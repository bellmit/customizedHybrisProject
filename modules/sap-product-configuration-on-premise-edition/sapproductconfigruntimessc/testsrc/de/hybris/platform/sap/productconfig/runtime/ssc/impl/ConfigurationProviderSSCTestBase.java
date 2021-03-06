/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.productconfig.runtime.ssc.impl;

import de.hybris.bootstrap.annotations.ManualTest;
import de.hybris.platform.servicelayer.i18n.I18NService;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


@ManualTest
public abstract class ConfigurationProviderSSCTestBase
{
	@Mock
	I18NService i18nService;



	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
	}



}
