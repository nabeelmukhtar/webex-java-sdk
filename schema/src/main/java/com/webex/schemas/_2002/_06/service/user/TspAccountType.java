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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="tollFreeCallInNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tollCallInNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participantAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createOnBridge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="custom1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custom2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custom3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tollFreeCallInData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tollCallInData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbrDialOut" type="{http://www.webex.com/schemas/2002/06/service/user}nbrDialOutType" minOccurs="0"/>
 *         &lt;element name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "accountIndex",
    "tollCallInNumber",
    "subscriberAccessCode",
    "participantAccessCode",
    "createOnBridge",
    "defaultFlag",
    "custom1",
    "custom2",
    "custom3",
    "tollFreeCallInData",
    "tollCallInData",
    "nbrDialOut",
    "delete"
})
public class TspAccountType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String tollFreeCallInNumber;
    protected Integer accountIndex;
    protected String tollCallInNumber;
    protected String subscriberAccessCode;
    protected String participantAccessCode;
    protected Boolean createOnBridge;
    protected Boolean defaultFlag;
    protected String custom1;
    protected String custom2;
    protected String custom3;
    protected String tollFreeCallInData;
    protected String tollCallInData;
    protected NbrDialOutType nbrDialOut;
    protected Boolean delete;

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
     * Gets the value of the accountIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountIndex() {
        return accountIndex;
    }

    /**
     * Sets the value of the accountIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountIndex(Integer value) {
        this.accountIndex = value;
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

    /**
     * Gets the value of the createOnBridge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateOnBridge() {
        return createOnBridge;
    }

    /**
     * Sets the value of the createOnBridge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateOnBridge(Boolean value) {
        this.createOnBridge = value;
    }

    /**
     * Gets the value of the defaultFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultFlag() {
        return defaultFlag;
    }

    /**
     * Sets the value of the defaultFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultFlag(Boolean value) {
        this.defaultFlag = value;
    }

    /**
     * Gets the value of the custom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * Sets the value of the custom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom1(String value) {
        this.custom1 = value;
    }

    /**
     * Gets the value of the custom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * Sets the value of the custom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom2(String value) {
        this.custom2 = value;
    }

    /**
     * Gets the value of the custom3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom3() {
        return custom3;
    }

    /**
     * Sets the value of the custom3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom3(String value) {
        this.custom3 = value;
    }

    /**
     * Gets the value of the tollFreeCallInData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeCallInData() {
        return tollFreeCallInData;
    }

    /**
     * Sets the value of the tollFreeCallInData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeCallInData(String value) {
        this.tollFreeCallInData = value;
    }

    /**
     * Gets the value of the tollCallInData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollCallInData() {
        return tollCallInData;
    }

    /**
     * Sets the value of the tollCallInData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollCallInData(String value) {
        this.tollCallInData = value;
    }

    /**
     * Gets the value of the nbrDialOut property.
     * 
     * @return
     *     possible object is
     *     {@link NbrDialOutType }
     *     
     */
    public NbrDialOutType getNbrDialOut() {
        return nbrDialOut;
    }

    /**
     * Sets the value of the nbrDialOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link NbrDialOutType }
     *     
     */
    public void setNbrDialOut(NbrDialOutType value) {
        this.nbrDialOut = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
