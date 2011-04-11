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

package com.webex.schemas._2002._06.service.event;

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
 *         &lt;element name="sessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultHighestMT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sessionTemplate" type="{http://www.webex.com/schemas/2002/06/common}sessionTemplateType" minOccurs="0"/>
 *         &lt;element name="programID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="postEventSurvey" type="{http://www.webex.com/schemas/2002/06/service/event}postEventSurveyType" minOccurs="0"/>
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
    "sessionName",
    "sessionType",
    "description",
    "defaultHighestMT",
    "sessionTemplate",
    "programID",
    "postEventSurvey"
})
public class MetaDataType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String sessionName;
    @XmlElement(type = String.class, defaultValue = "-1")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long sessionType;
    protected String description;
    @XmlElement(defaultValue = "true")
    protected Boolean defaultHighestMT;
    protected SessionTemplateType sessionTemplate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long programID;
    protected PostEventSurveyType postEventSurvey;

    /**
     * Gets the value of the sessionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Sets the value of the sessionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionName(String value) {
        this.sessionName = value;
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
     * Gets the value of the programID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getProgramID() {
        return programID;
    }

    /**
     * Sets the value of the programID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramID(Long value) {
        this.programID = value;
    }

    /**
     * Gets the value of the postEventSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link PostEventSurveyType }
     *     
     */
    public PostEventSurveyType getPostEventSurvey() {
        return postEventSurvey;
    }

    /**
     * Sets the value of the postEventSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostEventSurveyType }
     *     
     */
    public void setPostEventSurvey(PostEventSurveyType value) {
        this.postEventSurvey = value;
    }

}
