/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.core.jco.exceptions;


/**
 * Failure caused during logon into back end system.
 */
public class BackendLogonException extends BackendCommunicationException
{

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 6234384911781059874L;

	/**
	 * Creates a new exception with a given message.
	 * 
	 * @param msg
	 *           Message to give further information about the exception
	 */
	public BackendLogonException(final String msg)
	{
		super(msg);
	}

	/**
	 * Constructor.
	 * 
	 * @param msg
	 *           Message for the Exception
	 * @param ex
	 *           root cause
	 */
	public BackendLogonException(final String msg, final Throwable ex)
	{
		super(msg, ex);
	}



}
