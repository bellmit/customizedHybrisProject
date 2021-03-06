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

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.secureportaladdon.constants.SecureportaladdonConstants;
import de.hybris.platform.secureportaladdon.jalo.B2BRegistrationProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess B2BRegistrationApprovedProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedB2BRegistrationApprovedProcess extends B2BRegistrationProcess
{
	/** Qualifier of the <code>B2BRegistrationApprovedProcess.passwordResetToken</code> attribute **/
	public static final String PASSWORDRESETTOKEN = "passwordResetToken";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(B2BRegistrationProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PASSWORDRESETTOKEN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationApprovedProcess.passwordResetToken</code> attribute.
	 * @return the passwordResetToken
	 */
	public String getPasswordResetToken(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSWORDRESETTOKEN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationApprovedProcess.passwordResetToken</code> attribute.
	 * @return the passwordResetToken
	 */
	public String getPasswordResetToken()
	{
		return getPasswordResetToken( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationApprovedProcess.passwordResetToken</code> attribute. 
	 * @param value the passwordResetToken
	 */
	public void setPasswordResetToken(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSWORDRESETTOKEN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationApprovedProcess.passwordResetToken</code> attribute. 
	 * @param value the passwordResetToken
	 */
	public void setPasswordResetToken(final String value)
	{
		setPasswordResetToken( getSession().getSessionContext(), value );
	}
	
}
