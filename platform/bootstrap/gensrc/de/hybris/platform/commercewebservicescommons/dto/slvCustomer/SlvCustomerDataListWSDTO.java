/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.slvCustomer;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.slvCustomer.SlvCustomerDataWSDTO;
import java.util.List;

public  class SlvCustomerDataListWSDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SlvCustomerDataListWSDTO.slvCustomer</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<SlvCustomerDataWSDTO> slvCustomer;
	
	public SlvCustomerDataListWSDTO()
	{
		// default constructor
	}
	
	public void setSlvCustomer(final List<SlvCustomerDataWSDTO> slvCustomer)
	{
		this.slvCustomer = slvCustomer;
	}

	public List<SlvCustomerDataWSDTO> getSlvCustomer() 
	{
		return slvCustomer;
	}
	


}
