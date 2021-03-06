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
 * <p>Java class for ResourceStateEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceStateEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VENDOR_EXT"/>
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="INSTALLING"/>
 *     &lt;enumeration value="INSTALLING_ACCEPTED"/>
 *     &lt;enumeration value="INSTALLING_COMMISSIONED"/>
 *     &lt;enumeration value="INSTALLING_DELIVERED"/>
 *     &lt;enumeration value="INSTALLING_INSTALLED"/>
 *     &lt;enumeration value="INSTALLING_INTEGRATED"/>
 *     &lt;enumeration value="INSTALLING_REJECTED"/>
 *     &lt;enumeration value="NON_WORKING"/>
 *     &lt;enumeration value="PLANNING"/>
 *     &lt;enumeration value="PLANNING_INITIAL_PLAN"/>
 *     &lt;enumeration value="PLANNING_ORDERED"/>
 *     &lt;enumeration value="PLANNING_PLANNED"/>
 *     &lt;enumeration value="RETIRING"/>
 *     &lt;enumeration value="RETIRING_DECOMMISSIONED"/>
 *     &lt;enumeration value="RETIRING_DEINSTALLED"/>
 *     &lt;enumeration value="RETIRING_DEINTEGRATED"/>
 *     &lt;enumeration value="RETIRING_RECOVERED"/>
 *     &lt;enumeration value="RETIRING_STORED"/>
 *     &lt;enumeration value="RETIRING_WITHDRAWN_ACTIVE"/>
 *     &lt;enumeration value="RETIRING_WITHDRAWN_UNAVAILABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="WORKING"/>
 *     &lt;enumeration value="WORKING_ACTIVATED"/>
 *     &lt;enumeration value="WORKING_DEACTIVATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceStateEnumType", namespace = "http://www.tmforum.org/mtop/nrb/xsd/cri/v1")
@XmlEnum
public enum ResourceStateEnumType {

    VENDOR_EXT,
    MINOR_EXT,
    INSTALLING,
    INSTALLING_ACCEPTED,
    INSTALLING_COMMISSIONED,
    INSTALLING_DELIVERED,
    INSTALLING_INSTALLED,
    INSTALLING_INTEGRATED,
    INSTALLING_REJECTED,
    NON_WORKING,
    PLANNING,
    PLANNING_INITIAL_PLAN,
    PLANNING_ORDERED,
    PLANNING_PLANNED,
    RETIRING,
    RETIRING_DECOMMISSIONED,
    RETIRING_DEINSTALLED,
    RETIRING_DEINTEGRATED,
    RETIRING_RECOVERED,
    RETIRING_STORED,
    RETIRING_WITHDRAWN_ACTIVE,
    RETIRING_WITHDRAWN_UNAVAILABLE,
    UNKNOWN,
    WORKING,
    WORKING_ACTIVATED,
    WORKING_DEACTIVATED;

    public String value() {
        return name();
    }

    public static ResourceStateEnumType fromValue(String v) {
        return valueOf(v);
    }

}
