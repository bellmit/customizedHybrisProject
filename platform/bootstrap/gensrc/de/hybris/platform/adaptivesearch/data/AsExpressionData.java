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

public  class AsExpressionData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsExpressionData.expression</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String expression;

	/** <i>Generated property</i> for <code>AsExpressionData.name</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String name;
	
	public AsExpressionData()
	{
		// default constructor
	}
	
	public void setExpression(final String expression)
	{
		this.expression = expression;
	}

	public String getExpression() 
	{
		return expression;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final AsExpressionData other = (AsExpressionData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getExpression(), other.getExpression()) 
			.append(getName(), other.getName()) 
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
		.append(getExpression()) 
		.append(getName()) 
		.toHashCode();
	}

}
