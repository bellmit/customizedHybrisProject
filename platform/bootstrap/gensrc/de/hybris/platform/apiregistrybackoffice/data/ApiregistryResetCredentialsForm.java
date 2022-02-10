/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.apiregistrybackoffice.data;

import java.io.Serializable;
import de.hybris.platform.apiregistryservices.model.ExposedDestinationModel;
import de.hybris.platform.apiregistryservices.model.ExposedOAuthCredentialModel;
import java.util.List;

public  class ApiregistryResetCredentialsForm  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ApiregistryResetCredentialsForm.credential</code> property defined at extension <code>apiregistrybackoffice</code>. */
		
	private ExposedOAuthCredentialModel credential;

	/** <i>Generated property</i> for <code>ApiregistryResetCredentialsForm.impactedDestinations</code> property defined at extension <code>apiregistrybackoffice</code>. */
		
	private List<ExposedDestinationModel> impactedDestinations;

	/** <i>Generated property</i> for <code>ApiregistryResetCredentialsForm.impactedCredentials</code> property defined at extension <code>apiregistrybackoffice</code>. */
		
	private List<ExposedOAuthCredentialModel> impactedCredentials;

	/** <i>Generated property</i> for <code>ApiregistryResetCredentialsForm.clientId</code> property defined at extension <code>apiregistrybackoffice</code>. */
		
	private String clientId;

	/** <i>Generated property</i> for <code>ApiregistryResetCredentialsForm.clientSecret</code> property defined at extension <code>apiregistrybackoffice</code>. */
		
	private String clientSecret;

	/** <i>Generated property</i> for <code>ApiregistryResetCredentialsForm.gracePeriod</code> property defined at extension <code>apiregistrybackoffice</code>. */
		
	private Integer gracePeriod;
	
	public ApiregistryResetCredentialsForm()
	{
		// default constructor
	}
	
	public void setCredential(final ExposedOAuthCredentialModel credential)
	{
		this.credential = credential;
	}

	public ExposedOAuthCredentialModel getCredential() 
	{
		return credential;
	}
	
	public void setImpactedDestinations(final List<ExposedDestinationModel> impactedDestinations)
	{
		this.impactedDestinations = impactedDestinations;
	}

	public List<ExposedDestinationModel> getImpactedDestinations() 
	{
		return impactedDestinations;
	}
	
	public void setImpactedCredentials(final List<ExposedOAuthCredentialModel> impactedCredentials)
	{
		this.impactedCredentials = impactedCredentials;
	}

	public List<ExposedOAuthCredentialModel> getImpactedCredentials() 
	{
		return impactedCredentials;
	}
	
	public void setClientId(final String clientId)
	{
		this.clientId = clientId;
	}

	public String getClientId() 
	{
		return clientId;
	}
	
	public void setClientSecret(final String clientSecret)
	{
		this.clientSecret = clientSecret;
	}

	public String getClientSecret() 
	{
		return clientSecret;
	}
	
	public void setGracePeriod(final Integer gracePeriod)
	{
		this.gracePeriod = gracePeriod;
	}

	public Integer getGracePeriod() 
	{
		return gracePeriod;
	}
	


}
