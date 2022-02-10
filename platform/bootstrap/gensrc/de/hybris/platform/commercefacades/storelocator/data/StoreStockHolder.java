/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.storelocator.data;

import java.io.Serializable;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.storelocator.model.PointOfServiceModel;

public  class StoreStockHolder  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>StoreStockHolder.product</code> property defined at extension <code>commercefacades</code>. */
		
	private ProductModel product;

	/** <i>Generated property</i> for <code>StoreStockHolder.pointOfService</code> property defined at extension <code>commercefacades</code>. */
		
	private PointOfServiceModel pointOfService;
	
	public StoreStockHolder()
	{
		// default constructor
	}
	
	public void setProduct(final ProductModel product)
	{
		this.product = product;
	}

	public ProductModel getProduct() 
	{
		return product;
	}
	
	public void setPointOfService(final PointOfServiceModel pointOfService)
	{
		this.pointOfService = pointOfService;
	}

	public PointOfServiceModel getPointOfService() 
	{
		return pointOfService;
	}
	


}
