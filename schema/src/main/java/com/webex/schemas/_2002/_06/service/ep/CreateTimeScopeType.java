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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createTimeScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createTimeScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createTimeStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createTimeEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTimeScopeType", propOrder = {
    "createTimeStart",
    "createTimeEnd",
    "timeZoneID"
})
public class CreateTimeScopeType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String createTimeStart;
    @XmlElement(required = true)
    protected String createTimeEnd;
    @XmlElement(defaultValue = "-1")
    protected Integer timeZoneID;

    /**
     * Gets the value of the createTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTimeStart() {
        return createTimeStart;
    }

    /**
     * Sets the value of the createTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTimeStart(String value) {
        this.createTimeStart = value;
    }

    /**
     * Gets the value of the createTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    /**
     * Sets the value of the createTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTimeEnd(String value) {
        this.createTimeEnd = value;
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

}
