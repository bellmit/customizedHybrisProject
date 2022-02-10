/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2boccaddon.dto.company;

import java.io.Serializable;
import de.hybris.platform.b2boccaddon.dto.company.B2BUnitWsDTO;

public  class B2BCostCenterWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>B2BCostCenterWsDTO.originalCode</code> property defined at extension <code>b2boccaddon</code>. */
		
	private String originalCode;

	/** <i>Generated property</i> for <code>B2BCostCenterWsDTO.name</code> property defined at extension <code>b2boccaddon</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>B2BCostCenterWsDTO.active</code> property defined at extension <code>b2boccaddon</code>. */
		
	private String active;

	/** <i>Generated property</i> for <code>B2BCostCenterWsDTO.code</code> property defined at extension <code>b2boccaddon</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>B2BCostCenterWsDTO.unit</code> property defined at extension <code>b2boccaddon</code>. */
		
	private B2BUnitWsDTO unit;
	
	public B2BCostCenterWsDTO()
	{
		// default constructor
	}
	
	public void setOriginalCode(final String originalCode)
	{
		this.originalCode = originalCode;
	}

	public String getOriginalCode() 
	{
		return originalCode;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setActive(final String active)
	{
		this.active = active;
	}

	public String getActive() 
	{
		return active;
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setUnit(final B2BUnitWsDTO unit)
	{
		this.unit = unit;
	}

	public B2BUnitWsDTO getUnit() 
	{
		return unit;
	}
	


}
