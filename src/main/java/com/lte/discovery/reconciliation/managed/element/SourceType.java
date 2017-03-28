//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.26 at 02:40:57 PM IST 
//


package com.lte.discovery.reconciliation.managed.element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:coi="http://www.tmforum.org/mtop/fmw/xsd/coi/v1" xmlns:gen="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:itu="http://www.tmforum.org/mtop/nrb/xsd/itu/v1" xmlns:tns="http://www.tmforum.org/mtop/nrb/xsd/cri/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;This is the definition of the object attribute that indicates whether the object was discovered from the network, or was entered into the OS's inventory.&lt;/p&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for SourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.tmforum.org/mtop/nrb/xsd/cri/v1>SourceEnumType">
 *       &lt;attribute name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceType", namespace = "http://www.tmforum.org/mtop/nrb/xsd/cri/v1", propOrder = {
    "value"
})
public class SourceType {

    @XmlValue
    protected SourceEnumType value;
    @XmlAttribute(name = "qualifier")
    protected String qualifier;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link SourceEnumType }
     *     
     */
    public SourceEnumType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceEnumType }
     *     
     */
    public void setValue(SourceEnumType value) {
        this.value = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

}
