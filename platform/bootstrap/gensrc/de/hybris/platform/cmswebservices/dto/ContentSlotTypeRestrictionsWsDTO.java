/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Content slot type restrictions DTO
 */
@ApiModel(value="ContentSlotTypeRestrictionsWsDTO", description="Content slot type restrictions DTO")
public  class ContentSlotTypeRestrictionsWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ContentSlotTypeRestrictionsWsDTO.contentSlotUid</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="contentSlotUid") 	
	private String contentSlotUid;

	/** <i>Generated property</i> for <code>ContentSlotTypeRestrictionsWsDTO.validComponentTypes</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="validComponentTypes") 	
	private List<String> validComponentTypes;
	
	public ContentSlotTypeRestrictionsWsDTO()
	{
		// default constructor
	}
	
	public void setContentSlotUid(final String contentSlotUid)
	{
		this.contentSlotUid = contentSlotUid;
	}

	public String getContentSlotUid() 
	{
		return contentSlotUid;
	}
	
	public void setValidComponentTypes(final List<String> validComponentTypes)
	{
		this.validComponentTypes = validComponentTypes;
	}

	public List<String> getValidComponentTypes() 
	{
		return validComponentTypes;
	}
	


}
