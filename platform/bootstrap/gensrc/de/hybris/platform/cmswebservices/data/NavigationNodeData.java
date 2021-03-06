/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import de.hybris.platform.cmswebservices.data.NavigationEntryData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import java.util.Map;

/**
 * The navigation node data
 */
@ApiModel(value="NavigationNodeData", description="The navigation node data")
public  class NavigationNodeData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>NavigationNodeData.uid</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="uid") 	
	private String uid;

	/** <i>Generated property</i> for <code>NavigationNodeData.uuid</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="uuid") 	
	private String uuid;

	/** <i>Generated property</i> for <code>NavigationNodeData.itemtype</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="itemtype") 	
	private String itemtype;

	/** <i>Generated property</i> for <code>NavigationNodeData.parentUid</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="parentUid") 	
	private String parentUid;

	/** <i>Generated property</i> for <code>NavigationNodeData.name</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="name") 	
	private String name;

	/** <i>Generated property</i> for <code>NavigationNodeData.title</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="title") 	
	private Map<String,String> title;

	/** <i>Generated property</i> for <code>NavigationNodeData.hasChildren</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="hasChildren") 	
	private Boolean hasChildren;

	/** <i>Generated property</i> for <code>NavigationNodeData.position</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="position") 	
	private Integer position;

	/** <i>Generated property</i> for <code>NavigationNodeData.entries</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="entries") 	
	private List<NavigationEntryData> entries;
	
	public NavigationNodeData()
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
	
	public void setItemtype(final String itemtype)
	{
		this.itemtype = itemtype;
	}

	public String getItemtype() 
	{
		return itemtype;
	}
	
	public void setParentUid(final String parentUid)
	{
		this.parentUid = parentUid;
	}

	public String getParentUid() 
	{
		return parentUid;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setTitle(final Map<String,String> title)
	{
		this.title = title;
	}

	public Map<String,String> getTitle() 
	{
		return title;
	}
	
	public void setHasChildren(final Boolean hasChildren)
	{
		this.hasChildren = hasChildren;
	}

	public Boolean getHasChildren() 
	{
		return hasChildren;
	}
	
	public void setPosition(final Integer position)
	{
		this.position = position;
	}

	public Integer getPosition() 
	{
		return position;
	}
	
	public void setEntries(final List<NavigationEntryData> entries)
	{
		this.entries = entries;
	}

	public List<NavigationEntryData> getEntries() 
	{
		return entries;
	}
	


}
