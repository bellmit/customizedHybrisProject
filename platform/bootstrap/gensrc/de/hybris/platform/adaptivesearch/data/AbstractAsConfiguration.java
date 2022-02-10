/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;
import de.hybris.platform.adaptivesearch.data.AsCatalogVersion;

public  class AbstractAsConfiguration  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractAsConfiguration.catalogVersion</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsCatalogVersion catalogVersion;

	/** <i>Generated property</i> for <code>AbstractAsConfiguration.uid</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String uid;
	
	public AbstractAsConfiguration()
	{
		// default constructor
	}
	
	public void setCatalogVersion(final AsCatalogVersion catalogVersion)
	{
		this.catalogVersion = catalogVersion;
	}

	public AsCatalogVersion getCatalogVersion() 
	{
		return catalogVersion;
	}
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

	public String getUid() 
	{
		return uid;
	}
	


}