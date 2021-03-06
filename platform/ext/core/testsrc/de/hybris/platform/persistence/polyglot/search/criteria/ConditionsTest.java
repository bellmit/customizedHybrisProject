/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.persistence.polyglot.search.criteria;

import de.hybris.platform.persistence.polyglot.PolyglotPersistence;

import static org.assertj.core.api.Assertions.assertThat;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.persistence.polyglot.search.criteria.Conditions.ComparisonCondition.CmpOperator;

import org.junit.Test;


@UnitTest
public class ConditionsTest
{
	@Test(expected = NullPointerException.class)
	public void shouldFailComparisionWithNullLT()
	{
		de.hybris.platform.persistence.polyglot.search.criteria.Conditions.cmp(PolyglotPersistence.CoreAttributes.pk(),
				CmpOperator.LESS_THAN, null);
	}

	@Test(expected = NullPointerException.class)
	public void shouldFailComparisionWithNullLOET()
	{
		de.hybris.platform.persistence.polyglot.search.criteria.Conditions.cmp(PolyglotPersistence.CoreAttributes.pk(),
				CmpOperator.LESS_OR_EQUAL_THAN, null);
	}

	@Test(expected = NullPointerException.class)
	public void shouldFailComparisionWithNullGT()
	{
		de.hybris.platform.persistence.polyglot.search.criteria.Conditions.cmp(PolyglotPersistence.CoreAttributes.pk(),
				CmpOperator.GREATER_THAN, null);
	}

	@Test(expected = NullPointerException.class)
	public void shouldFailComparisionWithNullGOET()
	{
		de.hybris.platform.persistence.polyglot.search.criteria.Conditions.cmp(PolyglotPersistence.CoreAttributes.pk(),
				CmpOperator.GREATER_OR_EQUAL_THAN, null);
	}

	@Test
	public void shouldPassComparisionWithNullEQ()
	{
		assertThat(de.hybris.platform.persistence.polyglot.search.criteria.Conditions.cmp(PolyglotPersistence.CoreAttributes.pk(),
				CmpOperator.EQUAL, null)).isNotNull();
	}

	@Test
	public void shouldPassComparisionWithNullNEQ()
	{
		assertThat(Conditions.cmp(PolyglotPersistence.CoreAttributes.pk(), CmpOperator.NOT_EQUAL, null)).isNotNull();
	}
}
