//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.26 at 02:27:13 PM IST 
//


package com.lte.discovery.reconciliation.management.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:gen="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:hdr="http://www.tmforum.org/mtop/fmw/xsd/hdr/v1" xmlns:tns="http://www.tmforum.org/mtop/fmw/xsd/msg/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Profile of exception types supported by all mTOP iterator operations.&lt;/p&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Java class for GetAllDataIteratorExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllDataIteratorExceptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}AllExceptionsType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}commLoss"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}internalError"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}invalidInput"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}notImplemented"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllDataIteratorExceptionType", namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1")
public class GetAllDataIteratorExceptionType
    extends AllExceptionsType
{


}
