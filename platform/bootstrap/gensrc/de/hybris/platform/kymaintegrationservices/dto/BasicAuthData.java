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

public  class BasicAuthData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>BasicAuthData.username</code> property defined at extension <code>kymaintegrationservices</code>. */
	@JsonProperty("username") 	
	private String username;

	/** <i>Generated property</i> for <code>BasicAuthData.password</code> property defined at extension <code>kymaintegrationservices</code>. */
	@JsonProperty("password") 	
	private String password;
	
	public BasicAuthData()
	{
		// default constructor
	}
	
@JsonProperty("username") 	public void setUsername(final String username)
	{
		this.username = username;
	}

@JsonProperty("username") 	public String getUsername() 
	{
		return username;
	}
	
@JsonProperty("password") 	public void setPassword(final String password)
	{
		this.password = password;
	}

@JsonProperty("password") 	public String getPassword() 
	{
		return password;
	}
	


}
