/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.consent.data;

import java.io.Serializable;

public  class AnonymousConsentData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AnonymousConsentData.templateCode</code> property defined at extension <code>commercefacades</code>. */
		
	private String templateCode;

	/** <i>Generated property</i> for <code>AnonymousConsentData.templateVersion</code> property defined at extension <code>commercefacades</code>. */
		
	private int templateVersion;

	/** <i>Generated property</i> for <code>AnonymousConsentData.consentState</code> property defined at extension <code>commercefacades</code>. */
		
	private String consentState;
	
	public AnonymousConsentData()
	{
		// default constructor
	}
	
	public void setTemplateCode(final String templateCode)
	{
		this.templateCode = templateCode;
	}

	public String getTemplateCode() 
	{
		return templateCode;
	}
	
	public void setTemplateVersion(final int templateVersion)
	{
		this.templateVersion = templateVersion;
	}

	public int getTemplateVersion() 
	{
		return templateVersion;
	}
	
	public void setConsentState(final String consentState)
	{
		this.consentState = consentState;
	}

	public String getConsentState() 
	{
		return consentState;
	}
	


}
