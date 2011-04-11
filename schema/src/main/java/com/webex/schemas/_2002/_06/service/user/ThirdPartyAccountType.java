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
 * <p>Java class for thirdPartyAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thirdPartyAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="confBridgeNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pause" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="accessCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accountIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="defaultFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tollFreeNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="moderatorCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phoneName1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phoneName2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
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
@XmlType(name = "thirdPartyAccountType", propOrder = {
    "name",
    "confBridgeNum",
    "pause",
    "accessCode",
    "accountIndex",
    "defaultFlag",
    "tollFreeNum",
    "moderatorCode",
    "phoneName1",
    "phoneName2"
})
public class ThirdPartyAccountType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String name;
    protected String confBridgeNum;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long pause;
    protected String accessCode;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long accountIndex;
    protected Boolean defaultFlag;
    protected String tollFreeNum;
    protected String moderatorCode;
    protected String phoneName1;
    protected String phoneName2;

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
     * Gets the value of the confBridgeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfBridgeNum() {
        return confBridgeNum;
    }

    /**
     * Sets the value of the confBridgeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfBridgeNum(String value) {
        this.confBridgeNum = value;
    }

    /**
     * Gets the value of the pause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPause() {
        return pause;
    }

    /**
     * Sets the value of the pause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPause(Long value) {
        this.pause = value;
    }

    /**
     * Gets the value of the accessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessCode() {
        return accessCode;
    }

    /**
     * Sets the value of the accessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessCode(String value) {
        this.accessCode = value;
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
     * Gets the value of the tollFreeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeNum() {
        return tollFreeNum;
    }

    /**
     * Sets the value of the tollFreeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeNum(String value) {
        this.tollFreeNum = value;
    }

    /**
     * Gets the value of the moderatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeratorCode() {
        return moderatorCode;
    }

    /**
     * Sets the value of the moderatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeratorCode(String value) {
        this.moderatorCode = value;
    }

    /**
     * Gets the value of the phoneName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneName1() {
        return phoneName1;
    }

    /**
     * Sets the value of the phoneName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneName1(String value) {
        this.phoneName1 = value;
    }

    /**
     * Gets the value of the phoneName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneName2() {
        return phoneName2;
    }

    /**
     * Sets the value of the phoneName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneName2(String value) {
        this.phoneName2 = value;
    }

}
