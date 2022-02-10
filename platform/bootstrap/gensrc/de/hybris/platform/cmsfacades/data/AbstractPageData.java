/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import de.hybris.platform.cmsfacades.data.PageContentSlotData;
import java.util.Date;
import java.util.List;
import java.util.Map;

public  class AbstractPageData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractPageData.uuid</code> property defined at extension <code>cmsfacades</code>. */
		
	private String uuid;

	/** <i>Generated property</i> for <code>AbstractPageData.pk</code> property defined at extension <code>cmsfacades</code>. */
		
	private String pk;

	/** <i>Generated property</i> for <code>AbstractPageData.creationtime</code> property defined at extension <code>cmsfacades</code>. */
		
	private Date creationtime;

	/** <i>Generated property</i> for <code>AbstractPageData.modifiedtime</code> property defined at extension <code>cmsfacades</code>. */
		
	private Date modifiedtime;

	/** <i>Generated property</i> for <code>AbstractPageData.uid</code> property defined at extension <code>cmsfacades</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>AbstractPageData.name</code> property defined at extension <code>cmsfacades</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>AbstractPageData.title</code> property defined at extension <code>cmsfacades</code>. */
		
	private Map<String,String> title;

	/** <i>Generated property</i> for <code>AbstractPageData.typeCode</code> property defined at extension <code>cmsfacades</code>. */
		
	private String typeCode;

	/** <i>Generated property</i> for <code>AbstractPageData.template</code> property defined at extension <code>cmsfacades</code>. */
		
	private String template;

	/** <i>Generated property</i> for <code>AbstractPageData.defaultPage</code> property defined at extension <code>cmsfacades</code>. */
		
	private Boolean defaultPage;

	/** <i>Generated property</i> for <code>AbstractPageData.onlyOneRestrictionMustApply</code> property defined at extension <code>cmsfacades</code>. */
		
	private Boolean onlyOneRestrictionMustApply;

	/** <i>Generated property</i> for <code>AbstractPageData.localizedTitle</code> property defined at extension <code>cmsfacades</code>. */
		
	private String localizedTitle;

	/** <i>Generated property</i> for <code>AbstractPageData.contentSlots</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<PageContentSlotData> contentSlots;

	/** <i>Generated property</i> for <code>AbstractPageData.catalogVersionUuid</code> property defined at extension <code>cmsfacades</code>. */
		
	private String catalogVersionUuid;

	/** <i>Generated property</i> for <code>AbstractPageData.otherProperties</code> property defined at extension <code>cmsfacades</code>. */
		
	private Map<String, Object> otherProperties;
	
	public AbstractPageData()
	{
		// default constructor
	}
	
	public void setUuid(final String uuid)
	{
		this.uuid = uuid;
	}

	public String getUuid() 
	{
		return uuid;
	}
	
	/**
	 * @deprecated Deprecated since 6.6
	 */
	@Deprecated(forRemoval = true)
	public void setPk(final String pk)
	{
		this.pk = pk;
	}

	/**
	 * @deprecated Deprecated since 6.6
	 */
	@Deprecated(forRemoval = true)
	public String getPk() 
	{
		return pk;
	}
	
	/**
	 * @deprecated Deprecated since 6.6
	 */
	@Deprecated(forRemoval = true)
	public void setCreationtime(final Date creationtime)
	{
		this.creationtime = creationtime;
	}

	/**
	 * @deprecated Deprecated since 6.6
	 */
	@Deprecated(forRemoval = true)
	public Date getCreationtime() 
	{
		return creationtime;
	}
	
	public void setModifiedtime(final Date modifiedtime)
	{
		this.modifiedtime = modifiedtime;
	}

	public Date getModifiedtime() 
	{
		return modifiedtime;
	}
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

	public String getUid() 
	{
		return uid;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	/**
	 * @deprecated Deprecated since 6.6
	 */
	@Deprecated(forRemoval = true)
	public void setTitle(final Map<String,String> title)
	{
		this.title = title;
	}

	/**
	 * @deprecated Deprecated since 6.6
	 */
	@Deprecated(forRemoval = true)
	public Map<String,String> getTitle() 
	{
		return title;
	}
	
	public void setTypeCode(final String typeCode)
	{
		this.typeCode = typeCode;
	}

	public String getTypeCode() 
	{
		return typeCode;
	}
	
	public void setTemplate(final String template)
	{
		this.template = template;
	}

	public String getTemplate() 
	{
		return template;
	}
	
	public void setDefaultPage(final Boolean defaultPage)
	{
		this.defaultPage = defaultPage;
	}

	public Boolean getDefaultPage() 
	{
		return defaultPage;
	}
	
	/**
	 * @deprecated Deprecated since 6.6
	 */
	@Deprecated(forRemoval = true)
	public void setOnlyOneRestrictionMustApply(final Boolean onlyOneRestrictionMustApply)
	{
		this.onlyOneRestrictionMustApply = onlyOneRestrictionMustApply;
	}

	/**
	 * @deprecated Deprecated since 6.6
	 */
	@Deprecated(forRemoval = true)
	public Boolean getOnlyOneRestrictionMustApply() 
	{
		return onlyOneRestrictionMustApply;
	}
	
	public void setLocalizedTitle(final String localizedTitle)
	{
		this.localizedTitle = localizedTitle;
	}

	public String getLocalizedTitle() 
	{
		return localizedTitle;
	}
	
	public void setContentSlots(final List<PageContentSlotData> contentSlots)
	{
		this.contentSlots = contentSlots;
	}

	public List<PageContentSlotData> getContentSlots() 
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
	
	public void setOtherProperties(final Map<String, Object> otherProperties)
	{
		this.otherProperties = otherProperties;
	}

	public Map<String, Object> getOtherProperties() 
	{
		return otherProperties;
	}
	


}
