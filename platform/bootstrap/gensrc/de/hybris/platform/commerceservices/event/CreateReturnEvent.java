/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.event;

import java.io.Serializable;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import de.hybris.platform.returns.model.ReturnRequestModel;

public  class CreateReturnEvent  extends AbstractEvent {


	/** <i>Generated property</i> for <code>CreateReturnEvent.returnRequest</code> property defined at extension <code>commerceservices</code>. */
		
	private ReturnRequestModel returnRequest;
	
	public CreateReturnEvent()
	{
		super();
	}

	public CreateReturnEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setReturnRequest(final ReturnRequestModel returnRequest)
	{
		this.returnRequest = returnRequest;
	}

	public ReturnRequestModel getReturnRequest() 
	{
		return returnRequest;
	}
	


}
