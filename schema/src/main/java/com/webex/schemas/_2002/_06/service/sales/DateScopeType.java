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
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for dateScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dateScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startDateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateScopeType", propOrder = {
    "startDateStart",
    "startDateEnd",
    "endDateStart",
    "endDateEnd",
    "timeZoneID"
})
public class DateScopeType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String startDateStart;
    protected String startDateEnd;
    protected String endDateStart;
    protected String endDateEnd;
    @XmlElement(type = String.class, defaultValue = "-1")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;

    /**
     * Gets the value of the startDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateStart() {
        return startDateStart;
    }

    /**
     * Sets the value of the startDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateStart(String value) {
        this.startDateStart = value;
    }

    /**
     * Gets the value of the startDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateEnd() {
        return startDateEnd;
    }

    /**
     * Sets the value of the startDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateEnd(String value) {
        this.startDateEnd = value;
    }

    /**
     * Gets the value of the endDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateStart() {
        return endDateStart;
    }

    /**
     * Sets the value of the endDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateStart(String value) {
        this.endDateStart = value;
    }

    /**
     * Gets the value of the endDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateEnd() {
        return endDateEnd;
    }

    /**
     * Sets the value of the endDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateEnd(String value) {
        this.endDateEnd = value;
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

}
