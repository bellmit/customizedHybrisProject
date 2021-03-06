/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtb2bfacades.cart.impl;

import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.data.ProductData;

import org.easymock.EasyMock;


/**
 * 
 */
public class OrderEntryDataMockBuilder
{

	OrderEntryData orderEntryDataMock = EasyMock.createNiceMock(OrderEntryData.class);

	public static OrderEntryDataMockBuilder create()
	{
		return new OrderEntryDataMockBuilder();
	}

	public OrderEntryDataMockBuilder withStandardQuantity(final Long quantity)
	{
		EasyMock.expect(orderEntryDataMock.getQuantity()).andReturn(quantity).anyTimes();
		return this;
	}

	public OrderEntryData build()
	{
		EasyMock.replay(orderEntryDataMock);
		return orderEntryDataMock;
	}

	/**
	 * @param productCode
	 * @return
	 */
	public OrderEntryDataMockBuilder withStandardProductCode(final String productCode)
	{
		final ProductData productData = new ProductData();
		productData.setCode(productCode);
		EasyMock.expect(orderEntryDataMock.getProduct()).andReturn(productData).anyTimes();
		return this;
	}

}
