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
import java.util.List;

/**
 * List of uids
 */
@ApiModel(value="UidListData", description="List of uids")
public  class UidListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>UidListData.uids</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="uids") 	
	private List<String> uids;
	
	public UidListData()
	{
		// default constructor
	}
	
	public void setUids(final List<String> uids)
	{
		this.uids = uids;
	}

	public List<String> getUids() 
	{
		return uids;
	}
	


}
