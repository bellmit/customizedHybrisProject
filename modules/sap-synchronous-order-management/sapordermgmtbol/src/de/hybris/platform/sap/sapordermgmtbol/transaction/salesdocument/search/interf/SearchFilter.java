/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.search.interf;

/**
 * Possible search filtering options.
 */
public interface SearchFilter
{

	/**
	 * Restrict search via shipping status. In case null is provided, no restriction takes place
	 * 
	 * @param shippingStatus
	 *           Status to be used as filter
	 */
	void setShippingStatus(String shippingStatus);

	/**
	 * Restrict search via shipping status.
	 * 
	 * @return Status to be used as filter. No restriction in case of null
	 */
	String getShippingStatus();

	/**
	 * Sets product as search filter
	 * 
	 * @param product
	 *           Product ID
	 */
	void setProductID(String product);

	/**
	 * Retrieving product ID
	 * 
	 * @return Product ID used for searching
	 */
	String getProductID();

	/**
	 * Setting sold to ID we use for the back end search. Without it, search is not possible
	 * 
	 * @param currentSapCustomerId
	 *           Technical SAP customer ID, should be passed completely (with leading zeros)
	 */
	void setSoldToId(String currentSapCustomerId);

	/**
	 * Retrieving sold to ID
	 * 
	 * @return Technical SAP customer ID
	 */
	String getSoldToId();

}
