/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cms2.namedquery.service.impl;

import static java.util.Locale.ENGLISH;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.cms2.exceptions.InvalidNamedQueryException;
import de.hybris.platform.cms2.namedquery.NamedQuery;
import de.hybris.platform.cms2.namedquery.NamedQueryConversionDto;
import de.hybris.platform.cms2.namedquery.service.NamedQueryFactory;
import de.hybris.platform.servicelayer.i18n.I18NService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.impl.SearchResultImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.google.common.collect.ImmutableMap;

@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class NamedQueryServiceTest
{

	private static final String QUERY = "QUERY";
	private static final String QUERY_NAME = "QUERY_NAME";

	@Mock
	FlexibleSearchService flexibleSearchService;

	@Mock
	NamedQueryFactory mediaSearchNamedQueryFactory;

	@Mock
	FlexibleSearchNamedQueryConverter flexibleSearchNamedQueryConverter;

	@Mock
	I18NService i18NService;

	@InjectMocks
	FlexibleSearchNamedQueryService namedQueryService;

	SearchResult<Object> searchResult = new SearchResultImpl<>(Arrays.asList("result 1"), 1, 100, 0);

	private final Locale locale = ENGLISH;

	@Before
	public void setup() throws InvalidNamedQueryException
	{
		Mockito.when(mediaSearchNamedQueryFactory.getNamedQuery(QUERY_NAME)).thenReturn(QUERY);
		Mockito.when(i18NService.getCurrentLocale()).thenReturn(locale);
	}

	@Test
	public void testNamedQueryServiceSearchCoordination() throws InvalidNamedQueryException
	{
		final FlexibleSearchQuery flexibleSearchQuery = Mockito.mock(FlexibleSearchQuery.class);
		Mockito.when(flexibleSearchNamedQueryConverter.convert(Mockito.any())).thenReturn(flexibleSearchQuery);

		Mockito.when(flexibleSearchService.search(flexibleSearchQuery)).thenReturn(searchResult);

		final List<Object> search = namedQueryService.search(new NamedQuery() //
				.withQueryName(QUERY_NAME) //
				.withCurrentPage(1) //
				.withPageSize(10)
				.withParameters(ImmutableMap.of("langIsoCode", locale.toString())));

		Assert.assertEquals(searchResult.getResult(), search);
	}

	@Test
	public void testInternalNamedQueryAssignment()
	{
		final NamedQuery namedQuery = new NamedQuery().withSort(new ArrayList<>()).withParameters(new HashMap<>()).withPageSize(100)
				.withCurrentPage(1).withQueryName(QUERY_NAME);
		final NamedQueryConversionDto namedQueryConversionDto = namedQueryService.getInternalNamedQuery(namedQuery, QUERY);
		Assert.assertEquals(namedQuery.getCurrentPage(), namedQueryConversionDto.getNamedQuery().getCurrentPage());
		Assert.assertEquals(namedQuery.getSort(), namedQueryConversionDto.getNamedQuery().getSort());
		Assert.assertEquals(namedQuery.getParameters(), namedQueryConversionDto.getNamedQuery().getParameters());
		Assert.assertEquals(namedQuery.getPageSize(), namedQueryConversionDto.getNamedQuery().getPageSize());
		Assert.assertEquals(namedQuery.getQueryName(), namedQueryConversionDto.getNamedQuery().getQueryName());
		Assert.assertEquals(QUERY, namedQueryConversionDto.getQuery());
	}

	@Test(expected = InvalidNamedQueryException.class)
	public void testInvalidNamedQueryExceptionAfterSearch() throws InvalidNamedQueryException
	{
		Mockito.when(mediaSearchNamedQueryFactory.getNamedQuery(Mockito.anyString())).thenThrow(InvalidNamedQueryException.class);

		final NamedQuery namedQuery = new NamedQuery().withQueryName(QUERY_NAME);

		namedQueryService.search(namedQuery);
	}
}
