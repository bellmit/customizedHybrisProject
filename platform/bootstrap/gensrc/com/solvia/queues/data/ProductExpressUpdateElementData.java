/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.queues.data;

import java.io.Serializable;

public  class ProductExpressUpdateElementData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductExpressUpdateElementData.code</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>ProductExpressUpdateElementData.catalogId</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>ProductExpressUpdateElementData.catalogVersion</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private String catalogVersion;
	
	public ProductExpressUpdateElementData()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

	public String getCatalogId() 
	{
		return catalogId;
	}
	
	public void setCatalogVersion(final String catalogVersion)
	{
		this.catalogVersion = catalogVersion;
	}

	public String getCatalogVersion() 
	{
		return catalogVersion;
	}
	


}
