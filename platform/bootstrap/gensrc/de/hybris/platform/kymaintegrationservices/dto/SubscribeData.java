/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.kymaintegrationservices.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.hybris.platform.kymaintegrationservices.dto.PayloadData;

public  class SubscribeData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SubscribeData.summary</code> property defined at extension <code>kymaintegrationservices</code>. */
	@JsonProperty("summary") 	
	private String summary;

	/** <i>Generated property</i> for <code>SubscribeData.payload</code> property defined at extension <code>kymaintegrationservices</code>. */
	@JsonProperty("payload") 	
	private PayloadData payload;
	
	public SubscribeData()
	{
		// default constructor
	}
	
@JsonProperty("summary") 	public void setSummary(final String summary)
	{
		this.summary = summary;
	}

@JsonProperty("summary") 	public String getSummary() 
	{
		return summary;
	}
	
@JsonProperty("payload") 	public void setPayload(final PayloadData payload)
	{
		this.payload = payload;
	}

@JsonProperty("payload") 	public PayloadData getPayload() 
	{
		return payload;
	}
	


}
