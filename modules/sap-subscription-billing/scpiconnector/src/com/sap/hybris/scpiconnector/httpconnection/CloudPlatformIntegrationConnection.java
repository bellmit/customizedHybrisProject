/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.sap.hybris.scpiconnector.httpconnection;

import java.io.IOException;

import com.sap.hybris.scpiconnector.data.ResponseData;





/**
 *
 */
public interface CloudPlatformIntegrationConnection
{
	ResponseData sendPost(final String iflowKey, final Object body) throws IOException;
}
