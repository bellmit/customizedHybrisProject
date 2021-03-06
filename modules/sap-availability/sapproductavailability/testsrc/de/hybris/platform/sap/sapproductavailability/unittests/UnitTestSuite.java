/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapproductavailability.unittests;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.sap.sapproductavailability.backend.impl.SapProductAvailabilityBackendErpUnitTests;
import de.hybris.platform.sap.sapproductavailability.service.impl.DefaultSapProductAvailabilityServiceTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@UnitTest
@RunWith(Suite.class)
@SuiteClasses(
{ DefaultSapProductAvailabilityServiceTest.class, SapProductAvailabilityBackendErpUnitTests.class })
public class UnitTestSuite
{
	//Left empty intentionally 
}
