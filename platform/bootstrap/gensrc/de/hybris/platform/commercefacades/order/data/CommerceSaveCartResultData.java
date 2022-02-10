/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.order.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.CartData;

public  class CommerceSaveCartResultData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CommerceSaveCartResultData.savedCartData</code> property defined at extension <code>commercefacades</code>. */
		
	private CartData savedCartData;
	
	public CommerceSaveCartResultData()
	{
		// default constructor
	}
	
	public void setSavedCartData(final CartData savedCartData)
	{
		this.savedCartData = savedCartData;
	}

	public CartData getSavedCartData() 
	{
		return savedCartData;
	}
	


}
