/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.search.solrfacetsearch.provider.impl;

import de.hybris.platform.variants.model.GenericVariantProductModel;
import de.hybris.platform.commerceservices.search.solrfacetsearch.provider.AbstractMultidimensionalProductFieldValueProvider;
import de.hybris.platform.commerceservices.url.UrlResolver;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.variants.model.VariantProductModel;

import java.util.*;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;


/**
 * Value Provider for url of multidimensional products.
 */
public class FirstGenericVariantProductUrlValueProvider extends AbstractMultidimensionalProductFieldValueProvider
{
	private UrlResolver<ProductModel> productModelUrlResolver;

	private Comparator<GenericVariantProductModel> genericVariantProductModelComparator;

	@Override
	public Object getFieldValue(final ProductModel product)
	{
		String url = null;
		if (isVariantBaseProduct(product))
		{
			final Collection<VariantProductModel> variants = product.getVariants();
			if (CollectionUtils.isNotEmpty(variants))
			{
				final List<GenericVariantProductModel> genericVariants = new ArrayList<>();
				for (final VariantProductModel variant : variants)
				{
					if (variant instanceof GenericVariantProductModel)
					{
						genericVariants.add((GenericVariantProductModel) variant);
					}
				}
				if (!genericVariants.isEmpty())
				{
					Collections.sort(genericVariants, genericVariantProductModelComparator);
					url = productModelUrlResolver.resolve(genericVariants.get(0));
				}
			}
		}
		return url;
	}

	public UrlResolver<ProductModel> getProductModelUrlResolver()
	{
		return productModelUrlResolver;
	}

	@Required
	public void setProductModelUrlResolver(final UrlResolver<ProductModel> productModelUrlResolver)
	{
		this.productModelUrlResolver = productModelUrlResolver;
	}

	public Comparator<GenericVariantProductModel> getGenericVariantProductModelComparator()
	{
		return genericVariantProductModelComparator;
	}

	@Required
	public void setGenericVariantProductModelComparator(
			final Comparator<GenericVariantProductModel> genericVariantProductModelComparator)
	{
		this.genericVariantProductModelComparator = genericVariantProductModelComparator;
	}


}
