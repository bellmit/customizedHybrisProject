/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmssmarteditwebservices.dto;

import java.io.Serializable;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="CMSWorkflowTaskListWsDTO")
public  class CMSWorkflowTaskListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSWorkflowTaskListWsDTO.tasks</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="tasks") 	
	private List<CMSWorkflowTaskWsDTO> tasks;

	/** <i>Generated property</i> for <code>CMSWorkflowTaskListWsDTO.pagination</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="pagination") 	
	private PaginationWsDTO pagination;
	
	public CMSWorkflowTaskListWsDTO()
	{
		// default constructor
	}
	
	public void setTasks(final List<CMSWorkflowTaskWsDTO> tasks)
	{
		this.tasks = tasks;
	}

	public List<CMSWorkflowTaskWsDTO> getTasks() 
	{
		return tasks;
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