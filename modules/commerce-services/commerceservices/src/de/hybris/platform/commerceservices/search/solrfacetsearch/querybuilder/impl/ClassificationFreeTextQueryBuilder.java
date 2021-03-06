/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.search.solrfacetsearch.querybuilder.impl;

import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.IndexedType;
import de.hybris.platform.solrfacetsearch.search.SearchQuery;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;


/**
 * Implementation of FreeTextQueryBuilder that finds all the searchable ClassAttributeAssignments
 *
 * @deprecated Since 6.4, default search mode (instead of legacy) should be used.
 */
@Deprecated(since = "6.4")
public class ClassificationFreeTextQueryBuilder extends AbstractFreeTextQueryBuilder
{
	private int boost;

	protected int getBoost()
	{
		return boost;
	}

	@Required
	public void setBoost(final int boost)
	{
		this.boost = boost;
	}

	@Override
	public void addFreeTextQuery(final SearchQuery searchQuery, final String fullText, final String[] textWords)
	{
		for (final IndexedProperty indexedProperty : getSearchableClassificationProperties(searchQuery.getIndexedType()))
		{
			addFreeTextQuery(searchQuery, indexedProperty, fullText, textWords, getBoost());
		}
	}

	protected List<IndexedProperty> getSearchableClassificationProperties(final IndexedType indexedType)
	{
		final List<IndexedProperty> result = new ArrayList<>();

		if (indexedType != null)
		{
			for (final IndexedProperty indexedProperty : indexedType.getIndexedProperties().values())
			{
				addIndexedProperty(result, indexedProperty);
			}
		}
		return result;
	}

	protected void addIndexedProperty(final List<IndexedProperty> result, final IndexedProperty indexedProperty)
	{
		if (!indexedProperty.isFacet())
		{
			final ClassAttributeAssignmentModel classAttributeAssignment = indexedProperty.getClassAttributeAssignment();
			if (classAttributeAssignment != null && Boolean.TRUE.equals(classAttributeAssignment.getSearchable()))
			{
				result.add(indexedProperty);
			}
		}
	}
}
