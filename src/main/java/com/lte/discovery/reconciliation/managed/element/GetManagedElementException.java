//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.01 at 12:49:03 PM IST 
//


package com.lte.discovery.reconciliation.managed.element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;restriction base="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}AllExceptionsType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}commLoss"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}entityNotFound"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}internalError"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}invalidInput"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}notImplemented"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/msg/v1}unableToComply"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "getManagedElementException")
public class GetManagedElementException
    extends AllExceptionsType
{


}
