/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.savedorderformsoccaddon.dto;

import java.io.Serializable;
import de.hybris.platform.savedorderformsoccaddon.dto.OrderFormWsDTO;
import java.util.List;

public  class OrderFormListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>OrderFormListWsDTO.orderForms</code> property defined at extension <code>savedorderformsoccaddon</code>. */
		
	private List<OrderFormWsDTO> orderForms;
	
	public OrderFormListWsDTO()
	{
		// default constructor
	}
	
	public void setOrderForms(final List<OrderFormWsDTO> orderForms)
	{
		this.orderForms = orderForms;
	}

	public List<OrderFormWsDTO> getOrderForms() 
	{
		return orderForms;
	}
	


}
