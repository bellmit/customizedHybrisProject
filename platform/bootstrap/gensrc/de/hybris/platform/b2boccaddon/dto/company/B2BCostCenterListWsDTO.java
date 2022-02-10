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
import de.hybris.platform.b2boccaddon.dto.company.B2BCostCenterWsDTO;
import java.util.List;

public  class B2BCostCenterListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>B2BCostCenterListWsDTO.costCenters</code> property defined at extension <code>b2boccaddon</code>. */
		
	private List<B2BCostCenterWsDTO> costCenters;
	
	public B2BCostCenterListWsDTO()
	{
		// default constructor
	}
	
	public void setCostCenters(final List<B2BCostCenterWsDTO> costCenters)
	{
		this.costCenters = costCenters;
	}

	public List<B2BCostCenterWsDTO> getCostCenters() 
	{
		return costCenters;
	}
	


}
