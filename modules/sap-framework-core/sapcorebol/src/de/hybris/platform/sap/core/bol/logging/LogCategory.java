/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.core.bol.logging;

/**
 * Log Category.
 */
public class LogCategory
{

	private final String categoryValue;

	/**
	 * Standard constructor.
	 * 
	 * @param categoryValue
	 *           log category
	 */
	public LogCategory(final String categoryValue)
	{
		super();
		this.categoryValue = categoryValue;
	}

	/**
	 * Returns the log category value.
	 * 
	 * @return the categoryValue
	 */
	public String getCategoryValue()
	{
		return categoryValue;
	}

}
