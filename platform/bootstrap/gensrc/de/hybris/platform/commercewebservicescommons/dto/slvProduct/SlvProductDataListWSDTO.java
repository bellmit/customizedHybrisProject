/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.slvProduct;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.slvProduct.SlvProductDataWSDTO;
import java.util.List;

public  class SlvProductDataListWSDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SlvProductDataListWSDTO.slvProduct</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<SlvProductDataWSDTO> slvProduct;
	
	public SlvProductDataListWSDTO()
	{
		// default constructor
	}
	
	public void setSlvProduct(final List<SlvProductDataWSDTO> slvProduct)
	{
		this.slvProduct = slvProduct;
	}

	public List<SlvProductDataWSDTO> getSlvProduct() 
	{
		return slvProduct;
	}
	


}
