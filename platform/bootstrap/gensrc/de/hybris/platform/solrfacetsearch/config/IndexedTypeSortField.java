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

public  class IndexedTypeSortField  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>IndexedTypeSortField.fieldName</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String fieldName;

	/** <i>Generated property</i> for <code>IndexedTypeSortField.ascending</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private boolean ascending;
	
	public IndexedTypeSortField()
	{
		// default constructor
	}
	
	public void setFieldName(final String fieldName)
	{
		this.fieldName = fieldName;
	}

	public String getFieldName() 
	{
		return fieldName;
	}
	
	public void setAscending(final boolean ascending)
	{
		this.ascending = ascending;
	}

	public boolean isAscending() 
	{
		return ascending;
	}
	


}
