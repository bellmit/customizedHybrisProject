/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.impl.messagemapping;

import de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.interf.messagemapping.MessageMappingCallbackProcessor;


@SuppressWarnings("javadoc")
public class TestImplementationMessageMappingCallback implements MessageMappingCallbackProcessor
{

	/**
	 * 
	 */
	public static final String TEST_MESSAGE_MAPPING_CALLBACK_ID = "testMessageMappingCallback";

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.interf.messagemapping.
	 * MessageMappingCallbackProcessor
	 * #process(de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.impl
	 * .messagemapping.BackendMessage)
	 */
	@Override
	public boolean process(final BackendMessage message)
	{
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.impl.messagemapping.
	 * AbstractMessageMappingCallbackProcessor#getId()
	 */
	@Override
	public String getId()
	{
		return TEST_MESSAGE_MAPPING_CALLBACK_ID;
	}



}
