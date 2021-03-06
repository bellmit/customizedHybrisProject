/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * A list of all configured content catalogs and version details
 */
@ApiModel(value="CatalogVersionData", description="A list of all configured content catalogs and version details")
public  class CatalogVersionData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogVersionData.uid</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="uid") 	
	private String uid;

	/** <i>Generated property</i> for <code>CatalogVersionData.version</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="version") 	
	private String version;

	/** <i>Generated property</i> for <code>CatalogVersionData.active</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="active") 	
	private Boolean active;

	/** <i>Generated property</i> for <code>CatalogVersionData.pageDisplayConditions</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="pageDisplayConditions") 	
	private List<DisplayConditionData> pageDisplayConditions;
	
	public CatalogVersionData()
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
	
	public void setVersion(final String version)
	{
		this.version = version;
	}

	public String getVersion() 
	{
		return version;
	}
	
	public void setActive(final Boolean active)
	{
		this.active = active;
	}

	public Boolean getActive() 
	{
		return active;
	}
	
	public void setPageDisplayConditions(final List<DisplayConditionData> pageDisplayConditions)
	{
		this.pageDisplayConditions = pageDisplayConditions;
	}

	public List<DisplayConditionData> getPageDisplayConditions() 
	{
		return pageDisplayConditions;
	}
	


}
