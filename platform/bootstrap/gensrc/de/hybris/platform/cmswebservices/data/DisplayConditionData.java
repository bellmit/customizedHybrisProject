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
import de.hybris.platform.cmswebservices.data.OptionData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="DisplayConditionData")
public  class DisplayConditionData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>DisplayConditionData.typecode</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="typecode") 	
	private String typecode;

	/** <i>Generated property</i> for <code>DisplayConditionData.options</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="options") 	
	private List<OptionData> options;
	
	public DisplayConditionData()
	{
		// default constructor
	}
	
	public void setTypecode(final String typecode)
	{
		this.typecode = typecode;
	}

	public String getTypecode() 
	{
		return typecode;
	}
	
	public void setOptions(final List<OptionData> options)
	{
		this.options = options;
	}

	public List<OptionData> getOptions() 
	{
		return options;
	}
	


}
