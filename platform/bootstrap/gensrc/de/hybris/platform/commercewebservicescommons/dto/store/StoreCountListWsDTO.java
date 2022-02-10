/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.store;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.store.StoreCountWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Representation of a Store Count List
 */
@ApiModel(value="StoreCountList", description="Representation of a Store Count List")
public  class StoreCountListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** List of store counts<br/><br/><i>Generated property</i> for <code>StoreCountListWsDTO.countriesAndRegionsStoreCount</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="countriesAndRegionsStoreCount", value="List of store counts") 	
	private List<StoreCountWsDTO> countriesAndRegionsStoreCount;
	
	public StoreCountListWsDTO()
	{
		// default constructor
	}
	
	public void setCountriesAndRegionsStoreCount(final List<StoreCountWsDTO> countriesAndRegionsStoreCount)
	{
		this.countriesAndRegionsStoreCount = countriesAndRegionsStoreCount;
	}

	public List<StoreCountWsDTO> getCountriesAndRegionsStoreCount() 
	{
		return countriesAndRegionsStoreCount;
	}
	


}