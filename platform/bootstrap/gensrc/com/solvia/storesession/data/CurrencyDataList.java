/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.storesession.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import java.util.Collection;

public  class CurrencyDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CurrencyDataList.currencies</code> property defined at extension <code>solviacommercewebservices</code>. */
		
	private Collection<CurrencyData> currencies;
	
	public CurrencyDataList()
	{
		// default constructor
	}
	
	public void setCurrencies(final Collection<CurrencyData> currencies)
	{
		this.currencies = currencies;
	}

	public Collection<CurrencyData> getCurrencies() 
	{
		return currencies;
	}
	


}
