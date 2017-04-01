//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.01 at 08:15:46 PM IST 
//


package com.lte.discovery.reconciliation.adapter.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NETWORK_ME"/>
 *     &lt;enumeration value="OS"/>
 *     &lt;enumeration value="NETWORK_EMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SourceEnumType", namespace = "http://www.tmforum.org/mtop/nrb/xsd/cri/v1")
@XmlEnum
public enum SourceEnumType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:coi="http://www.tmforum.org/mtop/fmw/xsd/coi/v1" xmlns:gen="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:itu="http://www.tmforum.org/mtop/nrb/xsd/itu/v1" xmlns:tns="http://www.tmforum.org/mtop/nrb/xsd/cri/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;the object was discovered directly from the ME.&lt;/p&gt;
     * </pre>
     * 
     * 					
     * 
     */
    NETWORK_ME,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:coi="http://www.tmforum.org/mtop/fmw/xsd/coi/v1" xmlns:gen="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:itu="http://www.tmforum.org/mtop/nrb/xsd/itu/v1" xmlns:tns="http://www.tmforum.org/mtop/nrb/xsd/cri/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;the object was entered into an OS on the CCV, e.g., OS GUI or file transfer to the OS from some other system.&lt;/p&gt;
     * </pre>
     * 
     * 					
     * 
     */
    OS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:coi="http://www.tmforum.org/mtop/fmw/xsd/coi/v1" xmlns:gen="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:itu="http://www.tmforum.org/mtop/nrb/xsd/itu/v1" xmlns:tns="http://www.tmforum.org/mtop/nrb/xsd/cri/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;the object was discovered from an EMS.&lt;/p&gt;
     * </pre>
     * 
     * 					
     * 
     */
    NETWORK_EMS;

    public String value() {
        return name();
    }

    public static SourceEnumType fromValue(String v) {
        return valueOf(v);
    }

}