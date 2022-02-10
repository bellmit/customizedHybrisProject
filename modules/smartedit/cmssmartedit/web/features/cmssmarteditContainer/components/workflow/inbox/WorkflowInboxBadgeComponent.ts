/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {Subscription} from 'rxjs';
import {ISeComponent, SeComponent} from 'smarteditcommons';
import './workflowInboxBadge.scss';
import {WorkflowService} from '../services/WorkflowService';

@SeComponent({
	templateUrl: 'workflowInboxBadgeTemplate.html'
})
export class WorkflowInboxBadgeComponent implements ISeComponent {
	private inboxCount = 0;
	private inboxCountSub: Subscription;

	constructor(private workflowService: WorkflowService) {}

	$onInit(): void {
		this.inboxCountSub = this.workflowService
			.getTotalNumberOfActiveWorkflowTasksAsStream()
			.subscribe((count) => (this.inboxCount = count));
	}

	$onDestroy(): void {
		if (this.inboxCountSub) {
			this.inboxCountSub.unsubscribe();
		}
	}

	public stringifyCount(count: number): string {
		return count <= 99 ? this.inboxCount.toString() : '99+';
	}
}
