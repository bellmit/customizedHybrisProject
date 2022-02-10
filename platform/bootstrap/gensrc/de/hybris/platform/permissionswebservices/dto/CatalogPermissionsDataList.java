/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.permissionswebservices.dto;

import java.io.Serializable;
import de.hybris.platform.permissionsfacades.data.CatalogPermissionsData;
import java.util.List;

public  class CatalogPermissionsDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogPermissionsDataList.permissionsList</code> property defined at extension <code>permissionswebservices</code>. */
		
	private List<CatalogPermissionsData> permissionsList;
	
	public CatalogPermissionsDataList()
	{
		// default constructor
	}
	
	public void setPermissionsList(final List<CatalogPermissionsData> permissionsList)
	{
		this.permissionsList = permissionsList;
	}

	public List<CatalogPermissionsData> getPermissionsList() 
	{
		return permissionsList;
	}
	


}