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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for emailAttendeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emailAttendeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reminderAfterStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="beforeDays" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="beforeHours" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="beforeMinutes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="59"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sendToRegister" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifySubmits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailAttendeeType", propOrder = {
    "invite",
    "reminderAfterStart",
    "beforeDays",
    "beforeHours",
    "beforeMinutes",
    "sendToRegister",
    "notifySubmits"
})
public class EmailAttendeeType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean invite;
    protected Boolean reminderAfterStart;
    protected Integer beforeDays;
    protected Integer beforeHours;
    protected Integer beforeMinutes;
    protected Boolean sendToRegister;
    protected Boolean notifySubmits;

    /**
     * Gets the value of the invite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvite() {
        return invite;
    }

    /**
     * Sets the value of the invite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvite(Boolean value) {
        this.invite = value;
    }

    /**
     * Gets the value of the reminderAfterStart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReminderAfterStart() {
        return reminderAfterStart;
    }

    /**
     * Sets the value of the reminderAfterStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReminderAfterStart(Boolean value) {
        this.reminderAfterStart = value;
    }

    /**
     * Gets the value of the beforeDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBeforeDays() {
        return beforeDays;
    }

    /**
     * Sets the value of the beforeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBeforeDays(Integer value) {
        this.beforeDays = value;
    }

    /**
     * Gets the value of the beforeHours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBeforeHours() {
        return beforeHours;
    }

    /**
     * Sets the value of the beforeHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBeforeHours(Integer value) {
        this.beforeHours = value;
    }

    /**
     * Gets the value of the beforeMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBeforeMinutes() {
        return beforeMinutes;
    }

    /**
     * Sets the value of the beforeMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBeforeMinutes(Integer value) {
        this.beforeMinutes = value;
    }

    /**
     * Gets the value of the sendToRegister property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendToRegister() {
        return sendToRegister;
    }

    /**
     * Sets the value of the sendToRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendToRegister(Boolean value) {
        this.sendToRegister = value;
    }

    /**
     * Gets the value of the notifySubmits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifySubmits() {
        return notifySubmits;
    }

    /**
     * Sets the value of the notifySubmits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifySubmits(Boolean value) {
        this.notifySubmits = value;
    }

}
