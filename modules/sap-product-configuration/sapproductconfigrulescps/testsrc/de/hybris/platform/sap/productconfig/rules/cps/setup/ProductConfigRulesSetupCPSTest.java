/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.productconfig.rules.cps.setup;

import static org.junit.Assert.assertEquals;

import de.hybris.bootstrap.annotations.UnitTest;

import org.junit.Test;


@UnitTest
public class ProductConfigRulesSetupCPSTest
{
	private final ProductConfigRulesCPSSetup classUnderTest = new ProductConfigRulesCPSSetup();

	@Test
	public void testGetExtensionName()
	{
		assertEquals("sapproductconfigrulescps", classUnderTest.getExtensionName());
	}
}
