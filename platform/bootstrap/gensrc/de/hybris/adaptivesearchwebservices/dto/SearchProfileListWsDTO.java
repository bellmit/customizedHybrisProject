/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.adaptivesearchwebservices.dto;

import java.io.Serializable;
import de.hybris.adaptivesearchfacades.data.AsSearchProfileData;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of search profiles
 */
@ApiModel(value="searchProfileList", description="List of search profiles")
public  class SearchProfileListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchProfileListWsDTO.pagination</code> property defined at extension <code>adaptivesearchwebservices</code>. */
	@ApiModelProperty(name="pagination") 	
	private PaginationWsDTO pagination;

	/** <i>Generated property</i> for <code>SearchProfileListWsDTO.searchProfiles</code> property defined at extension <code>adaptivesearchwebservices</code>. */
	@ApiModelProperty(name="searchProfiles") 	
	private List<AsSearchProfileData> searchProfiles;
	
	public SearchProfileListWsDTO()
	{
		// default constructor
	}
	
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}

	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
	
	public void setSearchProfiles(final List<AsSearchProfileData> searchProfiles)
	{
		this.searchProfiles = searchProfiles;
	}

	public List<AsSearchProfileData> getSearchProfiles() 
	{
		return searchProfiles;
	}
	


}
