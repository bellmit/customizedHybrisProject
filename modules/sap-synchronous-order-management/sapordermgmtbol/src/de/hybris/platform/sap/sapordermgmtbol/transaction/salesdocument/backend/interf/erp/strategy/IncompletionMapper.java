/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.interf.erp.strategy;

import de.hybris.platform.sap.sapordermgmtbol.transaction.item.businessobject.interf.ItemList;

import com.sap.conn.jco.JCoTable;


/**
 * Handles reading of ERP incompletion log and transferring relevant messages to BOL messages
 */
public interface IncompletionMapper
{

	/**
	 * Copies the incompletion log to the table of messages which can be processed further on.
	 * 
	 * @param incompLog
	 *           JCO Table of incompletion messages
	 * @param messages
	 *           Standard message table
	 * @param items
	 *           Sales document items
	 */
	void mapLogToMessage(JCoTable incompLog, JCoTable messages, ItemList items);

}
