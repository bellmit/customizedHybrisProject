/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.slvCategory;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.slvCategory.SlvCategoryDataWSDTO;
import java.util.List;

public  class SlvCategoryDataListWSDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SlvCategoryDataListWSDTO.slvCategory</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<SlvCategoryDataWSDTO> slvCategory;
	
	public SlvCategoryDataListWSDTO()
	{
		// default constructor
	}
	
	public void setSlvCategory(final List<SlvCategoryDataWSDTO> slvCategory)
	{
		this.slvCategory = slvCategory;
	}

	public List<SlvCategoryDataWSDTO> getSlvCategory() 
	{
		return slvCategory;
	}
	


}
