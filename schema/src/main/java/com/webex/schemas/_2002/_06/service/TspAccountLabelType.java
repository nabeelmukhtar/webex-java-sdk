//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 03:46:38 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tspAccountLabelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tspAccountLabelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tollFreeCallInNumberLabel">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tollCallInNumberLabel">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="subscriberAccessCodeLabel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="participantAccessCodeLabel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tspAccountLabelType", propOrder = {
    "tollFreeCallInNumberLabel",
    "tollCallInNumberLabel",
    "subscriberAccessCodeLabel",
    "participantAccessCodeLabel"
})
public class TspAccountLabelType {

    @XmlElement(required = true)
    protected String tollFreeCallInNumberLabel;
    @XmlElement(required = true)
    protected String tollCallInNumberLabel;
    protected String subscriberAccessCodeLabel;
    protected String participantAccessCodeLabel;

    /**
     * Gets the value of the tollFreeCallInNumberLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeCallInNumberLabel() {
        return tollFreeCallInNumberLabel;
    }

    /**
     * Sets the value of the tollFreeCallInNumberLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeCallInNumberLabel(String value) {
        this.tollFreeCallInNumberLabel = value;
    }

    /**
     * Gets the value of the tollCallInNumberLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollCallInNumberLabel() {
        return tollCallInNumberLabel;
    }

    /**
     * Sets the value of the tollCallInNumberLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollCallInNumberLabel(String value) {
        this.tollCallInNumberLabel = value;
    }

    /**
     * Gets the value of the subscriberAccessCodeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAccessCodeLabel() {
        return subscriberAccessCodeLabel;
    }

    /**
     * Sets the value of the subscriberAccessCodeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAccessCodeLabel(String value) {
        this.subscriberAccessCodeLabel = value;
    }

    /**
     * Gets the value of the participantAccessCodeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantAccessCodeLabel() {
        return participantAccessCodeLabel;
    }

    /**
     * Sets the value of the participantAccessCodeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantAccessCodeLabel(String value) {
        this.participantAccessCodeLabel = value;
    }

}
