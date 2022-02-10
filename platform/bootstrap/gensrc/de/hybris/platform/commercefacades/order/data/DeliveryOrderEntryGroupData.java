/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.order.data;

import de.hybris.platform.commercefacades.order.data.OrderEntryGroupData;
import de.hybris.platform.commercefacades.user.data.AddressData;

public  class DeliveryOrderEntryGroupData extends OrderEntryGroupData 
{

 

	/** <i>Generated property</i> for <code>DeliveryOrderEntryGroupData.deliveryAddress</code> property defined at extension <code>commercefacades</code>. */
		
	private AddressData deliveryAddress;
	
	public DeliveryOrderEntryGroupData()
	{
		// default constructor
	}
	
	public void setDeliveryAddress(final AddressData deliveryAddress)
	{
		this.deliveryAddress = deliveryAddress;
	}

	public AddressData getDeliveryAddress() 
	{
		return deliveryAddress;
	}
	


}
