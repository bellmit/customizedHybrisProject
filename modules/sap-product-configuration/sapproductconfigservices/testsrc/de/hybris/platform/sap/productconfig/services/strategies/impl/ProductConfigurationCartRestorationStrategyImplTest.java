/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.productconfig.services.strategies.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartRestoration;
import de.hybris.platform.commerceservices.order.CommerceCartRestorationException;
import de.hybris.platform.commerceservices.order.CommerceCartRestorationStrategy;
import de.hybris.platform.commerceservices.order.impl.DefaultCommerceCartRestorationStrategy;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.sap.productconfig.services.impl.CPQConfigurableChecker;
import de.hybris.platform.sap.productconfig.services.intf.ProductConfigurationOrderIntegrationService;
import de.hybris.platform.sap.productconfig.services.intf.ProductConfigurationPricingStrategy;
import de.hybris.platform.sap.productconfig.services.strategies.lifecycle.intf.ConfigurationAbstractOrderEntryLinkStrategy;
import de.hybris.platform.sap.productconfig.services.strategies.lifecycle.intf.ConfigurationAbstractOrderIntegrationStrategy;
import de.hybris.platform.sap.productconfig.services.strategies.lifecycle.intf.ConfigurationSavedCartCleanUpStrategy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class ProductConfigurationCartRestorationStrategyImplTest
{
	private static final String PRODUCT_KEY = "DRAGON_CAR";

	@Mock
	private CartService cartService;
	@Mock
	private ProductConfigurationPricingStrategy productConfigurationPricingStrategy;
	@Mock
	private ProductConfigurationOrderIntegrationService productConfigurationOrderIntegrationService;
	@Mock
	private CPQConfigurableChecker cpqConfigurableChecker;
	@Mock
	private ConfigurationAbstractOrderEntryLinkStrategy configurationAbstractOrderEntryLinkStrategy;
	@Mock
	private ConfigurationAbstractOrderIntegrationStrategy configurationAbstractOrderIntegrationStrategy;
	@Mock
	private CommerceCartRestorationStrategy commerceCartRestorationStrategy;
	@Mock
	private ConfigurationSavedCartCleanUpStrategy cleanUpStrategy;
	
	@InjectMocks
	private ProductConfigurationCartRestorationStrategyImpl classUnderTest;

	private final CommerceCartParameter parameters = new CommerceCartParameter();
	private final CommerceCartRestoration commerceCartRestoration = new CommerceCartRestoration();
	private final List<AbstractOrderEntryModel> entryList = new ArrayList<AbstractOrderEntryModel>();
	private final CommerceCartRestorationStrategy commerceSaveCartRestorationStrategy = new DefaultCommerceCartRestorationStrategy();

	private final CartModel cartModel = new CartModel();
	private final CartEntryModel cartEntry = new CartEntryModel();
	private final ProductModel productModel = new ProductModel();
	private final ProductModel changebaleVariantProductModel = new ProductModel();
	private final ProductModel variantProductModel = new ProductModel();


	@Before
	public void initialize() throws CommerceCartRestorationException
	{
		entryList.add(cartEntry);
		parameters.setCart(cartModel);
		cartModel.setEntries(entryList);
		cartEntry.setProduct(productModel);
		productModel.setCode(PRODUCT_KEY);

		given(cartService.hasSessionCart()).willReturn(true);
		given(cartService.getSessionCart()).willReturn(cartModel);

		given(cpqConfigurableChecker.isCPQConfiguratorApplicableProduct(productModel)).willReturn(true);
		given(cpqConfigurableChecker.isCPQConfiguratorApplicableProduct(changebaleVariantProductModel)).willReturn(true);
		given(cpqConfigurableChecker.isCPQNotChangeableVariantProduct(variantProductModel)).willReturn(true);
	}

	@Test
	public void testConfigurationAbstractOrderIntegrationStrategy()
	{
		assertEquals(configurationAbstractOrderIntegrationStrategy,
				classUnderTest.getConfigurationAbstractOrderIntegrationStrategy());
	}


	@Test(expected = IllegalStateException.class)
	public void testRetrieveCartNoCart()
	{
		parameters.setCart(null);
		classUnderTest.retrieveCart(parameters);
	}

	@Test
	public void testUpdatePrices()
	{
		classUnderTest.updatePrices(parameters);
		verify(productConfigurationPricingStrategy, Mockito.times(1)).updateCartEntryPrices(cartEntry, false, null);
	}

	@Test
	public void testUpdatePriceForCartEntry()
	{
		classUnderTest.updatePriceForCartEntry(cartEntry);
		verify(configurationAbstractOrderIntegrationStrategy, Mockito.times(1)).getConfigurationForAbstractOrderEntry(cartEntry);
		verify(productConfigurationPricingStrategy, Mockito.times(1)).updateCartEntryPrices(cartEntry, false, null);
	}

	@Test
	public void testAbstractOrderEntryLinkStrategy()
	{
		assertEquals(configurationAbstractOrderEntryLinkStrategy, classUnderTest.getAbstractOrderEntryLinkStrategy());
	}

	@Test
	public void testIsConfigurableProductTrue()
	{
		assertTrue(classUnderTest.isConfigurableProduct(cartEntry));
	}

	@Test
	public void testIsConfigurableProductChangebaleVariantTrue()
	{
		cartEntry.setProduct(changebaleVariantProductModel);
		assertTrue(classUnderTest.isConfigurableProduct(cartEntry));
	}

	@Test
	public void testIsConfigurableProductVariantFalse()
	{
		cartEntry.setProduct(variantProductModel);
		assertFalse(classUnderTest.isConfigurableProduct(cartEntry));
	}
	
	@Test
	public void testRestoreCart() throws CommerceCartRestorationException
	{
		CommerceCartRestoration restoration = prepareRestoration();
		final CartModel cart = prepareCart();
		final AbstractOrderEntryModel entry = cart.getEntries().get(0);
		parameters.setCart(cart);
		given(cpqConfigurableChecker.isCPQConfiguratorApplicableProduct(Mockito.any(ProductModel.class))).willReturn(true);
		given(cpqConfigurableChecker.isCPQConfiguratorApplicableProduct(Mockito.any(ProductModel.class))).willReturn(true);
		given(commerceCartRestorationStrategy.restoreCart(parameters)).willReturn(restoration);
		restoration = classUnderTest.restoreCart(parameters);
		verify(cleanUpStrategy).cleanUpCart();
		verify(configurationAbstractOrderIntegrationStrategy).refreshCartEntryConfiguration(entry);
		verify(configurationAbstractOrderIntegrationStrategy).getConfigurationForAbstractOrderEntry(entry);
		verify(productConfigurationPricingStrategy).updateCartEntryPrices(entry, false, null);
		assertEquals(1, restoration.getModifications().size());
	}

	@Test
	public void testRefreshConfigurations()
	{
		final CartModel cart = prepareCart();
		final AbstractOrderEntryModel entry = cart.getEntries().get(0);
		given(cpqConfigurableChecker.isCPQConfiguratorApplicableProduct(Mockito.any(ProductModel.class))).willReturn(true);
		classUnderTest.refreshConfigurations(cart);
		verify(configurationAbstractOrderIntegrationStrategy).refreshCartEntryConfiguration(entry);
	}

	@Test
	public void testRefreshConfigurationsNoEntries()
	{
		final CartModel cart = new CartModel();
		classUnderTest.refreshConfigurations(cart);
		verify(configurationAbstractOrderIntegrationStrategy, times(0)).refreshCartEntryConfiguration(Mockito.any());
	}

	@Test
	public void testRefreshConfigurationsNotConfigurableProduct()
	{
		final CartModel cart = prepareCart();
		final AbstractOrderEntryModel entry = cart.getEntries().get(0);
		given(cpqConfigurableChecker.isCPQConfiguratorApplicableProduct(Mockito.any(ProductModel.class))).willReturn(false);
		classUnderTest.refreshConfigurations(cart);
		verify(configurationAbstractOrderIntegrationStrategy, times(0)).refreshCartEntryConfiguration(Mockito.any());
	}

	@Test
	public void testAddModificationsForConfigurableProducts()
	{
		final CommerceCartRestoration restoration = prepareRestoration();
		final CartModel cart = prepareCart();
		final AbstractOrderEntryModel entry = cart.getEntries().get(0);
		given(cpqConfigurableChecker.isCPQConfiguratorApplicableProduct(Mockito.any(ProductModel.class))).willReturn(true);
		classUnderTest.addModificationsForConfigurableProducts(restoration, cart);
		final CommerceCartModification modification = restoration.getModifications().get(0);
		assertEquals(entry, modification.getEntry());
		assertEquals(ProductConfigurationCartRestorationStrategyImpl.REFRESH_INLINE_CONFIGURATION, modification.getStatusCode());
	}

	@Test
	public void testAddModificationsForConfigurableProductsNoEntries()
	{
		final CommerceCartRestoration restoration = prepareRestoration();
		final CartModel cart = new CartModel();
		classUnderTest.addModificationsForConfigurableProducts(restoration, cart);
		assertEquals(0, restoration.getModifications().size());
	}

	@Test
	public void testAddModificationsForConfigurableProductsNotConfigurableProduct()
	{
		final CommerceCartRestoration restoration = prepareRestoration();
		final CartModel cart = prepareCart();
		given(cpqConfigurableChecker.isCPQConfiguratorApplicableProduct(Mockito.any(ProductModel.class))).willReturn(false);
		classUnderTest.addModificationsForConfigurableProducts(restoration, cart);
		assertEquals(0, restoration.getModifications().size());
	}

	private CartModel prepareCart()
	{
		final CartModel cart = new CartModel();
		final AbstractOrderEntryModel entry = new AbstractOrderEntryModel();
		final ProductModel product = new ProductModel();
		entry.setProduct(product);
		final List<AbstractOrderEntryModel> entries = new ArrayList();
		entries.add(entry);
		cart.setEntries(entries);
		return cart;
	}

	protected CommerceCartRestoration prepareRestoration()
	{
		final CommerceCartRestoration restoration = new CommerceCartRestoration();
		final List<CommerceCartModification> modifications = new ArrayList<>();
		restoration.setModifications(modifications);
		return restoration;
	}
}
