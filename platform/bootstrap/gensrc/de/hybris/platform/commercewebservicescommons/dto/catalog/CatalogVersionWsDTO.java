/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.catalog;

import de.hybris.platform.commercewebservicescommons.dto.catalog.AbstractCatalogItemWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.catalog.CategoryHierarchyWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Collection;

/**
 * Representation of a Catalog Version
 */
@ApiModel(value="CatalogVersion", description="Representation of a Catalog Version")
public  class CatalogVersionWsDTO extends AbstractCatalogItemWsDTO 
{

 

	/** List of category hierarchies<br/><br/><i>Generated property</i> for <code>CatalogVersionWsDTO.categories</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="categories", value="List of category hierarchies") 	
	private Collection<CategoryHierarchyWsDTO> categories;
	
	public CatalogVersionWsDTO()
	{
		// default constructor
	}
	
	public void setCategories(final Collection<CategoryHierarchyWsDTO> categories)
	{
		this.categories = categories;
	}

	public Collection<CategoryHierarchyWsDTO> getCategories() 
	{
		return categories;
	}
	


}