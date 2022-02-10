/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.store.data;

import java.io.Serializable;

public  class GeoPoint  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>GeoPoint.latitude</code> property defined at extension <code>commerceservices</code>. */
		
	private double latitude;

	/** <i>Generated property</i> for <code>GeoPoint.longitude</code> property defined at extension <code>commerceservices</code>. */
		
	private double longitude;
	
	public GeoPoint()
	{
		// default constructor
	}
	
	public void setLatitude(final double latitude)
	{
		this.latitude = latitude;
	}

	public double getLatitude() 
	{
		return latitude;
	}
	
	public void setLongitude(final double longitude)
	{
		this.longitude = longitude;
	}

	public double getLongitude() 
	{
		return longitude;
	}
	


}
