/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionservices.subscription;

import de.hybris.platform.commerceservices.order.impl.AbstractCommerceCartStrategy;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.storelocator.model.PointOfServiceModel;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


/**
 * Temporary solution until the DefaultSubscriptionCommmerceCartService is adjusted to the pre/post-hook refactoring.
 * Expose some helper methods that have been moved from the DefaultCommerceCartService to the
 * {@link AbstractCommerceCartStrategy}. See there for a description of these methods
 */
public interface SubscriptionCommerceCartStrategy
{
	/**
	 * see {@link AbstractCommerceCartStrategy#normalizeEntryNumbers}.
	 */
	void normalizeEntryNumbers(@Nonnull CartModel cartModel);

	/**
	 * see {@link AbstractCommerceCartStrategy#getEntryForNumber}.
	 */
	@Nullable
	AbstractOrderEntryModel getEntryForNumber(@Nonnull AbstractOrderModel order, int number);

	/**
	 * see {@link AbstractCommerceCartStrategy#getAvailableStockLevel}.
	 */
	long getAvailableStockLevel(@Nonnull final ProductModel productModel,@Nullable final PointOfServiceModel pointOfServiceModel);

	/**
	 * see {@link AbstractCommerceCartStrategy#getForceInStockMaxQuantity}.
	 */
	long getForceInStockMaxQuantity();
}
