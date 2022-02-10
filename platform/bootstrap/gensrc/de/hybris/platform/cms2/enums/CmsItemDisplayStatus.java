/*
 *  
 * [y] hybris Platform
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.cms2.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum CmsItemDisplayStatus declared at extension cms2.
 */
public enum CmsItemDisplayStatus implements HybrisEnumValue
{
	/**
	 * Generated enum value for CmsItemDisplayStatus.DRAFT declared at extension cms2.
	 */
	DRAFT("DRAFT"),
	/**
	 * Generated enum value for CmsItemDisplayStatus.IN_PROGRESS declared at extension cms2.
	 */
	IN_PROGRESS("IN_PROGRESS"),
	/**
	 * Generated enum value for CmsItemDisplayStatus.READY_TO_SYNC declared at extension cms2.
	 */
	READY_TO_SYNC("READY_TO_SYNC"),
	/**
	 * Generated enum value for CmsItemDisplayStatus.SYNCED declared at extension cms2.
	 */
	SYNCED("SYNCED");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CmsItemDisplayStatus";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "CmsItemDisplayStatus";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private CmsItemDisplayStatus(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
}
