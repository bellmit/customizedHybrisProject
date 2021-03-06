/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.orderexchange.outbound;

/**
 * Result container for sending raw items to DataHub
 */
public interface SendToDataHubResult
{
	@SuppressWarnings("javadoc")
	int SENDING_FAILED_CODE = -1;
	@SuppressWarnings("javadoc")
	int MESSAGE_HANDLING_ERROR = -2;

	/**
	 * @return true if sending was successful
	 */
	boolean isSuccess();

	@SuppressWarnings("javadoc")
	int getErrorCode();

	@SuppressWarnings("javadoc")
	String getErrorText();

}
