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
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of languages.
 */
@ApiModel(value="LanguageListData", description="List of languages.")
public  class LanguageListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>LanguageListData.languages</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="languages") 	
	private List<LanguageData> languages;
	
	public LanguageListData()
	{
		// default constructor
	}
	
	public void setLanguages(final List<LanguageData> languages)
	{
		this.languages = languages;
	}

	public List<LanguageData> getLanguages() 
	{
		return languages;
	}
	


}
