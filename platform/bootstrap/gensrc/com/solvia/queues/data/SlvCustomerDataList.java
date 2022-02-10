/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.queues.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import java.util.List;

public  class SlvCustomerDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SlvCustomerDataList.slvCustomer </code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<CustomerData> slvCustomer ;
	
	public SlvCustomerDataList()
	{
		// default constructor
	}
	
	public void setSlvCustomer (final List<CustomerData> slvCustomer )
	{
		this.slvCustomer  = slvCustomer ;
	}

	public List<CustomerData> getSlvCustomer () 
	{
		return slvCustomer ;
	}
	


}
