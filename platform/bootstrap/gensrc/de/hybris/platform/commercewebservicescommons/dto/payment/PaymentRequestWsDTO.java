/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.payment;

import java.io.Serializable;
import java.util.Map;

public  class PaymentRequestWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PaymentRequestWsDTO.postUrl</code> property defined at extension <code>acceleratorwebservicesaddon</code>. */
		
	private String postUrl;

	/** <i>Generated property</i> for <code>PaymentRequestWsDTO.parameters</code> property defined at extension <code>acceleratorwebservicesaddon</code>. */
		
	private Map<String, String> parameters;

	/** <i>Generated property</i> for <code>PaymentRequestWsDTO.mappingLabels</code> property defined at extension <code>acceleratorwebservicesaddon</code>. */
		
	private Map<String, String> mappingLabels;
	
	public PaymentRequestWsDTO()
	{
		// default constructor
	}
	
	public void setPostUrl(final String postUrl)
	{
		this.postUrl = postUrl;
	}

	public String getPostUrl() 
	{
		return postUrl;
	}
	
	public void setParameters(final Map<String, String> parameters)
	{
		this.parameters = parameters;
	}

	public Map<String, String> getParameters() 
	{
		return parameters;
	}
	
	public void setMappingLabels(final Map<String, String> mappingLabels)
	{
		this.mappingLabels = mappingLabels;
	}

	public Map<String, String> getMappingLabels() 
	{
		return mappingLabels;
	}
	


}
