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
package de.hybris.platform.integrationservices.jalo;

import de.hybris.platform.integrationservices.constants.IntegrationservicesConstants;
import de.hybris.platform.integrationservices.jalo.IntegrationApiMedia;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MonitoredRequest}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMonitoredRequest extends GenericItem
{
	/** Qualifier of the <code>MonitoredRequest.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>MonitoredRequest.integrationKey</code> attribute **/
	public static final String INTEGRATIONKEY = "integrationKey";
	/** Qualifier of the <code>MonitoredRequest.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>MonitoredRequest.payload</code> attribute **/
	public static final String PAYLOAD = "payload";
	/** Qualifier of the <code>MonitoredRequest.messageId</code> attribute **/
	public static final String MESSAGEID = "messageId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(INTEGRATIONKEY, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(PAYLOAD, AttributeMode.INITIAL);
		tmp.put(MESSAGEID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitoredRequest.integrationKey</code> attribute.
	 * @return the integrationKey
	 */
	public String getIntegrationKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTEGRATIONKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitoredRequest.integrationKey</code> attribute.
	 * @return the integrationKey
	 */
	public String getIntegrationKey()
	{
		return getIntegrationKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitoredRequest.integrationKey</code> attribute. 
	 * @param value the integrationKey
	 */
	public void setIntegrationKey(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTEGRATIONKEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitoredRequest.integrationKey</code> attribute. 
	 * @param value the integrationKey
	 */
	public void setIntegrationKey(final String value)
	{
		setIntegrationKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitoredRequest.messageId</code> attribute.
	 * @return the messageId
	 */
	public String getMessageId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MESSAGEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitoredRequest.messageId</code> attribute.
	 * @return the messageId
	 */
	public String getMessageId()
	{
		return getMessageId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitoredRequest.messageId</code> attribute. 
	 * @param value the messageId
	 */
	public void setMessageId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MESSAGEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitoredRequest.messageId</code> attribute. 
	 * @param value the messageId
	 */
	public void setMessageId(final String value)
	{
		setMessageId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitoredRequest.payload</code> attribute.
	 * @return the payload
	 */
	public IntegrationApiMedia getPayload(final SessionContext ctx)
	{
		return (IntegrationApiMedia)getProperty( ctx, PAYLOAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitoredRequest.payload</code> attribute.
	 * @return the payload
	 */
	public IntegrationApiMedia getPayload()
	{
		return getPayload( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitoredRequest.payload</code> attribute. 
	 * @param value the payload
	 */
	public void setPayload(final SessionContext ctx, final IntegrationApiMedia value)
	{
		setProperty(ctx, PAYLOAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitoredRequest.payload</code> attribute. 
	 * @param value the payload
	 */
	public void setPayload(final IntegrationApiMedia value)
	{
		setPayload( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitoredRequest.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitoredRequest.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitoredRequest.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitoredRequest.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitoredRequest.type</code> attribute.
	 * @return the type
	 */
	public String getType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonitoredRequest.type</code> attribute.
	 * @return the type
	 */
	public String getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitoredRequest.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonitoredRequest.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final String value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}