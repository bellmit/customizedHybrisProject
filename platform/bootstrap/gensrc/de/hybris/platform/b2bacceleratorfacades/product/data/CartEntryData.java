/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2bacceleratorfacades.product.data;

import java.io.Serializable;

public  class CartEntryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CartEntryData.entryNumber</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private Long entryNumber;

	/** <i>Generated property</i> for <code>CartEntryData.sku</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private String sku;

	/** <i>Generated property</i> for <code>CartEntryData.quantity</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private Long quantity;
	
	public CartEntryData()
	{
		// default constructor
	}
	
	public void setEntryNumber(final Long entryNumber)
	{
		this.entryNumber = entryNumber;
	}

	public Long getEntryNumber() 
	{
		return entryNumber;
	}
	
	public void setSku(final String sku)
	{
		this.sku = sku;
	}

	public String getSku() 
	{
		return sku;
	}
	
	public void setQuantity(final Long quantity)
	{
		this.quantity = quantity;
	}

	public Long getQuantity() 
	{
		return quantity;
	}
	


}
