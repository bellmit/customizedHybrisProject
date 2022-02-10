/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.order;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.order.PaymentModeWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Representation of a Payment Mode List
 */
@ApiModel(value="PaymentModeList", description="Representation of a Payment Mode List")
public  class PaymentModeListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** List of payment modes<br/><br/><i>Generated property</i> for <code>PaymentModeListWsDTO.paymentModes</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="paymentModes", value="List of payment modes") 	
	private List<PaymentModeWsDTO> paymentModes;
	
	public PaymentModeListWsDTO()
	{
		// default constructor
	}
	
	public void setPaymentModes(final List<PaymentModeWsDTO> paymentModes)
	{
		this.paymentModes = paymentModes;
	}

	public List<PaymentModeWsDTO> getPaymentModes() 
	{
		return paymentModes;
	}
	


}
