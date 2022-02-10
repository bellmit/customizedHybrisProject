/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import de.hybris.platform.cmswebservices.data.ComposedTypeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="PageTypeData")
public  class PageTypeData extends ComposedTypeData 
{

 

	/** <i>Generated property</i> for <code>PageTypeData.type</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="type") 	
	private String type;
	
	public PageTypeData()
	{
		// default constructor
	}
	
	/**
	 * @deprecated since 1811
	 */
	@Deprecated(forRemoval = true)
	public void setType(final String type)
	{
		this.type = type;
	}

	/**
	 * @deprecated since 1811
	 */
	@Deprecated(forRemoval = true)
	public String getType() 
	{
		return type;
	}
	


}
