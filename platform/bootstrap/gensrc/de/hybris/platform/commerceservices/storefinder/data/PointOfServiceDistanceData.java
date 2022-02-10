/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.storefinder.data;

import java.io.Serializable;
import de.hybris.platform.storelocator.model.PointOfServiceModel;

public  class PointOfServiceDistanceData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PointOfServiceDistanceData.pointOfService</code> property defined at extension <code>commerceservices</code>. */
		
	private PointOfServiceModel pointOfService;

	/** <i>Generated property</i> for <code>PointOfServiceDistanceData.distanceKm</code> property defined at extension <code>commerceservices</code>. */
		
	private double distanceKm;
	
	public PointOfServiceDistanceData()
	{
		// default constructor
	}
	
	public void setPointOfService(final PointOfServiceModel pointOfService)
	{
		this.pointOfService = pointOfService;
	}

	public PointOfServiceModel getPointOfService() 
	{
		return pointOfService;
	}
	
	public void setDistanceKm(final double distanceKm)
	{
		this.distanceKm = distanceKm;
	}

	public double getDistanceKm() 
	{
		return distanceKm;
	}
	


}
