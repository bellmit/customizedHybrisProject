/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsoccaddon.data;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public  class ComponentWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ComponentWsDTO.uid</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>ComponentWsDTO.uuid</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String uuid;

	/** <i>Generated property</i> for <code>ComponentWsDTO.typeCode</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String typeCode;

	/** <i>Generated property</i> for <code>ComponentWsDTO.modifiedtime</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private Date modifiedtime;

	/** <i>Generated property</i> for <code>ComponentWsDTO.name</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>ComponentWsDTO.otherProperties</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private Map<String,Object> otherProperties;
	
	public ComponentWsDTO()
	{
		// default constructor
	}
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

	public String getUid() 
	{
		return uid;
	}
	
	public void setUuid(final String uuid)
	{
		this.uuid = uuid;
	}

	public String getUuid() 
	{
		return uuid;
	}
	
	public void setTypeCode(final String typeCode)
	{
		this.typeCode = typeCode;
	}

	public String getTypeCode() 
	{
		return typeCode;
	}
	
	public void setModifiedtime(final Date modifiedtime)
	{
		this.modifiedtime = modifiedtime;
	}

	public Date getModifiedtime() 
	{
		return modifiedtime;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setOtherProperties(final Map<String,Object> otherProperties)
	{
		this.otherProperties = otherProperties;
	}

	public Map<String,Object> getOtherProperties() 
	{
		return otherProperties;
	}
	


}
