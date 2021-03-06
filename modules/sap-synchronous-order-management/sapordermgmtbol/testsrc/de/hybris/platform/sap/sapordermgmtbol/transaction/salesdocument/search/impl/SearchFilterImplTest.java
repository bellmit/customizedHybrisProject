/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.search.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.search.interf.SearchResult;

import org.junit.Test;


@UnitTest
@SuppressWarnings("javadoc")
public class SearchFilterImplTest
{

	SearchFilterImpl classUnderTest = new SearchFilterImpl();

	@Test
	public void testNotShipped()
	{
		classUnderTest.setShippingStatus(SearchResult.SHIPPING_NOT_SHIPPED);
		assertEquals(SearchResult.SHIPPING_NOT_SHIPPED, classUnderTest.getShippingStatus());
	}

	@Test
	public void testNoStatus()
	{
		assertNull(classUnderTest.getShippingStatus());
	}

	@Test
	public void testProduct()
	{
		final String product = "A";
		classUnderTest.setProductID(product);
		assertEquals(product, classUnderTest.getProductID());
	}

}
