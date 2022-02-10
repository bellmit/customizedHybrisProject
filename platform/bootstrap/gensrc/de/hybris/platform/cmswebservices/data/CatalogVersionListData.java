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
import de.hybris.platform.cmsfacades.data.CatalogVersionData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * The list of content catalog versions.
 */
@ApiModel(value="CatalogVersionListData", description="The list of content catalog versions.")
public  class CatalogVersionListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogVersionListData.versions</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="versions") 	
	private List<CatalogVersionData> versions;
	
	public CatalogVersionListData()
	{
		// default constructor
	}
	
	public void setVersions(final List<CatalogVersionData> versions)
	{
		this.versions = versions;
	}

	public List<CatalogVersionData> getVersions() 
	{
		return versions;
	}
	


}
