/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.orderexchange.outbound.impl;

import de.hybris.platform.ordercancel.model.OrderCancelRecordEntryModel;


/**
 * Class definition as a workaround for Spring since it cannot handle parameterized types
 */
public class DefaultSendOrderCancelRequestToDataHubHelper extends AbstractSendToDataHubHelper<OrderCancelRecordEntryModel>
{

}
