//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.01 at 12:49:03 PM IST 
//


package com.lte.discovery.reconciliation.managed.element;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for X721.AdministrativeStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="X721.AdministrativeStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOCKED"/>
 *     &lt;enumeration value="UNLOCKED"/>
 *     &lt;enumeration value="SHUTTING_DOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "X721.AdministrativeStateType", namespace = "http://www.tmforum.org/mtop/nrb/xsd/itu/v1")
@XmlEnum
public enum X721AdministrativeStateType {

    LOCKED,
    UNLOCKED,
    SHUTTING_DOWN;

    public String value() {
        return name();
    }

    public static X721AdministrativeStateType fromValue(String v) {
        return valueOf(v);
    }

}
