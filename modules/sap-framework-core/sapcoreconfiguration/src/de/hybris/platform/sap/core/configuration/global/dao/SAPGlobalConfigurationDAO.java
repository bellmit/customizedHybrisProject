/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.core.configuration.global.dao;

import de.hybris.platform.sap.core.configuration.model.SAPGlobalConfigurationModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;


/**
 * Interface for accessing the data of the global configuration.
 */
public interface SAPGlobalConfigurationDAO
{

	/**
	 * Finds the {@link SAPGlobalConfigurationModel} by performing a FlexibleSearch using the
	 * {@link FlexibleSearchService}.
	 * 
	 * @return {@link SAPGlobalConfigurationModel}
	 */
	public SAPGlobalConfigurationModel getSAPGlobalConfiguration();
}
