/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
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

@ApiModel(value="CMSCommentListWsDTO")
public  class CMSCommentListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSCommentListWsDTO.comments</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="comments") 	
	private List<CMSCommentWsDTO> comments;

	/** <i>Generated property</i> for <code>CMSCommentListWsDTO.pagination</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="pagination") 	
	private PaginationWsDTO pagination;
	
	public CMSCommentListWsDTO()
	{
		// default constructor
	}
	
	public void setComments(final List<CMSCommentWsDTO> comments)
	{
		this.comments = comments;
	}

	public List<CMSCommentWsDTO> getComments() 
	{
		return comments;
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
