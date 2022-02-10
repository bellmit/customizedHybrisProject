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

@ApiModel(value="CMSWorkflowOperationWsDTO")
public  class CMSWorkflowOperationWsDTO extends CMSCreateVersionWsDTO 
{

 

	/** <i>Generated property</i> for <code>CMSWorkflowOperationWsDTO.operation</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="operation") 	
	private String operation;

	/** <i>Generated property</i> for <code>CMSWorkflowOperationWsDTO.actionCode</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="actionCode") 	
	private String actionCode;

	/** <i>Generated property</i> for <code>CMSWorkflowOperationWsDTO.decisionCode</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="decisionCode") 	
	private String decisionCode;

	/** <i>Generated property</i> for <code>CMSWorkflowOperationWsDTO.comment</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="comment") 	
	private String comment;
	
	public CMSWorkflowOperationWsDTO()
	{
		// default constructor
	}
	
	public void setOperation(final String operation)
	{
		this.operation = operation;
	}

	public String getOperation() 
	{
		return operation;
	}
	
	public void setActionCode(final String actionCode)
	{
		this.actionCode = actionCode;
	}

	public String getActionCode() 
	{
		return actionCode;
	}
	
	public void setDecisionCode(final String decisionCode)
	{
		this.decisionCode = decisionCode;
	}

	public String getDecisionCode() 
	{
		return decisionCode;
	}
	
	public void setComment(final String comment)
	{
		this.comment = comment;
	}

	public String getComment() 
	{
		return comment;
	}
	


}
