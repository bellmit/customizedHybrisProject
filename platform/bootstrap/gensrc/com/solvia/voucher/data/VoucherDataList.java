/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.voucher.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.voucher.data.VoucherData;
import java.util.List;

public  class VoucherDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>VoucherDataList.vouchers</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private List<VoucherData> vouchers;
	
	public VoucherDataList()
	{
		// default constructor
	}
	
	public void setVouchers(final List<VoucherData> vouchers)
	{
		this.vouchers = vouchers;
	}

	public List<VoucherData> getVouchers() 
	{
		return vouchers;
	}
	


}
