//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.26 at 02:27:13 PM IST 
//


package com.lte.discovery.reconciliation.management.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:tns="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;This is the definition of the object attribute that contains the list of aliases for the network entity. The attribute is a name-value list. The name refers to the type of alias (e.g., nativeEMSname) and the value component holds the alias itself&lt;/p&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for AliasNameListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AliasNameListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alias" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aliasName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="aliasValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasNameListType", propOrder = {
    "alias"
})
public class AliasNameListType {

    protected List<AliasNameListType.Alias> alias;

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AliasNameListType.Alias }
     * 
     * 
     */
    public List<AliasNameListType.Alias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<AliasNameListType.Alias>();
        }
        return this.alias;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="aliasName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="aliasValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aliasName",
        "aliasValue"
    })
    public static class Alias {

        @XmlElement(required = true)
        protected String aliasName;
        @XmlElement(required = true, nillable = true)
        protected String aliasValue;

        /**
         * Gets the value of the aliasName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAliasName() {
            return aliasName;
        }

        /**
         * Sets the value of the aliasName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAliasName(String value) {
            this.aliasName = value;
        }

        /**
         * Gets the value of the aliasValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAliasValue() {
            return aliasValue;
        }

        /**
         * Sets the value of the aliasValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAliasValue(String value) {
            this.aliasValue = value;
        }

    }

}
