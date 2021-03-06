/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.ep.OneClickAccountType;


/**
 * <p>Java class for tspAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tspAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tollFreeCallInNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tollCallInNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="subscriberAccessCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="participantAccessCode" minOccurs="0">
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
@XmlType(name = "tspAccountType", propOrder = {
    "tollFreeCallInNumber",
    "tollCallInNumber",
    "subscriberAccessCode",
    "participantAccessCode"
})
@XmlSeeAlso({
    OneClickAccountType.class
})
public class TspAccountType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String tollFreeCallInNumber;
    @XmlElement(required = true)
    protected String tollCallInNumber;
    protected String subscriberAccessCode;
    protected String participantAccessCode;

    /**
     * Gets the value of the tollFreeCallInNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeCallInNumber() {
        return tollFreeCallInNumber;
    }

    /**
     * Sets the value of the tollFreeCallInNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeCallInNumber(String value) {
        this.tollFreeCallInNumber = value;
    }

    /**
     * Gets the value of the tollCallInNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollCallInNumber() {
        return tollCallInNumber;
    }

    /**
     * Sets the value of the tollCallInNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollCallInNumber(String value) {
        this.tollCallInNumber = value;
    }

    /**
     * Gets the value of the subscriberAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAccessCode() {
        return subscriberAccessCode;
    }

    /**
     * Sets the value of the subscriberAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAccessCode(String value) {
        this.subscriberAccessCode = value;
    }

    /**
     * Gets the value of the participantAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantAccessCode() {
        return participantAccessCode;
    }

    /**
     * Sets the value of the participantAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantAccessCode(String value) {
        this.participantAccessCode = value;
    }

}
