/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.sap.hybris.sec.eventpublisher.jalo;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.hybris.platform.testframework.HybrisJUnit4TransactionalTest;


/**
 * JUnit Tests for the Eventpublisher extension.
 */
public class EventpublisherTest extends HybrisJUnit4TransactionalTest
{
	/** Edit the local|project.properties to change logging behaviour (properties log4j2.logger.*). */
	@SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(EventpublisherTest.class);

	@Before
	public void setUp()
	{
		// implement here code executed before each test
	}

	@After
	public void tearDown()
	{
		// implement here code executed after each test
	}

	/**
	 * This is a sample test method.
	 */
	@Test
	public void testEventpublisher()
	{
		final boolean testTrue = true;
        assertThat(testTrue).isTrue();
	}
}
