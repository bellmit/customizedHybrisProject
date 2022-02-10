/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.solrfacetsearch.config;

import java.io.Serializable;

public  class ValueRange  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ValueRange.name</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>ValueRange.from</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private Comparable from;

	/** <i>Generated property</i> for <code>ValueRange.to</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private Comparable to;
	
	public ValueRange()
	{
		// default constructor
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setFrom(final Comparable from)
	{
		this.from = from;
	}

	public Comparable getFrom() 
	{
		return from;
	}
	
	public void setTo(final Comparable to)
	{
		this.to = to;
	}

	public Comparable getTo() 
	{
		return to;
	}
	


}
