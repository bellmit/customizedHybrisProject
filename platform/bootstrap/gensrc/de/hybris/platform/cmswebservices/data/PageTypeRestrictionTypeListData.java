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
import de.hybris.platform.cmswebservices.data.PageTypeRestrictionTypeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Page type restriction type list data
 */
@ApiModel(value="PageTypeRestrictionTypeListData", description="Page type restriction type list data")
public  class PageTypeRestrictionTypeListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageTypeRestrictionTypeListData.pageTypeRestrictionTypeList</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="pageTypeRestrictionTypeList") 	
	private List<PageTypeRestrictionTypeData> pageTypeRestrictionTypeList;
	
	public PageTypeRestrictionTypeListData()
	{
		// default constructor
	}
	
	public void setPageTypeRestrictionTypeList(final List<PageTypeRestrictionTypeData> pageTypeRestrictionTypeList)
	{
		this.pageTypeRestrictionTypeList = pageTypeRestrictionTypeList;
	}

	public List<PageTypeRestrictionTypeData> getPageTypeRestrictionTypeList() 
	{
		return pageTypeRestrictionTypeList;
	}
	


}
