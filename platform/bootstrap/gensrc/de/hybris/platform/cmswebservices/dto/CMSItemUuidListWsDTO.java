/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="CMSItemUuidListWsDTO")
public  class CMSItemUuidListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSItemUuidListWsDTO.uuids</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="uuids") 	
	private List<String> uuids;
	
	public CMSItemUuidListWsDTO()
	{
		// default constructor
	}
	
	public void setUuids(final List<String> uuids)
	{
		this.uuids = uuids;
	}

	public List<String> getUuids() 
	{
		return uuids;
	}
	


}
