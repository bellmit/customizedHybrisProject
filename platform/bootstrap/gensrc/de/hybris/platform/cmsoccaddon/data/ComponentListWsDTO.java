/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsoccaddon.data;

import java.io.Serializable;
import de.hybris.platform.cmsoccaddon.data.ComponentWsDTO;
import java.util.List;

public  class ComponentListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ComponentListWsDTO.component</code> property defined at extension <code>cmsoccaddon</code>. */
		
	private List<ComponentWsDTO> component;
	
	public ComponentListWsDTO()
	{
		// default constructor
	}
	
	public void setComponent(final List<ComponentWsDTO> component)
	{
		this.component = component;
	}

	public List<ComponentWsDTO> getComponent() 
	{
		return component;
	}
	


}
