//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.01 at 12:49:03 PM IST 
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:gen="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:tns="http://www.tmforum.org/mtop/fmw/xsd/hdr/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Specify if compression is to be performed.&lt;/p&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Java class for CompressionTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompressionTypeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.tmforum.org/mtop/fmw/xsd/hdr/v1>CompressionEnumType">
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompressionTypeType", namespace = "http://www.tmforum.org/mtop/fmw/xsd/hdr/v1", propOrder = {
    "value"
})
public class CompressionTypeType {

    @XmlValue
    protected CompressionEnumType value;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * 
     *         
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:gen="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:tns="http://www.tmforum.org/mtop/fmw/xsd/hdr/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Enumeration of supported compressions. All extensions allowed.&lt;/p&gt;
     * </pre>
     * 
     *       
     * 
     * @return
     *     possible object is
     *     {@link CompressionEnumType }
     *     
     */
    public CompressionEnumType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionEnumType }
     *     
     */
    public void setValue(CompressionEnumType value) {
        this.value = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}
