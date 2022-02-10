/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.product;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Representation of a Stock
 */
@ApiModel(value="Stock", description="Representation of a Stock")
public  class StockWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** Status of stock level<br/><br/><i>Generated property</i> for <code>StockWsDTO.stockLevelStatus</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="stockLevelStatus", value="Status of stock level") 	
	private String stockLevelStatus;

	/** Stock level expressed as number<br/><br/><i>Generated property</i> for <code>StockWsDTO.stockLevel</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="stockLevel", value="Stock level expressed as number") 	
	private Long stockLevel;
	
	public StockWsDTO()
	{
		// default constructor
	}
	
	public void setStockLevelStatus(final String stockLevelStatus)
	{
		this.stockLevelStatus = stockLevelStatus;
	}

	public String getStockLevelStatus() 
	{
		return stockLevelStatus;
	}
	
	public void setStockLevel(final Long stockLevel)
	{
		this.stockLevel = stockLevel;
	}

	public Long getStockLevel() 
	{
		return stockLevel;
	}
	


}
