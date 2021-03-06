/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 9, 2022, 11:43:51 AM                    ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.secureportaladdon.jalo;

import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.secureportaladdon.constants.SecureportaladdonConstants;
import de.hybris.platform.secureportaladdon.jalo.B2BRegistration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess B2BRegistrationProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedB2BRegistrationProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>B2BRegistrationProcess.registration</code> attribute **/
	public static final String REGISTRATION = "registration";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REGISTRATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationProcess.registration</code> attribute.
	 * @return the registration
	 */
	public B2BRegistration getRegistration(final SessionContext ctx)
	{
		return (B2BRegistration)getProperty( ctx, REGISTRATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationProcess.registration</code> attribute.
	 * @return the registration
	 */
	public B2BRegistration getRegistration()
	{
		return getRegistration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationProcess.registration</code> attribute. 
	 * @param value the registration
	 */
	public void setRegistration(final SessionContext ctx, final B2BRegistration value)
	{
		setProperty(ctx, REGISTRATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationProcess.registration</code> attribute. 
	 * @param value the registration
	 */
	public void setRegistration(final B2BRegistration value)
	{
		setRegistration( getSession().getSessionContext(), value );
	}
	
}
