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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordAccessDetailHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordAccessDetailHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viewID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="participantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participantEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="registerDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downloaded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="viewed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="regFields" type="{http://www.webex.com/schemas/2002/06/service/history}regFieldsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordAccessDetailHistoryType", propOrder = {
    "viewID",
    "participantName",
    "participantEmail",
    "accessTime",
    "registered",
    "registerDate",
    "downloaded",
    "viewed",
    "timeZoneID",
    "regFields"
})
public class RecordAccessDetailHistoryType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long viewID;
    protected String participantName;
    protected String participantEmail;
    protected String accessTime;
    protected Boolean registered;
    protected String registerDate;
    protected Boolean downloaded;
    protected Boolean viewed;
    @XmlElement(defaultValue = "-1")
    protected Integer timeZoneID;
    protected RegFieldsType regFields;

    /**
     * Gets the value of the viewID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getViewID() {
        return viewID;
    }

    /**
     * Sets the value of the viewID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setViewID(Long value) {
        this.viewID = value;
    }

    /**
     * Gets the value of the participantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantName() {
        return participantName;
    }

    /**
     * Sets the value of the participantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantName(String value) {
        this.participantName = value;
    }

    /**
     * Gets the value of the participantEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantEmail() {
        return participantEmail;
    }

    /**
     * Sets the value of the participantEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantEmail(String value) {
        this.participantEmail = value;
    }

    /**
     * Gets the value of the accessTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessTime() {
        return accessTime;
    }

    /**
     * Sets the value of the accessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessTime(String value) {
        this.accessTime = value;
    }

    /**
     * Gets the value of the registered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistered() {
        return registered;
    }

    /**
     * Sets the value of the registered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistered(Boolean value) {
        this.registered = value;
    }

    /**
     * Gets the value of the registerDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the value of the registerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterDate(String value) {
        this.registerDate = value;
    }

    /**
     * Gets the value of the downloaded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownloaded() {
        return downloaded;
    }

    /**
     * Sets the value of the downloaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownloaded(Boolean value) {
        this.downloaded = value;
    }

    /**
     * Gets the value of the viewed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewed() {
        return viewed;
    }

    /**
     * Sets the value of the viewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewed(Boolean value) {
        this.viewed = value;
    }

    /**
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeZoneID(Integer value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the regFields property.
     * 
     * @return
     *     possible object is
     *     {@link RegFieldsType }
     *     
     */
    public RegFieldsType getRegFields() {
        return regFields;
    }

    /**
     * Sets the value of the regFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegFieldsType }
     *     
     */
    public void setRegFields(RegFieldsType value) {
        this.regFields = value;
    }

}
