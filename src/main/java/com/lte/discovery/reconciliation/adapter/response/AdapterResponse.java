//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.01 at 08:15:46 PM IST 
//


package com.lte.discovery.reconciliation.adapter.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="networkElements" type="{http://www.tmforum.org/mtop/mri/xsd/mer/v1}MultipleMeObjectsResponseType"/>
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
    "networkElements"
})
@XmlRootElement(name = "adapterResponse", namespace = "http://www.example.org/AdapterResponse")
public class AdapterResponse {

    @XmlElement(namespace = "http://www.example.org/AdapterResponse", required = true)
    protected MultipleMeObjectsResponseType networkElements;

    /**
     * Gets the value of the networkElements property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleMeObjectsResponseType }
     *     
     */
    public MultipleMeObjectsResponseType getNetworkElements() {
        return networkElements;
    }

    /**
     * Sets the value of the networkElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleMeObjectsResponseType }
     *     
     */
    public void setNetworkElements(MultipleMeObjectsResponseType value) {
        this.networkElements = value;
    }

}
