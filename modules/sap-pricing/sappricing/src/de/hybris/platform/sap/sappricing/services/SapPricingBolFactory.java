/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sappricing.services;


import de.hybris.platform.sap.sappricingbol.businessobject.interf.SapPricing;


public interface SapPricingBolFactory
{
	/**
	 * @return Search BO implementation
	 */
	SapPricing getSapPricing();
}
