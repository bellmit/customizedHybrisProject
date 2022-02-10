/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="CMSWorkflowListWsDTO")
public  class CMSWorkflowListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSWorkflowListWsDTO.workflows</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="workflows") 	
	private List<CMSWorkflowWsDTO> workflows;

	/** <i>Generated property</i> for <code>CMSWorkflowListWsDTO.pagination</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="pagination") 	
	private PaginationWsDTO pagination;
	
	public CMSWorkflowListWsDTO()
	{
		// default constructor
	}
	
	public void setWorkflows(final List<CMSWorkflowWsDTO> workflows)
	{
		this.workflows = workflows;
	}

	public List<CMSWorkflowWsDTO> getWorkflows() 
	{
		return workflows;
	}
	
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}

	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
	


}
