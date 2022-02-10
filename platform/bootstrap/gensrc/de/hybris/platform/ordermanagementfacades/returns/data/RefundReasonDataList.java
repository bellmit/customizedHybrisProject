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
import de.hybris.platform.basecommerce.enums.RefundReason;
import java.util.List;

public  class RefundReasonDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RefundReasonDataList.refundReasons</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private List<RefundReason> refundReasons;
	
	public RefundReasonDataList()
	{
		// default constructor
	}
	
	public void setRefundReasons(final List<RefundReason> refundReasons)
	{
		this.refundReasons = refundReasons;
	}

	public List<RefundReason> getRefundReasons() 
	{
		return refundReasons;
	}
	


}
