/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.core.configuration.test;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.sap.core.configuration.datahub.DataHubTransferHandlerTest;
import de.hybris.platform.sap.core.configuration.impl.ConfigurationPropertyAccessImplTest;
import de.hybris.platform.sap.core.configuration.impl.SAPConfigurationServiceImplTest;
import de.hybris.platform.sap.core.configuration.populators.SAPBaseStoreConfigurationMappingPopulatorTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * Spring testsuite for extension sapcoreconfiguration.
 */
@UnitTest
@RunWith(Suite.class)
@SuiteClasses(
{ ConfigurationPropertyAccessImplTest.class, SAPConfigurationServiceImplTest.class,
		SAPBaseStoreConfigurationMappingPopulatorTest.class, DataHubTransferHandlerTest.class })
public class SapcoreconfigurationSpringTestSuite
{

}
