/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.basket.backend.interf;

import de.hybris.platform.sap.core.jco.exceptions.BackendException;
import de.hybris.platform.sap.sapordermgmtbol.transaction.businessobject.interf.Basket;
import de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.interf.SalesDocumentBackend;


/**
 * This interface defines the backend functionality of the Basket object, implementors are BasketDB, BasketCRM,
 * BasketERP, etc.
 * 
 */
public interface BasketBackend extends SalesDocumentBackend
{

	/**
	 * Saves the basket object in the underlying backend layer.<br>
	 * 
	 * @param basket
	 *           Basket to be saved in back end
	 * @param commit
	 *           if <code>true</code> also a commit will be done in the backend
	 * @return <code>true</code> only if document saved successfully
	 * @throws BackendException
	 *            Is thrown if there is an exception in the backend
	 */
	boolean saveInBackend(Basket basket, boolean commit) throws BackendException;

}
