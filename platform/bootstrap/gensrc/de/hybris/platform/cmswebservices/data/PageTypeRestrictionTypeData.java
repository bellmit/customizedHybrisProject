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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="PageTypeRestrictionTypeData")
public  class PageTypeRestrictionTypeData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageTypeRestrictionTypeData.pageType</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="pageType") 	
	private String pageType;

	/** <i>Generated property</i> for <code>PageTypeRestrictionTypeData.restrictionType</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="restrictionType") 	
	private String restrictionType;
	
	public PageTypeRestrictionTypeData()
	{
		// default constructor
	}
	
	public void setPageType(final String pageType)
	{
		this.pageType = pageType;
	}

	public String getPageType() 
	{
		return pageType;
	}
	
	public void setRestrictionType(final String restrictionType)
	{
		this.restrictionType = restrictionType;
	}

	public String getRestrictionType() 
	{
		return restrictionType;
	}
	


}
