/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.util.interf;

/**
 * Enumeration representing all the different document kinds an sales document
 * can have.
 * 
 */
public enum DocumentType {

    /**
     * Constant defining the document type for a basket.
     */
    BASKET(),
    /**
     * Constant defining the document type for an order.
     */
    ORDER(),
    /**
     * Constant defining the document type for a quotation.
     */
    QUOTATION(),
    /**
     * Constant defining the document type for an request for quotation (rfq).
     */
    RFQ(),
    /**
     * Constant defining the document type for a lead. There exists no Business
     * Object right now, to represent a lead. This Constant is only used, for
     * the predecessor document type
     */
    LEAD(),
    /**
     * Constant defining the document type for an opportunity.
     */
    ACTIVITY(),
    /**
     * Constant defining the common document type for billing (e.g. invoice,
     * credit memo, ...)
     */
    BILLING(),
    /**
     * Constant defining the common document type for invoice
     */
    INVOICE(),
    /**
     * Constant defining the common document type for invoice cancellation
     */
    INVOICE_CNC(),
    /**
     * Constant defining the common document type for CRM billing invoice
     */
    INVOICE_CRMBILL(),
    /**
    * Constant defining the common document type for credit memo
    */     
    CREDIT_MEMO(),
    /**
     * Constant defining the common document type for credit memo cancellation
     */
    CREDIT_MEMO_CNC(),
    /**
     * Constant defining the document type for delivery
     */
    DELIVERY(),
    /**
     * Constant defining the document type for returns
     */
    RETURNS(),
    /**
     * Constant defining the document type for complaint
     */
    COMPLAINT(),
    /**
     * Constant defining the document type for service contract
     */
    SERVICECONTRACT(),
    /**
     * Constant defining the document type for service order
     */
    SERVICEORDER(),
    /**
     * Constant defining the document type for service confirmation
     */
    CONFIRMATION(),
    /**
     * Document type is undefined
     */
    UNKNOWN();

}
