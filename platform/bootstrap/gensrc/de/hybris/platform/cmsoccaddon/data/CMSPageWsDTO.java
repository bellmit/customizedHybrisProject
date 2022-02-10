/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsoccaddon.data;

import java.io.Serializable;
import de.hybris.platform.cmsoccaddon.data.ContentSlotListWsDTO;
import java.util.Map;

public  class CMSPageWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSPageWsDTO.uid</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>CMSPageWsDTO.uuid</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String uuid;

	/** <i>Generated property</i> for <code>CMSPageWsDTO.title</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String title;

	/** <i>Generated property</i> for <code>CMSPageWsDTO.template</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String template;

	/** <i>Generated property</i> for <code>CMSPageWsDTO.typeCode</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String typeCode;

	/** <i>Generated property</i> for <code>CMSPageWsDTO.name</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>CMSPageWsDTO.defaultPage</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private Boolean defaultPage;

	/** <i>Generated property</i> for <code>CMSPageWsDTO.contentSlots</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private ContentSlotListWsDTO contentSlots;

	/** <i>Generated property</i> for <code>CMSPageWsDTO.catalogVersionUuid</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private String catalogVersionUuid;

	/** <i>Generated property</i> for <code>CMSPageWsDTO.otherProperties</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private Map<String,Object> otherProperties;
	
	public CMSPageWsDTO()
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
	
	public void setTitle(final String title)
	{
		this.title = title;
	}

	public String getTitle() 
	{
		return title;
	}
	
	public void setTemplate(final String template)
	{
		this.template = template;
	}

	public String getTemplate() 
	{
		return template;
	}
	
	public void setTypeCode(final String typeCode)
	{
		this.typeCode = typeCode;
	}

	public String getTypeCode() 
	{
		return typeCode;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setDefaultPage(final Boolean defaultPage)
	{
		this.defaultPage = defaultPage;
	}

	public Boolean getDefaultPage() 
	{
		return defaultPage;
	}
	
	public void setContentSlots(final ContentSlotListWsDTO contentSlots)
	{
		this.contentSlots = contentSlots;
	}

	public ContentSlotListWsDTO getContentSlots() 
	{
		return contentSlots;
	}
	
	public void setCatalogVersionUuid(final String catalogVersionUuid)
	{
		this.catalogVersionUuid = catalogVersionUuid;
	}

	public String getCatalogVersionUuid() 
	{
		return catalogVersionUuid;
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
