/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.businessobject.impl;

import de.hybris.platform.sap.sapordermgmtbol.transaction.businessobject.interf.BillingStatus;
import de.hybris.platform.sap.sapordermgmtbol.transaction.businessobject.interf.EStatus;


/**
 * Billing Status of the sales document
 *
 */
public abstract class BillingStatusImpl extends BusinessStatusImpl implements BillingStatus
{
	/**
	 * Invoice status (invoice referring to order)
	 */
	protected EStatus ordInvoiceStatus;
	/**
	 * Invoice status (invoice referring to delivery)
	 */
	protected EStatus dlvInvoiceStatus;

	/**
	 * Constructor
	 *
	 * @param key
	 *           Status key
	 */
	public BillingStatusImpl(final EStatus key)
	{
		super(key);
	}

	/**
	 * Default Constructor
	 */
	public BillingStatusImpl()
	{
		super();
	}

	/**
	 * Only for unit tests. Other callers should use generic factory and init method
	 *
	 * @param dlvStatus
	 *           delivery status
	 * @param ordInvoiceStatus
	 *           order invoice status
	 * @param dlvInvoiceStatus
	 *           delivery invoice status
	 * @param rjStatus
	 *           rejection status
	 */
	public BillingStatusImpl(final EStatus dlvStatus, final EStatus ordInvoiceStatus, final EStatus dlvInvoiceStatus,
			final EStatus rjStatus)
	{
		super();
		init(dlvStatus, ordInvoiceStatus, dlvInvoiceStatus, rjStatus);
	}

	@Override
	public final void init(final EStatus dlvStatus, final EStatus ordInvoiceStatus, final EStatus dlvInvoiceStatus,
			final EStatus rjStatus)
	{
		super.init(dlvStatus, rjStatus);
		this.ordInvoiceStatus = ordInvoiceStatus;
		this.dlvInvoiceStatus = dlvInvoiceStatus;
		this.determineStatus();
	}

}
