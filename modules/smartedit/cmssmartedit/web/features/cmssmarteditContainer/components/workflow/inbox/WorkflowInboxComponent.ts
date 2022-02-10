/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {ISeComponent, Page, Pageable, SeComponent, SystemEventService} from 'smarteditcommons';
import {WorkflowTask} from '../dtos';
import {WorkflowFacade} from 'cmssmarteditcontainer/components/workflow/facades/WorkflowFacade';
import {WorkflowTasksPollingService} from '../services/WorkflowTasksPollingService';
import './workflowInbox.scss';

@SeComponent({
	templateUrl: 'workflowInboxTemplate.html',
	inputs: ['actionItem']
})
export class WorkflowInboxComponent implements ISeComponent {

	public pageSize = 10;
	public tasksNotReady: boolean;
	public totalNumberOfTasks: number;
	public actionItem: any;
	private unRegisterEvent: () => void;
	private unRegisterWorkflowCreatedEvent: () => void;
	private unRegisterWorkflowFinishedEvent: () => void;

	constructor(
		private workflowFacade: WorkflowFacade,
		private systemEventService: SystemEventService,
		private workflowTasksPollingService: WorkflowTasksPollingService,
		private CMS_EVENT_OPEN_WORKFLOW_INBOX_DROPDOWN: string,
		private WORKFLOW_CREATED_EVENT: string,
		private WORKFLOW_FINISHED_EVENT: string
	) {}

	$onInit() {
		this.tasksNotReady = true;

		this.unRegisterEvent = this.systemEventService.subscribe(this.CMS_EVENT_OPEN_WORKFLOW_INBOX_DROPDOWN, this.openDropdown.bind(this));

		this.unRegisterWorkflowCreatedEvent = this.systemEventService.subscribe(
			this.WORKFLOW_CREATED_EVENT,
			() => this.reloadInboxTasks()
		);

		this.unRegisterWorkflowFinishedEvent = this.systemEventService.subscribe(
			this.WORKFLOW_FINISHED_EVENT,
			() => this.reloadInboxTasks()
		);
	}

	$onDestroy() {
		this.workflowTasksPollingService.stopPolling();

		if (this.unRegisterEvent) {
			this.unRegisterEvent();
		}

		if (this.unRegisterWorkflowCreatedEvent) {
			this.unRegisterWorkflowCreatedEvent();
		}

		if (this.unRegisterWorkflowFinishedEvent) {
			this.unRegisterWorkflowFinishedEvent();
		}
	}

	public loadInboxTasks = (mask: string, pageSize: number, currentPage: number): angular.IPromise<Page<WorkflowTask>> => {
		const payload: Pageable = {
			currentPage,
			mask,
			pageSize
		};
		return this.workflowFacade.getWorkflowInboxTasks(payload).then((page: Page<WorkflowTask>) => {
			this.tasksNotReady = false;
			this.totalNumberOfTasks = page.pagination.totalCount;
			this.workflowFacade.updateWorkflowTasksCount(this.totalNumberOfTasks);
			return page;
		});
	}

	public onDropdownToggle(open: boolean) {
		if (open) {
			this.workflowTasksPollingService.stopPolling();
			return;
		}
		this.workflowTasksPollingService.startPolling();
		this.tasksNotReady = true;
	}

	private openDropdown() {
		this.actionItem.isOpen = true;
	}

	private reloadInboxTasks = () => {
		this.loadInboxTasks('', this.pageSize, 0);
	}
}
