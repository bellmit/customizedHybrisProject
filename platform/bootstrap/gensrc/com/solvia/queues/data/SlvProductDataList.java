/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.queues.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.solviaProducts.data.SolviaProductData;
import java.util.List;

public  class SlvProductDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SlvProductDataList.slvProduct</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<SolviaProductData> slvProduct;
	
	public SlvProductDataList()
	{
		// default constructor
	}
	
	public void setSlvProduct(final List<SolviaProductData> slvProduct)
	{
		this.slvProduct = slvProduct;
	}

	public List<SolviaProductData> getSlvProduct() 
	{
		return slvProduct;
	}
	


}
