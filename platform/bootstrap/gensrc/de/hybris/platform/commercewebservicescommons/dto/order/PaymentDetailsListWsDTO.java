/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.order;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.order.PaymentDetailsWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Representation of a Payment details list
 */
@ApiModel(value="PaymentDetailsList", description="Representation of a Payment details list")
public  class PaymentDetailsListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** List of payment details<br/><br/><i>Generated property</i> for <code>PaymentDetailsListWsDTO.payments</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="payments", value="List of payment details") 	
	private List<PaymentDetailsWsDTO> payments;
	
	public PaymentDetailsListWsDTO()
	{
		// default constructor
	}
	
	public void setPayments(final List<PaymentDetailsWsDTO> payments)
	{
		this.payments = payments;
	}

	public List<PaymentDetailsWsDTO> getPayments() 
	{
		return payments;
	}
	


}
