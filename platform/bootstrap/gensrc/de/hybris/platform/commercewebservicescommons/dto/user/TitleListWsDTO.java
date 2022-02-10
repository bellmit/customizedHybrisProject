/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.user;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.user.TitleWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Representation of a Title List
 */
@ApiModel(value="TitleList", description="Representation of a Title List")
public  class TitleListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** List of titles<br/><br/><i>Generated property</i> for <code>TitleListWsDTO.titles</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="titles", value="List of titles") 	
	private List<TitleWsDTO> titles;
	
	public TitleListWsDTO()
	{
		// default constructor
	}
	
	public void setTitles(final List<TitleWsDTO> titles)
	{
		this.titles = titles;
	}

	public List<TitleWsDTO> getTitles() 
	{
		return titles;
	}
	


}