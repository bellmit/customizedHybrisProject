/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.strategies.impl;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.order.dao.CommerceCartDao;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.commerceservices.strategies.StaleCartRemovalStrategy;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;


/**
 * Default strategy to remove all old carts related to the user and site.
 */
public class DefaultStaleCartRemovalStrategy implements StaleCartRemovalStrategy
{

	private ModelService modelService;
	private CommerceCartDao commerceCartDao;

	public void removeStaleCarts(final CommerceCartParameter parameters)
	{

		final CartModel currentCart = parameters.getCart();
		final BaseSiteModel baseSite = parameters.getBaseSite();
		final UserModel user = parameters.getUser();

		final List<CartModel> cartsToRemove = new ArrayList<CartModel>();

		final List<CartModel> oldCarts = getCommerceCartDao().getCartsForRemovalForSiteAndUser(currentCart.getModifiedtime(),
				baseSite, user);

		for (final CartModel cart : oldCarts)
		{
			if (!StringUtils.equals(cart.getGuid(), currentCart.getGuid())
					&& !StringUtils.equals(cart.getCode(), currentCart.getCode()))
			{
				cartsToRemove.add(cart);
			}
		}

		getModelService().removeAll(cartsToRemove);
	}

	/**
	 * @deprecated Since 5.2.
	 */
	@Override
	@Deprecated(since = "5.2")
	public void removeStaleCarts(final CartModel currentCart, final BaseSiteModel baseSite, final UserModel user)
	{
		final CommerceCartParameter parameter = new CommerceCartParameter();
		parameter.setEnableHooks(true);
		parameter.setCart(currentCart);
		parameter.setBaseSite(baseSite);
		parameter.setUser(user);
		this.removeStaleCarts(parameter);
	}

	protected ModelService getModelService()
	{
		return modelService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	protected CommerceCartDao getCommerceCartDao()
	{
		return commerceCartDao;
	}

	@Required
	public void setCommerceCartDao(final CommerceCartDao commerceCartDao)
	{
		this.commerceCartDao = commerceCartDao;
	}
}
