/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmssmarteditwebservices.data;

import java.io.Serializable;
import de.hybris.platform.cmsfacades.data.MediaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;

@ApiModel(value="ProductData")
public  class ProductData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductData.uid</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="uid") 	
	private String uid;

	/** <i>Generated property</i> for <code>ProductData.code</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="code") 	
	private String code;

	/** <i>Generated property</i> for <code>ProductData.name</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="name") 	
	private Map<String,String> name;

	/** <i>Generated property</i> for <code>ProductData.description</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="description") 	
	private Map<String,String> description;

	/** <i>Generated property</i> for <code>ProductData.thumbnail</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="thumbnail") 	
	private MediaData thumbnail;

	/** <i>Generated property</i> for <code>ProductData.catalogId</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="catalogId") 	
	private String catalogId;

	/** <i>Generated property</i> for <code>ProductData.catalogVersion</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="catalogVersion") 	
	private String catalogVersion;
	
	public ProductData()
	{
		// default constructor
	}
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

	public String getUid() 
	{
		return uid;
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setName(final Map<String,String> name)
	{
		this.name = name;
	}

	public Map<String,String> getName() 
	{
		return name;
	}
	
	public void setDescription(final Map<String,String> description)
	{
		this.description = description;
	}

	public Map<String,String> getDescription() 
	{
		return description;
	}
	
	public void setThumbnail(final MediaData thumbnail)
	{
		this.thumbnail = thumbnail;
	}

	public MediaData getThumbnail() 
	{
		return thumbnail;
	}
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

	public String getCatalogId() 
	{
		return catalogId;
	}
	
	public void setCatalogVersion(final String catalogVersion)
	{
		this.catalogVersion = catalogVersion;
	}

	public String getCatalogVersion() 
	{
		return catalogVersion;
	}
	


}
