/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.user.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.user.data.RegionData;
import java.util.List;

public  class RegionDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RegionDataList.regions</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<RegionData> regions;
	
	public RegionDataList()
	{
		// default constructor
	}
	
	public void setRegions(final List<RegionData> regions)
	{
		this.regions = regions;
	}

	public List<RegionData> getRegions() 
	{
		return regions;
	}
	


}
