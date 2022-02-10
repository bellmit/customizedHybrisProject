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
import com.solvia.queues.data.ProductExpressUpdateElementData;
import java.util.List;

public  class ProductExpressUpdateElementDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductExpressUpdateElementDataList.productExpressUpdateElements</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<ProductExpressUpdateElementData> productExpressUpdateElements;
	
	public ProductExpressUpdateElementDataList()
	{
		// default constructor
	}
	
	public void setProductExpressUpdateElements(final List<ProductExpressUpdateElementData> productExpressUpdateElements)
	{
		this.productExpressUpdateElements = productExpressUpdateElements;
	}

	public List<ProductExpressUpdateElementData> getProductExpressUpdateElements() 
	{
		return productExpressUpdateElements;
	}
	


}
