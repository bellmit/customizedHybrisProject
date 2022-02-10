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

@ApiModel(value="CMSVersionListWsDTO")
public  class CMSVersionListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSVersionListWsDTO.results</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="results") 	
	private List<CMSVersionWsDTO> results;

	/** <i>Generated property</i> for <code>CMSVersionListWsDTO.pagination</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="pagination") 	
	private PaginationWsDTO pagination;
	
	public CMSVersionListWsDTO()
	{
		// default constructor
	}
	
	public void setResults(final List<CMSVersionWsDTO> results)
	{
		this.results = results;
	}

	public List<CMSVersionWsDTO> getResults() 
	{
		return results;
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
