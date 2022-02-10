/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.productconfig.services.strategies.impl;

import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartRestoration;
import de.hybris.platform.commerceservices.order.CommerceCartRestorationException;
import de.hybris.platform.commerceservices.order.CommerceCartRestorationStrategy;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.sap.productconfig.services.impl.CPQConfigurableChecker;
import de.hybris.platform.sap.productconfig.services.intf.ProductConfigurationOrderIntegrationService;
import de.hybris.platform.sap.productconfig.services.intf.ProductConfigurationPricingStrategy;
import de.hybris.platform.sap.productconfig.services.strategies.lifecycle.intf.ConfigurationAbstractOrderEntryLinkStrategy;
import de.hybris.platform.sap.productconfig.services.strategies.lifecycle.intf.ConfigurationAbstractOrderIntegrationStrategy;
import de.hybris.platform.sap.productconfig.services.strategies.lifecycle.intf.ConfigurationSavedCartCleanUpStrategy;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;


/**
 * CPQ implementation of {@link CommerceCartRestorationStrategy}. Takes care of releasing session artifacts
 */
public class ProductConfigurationCartRestorationStrategyImpl implements CommerceCartRestorationStrategy
{

	/**
	 * Indicates that inline configuration needs to be refreshed.
	 */
	public static final String REFRESH_INLINE_CONFIGURATION = "refreshInlineConfiguration";
	
	private CommerceCartRestorationStrategy commerceCartRestorationStrategy;
	private ProductConfigurationPricingStrategy productConfigurationPricingStrategy;
	private ProductConfigurationOrderIntegrationService productConfigurationOrderIntegrationService;
	private CPQConfigurableChecker cpqConfigurableChecker;
	private CartService cartService;
	private ConfigurationAbstractOrderEntryLinkStrategy configurationAbstractOrderEntryLinkStrategy;
	private ConfigurationSavedCartCleanUpStrategy cleanUpStrategy;
	private ConfigurationAbstractOrderIntegrationStrategy configurationAbstractOrderIntegrationStrategy;

	protected ConfigurationAbstractOrderEntryLinkStrategy getAbstractOrderEntryLinkStrategy()
	{
		return configurationAbstractOrderEntryLinkStrategy;
	}

	@Override
	public CommerceCartRestoration restoreCart(final CommerceCartParameter parameters) throws CommerceCartRestorationException
	{
		cleanUpStrategy.cleanUpCart();
		final CartModel cart = parameters.getCart();
		refreshConfigurations(cart);
		updatePrices(parameters);
		final CommerceCartRestoration restoration = getCommerceCartRestorationStrategy().restoreCart(parameters);
		addModificationsForConfigurableProducts(restoration, cart);
		return restoration;
	}

	protected void updatePrices(final CommerceCartParameter parameters)
	{
		// cart recalculation is performed by default implementation of CommerceCartRestorationStrategy
		retrieveCart(parameters).getEntries().stream().filter(this::isConfigurableProduct).forEach(this::updatePriceForCartEntry);
	}

	protected void updatePriceForCartEntry(final AbstractOrderEntryModel entry)
	{
		getConfigurationAbstractOrderIntegrationStrategy().getConfigurationForAbstractOrderEntry(entry);
		getProductConfigurationPricingStrategy().updateCartEntryPrices(entry, false, null);
	}

	protected boolean isConfigurableProduct(final AbstractOrderEntryModel entry)
	{
		return getCpqConfigurableChecker().isCPQConfiguratorApplicableProduct(entry.getProduct());
	}
	
	protected CartModel retrieveCart(final CommerceCartParameter parameters)
	{
		final CartModel cart = parameters.getCart();
		if (cart == null)
		{
			throw new IllegalStateException("No saved cart available for restore");
		}
		return cart;
	}
	
	protected void refreshConfigurations(final CartModel cart)
	{
		if (CollectionUtils.isEmpty(cart.getEntries()))
		{
			return;
		}
		for (final AbstractOrderEntryModel entry : cart.getEntries())
		{
			if (isConfigurableProduct(entry))
			{
				getConfigurationAbstractOrderIntegrationStrategy().refreshCartEntryConfiguration(entry);
			}
		}
	}

