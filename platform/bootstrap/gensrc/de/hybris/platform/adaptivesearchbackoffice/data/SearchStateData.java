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
import de.hybris.platform.adaptivesearch.data.AsSearchQueryData;
import de.hybris.platform.adaptivesearchbackoffice.data.FacetStateData;
import java.util.Map;

public  class SearchStateData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchStateData.searchQuery</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private AsSearchQueryData searchQuery;

	/** <i>Generated property</i> for <code>SearchStateData.facetsState</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private Map<String,FacetStateData> facetsState;
	
	public SearchStateData()
	{
		// default constructor
	}
	
	public void setSearchQuery(final AsSearchQueryData searchQuery)
	{
		this.searchQuery = searchQuery;
	}

	public AsSearchQueryData getSearchQuery() 
	{
		return searchQuery;
	}
	
	public void setFacetsState(final Map<String,FacetStateData> facetsState)
	{
		this.facetsState = facetsState;
	}

	public Map<String,FacetStateData> getFacetsState() 
	{
		return facetsState;
	}
	


}
