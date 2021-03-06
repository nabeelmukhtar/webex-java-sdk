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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.SessionTemplateType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for metaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metaDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="agenda" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="account" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="opportunity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="defaultHighestMT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="intAccountID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="intOpptyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="extSystemID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sessionTemplate" type="{http://www.webex.com/schemas/2002/06/common}sessionTemplateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaDataType", propOrder = {
    "confName",
    "agenda",
    "account",
    "opportunity",
    "sessionType",
    "defaultHighestMT",
    "intAccountID",
    "intOpptyID",
    "extSystemID",
    "sessionTemplate"
})
public class MetaDataType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String confName;
    protected String agenda;
    protected String account;
    protected String opportunity;
    @XmlElement(type = String.class, defaultValue = "-1")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long sessionType;
    @XmlElement(defaultValue = "true")
    protected Boolean defaultHighestMT;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long intAccountID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long intOpptyID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long extSystemID;
    protected SessionTemplateType sessionTemplate;

    /**
     * Gets the value of the confName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the value of the confName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Gets the value of the agenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenda() {
        return agenda;
    }

    /**
     * Sets the value of the agenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenda(String value) {
        this.agenda = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the opportunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the value of the opportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity(String value) {
        this.opportunity = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionType(Long value) {
        this.sessionType = value;
    }

    /**
     * Gets the value of the defaultHighestMT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultHighestMT() {
        return defaultHighestMT;
    }

    /**
     * Sets the value of the defaultHighestMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultHighestMT(Boolean value) {
        this.defaultHighestMT = value;
    }

    /**
     * Gets the value of the intAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getIntAccountID() {
        return intAccountID;
    }

    /**
     * Sets the value of the intAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntAccountID(Long value) {
        this.intAccountID = value;
    }

    /**
     * Gets the value of the intOpptyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getIntOpptyID() {
        return intOpptyID;
    }

    /**
     * Sets the value of the intOpptyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntOpptyID(Long value) {
        this.intOpptyID = value;
    }

    /**
     * Gets the value of the extSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getExtSystemID() {
        return extSystemID;
    }

    /**
     * Sets the value of the extSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSystemID(Long value) {
        this.extSystemID = value;
    }

    /**
     * Gets the value of the sessionTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link SessionTemplateType }
     *     
     */
    public SessionTemplateType getSessionTemplate() {
        return sessionTemplate;
    }

    /**
     * Sets the value of the sessionTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionTemplateType }
     *     
     */
    public void setSessionTemplate(SessionTemplateType value) {
        this.sessionTemplate = value;
    }

}
