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
 * <p>Java class for M3100.ArcQIStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="M3100.ArcQIStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="NALM_NOT_READY"/>
 *     &lt;enumeration value="NALM_COUNT_DOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "M3100.ArcQIStatusType", namespace = "http://www.tmforum.org/mtop/nra/xsd/ituArc/v1")
@XmlEnum
public enum M3100ArcQIStatusType {

    NOT_APPLICABLE,
    NALM_NOT_READY,
    NALM_COUNT_DOWN;

    public String value() {
        return name();
    }

    public static M3100ArcQIStatusType fromValue(String v) {
        return valueOf(v);
    }

}