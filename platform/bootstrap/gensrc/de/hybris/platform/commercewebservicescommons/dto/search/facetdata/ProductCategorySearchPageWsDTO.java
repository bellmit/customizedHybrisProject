/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.search.facetdata;

import de.hybris.platform.commercewebservicescommons.dto.product.CategoryWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.search.facetdata.ProductSearchPageWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Representation od a Product Category Search Page
 */
@ApiModel(value="ProductCategorySearchPage", description="Representation od a Product Category Search Page")
public  class ProductCategorySearchPageWsDTO extends ProductSearchPageWsDTO 
{

 

	/** List of subcategories<br/><br/><i>Generated property</i> for <code>ProductCategorySearchPageWsDTO.subCategories</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="subCategories", value="List of subcategories") 	
	private List<CategoryWsDTO> subCategories;
	
	public ProductCategorySearchPageWsDTO()
	{
		// default constructor
	}
	
	public void setSubCategories(final List<CategoryWsDTO> subCategories)
	{
		this.subCategories = subCategories;
	}

	public List<CategoryWsDTO> getSubCategories() 
	{
		return subCategories;
	}
	


}
