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
package de.hybris.platform.configurablebundleservices.jalo;

import de.hybris.platform.configurablebundleservices.constants.ConfigurableBundleServicesConstants;
import de.hybris.platform.configurablebundleservices.jalo.PickExactlyNBundleSelectionCriteria;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.configurablebundleservices.jalo.PickNToMBundleSelectionCriteria PickNToMBundleSelectionCriteria}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPickNToMBundleSelectionCriteria extends PickExactlyNBundleSelectionCriteria
{
	/** Qualifier of the <code>PickNToMBundleSelectionCriteria.m</code> attribute **/
	public static final String M = "m";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PickExactlyNBundleSelectionCriteria.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(M, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickNToMBundleSelectionCriteria.m</code> attribute.
	 * @return the m - pick n to m options
	 */
	public Integer getM(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, M);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickNToMBundleSelectionCriteria.m</code> attribute.
	 * @return the m - pick n to m options
	 */
	public Integer getM()
	{
		return getM( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickNToMBundleSelectionCriteria.m</code> attribute. 
	 * @return the m - pick n to m options
	 */
	public int getMAsPrimitive(final SessionContext ctx)
	{
		Integer value = getM( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickNToMBundleSelectionCriteria.m</code> attribute. 
	 * @return the m - pick n to m options
	 */
	public int getMAsPrimitive()
	{
		return getMAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickNToMBundleSelectionCriteria.m</code> attribute. 
	 * @param value the m - pick n to m options
	 */
	public void setM(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, M,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickNToMBundleSelectionCriteria.m</code> attribute. 
	 * @param value the m - pick n to m options
	 */
	public void setM(final Integer value)
	{
		setM( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickNToMBundleSelectionCriteria.m</code> attribute. 
	 * @param value the m - pick n to m options
	 */
	public void setM(final SessionContext ctx, final int value)
	{
		setM( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickNToMBundleSelectionCriteria.m</code> attribute. 
	 * @param value the m - pick n to m options
	 */
	public void setM(final int value)
	{
		setM( getSession().getSessionContext(), value );
	}
	
}
