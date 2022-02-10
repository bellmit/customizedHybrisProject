/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import de.hybris.platform.cmswebservices.data.PageTypeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of PageTypeData
 */
@ApiModel(value="PageTypeListData", description="List of PageTypeData")
public  class PageTypeListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageTypeListData.pageTypes</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="pageTypes") 	
	private List<PageTypeData> pageTypes;
	
	public PageTypeListData()
	{
		// default constructor
	}
	
	public void setPageTypes(final List<PageTypeData> pageTypes)
	{
		this.pageTypes = pageTypes;
	}

	public List<PageTypeData> getPageTypes() 
	{
		return pageTypes;
	}
	


}
