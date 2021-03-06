/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.core.test;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.sap.core.test.property.PropertyAccessFactoryTest;
import de.hybris.platform.sap.core.test.property.PropertyAccessImplTest;
import de.hybris.platform.sap.core.test.property.PropertyAccessTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * Testsuite for extension sapcoretest.
 */
@UnitTest
@RunWith(Suite.class)
@SuiteClasses(
{ PropertyAccessFactoryTest.class, PropertyAccessImplTest.class, PropertyAccessTest.class })
public class SapcoretestTestSuite
{

}
