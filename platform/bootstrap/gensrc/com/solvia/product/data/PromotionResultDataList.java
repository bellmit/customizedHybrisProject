/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.product.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.product.data.PromotionResultData;
import java.util.List;

public  class PromotionResultDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PromotionResultDataList.promotions</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<PromotionResultData> promotions;
	
	public PromotionResultDataList()
	{
		// default constructor
	}
	
	public void setPromotions(final List<PromotionResultData> promotions)
	{
		this.promotions = promotions;
	}

	public List<PromotionResultData> getPromotions() 
	{
		return promotions;
	}
	


}
