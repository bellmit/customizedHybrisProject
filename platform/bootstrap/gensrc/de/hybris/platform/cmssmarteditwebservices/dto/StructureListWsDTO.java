/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmssmarteditwebservices.dto;

import java.io.Serializable;
import de.hybris.platform.cmssmarteditwebservices.dto.StructureWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * The list of structures for a type code.
 *
 * @deprecated since 1811, no longer needed.
 */
@ApiModel(value="StructureListWsDTO", description="The list of structures for a type code.")
@Deprecated(forRemoval = true)
public  class StructureListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>StructureListWsDTO.structures</code> property defined at extension <code>cmssmarteditwebservices</code>. */
	@ApiModelProperty(name="structures") 	
	private List<StructureWsDTO> structures;
	
	public StructureListWsDTO()
	{
		// default constructor
	}
	
	public void setStructures(final List<StructureWsDTO> structures)
	{
		this.structures = structures;
	}

	public List<StructureWsDTO> getStructures() 
	{
		return structures;
	}
	


}
