/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.store.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.store.data.StoreCountData;
import java.util.List;

public  class StoreCountListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>StoreCountListData.countriesAndRegionsStoreCount</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<StoreCountData> countriesAndRegionsStoreCount;
	
	public StoreCountListData()
	{
		// default constructor
	}
	
	public void setCountriesAndRegionsStoreCount(final List<StoreCountData> countriesAndRegionsStoreCount)
	{
		this.countriesAndRegionsStoreCount = countriesAndRegionsStoreCount;
	}

	public List<StoreCountData> getCountriesAndRegionsStoreCount() 
	{
		return countriesAndRegionsStoreCount;
	}
	


}
