/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearchbackoffice.data;

import java.io.Serializable;

public  class CatalogVersionData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogVersionData.catalogId</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>CatalogVersionData.version</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private String version;
	
	public CatalogVersionData()
	{
		// default constructor
	}
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

	public String getCatalogId() 
	{
		return catalogId;
	}
	
	public void setVersion(final String version)
	{
		this.version = version;
	}

	public String getVersion() 
	{
		return version;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final CatalogVersionData other = (CatalogVersionData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getCatalogId(), other.getCatalogId()) 
			.append(getVersion(), other.getVersion()) 
			.isEquals();
		} 
		catch (ClassCastException c)
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return new org.apache.commons.lang.builder.HashCodeBuilder()
		.append(getCatalogId()) 
		.append(getVersion()) 
		.toHashCode();
	}

}
