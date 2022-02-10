/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.queues.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.solviaCategories.data.SolviaCategoryData;
import java.util.List;

public  class SlvCategoryDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SlvCategoryDataList.slvCategory</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<SolviaCategoryData> slvCategory;
	
	public SlvCategoryDataList()
	{
		// default constructor
	}
	
	public void setSlvCategory(final List<SolviaCategoryData> slvCategory)
	{
		this.slvCategory = slvCategory;
	}

	public List<SolviaCategoryData> getSlvCategory() 
	{
		return slvCategory;
	}
	


}
