/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.storelocator.data;

import java.io.Serializable;

public  class TimeData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>TimeData.hour</code> property defined at extension <code>commercefacades</code>. */
		
	private byte hour;

	/** <i>Generated property</i> for <code>TimeData.minute</code> property defined at extension <code>commercefacades</code>. */
		
	private byte minute;

	/** <i>Generated property</i> for <code>TimeData.formattedHour</code> property defined at extension <code>commercefacades</code>. */
		
	private String formattedHour;
	
	public TimeData()
	{
		// default constructor
	}
	
	public void setHour(final byte hour)
	{
		this.hour = hour;
	}

	public byte getHour() 
	{
		return hour;
	}
	
	public void setMinute(final byte minute)
	{
		this.minute = minute;
	}

	public byte getMinute() 
	{
		return minute;
	}
	
	public void setFormattedHour(final String formattedHour)
	{
		this.formattedHour = formattedHour;
	}

	public String getFormattedHour() 
	{
		return formattedHour;
	}
	


}
