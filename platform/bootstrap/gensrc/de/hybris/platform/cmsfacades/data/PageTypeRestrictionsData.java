/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import java.util.List;

public  class PageTypeRestrictionsData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageTypeRestrictionsData.pageUid</code> property defined at extension <code>cmsfacades</code>. */
		
	private String pageUid;

	/** <i>Generated property</i> for <code>PageTypeRestrictionsData.validComponentTypes</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<String> validComponentTypes;
	
	public PageTypeRestrictionsData()
	{
		// default constructor
	}
	
	public void setPageUid(final String pageUid)
	{
		this.pageUid = pageUid;
	}

	public String getPageUid() 
	{
		return pageUid;
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
