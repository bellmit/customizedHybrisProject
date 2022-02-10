/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.12 at 07:19:30 PM EDT 
//



package org.cxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productActivityHeader",
    "productActivityDetails",
    "extrinsic"
})
@XmlRootElement(name = "ProductActivityMessage")
public class ProductActivityMessage {

    @XmlAttribute(name = "subcontractingIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String subcontractingIndicator;
    @XmlElement(name = "ProductActivityHeader", required = true)
    protected ProductActivityHeader productActivityHeader;
    @XmlElement(name = "ProductActivityDetails", required = true)
    protected List<ProductActivityDetails> productActivityDetails;
    @XmlElement(name = "Extrinsic")
    protected List<Extrinsic> extrinsic;

    /**
     * Gets the value of the subcontractingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcontractingIndicator() {
        return subcontractingIndicator;
    }

    /**
     * Sets the value of the subcontractingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcontractingIndicator(String value) {
        this.subcontractingIndicator = value;
    }

    /**
     * Gets the value of the productActivityHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ProductActivityHeader }
     *     
     */
    public ProductActivityHeader getProductActivityHeader() {
        return productActivityHeader;
    }

    /**
     * Sets the value of the productActivityHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductActivityHeader }
     *     
     */
    public void setProductActivityHeader(ProductActivityHeader value) {
        this.productActivityHeader = value;
    }

    /**
     * Gets the value of the productActivityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productActivityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductActivityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductActivityDetails }
     * 
     * 
     */
    public List<ProductActivityDetails> getProductActivityDetails() {
        if (productActivityDetails == null) {
            productActivityDetails = new ArrayList<ProductActivityDetails>();
        }
        return this.productActivityDetails;
    }

    /**
     * Gets the value of the extrinsic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extrinsic }
     * 
     * 
     */
    public List<Extrinsic> getExtrinsic() {
        if (extrinsic == null) {
            extrinsic = new ArrayList<Extrinsic>();
        }
        return this.extrinsic;
    }

}
