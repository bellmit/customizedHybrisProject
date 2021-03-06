/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sappricing.services;

import de.hybris.platform.core.model.order.AbstractOrderModel;


/**
 * Sap Pricing Cart Service
 */
public interface SapPricingCartService
{

	/**
	 * Method to get price information for cart
	 * 
	 * @param order orderModel
	 */
	void getPriceInformationForCart(AbstractOrderModel order);

}
