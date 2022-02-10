/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.webservicescommons.dto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Sort option
 */
@ApiModel(value="sort", description="Sort option")
public  class SortWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SortWsDTO.code</code> property defined at extension <code>webservicescommons</code>. */
	@ApiModelProperty(name="code") 	
	private String code;

	/** <i>Generated property</i> for <code>SortWsDTO.asc</code> property defined at extension <code>webservicescommons</code>. */
	@ApiModelProperty(name="asc") 	
	private boolean asc;
	
	public SortWsDTO()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setAsc(final boolean asc)
	{
		this.asc = asc;
	}

	public boolean isAsc() 
	{
		return asc;
	}
	


}