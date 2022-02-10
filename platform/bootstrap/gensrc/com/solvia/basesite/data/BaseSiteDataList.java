/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.basesite.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.basesite.data.BaseSiteData;
import java.util.List;

public  class BaseSiteDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>BaseSiteDataList.baseSites</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<BaseSiteData> baseSites;
	
	public BaseSiteDataList()
	{
		// default constructor
	}
	
	public void setBaseSites(final List<BaseSiteData> baseSites)
	{
		this.baseSites = baseSites;
	}

	public List<BaseSiteData> getBaseSites() 
	{
		return baseSites;
	}
	


}
