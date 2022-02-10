/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 *
 */
package de.hybris.platform.task.impl.gateways;

import static org.assertj.core.api.Assertions.assertThat;

import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.task.TaskService;
import de.hybris.platform.task.impl.AuxiliaryTablesTaskProviderTestHelper;

import javax.annotation.Resource;

import org.junit.Before;
import org.springframework.jdbc.core.JdbcTemplate;


public abstract class BaseGatewayTest extends ServicelayerBaseTest
{
	@Resource
	protected TaskService taskService;

	@Resource
	protected JdbcTemplate jdbcTemplate;

	protected AuxiliaryTablesTaskProviderTestHelper testHelper;

	@Before
	public void setupBaseGatewayTest()
	{
		testHelper = new AuxiliaryTablesTaskProviderTestHelper(taskService, jdbcTemplate);
	}

	protected void disableTaskEngine()
	{

		testHelper.disableTaskEngine();
	}

	protected void enableTaskEngine()
	{
		testHelper.enableTaskEngine();
	}

	protected void assertTableExists(final String tableName)
	{

		testHelper.assertTableExists(tableName);
	}

	protected void assertTableNotExists(final String tableName)
	{
		testHelper.assertTableNotExists(tableName);
	}
}
