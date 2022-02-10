/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmssmarteditwebservices.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @deprecated since 1811, no longer needed.
 */
@ApiModel(value="ContentPageWsDTO")
@Deprecated(forRemoval = true)
public  class ContentPageWsDTO extends AbstractPageWsDTO 
{

 

	/** <i>Generated property</i> for <code>ContentPageWsDTO.label</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="label") 	
	private String label;

	/** <i>Generated property</i> for <code>ContentPageWsDTO.path</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="path") 	
	private String path;
	
	public ContentPageWsDTO()
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
