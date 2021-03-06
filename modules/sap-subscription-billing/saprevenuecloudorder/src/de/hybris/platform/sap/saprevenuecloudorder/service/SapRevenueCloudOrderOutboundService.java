/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.saprevenuecloudorder.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import de.hybris.platform.core.model.order.OrderModel;
import rx.Observable;

/**
 * Sends order to Revenue Cloud via CPI.
 */
public interface SapRevenueCloudOrderOutboundService {
	
	/**
	 * Sends order to Revenue Cloud
	 * 
	 * @param orderModel OrderModel
	 * @return Observable<ResponseEntity<Map>>
	 */
	public Observable<ResponseEntity<Map>> sendOrder(OrderModel orderModel);
}
