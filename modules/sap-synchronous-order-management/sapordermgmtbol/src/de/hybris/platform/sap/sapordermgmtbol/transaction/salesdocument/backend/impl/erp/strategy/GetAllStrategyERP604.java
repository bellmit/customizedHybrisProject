/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.impl.erp.strategy;

import de.hybris.platform.sap.sapordermgmtbol.transaction.header.businessobject.interf.Header;
import de.hybris.platform.sap.sapordermgmtbol.transaction.item.businessobject.interf.Item;

import java.util.Map;

import com.sap.conn.jco.JCoStructure;
import com.sap.conn.jco.JCoTable;


/**
 * Strategy for function module ERP_LORD_GET_ALL.
 */
public class GetAllStrategyERP604 extends GetAllStrategyERP
{
	@Override
	protected void determineStatus(final Header head, final JCoStructure esHvStatComV, final JCoTable ttItemVstatComV,
			final ObjectInstances objInstMap, final Map<String, Item> itemMap)
	{
		//

	}

}
