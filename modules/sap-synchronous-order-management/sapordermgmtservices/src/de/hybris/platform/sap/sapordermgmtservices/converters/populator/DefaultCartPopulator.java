/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtservices.converters.populator;

import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.sap.sapordermgmtbol.transaction.businessobject.interf.Basket;
import de.hybris.platform.sap.sapordermgmtbol.transaction.header.businessobject.interf.Header;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;



/**
 * Populates a cart from the BOL representation to its DAO counterpart
 * 
 * @param <SOURCE>
 *           BOL representation of a cart
 * @param <TARGET>
 *           DAO representation of a cart
 */
public class DefaultCartPopulator<SOURCE extends Basket, TARGET extends CartData> extends
		DefaultAbstractOrderPopulator<SOURCE, TARGET>
{

	@Override
	public void populate(final SOURCE source, final TARGET target) throws ConversionException
	{
		super.populate(source, target);
		target.setTotalUnitCount(target.getTotalItems());


	}

	@Override
	protected void populateHeader(final SOURCE source, final TARGET target)
	{
		super.populateHeader(source, target);
		final Header header = source.getHeader();
		target.setPurchaseOrderNumber(header.getPurchaseOrderExt());
	}



}
