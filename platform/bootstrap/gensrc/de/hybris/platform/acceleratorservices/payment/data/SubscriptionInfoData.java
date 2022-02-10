/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.acceleratorservices.payment.data;

import java.io.Serializable;

public  class SubscriptionInfoData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SubscriptionInfoData.subscriptionID</code> property defined at extension <code>acceleratorservices</code>. */
		
	private String subscriptionID;

	/** <i>Generated property</i> for <code>SubscriptionInfoData.subscriptionIDPublicSignature</code> property defined at extension <code>acceleratorservices</code>. */
		
	private String subscriptionIDPublicSignature;

	/** <i>Generated property</i> for <code>SubscriptionInfoData.subscriptionSignedValue</code> property defined at extension <code>acceleratorservices</code>. */
		
	private String subscriptionSignedValue;
	
	public SubscriptionInfoData()
	{
		// default constructor
	}
	
	public void setSubscriptionID(final String subscriptionID)
	{
		this.subscriptionID = subscriptionID;
	}

	public String getSubscriptionID() 
	{
		return subscriptionID;
	}
	
	public void setSubscriptionIDPublicSignature(final String subscriptionIDPublicSignature)
	{
		this.subscriptionIDPublicSignature = subscriptionIDPublicSignature;
	}

	public String getSubscriptionIDPublicSignature() 
	{
		return subscriptionIDPublicSignature;
	}
	
	public void setSubscriptionSignedValue(final String subscriptionSignedValue)
	{
		this.subscriptionSignedValue = subscriptionSignedValue;
	}

	public String getSubscriptionSignedValue() 
	{
		return subscriptionSignedValue;
	}
	


}
