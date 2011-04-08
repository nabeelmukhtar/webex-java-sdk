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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for personalAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personalAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participantFullAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participantLimitedAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="defaultFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="autoGenerate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="joinBeforeHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "personalAccountType", propOrder = {
    "subscriberAccessCode",
    "participantFullAccessCode",
    "participantLimitedAccessCode",
    "accountIndex",
    "defaultFlag",
    "autoGenerate",
    "joinBeforeHost",
    "delete"
})
public class PersonalAccountType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String subscriberAccessCode;
    protected String participantFullAccessCode;
    protected String participantLimitedAccessCode;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long accountIndex;
    protected Boolean defaultFlag;
    protected Boolean autoGenerate;
    protected Boolean joinBeforeHost;
    protected Boolean delete;

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
     * Gets the value of the participantFullAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantFullAccessCode() {
        return participantFullAccessCode;
    }

    /**
     * Sets the value of the participantFullAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantFullAccessCode(String value) {
        this.participantFullAccessCode = value;
    }

    /**
     * Gets the value of the participantLimitedAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantLimitedAccessCode() {
        return participantLimitedAccessCode;
    }

    /**
     * Sets the value of the participantLimitedAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantLimitedAccessCode(String value) {
        this.participantLimitedAccessCode = value;
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
     * Gets the value of the autoGenerate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoGenerate() {
        return autoGenerate;
    }

    /**
     * Sets the value of the autoGenerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoGenerate(Boolean value) {
        this.autoGenerate = value;
    }

    /**
     * Gets the value of the joinBeforeHost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJoinBeforeHost() {
        return joinBeforeHost;
    }

    /**
     * Sets the value of the joinBeforeHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJoinBeforeHost(Boolean value) {
        this.joinBeforeHost = value;
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
