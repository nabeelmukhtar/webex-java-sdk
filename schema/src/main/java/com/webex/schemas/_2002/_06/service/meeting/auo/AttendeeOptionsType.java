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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attendeeOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attendeeOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requireUcfDiagnosis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excludePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requireAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailInvitations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeOptionsType", propOrder = {
    "requireUcfDiagnosis",
    "excludePassword",
    "requireAccount",
    "emailInvitations"
})
public class AttendeeOptionsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean requireUcfDiagnosis;
    protected Boolean excludePassword;
    protected Boolean requireAccount;
    @XmlElement(defaultValue = "false")
    protected Boolean emailInvitations;

    /**
     * Gets the value of the requireUcfDiagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireUcfDiagnosis() {
        return requireUcfDiagnosis;
    }

    /**
     * Sets the value of the requireUcfDiagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireUcfDiagnosis(Boolean value) {
        this.requireUcfDiagnosis = value;
    }

    /**
     * Gets the value of the excludePassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludePassword() {
        return excludePassword;
    }

    /**
     * Sets the value of the excludePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludePassword(Boolean value) {
        this.excludePassword = value;
    }

    /**
     * Gets the value of the requireAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireAccount() {
        return requireAccount;
    }

    /**
     * Sets the value of the requireAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireAccount(Boolean value) {
        this.requireAccount = value;
    }

    /**
     * Gets the value of the emailInvitations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailInvitations() {
        return emailInvitations;
    }

    /**
     * Sets the value of the emailInvitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailInvitations(Boolean value) {
        this.emailInvitations = value;
    }

}
