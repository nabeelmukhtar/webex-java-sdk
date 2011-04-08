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

package com.webex.schemas._2002._06.service.meetingtype;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for meetingTypeTypeExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meetingTypeTypeExt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="productCodePrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="active" type="{http://www.webex.com/schemas/2002/06/service/meetingtype}activeType"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limits" type="{http://www.webex.com/schemas/2002/06/service/meetingtype}limitsType" minOccurs="0"/>
 *         &lt;element name="options" type="{http://www.webex.com/schemas/2002/06/service/meetingtype}optionsType"/>
 *         &lt;element name="phoneNumbers" type="{http://www.webex.com/schemas/2002/06/service/meetingtype}phoneNumbersType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingTypeTypeExt", propOrder = {
    "productCodePrefix",
    "active",
    "name",
    "displayName",
    "limits",
    "options",
    "phoneNumbers"
})
@XmlSeeAlso({
    MeetingTypeInstanceType.class
})
public class MeetingTypeTypeExt
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String productCodePrefix;
    @XmlElement(required = true)
    protected ActiveType active;
    @XmlElement(required = true)
    protected String name;
    protected String displayName;
    protected LimitsType limits;
    @XmlElement(required = true)
    protected OptionsType options;
    @XmlElement(required = true)
    protected PhoneNumbersType phoneNumbers;

    /**
     * Gets the value of the productCodePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCodePrefix() {
        return productCodePrefix;
    }

    /**
     * Sets the value of the productCodePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCodePrefix(String value) {
        this.productCodePrefix = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveType }
     *     
     */
    public ActiveType getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveType }
     *     
     */
    public void setActive(ActiveType value) {
        this.active = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the limits property.
     * 
     * @return
     *     possible object is
     *     {@link LimitsType }
     *     
     */
    public LimitsType getLimits() {
        return limits;
    }

    /**
     * Sets the value of the limits property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitsType }
     *     
     */
    public void setLimits(LimitsType value) {
        this.limits = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link OptionsType }
     *     
     */
    public OptionsType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsType }
     *     
     */
    public void setOptions(OptionsType value) {
        this.options = value;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumbersType }
     *     
     */
    public PhoneNumbersType getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumbersType }
     *     
     */
    public void setPhoneNumbers(PhoneNumbersType value) {
        this.phoneNumbers = value;
    }

}
