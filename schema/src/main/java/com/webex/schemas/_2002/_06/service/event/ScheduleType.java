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
import com.webex.schemas._2002._06.common.EntryExitToneType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for scheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="openTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryExitTone" type="{http://www.webex.com/schemas/2002/06/common}entryExitToneType" minOccurs="0"/>
 *         &lt;element name="extURL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="extNotifyTime" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="joinNotifyURL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="joinTeleconfBeforeHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleType", propOrder = {
    "startDate",
    "timeZoneID",
    "duration",
    "openTime",
    "hostWebExID",
    "entryExitTone",
    "extURL",
    "extNotifyTime",
    "joinNotifyURL",
    "joinTeleconfBeforeHost"
})
public class ScheduleType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String startDate;
    @XmlElement(type = String.class, defaultValue = "-1")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long duration;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long openTime;
    protected String hostWebExID;
    protected EntryExitToneType entryExitTone;
    protected String extURL;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long extNotifyTime;
    protected String joinNotifyURL;
    protected Boolean joinTeleconfBeforeHost;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Gets the value of the openTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getOpenTime() {
        return openTime;
    }

    /**
     * Sets the value of the openTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenTime(Long value) {
        this.openTime = value;
    }

    /**
     * Gets the value of the hostWebExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the value of the hostWebExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

    /**
     * Gets the value of the entryExitTone property.
     * 
     * @return
     *     possible object is
     *     {@link EntryExitToneType }
     *     
     */
    public EntryExitToneType getEntryExitTone() {
        return entryExitTone;
    }

    /**
     * Sets the value of the entryExitTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryExitToneType }
     *     
     */
    public void setEntryExitTone(EntryExitToneType value) {
        this.entryExitTone = value;
    }

    /**
     * Gets the value of the extURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtURL() {
        return extURL;
    }

    /**
     * Sets the value of the extURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtURL(String value) {
        this.extURL = value;
    }

    /**
     * Gets the value of the extNotifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getExtNotifyTime() {
        return extNotifyTime;
    }

    /**
     * Sets the value of the extNotifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtNotifyTime(Long value) {
        this.extNotifyTime = value;
    }

    /**
     * Gets the value of the joinNotifyURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinNotifyURL() {
        return joinNotifyURL;
    }

    /**
     * Sets the value of the joinNotifyURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinNotifyURL(String value) {
        this.joinNotifyURL = value;
    }

    /**
     * Gets the value of the joinTeleconfBeforeHost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJoinTeleconfBeforeHost() {
        return joinTeleconfBeforeHost;
    }

    /**
     * Sets the value of the joinTeleconfBeforeHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJoinTeleconfBeforeHost(Boolean value) {
        this.joinTeleconfBeforeHost = value;
    }

}
