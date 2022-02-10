/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsoccaddon.data;

import java.io.Serializable;
import java.util.List;

/**
 * List of CMS component IDs
 */
public  class ComponentIDListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ComponentIDListWsDTO.idList</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private List<String> idList;
	
	public ComponentIDListWsDTO()
	{
		// default constructor
	}
	
	public void setIdList(final List<String> idList)
	{
		this.idList = idList;
	}

	public List<String> getIdList() 
	{
		return idList;
	}
	


}
