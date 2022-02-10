/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2boccaddon.dto.order;

import java.io.Serializable;
import de.hybris.platform.b2boccaddon.dto.order.B2BPaymentTypeWsDTO;
import java.util.List;

public  class B2BPaymentTypeListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>B2BPaymentTypeListWsDTO.paymentTypes</code> property defined at extension <code>b2boccaddon</code>. */
		
	private List<B2BPaymentTypeWsDTO> paymentTypes;
	
	public B2BPaymentTypeListWsDTO()
	{
		// default constructor
	}
	
	public void setPaymentTypes(final List<B2BPaymentTypeWsDTO> paymentTypes)
	{
		this.paymentTypes = paymentTypes;
	}

	public List<B2BPaymentTypeWsDTO> getPaymentTypes() 
	{
		return paymentTypes;
	}
	


}
