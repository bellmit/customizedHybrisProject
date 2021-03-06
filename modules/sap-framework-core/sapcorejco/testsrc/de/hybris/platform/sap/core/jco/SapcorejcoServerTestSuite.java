/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.core.jco;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import de.hybris.bootstrap.annotations.ManualTest;

/**
 * Server testsuite for extension sapcorejco.
 */
@ManualTest

@RunWith(Suite.class)
@SuiteClasses({ SapcorejcoSNCTest.class })
public class SapcorejcoServerTestSuite {
    SapcorejcoServerTestSuite() {

    }
}
