//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:47:51 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oneClickType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oneClickType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowJoinUnlistMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requireApproveJoin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneClickType", propOrder = {
    "allowJoinUnlistMeeting",
    "requireApproveJoin"
})
public class OneClickType {

    protected Boolean allowJoinUnlistMeeting;
    protected Boolean requireApproveJoin;

    /**
     * Gets the value of the allowJoinUnlistMeeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowJoinUnlistMeeting() {
        return allowJoinUnlistMeeting;
    }

    /**
     * Sets the value of the allowJoinUnlistMeeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowJoinUnlistMeeting(Boolean value) {
        this.allowJoinUnlistMeeting = value;
    }

    /**
     * Gets the value of the requireApproveJoin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireApproveJoin() {
        return requireApproveJoin;
    }

    /**
     * Sets the value of the requireApproveJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireApproveJoin(Boolean value) {
        this.requireApproveJoin = value;
    }

}
