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
 * Interface to read RFC destination properties.
 */
public interface HTTPDestination
{
	/**
	 * @return the rfcDestinationName
	 */
	public String getHttpDestinationName();

	/**
	 * @return the targetHost
	 */
	public String getTargetURL();

	/**
	 * @return the authentication
	 */
	public String getAuthenticationType();

	/**
	 * @return the userid
	 */
	public String getUserid();

	/**
	 * @return the password
	 */
	public String getPassword();

}
