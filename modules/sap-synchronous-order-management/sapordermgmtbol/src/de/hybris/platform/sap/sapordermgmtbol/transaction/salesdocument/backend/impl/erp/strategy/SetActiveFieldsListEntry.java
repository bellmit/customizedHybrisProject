/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.impl.erp.strategy;

/**
 * Represents an attribute that we want to exchange with SD via the LO-API. <br>
 * See {@link LrdActionsStrategyERP}
 * 
 */
public class SetActiveFieldsListEntry
{

	protected String objectName;
	protected String fieldName;

	/**
	 * Standard constructor. <br>
	 * 
	 * @param objectName
	 *           name of the object
	 * @param fieldName
	 *           name of the field
	 */
	public SetActiveFieldsListEntry(final String objectName, final String fieldName)
	{
		this.objectName = objectName;
		this.fieldName = fieldName;
	}

	/**
	 * Get the object name
	 * 
	 * @return object name
	 */
	public String getObjectName()
	{
		return this.objectName;
	}

	/**
	 * Get the field name
	 * 
	 * @return field name
	 */
	public String getFieldName()
	{
		return this.fieldName;
	}

	/**
	 * To String method
	 */
	@Override
	public String toString()
	{
		return "Objectname: " + objectName + ":  FieldName: " + fieldName;
	}
}
