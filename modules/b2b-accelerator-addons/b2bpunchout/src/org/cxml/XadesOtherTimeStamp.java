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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xadesReferenceInfo",
    "dsCanonicalizationMethod",
    "xadesEncapsulatedTimeStampOrXadesXMLTimeStamp"
})
@XmlRootElement(name = "xades:OtherTimeStamp")
public class XadesOtherTimeStamp {

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(name = "xades:ReferenceInfo", required = true)
    protected List<XadesReferenceInfo> xadesReferenceInfo;
    @XmlElement(name = "ds:CanonicalizationMethod")
    protected DsCanonicalizationMethod dsCanonicalizationMethod;
    @XmlElements({
        @XmlElement(name = "xades:EncapsulatedTimeStamp", required = true, type = XadesEncapsulatedTimeStamp.class),
        @XmlElement(name = "xades:XMLTimeStamp", required = true, type = XadesXMLTimeStamp.class)
    })
    protected List<Object> xadesEncapsulatedTimeStampOrXadesXMLTimeStamp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the xadesReferenceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesReferenceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesReferenceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesReferenceInfo }
     * 
     * 
     */
    public List<XadesReferenceInfo> getXadesReferenceInfo() {
        if (xadesReferenceInfo == null) {
            xadesReferenceInfo = new ArrayList<XadesReferenceInfo>();
        }
        return this.xadesReferenceInfo;
    }

    /**
     * Gets the value of the dsCanonicalizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DsCanonicalizationMethod }
     *     
     */
    public DsCanonicalizationMethod getDsCanonicalizationMethod() {
        return dsCanonicalizationMethod;
    }

    /**
     * Sets the value of the dsCanonicalizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsCanonicalizationMethod }
     *     
     */
    public void setDsCanonicalizationMethod(DsCanonicalizationMethod value) {
        this.dsCanonicalizationMethod = value;
    }

    /**
     * Gets the value of the xadesEncapsulatedTimeStampOrXadesXMLTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesEncapsulatedTimeStampOrXadesXMLTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesEncapsulatedTimeStampOrXadesXMLTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesEncapsulatedTimeStamp }
     * {@link XadesXMLTimeStamp }
     * 
     * 
     */
    public List<Object> getXadesEncapsulatedTimeStampOrXadesXMLTimeStamp() {
        if (xadesEncapsulatedTimeStampOrXadesXMLTimeStamp == null) {
            xadesEncapsulatedTimeStampOrXadesXMLTimeStamp = new ArrayList<Object>();
        }
        return this.xadesEncapsulatedTimeStampOrXadesXMLTimeStamp;
    }

}
