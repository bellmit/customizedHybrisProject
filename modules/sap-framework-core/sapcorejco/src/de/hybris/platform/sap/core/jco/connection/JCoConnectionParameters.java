/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.core.jco.connection;

import java.util.Map;



/**
 * JCo Connection parameter container interface.
 */
public interface JCoConnectionParameters
{

	/**
	 * Adds a {@link JCoConnectionParameter} to the container.
	 * 
	 * @param connectionParameter
	 *           {@link JCoConnectionParameter}
	 */
	public void addConnectionParameter(JCoConnectionParameter connectionParameter);

	/**
	 * Gets the {@link JCoConnectionParameter} for the requested Function Module Name.
	 * 
	 * @param functionModule
	 *           Function Module Name
	 * @return {@link JCoConnectionParameter}
	 */
	public JCoConnectionParameter getConnectionParameter(String functionModule);


	/**
	 * Checks if a function module is configured by parameter settings.
	 * 
	 * @param functionModule
	 *           Name of the function module
	 * @return true if function module is configured
	 */
	public boolean isFunctionModuleConfigured(String functionModule);

	/**
	 * Gets a map of all {@link JCoConnectionParameter} .
	 * 
	 * @return map of {@link JCoConnectionParameter}
	 */
	public Map<String, JCoConnectionParameter> getConnectionParameterMap();

}
