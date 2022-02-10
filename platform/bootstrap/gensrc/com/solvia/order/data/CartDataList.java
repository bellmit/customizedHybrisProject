/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.order.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.CartData;
import java.util.List;

public  class CartDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CartDataList.carts</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<CartData> carts;
	
	public CartDataList()
	{
		// default constructor
	}
	
	public void setCarts(final List<CartData> carts)
	{
		this.carts = carts;
	}

	public List<CartData> getCarts() 
	{
		return carts;
	}
	


}
