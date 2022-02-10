/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import java.util.List;

public  class CMSWorkflowTaskData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSWorkflowTaskData.action</code> property defined at extension <code>cmsfacades</code>. */
		
	private CMSWorkflowActionData action;

	/** <i>Generated property</i> for <code>CMSWorkflowTaskData.attachments</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<CMSWorkflowAttachmentData> attachments;
	
	public CMSWorkflowTaskData()
	{
		// default constructor
	}
	
	public void setAction(final CMSWorkflowActionData action)
	{
		this.action = action;
	}

	public CMSWorkflowActionData getAction() 
	{
		return action;
	}
	
	public void setAttachments(final List<CMSWorkflowAttachmentData> attachments)
	{
		this.attachments = attachments;
	}

	public List<CMSWorkflowAttachmentData> getAttachments() 
	{
		return attachments;
	}
	


}
