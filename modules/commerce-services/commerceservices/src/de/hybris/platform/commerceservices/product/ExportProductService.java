/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.product;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collection;
import java.util.Date;


/**
 * Product related methods that add export product functions not provided in {@link ProductService}
 */
public interface ExportProductService
{

	/**
	 * Returns all Products. For the search the current session active catalogversions of the current user are used.
	 * 
	 * @param catalogVersions
	 *           catalog versions used to query for products
	 * 
	 * @param start
	 *           index position of the first Product, which will be included in the returned List
	 * @param count
	 *           number of Products which will be returned in the List
	 * @return page of {@link ProductModel} wrapped on {@link SearchResult}
	 */
	SearchPageData<ProductModel> getAllProducts(Collection<CatalogVersionModel> catalogVersions, int start, int count);


	/**
	 * Returns page of products modified after timestamp for catalog version
	 * 
	 * @param catalogVersions
	 *           catalog versions used to query for products
	 * @param timestamp
	 *           modification time
	 * @param start
	 *           index position of the first Product, which will be included in the returned List
	 * @param count
	 *           number of Products which will be returned in the List
	 * @return page of {@link ProductModel}
	 */
	SearchPageData<ProductModel> getModifiedProducts(Collection<CatalogVersionModel> catalogVersions, Date timestamp, int start,
			int count);
}
