/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.interactionobjects.impl;

import de.hybris.platform.sap.core.bol.businessobject.CommunicationException;
import de.hybris.platform.sap.core.common.message.MessageList;
import de.hybris.platform.sap.sapordermgmtbol.transaction.businessobject.interf.Order;
import de.hybris.platform.sap.sapordermgmtbol.transaction.businessobject.interf.SalesDocument;
import de.hybris.platform.sap.sapordermgmtbol.transaction.interactionobjects.interf.CheckDocumentValid;
import de.hybris.platform.sap.sapordermgmtbol.transaction.util.interf.DocumentType;


/**
 * Standard implementation of the {@link CheckDocumentValid} interface. <br>
 *
 */
public class CheckDocumentValidImpl implements CheckDocumentValid
{

	@Override
	public MessageList collectHeaderMessages(final SalesDocument salesDoc)
	{
		final MessageList messageList = new MessageList();

		// getMessageList() returns own and item messages,
		// but item messages are handled in itemListViewHandler, so we call get
		// OwnMessages only
		final MessageList salesDocMessages = salesDoc.getOwnMessageList();
		if ((salesDocMessages != null) && !salesDocMessages.isEmpty())
		{
			messageList.add(salesDocMessages);
		}

		if (salesDoc.getHeader() != null)
		{
			final MessageList headerMessages = salesDoc.getHeader().getMessageList();
			if ((headerMessages != null) && !headerMessages.isEmpty())
			{
				messageList.add(headerMessages);
			}

		}
		// item messages will be collected in the ItemListViewHandler
		return messageList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @seecom.sap.wec.app.esales.module.transaction.interactionobjects.interf. CheckDocumentValid
	 * #isDocumentSupported(com.sap.wec.app.esales.module.transaction .backend.interf.SalesDocument)
	 */
	@Override
	public boolean isDocumentSupported(final SalesDocument salesDoc, final DocumentType expectedDocType)
			throws CommunicationException
	{
		return salesDoc.getHeader().getDocumentType().equals(expectedDocType);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.sap.sapordermgmtbol.transaction.interactionobjects.interf.CheckDocumentValid#hasPermissions
	 * (de.hybris.platform.sap.sapordermgmtbol.transaction.businessobject.interf.Order, java.lang.String)
	 */
	@Override
	public boolean hasPermissions(final Order order, final String soldToId)
	{
		return order.getHeader().getPartnerList().getSoldToData().getPartnerId().equals(soldToId);
	}
}
