/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearchbackoffice.data;

import de.hybris.platform.adaptivesearch.data.AbstractAsSortConfiguration;
import de.hybris.platform.adaptivesearchbackoffice.data.AbstractEditorData;
import java.util.Map;

public  class AbstractSortConfigurationEditorData extends AbstractEditorData 
{

 

	/** <i>Generated property</i> for <code>AbstractSortConfigurationEditorData.code</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>AbstractSortConfigurationEditorData.name</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private Map<String,String> name;

	/** <i>Generated property</i> for <code>AbstractSortConfigurationEditorData.priority</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private Integer priority;

	/** <i>Generated property</i> for <code>AbstractSortConfigurationEditorData.sortConfiguration</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private AbstractAsSortConfiguration sortConfiguration;
	
	public AbstractSortConfigurationEditorData()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setName(final Map<String,String> name)
	{
		this.name = name;
	}

	public Map<String,String> getName() 
	{
		return name;
	}
	
	public void setPriority(final Integer priority)
	{
		this.priority = priority;
	}

	public Integer getPriority() 
	{
		return priority;
	}
	
	public void setSortConfiguration(final AbstractAsSortConfiguration sortConfiguration)
	{
		this.sortConfiguration = sortConfiguration;
	}

	public AbstractAsSortConfiguration getSortConfiguration() 
	{
		return sortConfiguration;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final AbstractSortConfigurationEditorData other = (AbstractSortConfigurationEditorData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getCode(), other.getCode()) 
			.append(getName(), other.getName()) 
			.append(getPriority(), other.getPriority()) 
			.isEquals();
		} 
		catch (ClassCastException c)
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return new org.apache.commons.lang.builder.HashCodeBuilder()
		.append(getCode()) 
		.append(getName()) 
		.append(getPriority()) 
		.toHashCode();
	}

}
