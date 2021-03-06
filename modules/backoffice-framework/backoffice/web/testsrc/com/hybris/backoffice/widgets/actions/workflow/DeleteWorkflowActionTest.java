/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved
 */
package com.hybris.backoffice.widgets.actions.workflow;

import de.hybris.platform.workflow.model.WorkflowModel;

import java.util.function.Function;
import java.util.function.Predicate;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import com.hybris.backoffice.workflow.renderer.actionexecutors.WorkflowDeleteActionExecutor;
import com.hybris.backoffice.workflow.renderer.predicates.DeleteWorkflowActionPredicate;
import com.hybris.cockpitng.labels.LabelService;


public class DeleteWorkflowActionTest extends AbstractWorkflowActionTest<DeleteWorkflowAction>
{

	@Mock
	WorkflowDeleteActionExecutor workflowDeleteActionExecutor;
	@Mock
	DeleteWorkflowActionPredicate deleteWorkflowActionPredicate;
	@Mock
	LabelService labelService;

	@Spy
	@InjectMocks
	private final DeleteWorkflowAction action = new DeleteWorkflowAction();

	@Override
	public DeleteWorkflowAction getActionInstance()
	{
		return action;
	}

	@Override
	public Function<WorkflowModel, Boolean> getWorkflowMockExecutor()
	{
		return workflowDeleteActionExecutor;
	}

	@Override
	public Predicate<WorkflowModel> getWorkflowMockPredicate()
	{
		return deleteWorkflowActionPredicate;
	}
}
