/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.productconfig.services.ssc.jalo;

import de.hybris.platform.core.Registry;
import de.hybris.platform.sap.productconfig.services.ssc.constants.SapproductconfigservicessscConstants;



/**
 * This is the extension manager of the Sapproductconfigservicesssc extension.
 */
public class SapproductconfigservicessscManager extends GeneratedSapproductconfigservicessscManager
{

	/**
	 * Get the valid instance of this manager.
	 *
	 * @return the current instance of this manager
	 */
	public static SapproductconfigservicessscManager getInstance()
	{
		return (SapproductconfigservicessscManager) Registry.getCurrentTenant().getJaloConnection().getExtensionManager()
				.getExtension(SapproductconfigservicessscConstants.EXTENSIONNAME);
	}
}
