//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.01 at 12:49:03 PM IST 
//


package com.lte.discovery.reconciliation.managed.element;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:tns="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A list of NameAndAnyValueType&lt;/p&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for NameAndAnyValueListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameAndAnyValueListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nv" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndAnyValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndAnyValueListType", namespace = "http://www.tmforum.org/mtop/fmw/xsd/gen/v1", propOrder = {
    "nv"
})
public class NameAndAnyValueListType {

    protected List<NameAndAnyValueType> nv;

    /**
     * Gets the value of the nv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameAndAnyValueType }
     * 
     * 
     */
    public List<NameAndAnyValueType> getNv() {
        if (nv == null) {
            nv = new ArrayList<NameAndAnyValueType>();
        }
        return this.nv;
    }

}
