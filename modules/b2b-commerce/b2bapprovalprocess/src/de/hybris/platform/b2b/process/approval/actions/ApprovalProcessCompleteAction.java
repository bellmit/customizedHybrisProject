/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2b.process.approval.actions;

import de.hybris.platform.b2b.process.approval.event.ApprovalProcessCompleteEvent;
import de.hybris.platform.b2b.process.approval.model.B2BApprovalProcessModel;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.task.RetryLaterException;
import org.springframework.beans.factory.annotation.Required;


/**
 * This action is executed at the completion of a successful b2b order approval process.
 */
public class ApprovalProcessCompleteAction extends AbstractSimpleB2BApproveOrderDecisionAction
{

	public EventService getEventService()
	{
		return eventService;
	}

	@Required
	public void setEventService(final EventService eventService)
	{
		this.eventService = eventService;
	}

	private EventService eventService;

	/**
	 * This method allows to hook in into the completion of order approval process
	 */
	@Override
	public Transition executeAction(final B2BApprovalProcessModel process) throws RetryLaterException
	{
		eventService.publishEvent(new ApprovalProcessCompleteEvent(process));
		return Transition.OK;
	}
}
