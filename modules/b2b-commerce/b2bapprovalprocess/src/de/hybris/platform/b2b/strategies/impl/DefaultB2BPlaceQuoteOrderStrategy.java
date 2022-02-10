/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2b.strategies.impl;

import de.hybris.platform.b2b.strategies.PlaceQuoteOrderStrategy;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.OrderModel;


/**
 * @deprecated Since 6.3. Please see quote functionality from commerce.
 */
@Deprecated(since="6.3")
public class DefaultB2BPlaceQuoteOrderStrategy extends DefaultB2BCreateOrderFromCartStrategy implements PlaceQuoteOrderStrategy
{
	@Override
	public void placeQuoteOrder(final OrderModel order)
	{
		createB2BBusinessProcess(order);
	}

	@Override
	public void placeOrderFromRejectedQuote(final OrderModel order)
	{
		//Since this order is placed from the rejected code, setting the order status to CREATED will
		//invoke the normal place order action
		order.setStatus(OrderStatus.CREATED);
		createB2BBusinessProcess(order);
	}
}
