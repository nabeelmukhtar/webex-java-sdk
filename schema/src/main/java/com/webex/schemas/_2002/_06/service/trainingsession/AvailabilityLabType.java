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
import com.webex.schemas._2002._06.common.LabStatusType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for availabilityLabType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="availabilityLabType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="labName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="sessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numComputers" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="status" type="{http://www.webex.com/schemas/2002/06/common}labStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availabilityLabType", propOrder = {
    "labName",
    "timeZoneID",
    "sessionStartTime",
    "sessionEndTime",
    "numComputers",
    "status"
})
public class AvailabilityLabType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String labName;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;
    @XmlElement(required = true)
    protected String sessionStartTime;
    @XmlElement(required = true)
    protected String sessionEndTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numComputers;
    @XmlElement(required = true)
    protected LabStatusType status;

    /**
     * Gets the value of the labName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabName() {
        return labName;
    }

    /**
     * Sets the value of the labName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabName(String value) {
        this.labName = value;
    }

    /**
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneID(Long value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the sessionStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionStartTime() {
        return sessionStartTime;
    }

    /**
     * Sets the value of the sessionStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionStartTime(String value) {
        this.sessionStartTime = value;
    }

    /**
     * Gets the value of the sessionEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionEndTime() {
        return sessionEndTime;
    }

    /**
     * Sets the value of the sessionEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionEndTime(String value) {
        this.sessionEndTime = value;
    }

    /**
     * Gets the value of the numComputers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumComputers() {
        return numComputers;
    }

    /**
     * Sets the value of the numComputers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumComputers(Long value) {
        this.numComputers = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link LabStatusType }
     *     
     */
    public LabStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabStatusType }
     *     
     */
    public void setStatus(LabStatusType value) {
        this.status = value;
    }

}
