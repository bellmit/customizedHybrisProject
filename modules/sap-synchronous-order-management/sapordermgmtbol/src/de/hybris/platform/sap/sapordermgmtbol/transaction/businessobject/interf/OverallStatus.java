/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.businessobject.interf;

/**
 * Represents the OverallStatus object. <br>
 * 
 */
public interface OverallStatus extends BusinessStatus {
    /**
     * @return <code>true</code>, only if the document was already cancelled
     */
    boolean isCancelled();

}
