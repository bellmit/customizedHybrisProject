/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ordermanagementfacades.returns.data;

import java.io.Serializable;
import de.hybris.platform.ordermanagementfacades.returns.data.ReturnEntryModificationData;
import java.util.List;

public  class ReturnRequestModificationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ReturnRequestModificationData.returnEntries</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private List<ReturnEntryModificationData> returnEntries;

	/** <i>Generated property</i> for <code>ReturnRequestModificationData.refundDeliveryCost</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private Boolean refundDeliveryCost;
	
	public ReturnRequestModificationData()
	{
		// default constructor
	}
	
	public void setReturnEntries(final List<ReturnEntryModificationData> returnEntries)
	{
		this.returnEntries = returnEntries;
	}

	public List<ReturnEntryModificationData> getReturnEntries() 
	{
		return returnEntries;
	}
	
	public void setRefundDeliveryCost(final Boolean refundDeliveryCost)
	{
		this.refundDeliveryCost = refundDeliveryCost;
	}

	public Boolean getRefundDeliveryCost() 
	{
		return refundDeliveryCost;
	}
	


}
