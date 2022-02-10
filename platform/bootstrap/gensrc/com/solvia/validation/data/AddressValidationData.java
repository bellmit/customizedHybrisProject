/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.validation.data;

import java.io.Serializable;
import com.solvia.user.data.AddressDataList;
import de.hybris.platform.webservicescommons.dto.error.ErrorListWsDTO;

public  class AddressValidationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AddressValidationData.errors</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private ErrorListWsDTO errors;

	/** <i>Generated property</i> for <code>AddressValidationData.decision</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private String decision;

	/** <i>Generated property</i> for <code>AddressValidationData.suggestedAddressesList</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private AddressDataList suggestedAddressesList;
	
	public AddressValidationData()
	{
		// default constructor
	}
	
	public void setErrors(final ErrorListWsDTO errors)
	{
		this.errors = errors;
	}

	public ErrorListWsDTO getErrors() 
	{
		return errors;
	}
	
	public void setDecision(final String decision)
	{
		this.decision = decision;
	}

	public String getDecision() 
	{
		return decision;
	}
	
	public void setSuggestedAddressesList(final AddressDataList suggestedAddressesList)
	{
		this.suggestedAddressesList = suggestedAddressesList;
	}

	public AddressDataList getSuggestedAddressesList() 
	{
		return suggestedAddressesList;
	}
	


}