	protected void addModificationsForConfigurableProducts(final CommerceCartRestoration restoration, final CartModel cart)
	{
		final List<CommerceCartModification> modifications = restoration.getModifications();
		if (CollectionUtils.isEmpty(cart.getEntries()))
		{
			return;
		}
		for (final AbstractOrderEntryModel entry : cart.getEntries())
		{
			if (isConfigurableProduct(entry))
			{
				final CommerceCartModification configurationModification = new CommerceCartModification();
				configurationModification.setEntry(entry);
				configurationModification.setStatusCode(REFRESH_INLINE_CONFIGURATION);
				modifications.add(configurationModification);
			}
		}
	}

	protected CommerceCartRestorationStrategy getCommerceCartRestorationStrategy()
	{
		return commerceCartRestorationStrategy;
	}

	/**
	 * @param commerceCartRestorationStrategy
	 *           the commerceCartRestorationStrategy to set
	 */
	@Required
	public void setCommerceCartRestorationStrategy(final CommerceCartRestorationStrategy commerceCartRestorationStrategy)
	{
		this.commerceCartRestorationStrategy = commerceCartRestorationStrategy;
	}

	protected ProductConfigurationPricingStrategy getProductConfigurationPricingStrategy()
	{
		return productConfigurationPricingStrategy;
	}

	/**
	 * @param productConfigurationPricingStrategy
	 *           the productConfigurationPricingStrategy to set
	 */
	@Required
	public void setProductConfigurationPricingStrategy(
			final ProductConfigurationPricingStrategy productConfigurationPricingStrategy)
	{
		this.productConfigurationPricingStrategy = productConfigurationPricingStrategy;
	}

	protected ProductConfigurationOrderIntegrationService getProductConfigurationOrderIntegrationService()
	{
		return productConfigurationOrderIntegrationService;
	}

	/**
	 * @param productConfigurationOrderIntegrationService
	 *           the productConfigurationOrderIntegrationService to set
	 */
	@Required
	public void setProductConfigurationOrderIntegrationService(
			final ProductConfigurationOrderIntegrationService productConfigurationOrderIntegrationService)
	{
		this.productConfigurationOrderIntegrationService = productConfigurationOrderIntegrationService;
	}

	protected CPQConfigurableChecker getCpqConfigurableChecker()
	{
		return this.cpqConfigurableChecker;
	}

	/**
	 * Set helper, to check if the related product is CPQ configurable
	 *
	 * @param cpqConfigurableChecker
	 *           configurator checker
	 */
	@Required
	public void setCpqConfigurableChecker(final CPQConfigurableChecker cpqConfigurableChecker)
	{
		this.cpqConfigurableChecker = cpqConfigurableChecker;
	}


	public CartService getCartService()
	{
		return cartService;
	}

	@Required
	public void setCartService(final CartService cartService)
	{
		this.cartService = cartService;
	}

	/**
	 * @param configurationAbstractOrderEntryLinkStrategy
	 */
	public void setAbstractOrderEntryLinkStrategy(
			final ConfigurationAbstractOrderEntryLinkStrategy configurationAbstractOrderEntryLinkStrategy)
	{
		this.configurationAbstractOrderEntryLinkStrategy = configurationAbstractOrderEntryLinkStrategy;

	}

	protected ConfigurationSavedCartCleanUpStrategy getCleanUpStrategy()
	{
		return cleanUpStrategy;
	}

	@Required
	/*
	 * sets clean up strategy to release session artifacts
	 */
	public void setCleanUpStrategy(final ConfigurationSavedCartCleanUpStrategy cleanUpStrategy)
	{
		this.cleanUpStrategy = cleanUpStrategy;
	}

	/**
	 * @param configurationAbstractOrderIntegrationStrategy
	 */
	@Required
	public void setConfigurationAbstractOrderIntegrationStrategy(
			final ConfigurationAbstractOrderIntegrationStrategy configurationAbstractOrderIntegrationStrategy)
	{
		this.configurationAbstractOrderIntegrationStrategy = configurationAbstractOrderIntegrationStrategy;
	}

	protected ConfigurationAbstractOrderIntegrationStrategy getConfigurationAbstractOrderIntegrationStrategy()
	{
		return configurationAbstractOrderIntegrationStrategy;
	}
}
