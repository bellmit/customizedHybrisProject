/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.productconfig.runtime.ssc;

import static org.junit.Assert.assertEquals;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.sap.productconfig.runtime.interf.model.ConfigModel;
import de.hybris.platform.sap.productconfig.runtime.interf.model.impl.ConfigModelImpl;
import de.hybris.platform.sap.productconfig.runtime.interf.model.impl.CsticModelImpl;

import org.junit.Test;

import com.sap.custdev.projects.fbs.slc.cfg.IConfigSession;


@UnitTest
public class SolvableConflictAdapterTest
{
	private static final String ASSUMPTION_ID = "123";

	@Test
	public void testReleaseSessionDefault()
	{
		final SolvableConflictAdapterImplForTest solvableConflictAdapter = new SolvableConflictAdapterImplForTest();

		assertEquals(ASSUMPTION_ID, solvableConflictAdapter.getAssumptionId(new CsticModelImpl(), new ConfigModelImpl()));
	}

	private class SolvableConflictAdapterImplForTest implements SolvableConflictAdapter
	{
		@Override
		public void transferSolvableConflicts(final IConfigSession configSession, final String configId,
				final ConfigModel configModel)
		{
		}

		@Override
		public String getAssumptionId(final String csticname, final ConfigModel configModel)
		{
			return ASSUMPTION_ID;
		};
	}

}
