/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @deprecated Deprecated since 6.6
 */
@ApiModel(value="ContentPageData")
@Deprecated(forRemoval = true)
public  class ContentPageData extends AbstractPageData 
{

 

	/** <i>Generated property</i> for <code>ContentPageData.label</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="label") 	
	private String label;

	/** <i>Generated property</i> for <code>ContentPageData.path</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="path") 	
	private String path;
	
	public ContentPageData()
	{
		// default constructor
	}
	
	public void setLabel(final String label)
	{
		this.label = label;
	}

	public String getLabel() 
	{
		return label;
	}
	
	public void setPath(final String path)
	{
		this.path = path;
	}

	public String getPath() 
	{
		return path;
	}
	


}
