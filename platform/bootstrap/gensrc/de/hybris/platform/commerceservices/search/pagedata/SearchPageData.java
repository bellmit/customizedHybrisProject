/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.search.pagedata;

import java.io.Serializable;
import de.hybris.platform.commerceservices.search.pagedata.PaginationData;
import de.hybris.platform.commerceservices.search.pagedata.SortData;
import java.util.List;

/**
 * POJO that includes all necessary data for creating proper result in refine search.
 *
 * @deprecated Since version 6.5 use de.hybris.platform.core.servicelayer.data.SearchPageData<RESULT> instead
 */
@Deprecated(forRemoval = true)
public  class SearchPageData<RESULT>  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchPageData<RESULT>.results</code> property defined at extension <code>commerceservices</code>. */
		
	private List<RESULT> results;

	/** <i>Generated property</i> for <code>SearchPageData<RESULT>.sorts</code> property defined at extension <code>commerceservices</code>. */
		
	private List<SortData> sorts;

	/** <i>Generated property</i> for <code>SearchPageData<RESULT>.pagination</code> property defined at extension <code>commerceservices</code>. */
		
	private PaginationData pagination;
	
	public SearchPageData()
	{
		// default constructor
	}
	
	public void setResults(final List<RESULT> results)
	{
		this.results = results;
	}

	public List<RESULT> getResults() 
	{
		return results;
	}
	
	public void setSorts(final List<SortData> sorts)
	{
		this.sorts = sorts;
	}

	public List<SortData> getSorts() 
	{
		return sorts;
	}
	
	public void setPagination(final PaginationData pagination)
	{
		this.pagination = pagination;
	}

	public PaginationData getPagination() 
	{
		return pagination;
	}
	


}
