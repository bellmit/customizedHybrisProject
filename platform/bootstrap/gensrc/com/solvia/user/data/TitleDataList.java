/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.user.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.user.data.TitleData;
import java.util.List;

public  class TitleDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>TitleDataList.titles</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<TitleData> titles;
	
	public TitleDataList()
	{
		// default constructor
	}
	
	public void setTitles(final List<TitleData> titles)
	{
		this.titles = titles;
	}

	public List<TitleData> getTitles() 
	{
		return titles;
	}
	


}
