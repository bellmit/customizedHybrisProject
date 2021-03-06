/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sappricingproductcarouseladdon.controllers;

import de.hybris.platform.sap.sappricingproductcarouseladdon.model.SapProductCarouselComponentModel;


/**
 */
public interface SappricingproductcarouseladdonControllerConstants
{
	// implement here controller constants used by this extension
	/**
	 * Controller request mapping view
	 */
	public static final String VIEW = "/view/" + SapProductCarouselComponentModel._TYPECODE + "Controller";

	/**
	 * Controller
	 */
	public static final String CONTROLLER = SapProductCarouselComponentModel._TYPECODE + "Controller";

}
