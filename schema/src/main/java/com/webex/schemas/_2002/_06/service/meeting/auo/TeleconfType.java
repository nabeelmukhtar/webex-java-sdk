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

package com.webex.schemas._2002._06.service.meeting.auo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for teleconfType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="teleconfType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestConferenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accountIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="extTelephonyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intlLocalCallIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teleconfLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teleconfType", propOrder = {
    "requestConferenceNumber",
    "accountIndex",
    "extTelephonyDescription",
    "intlLocalCallIn",
    "teleconfLocation"
})
public class TeleconfType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean requestConferenceNumber;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long accountIndex;
    protected String extTelephonyDescription;
    protected Boolean intlLocalCallIn;
    protected String teleconfLocation;

    /**
     * Gets the value of the requestConferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestConferenceNumber() {
        return requestConferenceNumber;
    }

    /**
     * Sets the value of the requestConferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestConferenceNumber(Boolean value) {
        this.requestConferenceNumber = value;
    }

    /**
     * Gets the value of the accountIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAccountIndex() {
        return accountIndex;
    }

    /**
     * Sets the value of the accountIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIndex(Long value) {
        this.accountIndex = value;
    }

    /**
     * Gets the value of the extTelephonyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTelephonyDescription() {
        return extTelephonyDescription;
    }

    /**
     * Sets the value of the extTelephonyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTelephonyDescription(String value) {
        this.extTelephonyDescription = value;
    }

    /**
     * Gets the value of the intlLocalCallIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntlLocalCallIn() {
        return intlLocalCallIn;
    }

    /**
     * Sets the value of the intlLocalCallIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntlLocalCallIn(Boolean value) {
        this.intlLocalCallIn = value;
    }

    /**
     * Gets the value of the teleconfLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeleconfLocation() {
        return teleconfLocation;
    }

    /**
     * Sets the value of the teleconfLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeleconfLocation(String value) {
        this.teleconfLocation = value;
    }

}
