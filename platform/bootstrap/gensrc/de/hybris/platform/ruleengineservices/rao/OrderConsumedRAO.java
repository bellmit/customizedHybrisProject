/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ruleengineservices.rao;

import java.io.Serializable;
import de.hybris.platform.ruleengineservices.rao.CartRAO;

import java.util.Objects;

/**
 * @deprecated Since 6.7
 */
@Deprecated(forRemoval = true)
public  class OrderConsumedRAO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>OrderConsumedRAO.cart</code> property defined at extension <code>ruleengineservices</code>. */
		
	private CartRAO cart;

	/** <i>Generated property</i> for <code>OrderConsumedRAO.availableQuantity</code> property defined at extension <code>ruleengineservices</code>. */
		
	private int availableQuantity;
	
	public OrderConsumedRAO()
	{
		// default constructor
	}
	
	public void setCart(final CartRAO cart)
	{
		this.cart = cart;
	}

	public CartRAO getCart() 
	{
		return cart;
	}
	
	public void setAvailableQuantity(final int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}

	public int getAvailableQuantity() 
	{
		return availableQuantity;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

	if (getClass() != o.getClass()) return false;

	final OrderConsumedRAO other = (OrderConsumedRAO) o;
	return	Objects.equals(getCart(), other.getCart())
  ;
	}

	@Override
	public int hashCode()
	{
		int result = 1;
		Object attribute;

				attribute = cart;
		result = 31 * result + (attribute == null ? 0 : attribute.hashCode());
		
		return result;
	}
	}