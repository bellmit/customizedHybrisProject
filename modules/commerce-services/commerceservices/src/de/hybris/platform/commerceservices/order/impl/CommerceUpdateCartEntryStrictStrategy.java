/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.order.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.order.CommerceCartModificationStatus;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.storelocator.model.PointOfServiceModel;


/**
 * A strict strategy to update a cart entry.
 *
 */
public class CommerceUpdateCartEntryStrictStrategy extends DefaultCommerceUpdateCartEntryStrategy
{
	@Override
	public CommerceCartModification updateQuantityForCartEntry(final CommerceCartParameter parameters)
			throws CommerceCartModificationException
	{
		//strategy checks if there is enough stock for an update. if not - it throws an exception
		final long entryNumber = parameters.getEntryNumber();
		final CartModel cartModel = parameters.getCart();
		final PointOfServiceModel pointOfServiceModel = parameters.getPointOfService();
		final long newQuantity = parameters.getQuantity();

		validateParameterNotNull(cartModel, "Cart model cannot be null");

		final AbstractOrderEntryModel entryToUpdate = getEntryForNumber(cartModel, (int) entryNumber);
		final ProductModel productModel = entryToUpdate.getProduct();
		final long quantityToAdd = newQuantity - entryToUpdate.getQuantity().longValue();

		if (isStockLevelSufficient(cartModel, productModel, pointOfServiceModel, quantityToAdd))
		{
			return super.updateQuantityForCartEntry(parameters);
		}
		else
		{
			throw new CommerceCartModificationException("Insufficient stock level");
		}
	}

	@Override
	public CommerceCartModification updatePointOfServiceForCartEntry(final CommerceCartParameter parameters)
			throws CommerceCartModificationException
	{
		//strategy doesnt merge two entries if they have the same SKU and POS. it always add a new entry
		final CartModel cartModel = parameters.getCart();
		final PointOfServiceModel pointOfServiceModel = parameters.getPointOfService();
		validateParameterNotNull(cartModel, "Cart model cannot be null");
		validateParameterNotNull(pointOfServiceModel, "PointOfService Model cannot be null");

		final CartEntryModel entryToUpdate = (CartEntryModel) getEntryForNumber(cartModel, (int) parameters.getEntryNumber());

		if (entryToUpdate == null)
		{
			throw new CommerceCartModificationException("Unknown entry number");
		}

		if (!isOrderEntryUpdatable(entryToUpdate))
		{
			throw new CommerceCartModificationException("Entry is not updatable");
		}

		final CommerceCartModification modification = new CommerceCartModification();
		entryToUpdate.setDeliveryPointOfService(pointOfServiceModel);
		getModelService().save(entryToUpdate);
		getModelService().refresh(cartModel);
		final CommerceCartParameter parameter = new CommerceCartParameter();
		parameter.setEnableHooks(true);
		parameter.setCart(cartModel);
		getCommerceCartCalculationStrategy().calculateCart(parameter);
		getModelService().refresh(entryToUpdate);
		modification.setEntry(entryToUpdate);
		modification.setStatusCode(CommerceCartModificationStatus.SUCCESS);
		return modification;

	}

	@Override
	public CommerceCartModification updateToShippingModeForCartEntry(final CommerceCartParameter parameters)
			throws CommerceCartModificationException
	{
		//strategy doesnt merge two entries if they have the same SKU and POS. it always add a new entry
		final CartModel cartModel = parameters.getCart();

		final AbstractOrderEntryModel entryToUpdate = getEntryForNumber(cartModel, (int) parameters.getEntryNumber());
		final CommerceCartModification modification = new CommerceCartModification();

		validateEntryBeforeSetShippingMode(entryToUpdate);

		final long quantityBeforeChange = entryToUpdate.getQuantity().longValue();
		final long stockLevel = getAvailableStockLevel(entryToUpdate.getProduct(), null);
		// Now limit that to the total available in stock
		final long newTotalQuantityAfterStockLimit = Math.min(quantityBeforeChange, stockLevel);

		entryToUpdate.setDeliveryPointOfService(null);
		entryToUpdate.setQuantity(Long.valueOf(newTotalQuantityAfterStockLimit));
		getModelService().save(entryToUpdate);
		getModelService().refresh(cartModel);
		final CommerceCartParameter parameter = new CommerceCartParameter();
		parameter.setEnableHooks(true);
		parameter.setCart(cartModel);
		getCommerceCartCalculationStrategy().calculateCart(parameter);

		if (quantityBeforeChange == newTotalQuantityAfterStockLimit)
		{
			modification.setStatusCode(CommerceCartModificationStatus.SUCCESS);
		}
		else
		{
			modification.setStatusCode(CommerceCartModificationStatus.LOW_STOCK);
		}
		modification.setQuantity(entryToUpdate.getQuantity().longValue());
		modification.setEntry(entryToUpdate);
		return modification;
	}
}
