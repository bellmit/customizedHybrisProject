/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.product.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.product.data.ProductReferenceData;
import java.util.List;

public  class ProductReferencesData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductReferencesData.references</code> property defined at extension <code>commercefacades</code>. */
		
	private List<ProductReferenceData> references;
	
	public ProductReferencesData()
	{
		// default constructor
	}
	
	public void setReferences(final List<ProductReferenceData> references)
	{
		this.references = references;
	}

	public List<ProductReferenceData> getReferences() 
	{
		return references;
	}
	


}
