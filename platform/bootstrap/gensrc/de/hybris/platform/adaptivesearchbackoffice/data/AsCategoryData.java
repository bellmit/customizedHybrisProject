/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearchbackoffice.data;

import java.io.Serializable;
import de.hybris.platform.adaptivesearchbackoffice.data.AsCategoryData;
import java.util.List;

public  class AsCategoryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsCategoryData.code</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>AsCategoryData.name</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>AsCategoryData.children</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private List<AsCategoryData> children;
	
	public AsCategoryData()
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
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setChildren(final List<AsCategoryData> children)
	{
		this.children = children;
	}

	public List<AsCategoryData> getChildren() 
	{
		return children;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final AsCategoryData other = (AsCategoryData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getCode(), other.getCode()) 
			.append(getName(), other.getName()) 
			.append(getChildren(), other.getChildren()) 
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
		.append(getCode()) 
		.append(getName()) 
		.append(getChildren()) 
		.toHashCode();
	}

}
