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
package de.hybris.platform.apiregistryservices.jalo;

import de.hybris.platform.apiregistryservices.constants.ApiregistryservicesConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.servicelayer.internal.jalo.ServicelayerJob;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.apiregistryservices.jalo.DestinationTargetCronJob DestinationTargetCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDestinationTargetCronJob extends ServicelayerJob
{
	/** Qualifier of the <code>DestinationTargetCronJob.destinationTargetId</code> attribute **/
	public static final String DESTINATIONTARGETID = "destinationTargetId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ServicelayerJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DESTINATIONTARGETID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DestinationTargetCronJob.destinationTargetId</code> attribute.
	 * @return the destinationTargetId - ID of DestinationTarget to be processed
	 */
	public String getDestinationTargetId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESTINATIONTARGETID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DestinationTargetCronJob.destinationTargetId</code> attribute.
	 * @return the destinationTargetId - ID of DestinationTarget to be processed
	 */
	public String getDestinationTargetId()
	{
		return getDestinationTargetId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DestinationTargetCronJob.destinationTargetId</code> attribute. 
	 * @param value the destinationTargetId - ID of DestinationTarget to be processed
	 */
	public void setDestinationTargetId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESTINATIONTARGETID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DestinationTargetCronJob.destinationTargetId</code> attribute. 
	 * @param value the destinationTargetId - ID of DestinationTarget to be processed
	 */
	public void setDestinationTargetId(final String value)
	{
		setDestinationTargetId( getSession().getSessionContext(), value );
	}
	
}