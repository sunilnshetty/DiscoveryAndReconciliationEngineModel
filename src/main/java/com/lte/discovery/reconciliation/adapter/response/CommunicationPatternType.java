//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.01 at 08:15:46 PM IST 
//


package com.lte.discovery.reconciliation.adapter.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationPatternType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationPatternType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SimpleResponse"/>
 *     &lt;enumeration value="MultipleBatchResponse"/>
 *     &lt;enumeration value="BulkResponse"/>
 *     &lt;enumeration value="Notification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationPatternType", namespace = "http://www.tmforum.org/mtop/fmw/xsd/hdr/v1")
@XmlEnum
public enum CommunicationPatternType {

    @XmlEnumValue("SimpleResponse")
    SIMPLE_RESPONSE("SimpleResponse"),
    @XmlEnumValue("MultipleBatchResponse")
    MULTIPLE_BATCH_RESPONSE("MultipleBatchResponse"),
    @XmlEnumValue("BulkResponse")
    BULK_RESPONSE("BulkResponse"),
    @XmlEnumValue("Notification")
    NOTIFICATION("Notification");
    private final String value;

    CommunicationPatternType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationPatternType fromValue(String v) {
        for (CommunicationPatternType c: CommunicationPatternType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
