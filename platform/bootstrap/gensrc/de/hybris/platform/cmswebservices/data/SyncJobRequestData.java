/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Synchronization request data
 */
@ApiModel(value="SyncJobRequestData", description="Synchronization request data")
public  class SyncJobRequestData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SyncJobRequestData.catalogId</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="catalogId") 	
	private String catalogId;

	/** <i>Generated property</i> for <code>SyncJobRequestData.sourceVersionId</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="sourceVersionId") 	
	private String sourceVersionId;

	/** <i>Generated property</i> for <code>SyncJobRequestData.targetVersionId</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="targetVersionId") 	
	private String targetVersionId;
	
	public SyncJobRequestData()
	{
		// default constructor
	}
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

	public String getCatalogId() 
	{
		return catalogId;
	}
	
	public void setSourceVersionId(final String sourceVersionId)
	{
		this.sourceVersionId = sourceVersionId;
	}

	public String getSourceVersionId() 
	{
		return sourceVersionId;
	}
	
	public void setTargetVersionId(final String targetVersionId)
	{
		this.targetVersionId = targetVersionId;
	}

	public String getTargetVersionId() 
	{
		return targetVersionId;
	}
	


}
