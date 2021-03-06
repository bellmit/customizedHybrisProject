/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 10, 2022, 8:39:43 PM                    ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.inboundservices.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.inboundservices.model.InboundRequestErrorModel;
import de.hybris.platform.integrationservices.enums.HttpMethod;
import de.hybris.platform.integrationservices.enums.IntegrationRequestStatus;
import de.hybris.platform.integrationservices.model.MonitoredRequestModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;

/**
 * Generated model class for type InboundRequest first defined at extension inboundservices.
 */
@SuppressWarnings("all")
public class InboundRequestModel extends MonitoredRequestModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "InboundRequest";
	
	/** <i>Generated constant</i> - Attribute key of <code>InboundRequest.httpMethod</code> attribute defined at extension <code>inboundservices</code>. */
	public static final String HTTPMETHOD = "httpMethod";
	
	/** <i>Generated constant</i> - Attribute key of <code>InboundRequest.errors</code> attribute defined at extension <code>inboundservices</code>. */
	public static final String ERRORS = "errors";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public InboundRequestModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public InboundRequestModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _status initial attribute declared by type <code>MonitoredRequest</code> at extension <code>integrationservices</code>
	 * @param _type initial attribute declared by type <code>MonitoredRequest</code> at extension <code>integrationservices</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public InboundRequestModel(final IntegrationRequestStatus _status, final String _type)
	{
		super();
		setStatus(_status);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _httpMethod initial attribute declared by type <code>InboundRequest</code> at extension <code>inboundservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _status initial attribute declared by type <code>MonitoredRequest</code> at extension <code>integrationservices</code>
	 * @param _type initial attribute declared by type <code>MonitoredRequest</code> at extension <code>integrationservices</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public InboundRequestModel(final HttpMethod _httpMethod, final ItemModel _owner, final IntegrationRequestStatus _status, final String _type)
	{
		super();
		setHttpMethod(_httpMethod);
		setOwner(_owner);
		setStatus(_status);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InboundRequest.errors</code> attribute defined at extension <code>inboundservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the errors
	 */
	@Accessor(qualifier = "errors", type = Accessor.Type.GETTER)
	public Set<InboundRequestErrorModel> getErrors()
	{
		return getPersistenceContext().getPropertyValue(ERRORS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>InboundRequest.httpMethod</code> attribute defined at extension <code>inboundservices</code>. 
	 * @return the httpMethod - Indicates what HTTP method was used for this inbound request
	 */
	@Accessor(qualifier = "httpMethod", type = Accessor.Type.GETTER)
	public HttpMethod getHttpMethod()
	{
		return getPersistenceContext().getPropertyValue(HTTPMETHOD);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>InboundRequest.errors</code> attribute defined at extension <code>inboundservices</code>. 
	 *  
	 * @param value the errors
	 */
	@Accessor(qualifier = "errors", type = Accessor.Type.SETTER)
	public void setErrors(final Set<InboundRequestErrorModel> value)
	{
		getPersistenceContext().setPropertyValue(ERRORS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>InboundRequest.httpMethod</code> attribute defined at extension <code>inboundservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the httpMethod - Indicates what HTTP method was used for this inbound request
	 */
	@Accessor(qualifier = "httpMethod", type = Accessor.Type.SETTER)
	public void setHttpMethod(final HttpMethod value)
	{
		getPersistenceContext().setPropertyValue(HTTPMETHOD, value);
	}
	
}
