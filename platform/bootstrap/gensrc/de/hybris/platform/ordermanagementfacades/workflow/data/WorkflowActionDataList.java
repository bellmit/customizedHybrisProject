/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ordermanagementfacades.workflow.data;

import java.io.Serializable;
import de.hybris.platform.ordermanagementfacades.workflow.data.WorkflowActionData;
import java.util.List;

public  class WorkflowActionDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>WorkflowActionDataList.workflowActions</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private List<WorkflowActionData> workflowActions;
	
	public WorkflowActionDataList()
	{
		// default constructor
	}
	
	public void setWorkflowActions(final List<WorkflowActionData> workflowActions)
	{
		this.workflowActions = workflowActions;
	}

	public List<WorkflowActionData> getWorkflowActions() 
	{
		return workflowActions;
	}
	


}
