/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.acceleratorfacades.product.converters.populator;

import de.hybris.platform.catalog.model.KeywordModel;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Populate the product data with the product's description
 */
public class ProductKeywordsPopulator implements Populator<ProductModel, ProductData>
{
	@Override
	public void populate(final ProductModel source, final ProductData target) throws ConversionException
	{
		final List<KeywordModel> keywords = source.getKeywords();

		// Remove duplicates
		final Set<String> keywordSet = new HashSet<String>(keywords.size());
		for (final KeywordModel keyword : keywords)
		{
			keywordSet.add(keyword.getKeyword());
		}

		target.setKeywords(keywordSet);
	}
}
