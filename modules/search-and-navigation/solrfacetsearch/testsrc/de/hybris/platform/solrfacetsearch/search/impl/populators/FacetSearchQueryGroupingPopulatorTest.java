/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.solrfacetsearch.search.impl.populators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.BDDMockito.given;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedType;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider.FieldType;
import de.hybris.platform.solrfacetsearch.search.FieldNameTranslator;
import de.hybris.platform.solrfacetsearch.search.SearchQuery;
import de.hybris.platform.solrfacetsearch.search.impl.SearchQueryConverterData;

import org.apache.solr.client.solrj.SolrQuery;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


@UnitTest
public class FacetSearchQueryGroupingPopulatorTest
{
	public static final String FIELD = "field";
	public static final String TRANSLATED_FIELD = "translatedField";

	@Mock
	private FieldNameTranslator fieldNameTranslator;

	private FacetSearchQueryGroupingPopulator facetSearchQueryGroupingPopulator;
	private SearchQueryConverterData searchQueryConverterData;

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);

		final FacetSearchConfig facetSearchConfig = new FacetSearchConfig();
		final IndexedType indexedType = new IndexedType();
		final SearchQuery searchQuery = new SearchQuery(facetSearchConfig, indexedType);

		facetSearchQueryGroupingPopulator = new FacetSearchQueryGroupingPopulator();
		facetSearchQueryGroupingPopulator.setFieldNameTranslator(fieldNameTranslator);

		searchQueryConverterData = new SearchQueryConverterData();
		searchQueryConverterData.setSearchQuery(searchQuery);

		given(fieldNameTranslator.translate(searchQuery, FIELD, FieldType.INDEX)).willReturn(TRANSLATED_FIELD);
	}

	@Test
	public void populateWithEmptyGroups()
	{
		// given
		final SolrQuery solrQuery = new SolrQuery();

		// when
		facetSearchQueryGroupingPopulator.populate(searchQueryConverterData, solrQuery);

		// then
		assertNull(solrQuery.get(FacetSearchQueryGroupingPopulator.GROUP_PARAM));
		assertNull(solrQuery.get(FacetSearchQueryGroupingPopulator.GROUP_NGROUPS_PARAM));
		assertNull(solrQuery.get(FacetSearchQueryGroupingPopulator.GROUP_FACET_PARAM));
		assertNull(solrQuery.get(FacetSearchQueryGroupingPopulator.GROUP_FIELD_PARAM));
		assertNull(solrQuery.get(FacetSearchQueryGroupingPopulator.GROUP_LIMIT_PARAM));
	}

	@Test
	public void populateWithSingleGroup()
	{
		// given
		final Integer groupLimit = Integer.valueOf(10);

		final SearchQuery searchQuery = searchQueryConverterData.getSearchQuery();
		searchQuery.addGroupCommand(FIELD, groupLimit);
		searchQuery.setGroupFacets(true);


		final SolrQuery solrQuery = new SolrQuery();

		// when
		facetSearchQueryGroupingPopulator.populate(searchQueryConverterData, solrQuery);

		// then
		assertEquals("true", solrQuery.get(FacetSearchQueryGroupingPopulator.GROUP_PARAM));
		assertEquals("true", solrQuery.get(FacetSearchQueryGroupingPopulator.GROUP_NGROUPS_PARAM));
		assertEquals("true", solrQuery.get(FacetSearchQueryGroupingPopulator.GROUP_FACET_PARAM));
		assertEquals(TRANSLATED_FIELD, solrQuery.get(FacetSearchQueryGroupingPopulator.GROUP_FIELD_PARAM));
		assertEquals("10", solrQuery.get(FacetSearchQueryGroupingPopulator.GROUP_LIMIT_PARAM));
	}
}
