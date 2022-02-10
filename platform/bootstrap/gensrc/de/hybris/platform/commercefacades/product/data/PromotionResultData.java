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
import de.hybris.platform.commercefacades.coupon.data.CouponData;
import de.hybris.platform.commercefacades.order.data.PromotionOrderEntryConsumedData;
import de.hybris.platform.commercefacades.product.data.PromotionData;
import java.util.List;

public  class PromotionResultData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PromotionResultData.description</code> property defined at extension <code>commercefacades</code>. */
		
	private String description;

	/** <i>Generated property</i> for <code>PromotionResultData.giveAwayCouponCodes</code> property defined at extension <code>commercefacades</code>. */
		
	private List<CouponData> giveAwayCouponCodes;

	/** <i>Generated property</i> for <code>PromotionResultData.promotionData</code> property defined at extension <code>commercefacades</code>. */
		
	private PromotionData promotionData;

	/** <i>Generated property</i> for <code>PromotionResultData.consumedEntries</code> property defined at extension <code>commercefacades</code>. */
		
	private List<PromotionOrderEntryConsumedData> consumedEntries;
	
	public PromotionResultData()
	{
		// default constructor
	}
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

	public String getDescription() 
	{
		return description;
	}
	
	public void setGiveAwayCouponCodes(final List<CouponData> giveAwayCouponCodes)
	{
		this.giveAwayCouponCodes = giveAwayCouponCodes;
	}

	public List<CouponData> getGiveAwayCouponCodes() 
	{
		return giveAwayCouponCodes;
	}
	
	public void setPromotionData(final PromotionData promotionData)
	{
		this.promotionData = promotionData;
	}

	public PromotionData getPromotionData() 
	{
		return promotionData;
	}
	
	public void setConsumedEntries(final List<PromotionOrderEntryConsumedData> consumedEntries)
	{
		this.consumedEntries = consumedEntries;
	}

	public List<PromotionOrderEntryConsumedData> getConsumedEntries() 
	{
		return consumedEntries;
	}
	


}
