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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.SessionTemplateType;
import com.webex.schemas._2002._06.service.session.MetaDataType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for trainingMetaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trainingMetaDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/session}metaDataType">
 *       &lt;sequence>
 *         &lt;element name="agenda" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="greeting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invitation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="defaultHighestMT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sessionTemplate" type="{http://www.webex.com/schemas/2002/06/common}sessionTemplateType" minOccurs="0"/>
 *         &lt;element name="enableGreeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainingMetaDataType", propOrder = {
    "agenda",
    "description",
    "greeting",
    "location",
    "invitation",
    "sessionType",
    "defaultHighestMT",
    "sessionTemplate",
    "enableGreeting"
})
public class TrainingMetaDataType
    extends MetaDataType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String agenda;
    protected String description;
    protected String greeting;
    protected String location;
    protected String invitation;
    @XmlElement(type = String.class, defaultValue = "-1")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long sessionType;
    @XmlElement(defaultValue = "true")
    protected Boolean defaultHighestMT;
    protected SessionTemplateType sessionTemplate;
    protected Boolean enableGreeting;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the greeting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreeting() {
        return greeting;
    }

    /**
     * Sets the value of the greeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreeting(String value) {
        this.greeting = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the invitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvitation() {
        return invitation;
    }

    /**
     * Sets the value of the invitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvitation(String value) {
        this.invitation = value;
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

    /**
     * Gets the value of the enableGreeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableGreeting() {
        return enableGreeting;
    }

    /**
     * Sets the value of the enableGreeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableGreeting(Boolean value) {
        this.enableGreeting = value;
    }

}
