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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for teleconferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="teleconferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telephonySupport" type="{http://www.webex.com/schemas/2002/06/service/site}telephonySupportType"/>
 *         &lt;element name="tollFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="intlLocalCallIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teleconferenceType", propOrder = {
    "telephonySupport",
    "tollFree",
    "intlLocalCallIn"
})
public class TeleconferenceType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected TelephonySupportType telephonySupport;
    protected Boolean tollFree;
    protected Boolean intlLocalCallIn;

    /**
     * Gets the value of the telephonySupport property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonySupportType }
     *     
     */
    public TelephonySupportType getTelephonySupport() {
        return telephonySupport;
    }

    /**
     * Sets the value of the telephonySupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonySupportType }
     *     
     */
    public void setTelephonySupport(TelephonySupportType value) {
        this.telephonySupport = value;
    }

    /**
     * Gets the value of the tollFree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTollFree() {
        return tollFree;
    }

    /**
     * Sets the value of the tollFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTollFree(Boolean value) {
        this.tollFree = value;
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

}
