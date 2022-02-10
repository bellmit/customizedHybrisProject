/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.kymaintegrationservices.dto;

import java.io.Serializable;
import java.util.Date;

public  class CertificateRenewalData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CertificateRenewalData.aheadTime</code> property defined at extension <code>kymaintegrationservices</code>. */
		
	private Long aheadTime;

	/** <i>Generated property</i> for <code>CertificateRenewalData.expiryDate</code> property defined at extension <code>kymaintegrationservices</code>. */
		
	private Date expiryDate;
	
	public CertificateRenewalData()
	{
		// default constructor
	}
	
	public void setAheadTime(final Long aheadTime)
	{
		this.aheadTime = aheadTime;
	}

	public Long getAheadTime() 
	{
		return aheadTime;
	}
	
	public void setExpiryDate(final Date expiryDate)
	{
		this.expiryDate = expiryDate;
	}

	public Date getExpiryDate() 
	{
		return expiryDate;
	}
	


}
