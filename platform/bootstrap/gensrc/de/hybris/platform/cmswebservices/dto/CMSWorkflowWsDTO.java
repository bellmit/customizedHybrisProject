/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="CMSWorkflowWsDTO")
public  class CMSWorkflowWsDTO extends CMSCreateVersionWsDTO 
{

 

	/** <i>Generated property</i> for <code>CMSWorkflowWsDTO.workflowCode</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="workflowCode") 	
	private String workflowCode;

	/** <i>Generated property</i> for <code>CMSWorkflowWsDTO.templateCode</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="templateCode") 	
	private String templateCode;

	/** <i>Generated property</i> for <code>CMSWorkflowWsDTO.description</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="description") 	
	private String description;

	/** <i>Generated property</i> for <code>CMSWorkflowWsDTO.attachments</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="attachments") 	
	private List<String> attachments;

	/** <i>Generated property</i> for <code>CMSWorkflowWsDTO.status</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="status") 	
	private String status;

	/** <i>Generated property</i> for <code>CMSWorkflowWsDTO.isAvailableForCurrentPrincipal</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="isAvailableForCurrentPrincipal") 	
	private Boolean isAvailableForCurrentPrincipal;

	/** <i>Generated property</i> for <code>CMSWorkflowWsDTO.actions</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="actions") 	
	private List<CMSWorkflowActionWsDTO> actions;

	/** <i>Generated property</i> for <code>CMSWorkflowWsDTO.canModifyItemInWorkflow</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="canModifyItemInWorkflow") 	
	private Boolean canModifyItemInWorkflow;
	
	public CMSWorkflowWsDTO()
	{
		// default constructor
	}
	
	public void setWorkflowCode(final String workflowCode)
	{
		this.workflowCode = workflowCode;
	}

	public String getWorkflowCode() 
	{
		return workflowCode;
	}
	
	public void setTemplateCode(final String templateCode)
	{
		this.templateCode = templateCode;
	}

	public String getTemplateCode() 
	{
		return templateCode;
	}
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

	public String getDescription() 
	{
		return description;
	}
	
	public void setAttachments(final List<String> attachments)
	{
		this.attachments = attachments;
	}

	public List<String> getAttachments() 
	{
		return attachments;
	}
	
	public void setStatus(final String status)
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	
	public void setIsAvailableForCurrentPrincipal(final Boolean isAvailableForCurrentPrincipal)
	{
		this.isAvailableForCurrentPrincipal = isAvailableForCurrentPrincipal;
	}

	public Boolean getIsAvailableForCurrentPrincipal() 
	{
		return isAvailableForCurrentPrincipal;
	}
	
	public void setActions(final List<CMSWorkflowActionWsDTO> actions)
	{
		this.actions = actions;
	}

	public List<CMSWorkflowActionWsDTO> getActions() 
	{
		return actions;
	}
	
	public void setCanModifyItemInWorkflow(final Boolean canModifyItemInWorkflow)
	{
		this.canModifyItemInWorkflow = canModifyItemInWorkflow;
	}

	public Boolean getCanModifyItemInWorkflow() 
	{
		return canModifyItemInWorkflow;
	}
	


}
