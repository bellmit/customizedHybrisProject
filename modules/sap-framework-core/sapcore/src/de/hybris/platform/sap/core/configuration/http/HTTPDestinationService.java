/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.core.configuration.http;



/**
 * Interface to access HTTP destination data.
 */
public interface HTTPDestinationService
{

	/**
	 * Returns the HTTP Destination for the given name.
	 * 
	 * @param destinationName
	 *           Name of the destination
	 * @return list
	 */
	public HTTPDestination getHTTPDestination(String destinationName);
}
