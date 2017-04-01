//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.01 at 08:15:46 PM IST 
//


package com.lte.discovery.reconciliation.adapter.response;

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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:gen="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:tns="http://www.tmforum.org/mtop/fmw/xsd/nam/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;This is the type definition of the MTOSI object name data structure as a sequence of RDNs, which represents a unique identifier for the MTOSI object on the CCV. Once set by the naming OS, the name is invariant for the life of the object and should be used when referring to the object over the CCV. Name attribute of an object instance shall always be assigned a value, unless the object instance is first discovered by an OS that is not the naming OS for the object instance. In such a case, the discovering OS shall provide a value for the Discovered Name attribute of the object. The naming OS shall provide a value for the Name attribute of the object once it becomes aware of the new object.&lt;/p&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Java class for NamingAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamingAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rdn" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}RelativeDistinguishNameType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamingAttributeType", namespace = "http://www.tmforum.org/mtop/fmw/xsd/nam/v1", propOrder = {
    "rdn"
})
public class NamingAttributeType {

    @XmlElement(required = true)
    protected List<RelativeDistinguishNameType> rdn;

    /**
     * Gets the value of the rdn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rdn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRdn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelativeDistinguishNameType }
     * 
     * 
     */
    public List<RelativeDistinguishNameType> getRdn() {
        if (rdn == null) {
            rdn = new ArrayList<RelativeDistinguishNameType>();
        }
        return this.rdn;
    }

}
