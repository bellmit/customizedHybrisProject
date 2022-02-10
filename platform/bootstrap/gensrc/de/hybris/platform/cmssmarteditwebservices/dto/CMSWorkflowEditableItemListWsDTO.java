/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmssmarteditwebservices.dto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="CMSWorkflowEditableItemListWsDTO")
public  class CMSWorkflowEditableItemListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSWorkflowEditableItemListWsDTO.editableItems</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="editableItems") 	
	private List<CMSWorkflowEditableItemWsDTO> editableItems;
	
	public CMSWorkflowEditableItemListWsDTO()
	{
		// default constructor
	}
	
	public void setEditableItems(final List<CMSWorkflowEditableItemWsDTO> editableItems)
	{
		this.editableItems = editableItems;
	}

	public List<CMSWorkflowEditableItemWsDTO> getEditableItems() 
	{
		return editableItems;
	}
	


}
