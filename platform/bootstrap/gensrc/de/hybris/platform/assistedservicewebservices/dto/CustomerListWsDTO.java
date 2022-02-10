/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.assistedservicewebservices.dto;

import java.io.Serializable;
import java.util.List;

public  class CustomerListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CustomerListWsDTO.uid</code> property defined at extension <code>assistedservicewebservices</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>CustomerListWsDTO.name</code> property defined at extension <code>assistedservicewebservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>CustomerListWsDTO.additionalColumnsKeys</code> property defined at extension <code>assistedservicewebservices</code>. */
		
	private List<String> additionalColumnsKeys;

	/** <i>Generated property</i> for <code>CustomerListWsDTO.searchBoxEnabled</code> property defined at extension <code>assistedservicewebservices</code>. */
		
	private boolean searchBoxEnabled;
	
	public CustomerListWsDTO()
	{
		// default constructor
	}
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

	public String getUid() 
	{
		return uid;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setAdditionalColumnsKeys(final List<String> additionalColumnsKeys)
	{
		this.additionalColumnsKeys = additionalColumnsKeys;
	}

	public List<String> getAdditionalColumnsKeys() 
	{
		return additionalColumnsKeys;
	}
	
	public void setSearchBoxEnabled(final boolean searchBoxEnabled)
	{
		this.searchBoxEnabled = searchBoxEnabled;
	}

	public boolean isSearchBoxEnabled() 
	{
		return searchBoxEnabled;
	}
	


}
