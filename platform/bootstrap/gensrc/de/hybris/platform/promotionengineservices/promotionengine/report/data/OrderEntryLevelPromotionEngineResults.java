/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.promotionengineservices.promotionengine.report.data;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.promotionengineservices.promotionengine.report.data.AbstractPromotionEngineResults;
import java.math.BigDecimal;

public  class OrderEntryLevelPromotionEngineResults extends AbstractPromotionEngineResults 
{

 

	/** <i>Generated property</i> for <code>OrderEntryLevelPromotionEngineResults.orderEntry</code> property defined at extension <code>promotionengineservices</code>. */
		
	private AbstractOrderEntryModel orderEntry;

	/** <i>Generated property</i> for <code>OrderEntryLevelPromotionEngineResults.totalPrice</code> property defined at extension <code>promotionengineservices</code>. */
		
	private BigDecimal totalPrice;

	/** <i>Generated property</i> for <code>OrderEntryLevelPromotionEngineResults.estimatedAdjustedBasePrice</code> property defined at extension <code>promotionengineservices</code>. */
		
	private BigDecimal estimatedAdjustedBasePrice;
	
	public OrderEntryLevelPromotionEngineResults()
	{
		// default constructor
	}
	
	public void setOrderEntry(final AbstractOrderEntryModel orderEntry)
	{
		this.orderEntry = orderEntry;
	}

	public AbstractOrderEntryModel getOrderEntry() 
	{
		return orderEntry;
	}
	
	public void setTotalPrice(final BigDecimal totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	public BigDecimal getTotalPrice() 
	{
		return totalPrice;
	}
	
	public void setEstimatedAdjustedBasePrice(final BigDecimal estimatedAdjustedBasePrice)
	{
		this.estimatedAdjustedBasePrice = estimatedAdjustedBasePrice;
	}

	public BigDecimal getEstimatedAdjustedBasePrice() 
	{
		return estimatedAdjustedBasePrice;
	}
	


}
