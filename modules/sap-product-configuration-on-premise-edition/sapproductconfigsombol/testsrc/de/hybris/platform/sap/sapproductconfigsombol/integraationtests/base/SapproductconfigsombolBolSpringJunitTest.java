/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapproductconfigsombol.integraationtests.base;

import de.hybris.platform.sap.core.bol.test.SapcorebolSpringJUnitTest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:sapordermgmtbol-spring.xml", "classpath:sapordermgmtbol-be-spring.xml", "classpath:sapordermgmtbol-bo-spring.xml", "classpath:test/sapordermgmtbol-config-test-spring.xml",
		"classpath:test/sapordermgmtbol-test-spring.xml", "classpath:test/sapordermgmtbol-cache-test-spring.xml", "classpath:sapcommonbol-spring.xml", "classpath:sapproductconfigruntimeinterface-spring.xml",
		"classpath:test/sapcommonbol-cache-test-spring.xml" })
public abstract class SapproductconfigsombolBolSpringJunitTest extends SapcorebolSpringJUnitTest
{
	//
}
