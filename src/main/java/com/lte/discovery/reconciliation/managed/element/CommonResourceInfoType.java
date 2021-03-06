//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.01 at 12:49:03 PM IST 
//


package com.lte.discovery.reconciliation.managed.element;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:coi="http://www.tmforum.org/mtop/fmw/xsd/coi/v1" xmlns:gen="http://www.tmforum.org/mtop/fmw/xsd/gen/v1" xmlns:itu="http://www.tmforum.org/mtop/nrb/xsd/itu/v1" xmlns:tns="http://www.tmforum.org/mtop/nrb/xsd/cri/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;This aggregate defines attributes common to all mTOP resource objects.&lt;/p&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for CommonResourceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonResourceInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/coi/v1}CommonObjectInfoType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}SourceType" minOccurs="0"/>
 *         &lt;element name="networkAccessDomain" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NetworkAccessDomainType" minOccurs="0"/>
 *         &lt;element name="meiAttributes" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}MultiEventInventoryAttributesType" minOccurs="0"/>
 *         &lt;element name="resourceState" type="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}ResourceStateType" minOccurs="0"/>
 *         &lt;element name="ituStateAndStatusList" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}ItuStateAndStatusList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonResourceInfoType", namespace = "http://www.tmforum.org/mtop/nrb/xsd/cri/v1", propOrder = {
    "source",
    "networkAccessDomain",
    "meiAttributes",
    "resourceState",
    "ituStateAndStatusList"
})
@XmlSeeAlso({
    ManagedElementType.class
})
public abstract class CommonResourceInfoType
    extends CommonObjectInfoType
{

    @XmlElementRef(name = "source", namespace = "http://www.tmforum.org/mtop/nrb/xsd/cri/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<SourceType> source;
    @XmlElementRef(name = "networkAccessDomain", namespace = "http://www.tmforum.org/mtop/nrb/xsd/cri/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkAccessDomain;
    @XmlElementRef(name = "meiAttributes", namespace = "http://www.tmforum.org/mtop/nrb/xsd/cri/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiEventInventoryAttributesType> meiAttributes;
    @XmlElementRef(name = "resourceState", namespace = "http://www.tmforum.org/mtop/nrb/xsd/cri/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceStateType> resourceState;
    @XmlElement(required = true)
    protected ItuStateAndStatusList ituStateAndStatusList;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SourceType }{@code >}
     *     
     */
    public JAXBElement<SourceType> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SourceType }{@code >}
     *     
     */
    public void setSource(JAXBElement<SourceType> value) {
        this.source = value;
    }

    /**
     * Gets the value of the networkAccessDomain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkAccessDomain() {
        return networkAccessDomain;
    }

    /**
     * Sets the value of the networkAccessDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkAccessDomain(JAXBElement<String> value) {
        this.networkAccessDomain = value;
    }

    /**
     * Gets the value of the meiAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiEventInventoryAttributesType }{@code >}
     *     
     */
    public JAXBElement<MultiEventInventoryAttributesType> getMeiAttributes() {
        return meiAttributes;
    }

    /**
     * Sets the value of the meiAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiEventInventoryAttributesType }{@code >}
     *     
     */
    public void setMeiAttributes(JAXBElement<MultiEventInventoryAttributesType> value) {
        this.meiAttributes = value;
    }

    /**
     * Gets the value of the resourceState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceStateType }{@code >}
     *     
     */
    public JAXBElement<ResourceStateType> getResourceState() {
        return resourceState;
    }

    /**
     * Sets the value of the resourceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceStateType }{@code >}
     *     
     */
    public void setResourceState(JAXBElement<ResourceStateType> value) {
        this.resourceState = value;
    }

    /**
     * Gets the value of the ituStateAndStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ItuStateAndStatusList }
     *     
     */
    public ItuStateAndStatusList getItuStateAndStatusList() {
        return ituStateAndStatusList;
    }

    /**
     * Sets the value of the ituStateAndStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItuStateAndStatusList }
     *     
     */
    public void setItuStateAndStatusList(ItuStateAndStatusList value) {
        this.ituStateAndStatusList = value;
    }

}
