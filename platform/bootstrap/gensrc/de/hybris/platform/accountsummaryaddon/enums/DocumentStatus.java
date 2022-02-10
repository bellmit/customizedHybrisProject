/*
 *  
 * [y] hybris Platform
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.accountsummaryaddon.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum DocumentStatus declared at extension accountsummaryaddon.
 */
public enum DocumentStatus implements HybrisEnumValue
{
	/**
	 * Generated enum value for DocumentStatus.open declared at extension accountsummaryaddon.
	 */
	OPEN("open"),
	/**
	 * Generated enum value for DocumentStatus.closed declared at extension accountsummaryaddon.
	 */
	CLOSED("closed");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DocumentStatus";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "DocumentStatus";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private DocumentStatus(final String code)
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
