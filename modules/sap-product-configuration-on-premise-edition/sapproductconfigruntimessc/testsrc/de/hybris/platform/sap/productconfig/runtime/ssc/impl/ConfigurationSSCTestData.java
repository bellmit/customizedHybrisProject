/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.productconfig.runtime.ssc.impl;

import com.sap.custdev.projects.fbs.slc.cfg.client.ICsticValueData;
import com.sap.custdev.projects.fbs.slc.cfg.command.beans.CsticValueData;


/**
 * Helper class for tests
 *
 */
public class ConfigurationSSCTestData
{

	public static ICsticValueData createCsticValueData()
	{
		final CsticValueData data = new CsticValueData();
		return data;
	}

}
