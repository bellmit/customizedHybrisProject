/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {ISeComponent, SeComponent, SystemEventService} from 'smarteditcommons';
import {WorkflowService} from '../services/WorkflowService';
import {WorkflowFacade} from '../facades/WorkflowFacade';
import {Workflow, WorkflowAction, WorkflowActionStatus} from '../dtos';
import "./pageWorkflowMenu.scss";
import {IPageService} from 'cmscommons';
import {WORKFLOW_REFRESH_EVENT} from '../constants';

@SeComponent({
	templateUrl: 'pageWorkflowMenuTemplate.html',
	inputs: ['actionItem']
})
export class PageWorkflowMenuComponent implements ISeComponent {
	public workflow: Workflow;
	public isComponentReady: boolean;
	public allActions: WorkflowAction[];
	public activeActions: WorkflowAction[];
	public actionItem: any;
	public tabsList: any[];
	public isTooltipOpen: boolean;
	public pageHasWorkflow: boolean = false;
	public isWorkflowEnabled = false;
	public isReady: boolean = false;

	private unregOpenMenuEvent: () => void;
	private unregPerspectiveChangedEvent: () => void;
	private unregWorkflowFinishedEvent: () => void;
	private unregDecisionSelectedEvent: () => void;
	private unRegWorkflowRefreshEvent: () => void;

	constructor(
		private workflowService: WorkflowService,
		private workflowFacade: WorkflowFacade,
		private systemEventService: SystemEventService,
		private CMS_EVENT_OPEN_PAGE_WORKFLOW_MENU: string,
		private EVENT_PERSPECTIVE_CHANGED: string,
		private WORKFLOW_FINISHED_EVENT: string,
		private WORKFLOW_DECISION_SELECTED_EVENT: string,
		private WORKFLOW_TASKS_MENU_OPENED_EVENT: string,
		private pageService: IPageService,
		private $route: angular.route.IRouteService,
	) {
		this.isReady = false;
		this.isComponentReady = false;
		this.isTooltipOpen = false;
		this.unregOpenMenuEvent = this.systemEventService.subscribe(this.CMS_EVENT_OPEN_PAGE_WORKFLOW_MENU, this._openPageWorkflowMenu.bind(this));
		this.unregPerspectiveChangedEvent = this.systemEventService.subscribe(this.EVENT_PERSPECTIVE_CHANGED, this._loadWorkflow.bind(this));
		this.unregWorkflowFinishedEvent = this.systemEventService.subscribe(this.WORKFLOW_FINISHED_EVENT, this._loadWorkflow.bind(this));
		this.unregDecisionSelectedEvent = this.systemEventService.subscribe(this.WORKFLOW_DECISION_SELECTED_EVENT, this._closeDropdown.bind(this));
		this.unRegWorkflowRefreshEvent = this.systemEventService.subscribe(
			WORKFLOW_REFRESH_EVENT,
			() => this._loadWorkflow()
		);
	}

	$onInit(): void {
		this._fetchPageTasks();
		this.actionItem.isOpen = false;
	}

	$onDestroy(): void {
		this.unregOpenMenuEvent();
		this.unregPerspectiveChangedEvent();
		this.unregWorkflowFinishedEvent();
		this.unregDecisionSelectedEvent();
		this.unRegWorkflowRefreshEvent();
	}

	onDropdownToggle(open: boolean) {
		if (!open) {
			return;
		}
		this.systemEventService.publish(this.WORKFLOW_TASKS_MENU_OPENED_EVENT);
		this.isComponentReady = false;
		this.actionItem.isOpen = true;
		this.isTooltipOpen = false;
		this._fetchPageTasks();
	}

	public startWorkflow(): void {
		this.workflowFacade.startWorkflow().then(() => {
			this.$route.reload();
		});
	}

	private _openPageWorkflowMenu(key: string, value: boolean) {
		this.pageHasWorkflow = true;
		this.onDropdownToggle(value);
	}

	private _closeDropdown() {
		this.actionItem.isOpen = false;
	}

	private _setupTabs() {
		this.tabsList = [{
			id: 'currentTasksTab',
			title: 'se.cms.page.workflow.tabs.currenttasks',
			templateUrl: 'currentTasksTabWrapperTemplate.html'
		}, {
			id: 'allTasksTab',
			title: 'se.cms.page.workflow.tabs.alltasks',
			templateUrl: 'allTasksTabWrapperTemplate.html'
		}];
	}

	private _loadWorkflow(): angular.IPromise<Workflow> {
		return this.pageService.getCurrentPageInfo().then((page) => {
			return this.workflowService.getActiveWorkflowForPageUuid(page.uuid).then((workflow: Workflow) => {
				this.pageHasWorkflow = !!workflow;
				this.isWorkflowEnabled = page.displayStatus === 'DRAFT';
				return workflow;
			});
		});
	}

	private _fetchPageTasks() {
		this._loadWorkflow().then((workflow: Workflow) => {
			if (workflow) {
				this.workflow = workflow;
				this.workflowFacade.getAllActionsForWorkflow(this.workflow.workflowCode).then((response: WorkflowAction[]) => {
					response.sort(this._actionComparator.bind(this));
					this.allActions = response;
					this.activeActions = response.filter((action) => action.status.toLowerCase() === WorkflowActionStatus.IN_PROGRESS);
					this.isComponentReady = true;
					this._setupTabs();
				});
			}
		}).finally(() => {
			this.isReady = true;
		});
	}

	private _actionComparator(a: WorkflowAction, b: WorkflowAction): number {
		const priorityA = this._getActionPriority(a);
		const priorityB = this._getActionPriority(b);

		return (priorityA !== priorityB) ?
			priorityA - priorityB :
			a.startedAgoInMillis - b.startedAgoInMillis;
	}

	private _getActionPriority(action: WorkflowAction): number {
		switch (action.status.toLowerCase()) {
			case WorkflowActionStatus.IN_PROGRESS:
				return 1;
			case WorkflowActionStatus.PENDING:
				return 2;
			case WorkflowActionStatus.COMPLETED:
				return 3;
			default:
				return 4;
		}
	}
}