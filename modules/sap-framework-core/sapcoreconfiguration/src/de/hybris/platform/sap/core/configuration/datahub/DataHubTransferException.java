/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.core.configuration.datahub;

import de.hybris.platform.sap.core.common.exceptions.CoreBaseException;


/**
 * Data Hub transfer exception.
 */
public class DataHubTransferException extends CoreBaseException
{

	private static final long serialVersionUID = 8730135682117510547L;

	/**
	 * Standard constructor for DataHubTransferException with no detail message.
	 */
	public DataHubTransferException()
	{
		super();
	}

	/**
	 * Standard constructor for DataHubTransferException with the specified detail message.
	 * 
	 * @param message
	 *           the detail message.
	 */
	public DataHubTransferException(final String message)
	{
		super(message);
	}

	/**
	 * Standard constructor for DataHubTransferException with the specified detail message and root cause.
	 * 
	 * @param message
	 *           message text.
	 * @param rootCause
	 *           exception which causes the exception
	 */
	public DataHubTransferException(final String message, final Throwable rootCause)
	{
		super(message, rootCause);
	}

}
