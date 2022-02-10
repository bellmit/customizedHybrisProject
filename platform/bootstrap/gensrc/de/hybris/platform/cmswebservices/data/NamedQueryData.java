/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="NamedQueryData")
public  class NamedQueryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>NamedQueryData.namedQuery</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="namedQuery") 	
	private String namedQuery;

	/** <i>Generated property</i> for <code>NamedQueryData.params</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="params") 	
	private String params;

	/** <i>Generated property</i> for <code>NamedQueryData.sort</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="sort") 	
	private String sort;

	/** <i>Generated property</i> for <code>NamedQueryData.pageSize</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="pageSize") 	
	private String pageSize;

	/** <i>Generated property</i> for <code>NamedQueryData.currentPage</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="currentPage") 	
	private String currentPage;

	/** <i>Generated property</i> for <code>NamedQueryData.queryType</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="queryType") 	
	private Class<?> queryType;
	
	public NamedQueryData()
	{
		// default constructor
	}
	
	public void setNamedQuery(final String namedQuery)
	{
		this.namedQuery = namedQuery;
	}

	public String getNamedQuery() 
	{
		return namedQuery;
	}
	
	public void setParams(final String params)
	{
		this.params = params;
	}

	public String getParams() 
	{
		return params;
	}
	
	public void setSort(final String sort)
	{
		this.sort = sort;
	}

	public String getSort() 
	{
		return sort;
	}
	
	public void setPageSize(final String pageSize)
	{
		this.pageSize = pageSize;
	}

	public String getPageSize() 
	{
		return pageSize;
	}
	
	public void setCurrentPage(final String currentPage)
	{
		this.currentPage = currentPage;
	}

	public String getCurrentPage() 
	{
		return currentPage;
	}
	
	public void setQueryType(final Class<?> queryType)
	{
		this.queryType = queryType;
	}

	public Class<?> getQueryType() 
	{
		return queryType;
	}
	


}
