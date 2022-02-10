/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2b.occ.security;

/**
 * Global class for all Spring Security Access constants. Used .
 */
public final class SecuredAccessConstants
{
	private SecuredAccessConstants()
	{
		//empty to avoid instantiating this constant class
	}

	public static final String ROLE_GUEST = "ROLE_GUEST";
	public static final String ROLE_CUSTOMERGROUP = "ROLE_CUSTOMERGROUP";
	public static final String ROLE_TRUSTED_CLIENT = "ROLE_TRUSTED_CLIENT";
	public static final String ROLE_CUSTOMERMANAGERGROUP = "ROLE_CUSTOMERMANAGERGROUP";
}
