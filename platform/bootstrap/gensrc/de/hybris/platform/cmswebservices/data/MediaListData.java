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
import de.hybris.platform.cmswebservices.data.MediaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of media
 */
@ApiModel(value="MediaListData", description="List of media")
public  class MediaListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>MediaListData.media</code> property defined at extension <code>cmswebservices</code>. */
	@ApiModelProperty(name="media") 	
	private List<MediaData> media;
	
	public MediaListData()
	{
		// default constructor
	}
	
	public void setMedia(final List<MediaData> media)
	{
		this.media = media;
	}

	public List<MediaData> getMedia() 
	{
		return media;
	}
	


}
