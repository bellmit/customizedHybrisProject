/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmssmarteditwebservices.data;

import java.io.Serializable;
import de.hybris.platform.cmssmarteditwebservices.data.ComponentTypeAttributeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="ComponentTypeData")
public  class ComponentTypeData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ComponentTypeData.code</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="code") 	
	private String code;

	/** <i>Generated property</i> for <code>ComponentTypeData.category</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="category") 	
	private String category;

	/** <i>Generated property</i> for <code>ComponentTypeData.name</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="name") 	
	private String name;

	/** <i>Generated property</i> for <code>ComponentTypeData.i18nKey</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="i18nKey") 	
	private String i18nKey;

	/** <i>Generated property</i> for <code>ComponentTypeData.type</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="type") 	
	private String type;

	/** <i>Generated property</i> for <code>ComponentTypeData.attributes</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="attributes") 	
	private List<ComponentTypeAttributeData> attributes;
	
	public ComponentTypeData()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setCategory(final String category)
	{
		this.category = category;
	}

	public String getCategory() 
	{
		return category;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setI18nKey(final String i18nKey)
	{
		this.i18nKey = i18nKey;
	}

	public String getI18nKey() 
	{
		return i18nKey;
	}
	
	public void setType(final String type)
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}
	
	public void setAttributes(final List<ComponentTypeAttributeData> attributes)
	{
		this.attributes = attributes;
	}

	public List<ComponentTypeAttributeData> getAttributes() 
	{
		return attributes;
	}
	


}
