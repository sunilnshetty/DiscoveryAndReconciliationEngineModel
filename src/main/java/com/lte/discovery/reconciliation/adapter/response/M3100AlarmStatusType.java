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
 * <p>Java class for M3100.AlarmStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="M3100.AlarmStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLEARED"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="INDETERMINATE"/>
 *     &lt;enumeration value="MINOR"/>
 *     &lt;enumeration value="MAJOR"/>
 *     &lt;enumeration value="CRITICAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "M3100.AlarmStatusType", namespace = "http://www.tmforum.org/mtop/nra/xsd/ituArc/v1")
@XmlEnum
public enum M3100AlarmStatusType {

    CLEARED,
    PENDING,
    WARNING,
    INDETERMINATE,
    MINOR,
    MAJOR,
    CRITICAL;

    public String value() {
        return name();
    }

    public static M3100AlarmStatusType fromValue(String v) {
        return valueOf(v);
    }

}
