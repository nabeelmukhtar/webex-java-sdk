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

package com.webex.schemas._2002._06.service.meetingtype;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for limitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="limitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxAppShareDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxAppShareUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxDesktopShareDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxDesktopShareUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxFileTransferUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxMeetingDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxMeetingUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxRecordUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxVideoDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxVideoUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxWebTourDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxWebTourUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "limitsType", propOrder = {
    "maxAppShareDuration",
    "maxAppShareUser",
    "maxDesktopShareDuration",
    "maxDesktopShareUser",
    "maxFileTransferUser",
    "maxMeetingDuration",
    "maxMeetingUser",
    "maxRecordUser",
    "maxVideoDuration",
    "maxVideoUser",
    "maxWebTourDuration",
    "maxWebTourUser"
})
public class LimitsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(defaultValue = "999999")
    protected Long maxAppShareDuration;
    @XmlElement(defaultValue = "999999")
    protected Long maxAppShareUser;
    @XmlElement(defaultValue = "999999")
    protected Long maxDesktopShareDuration;
    @XmlElement(defaultValue = "999999")
    protected Long maxDesktopShareUser;
    @XmlElement(defaultValue = "999999")
    protected Long maxFileTransferUser;
    @XmlElement(defaultValue = "999999")
    protected Long maxMeetingDuration;
    @XmlElement(defaultValue = "999999")
    protected Long maxMeetingUser;
    @XmlElement(defaultValue = "999999")
    protected Long maxRecordUser;
    @XmlElement(defaultValue = "999999")
    protected Long maxVideoDuration;
    @XmlElement(defaultValue = "999999")
    protected Long maxVideoUser;
    @XmlElement(defaultValue = "999999")
    protected Long maxWebTourDuration;
    @XmlElement(defaultValue = "999999")
    protected Long maxWebTourUser;

    /**
     * Gets the value of the maxAppShareDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxAppShareDuration() {
        return maxAppShareDuration;
    }

    /**
     * Sets the value of the maxAppShareDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxAppShareDuration(Long value) {
        this.maxAppShareDuration = value;
    }

    /**
     * Gets the value of the maxAppShareUser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxAppShareUser() {
        return maxAppShareUser;
    }

    /**
     * Sets the value of the maxAppShareUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxAppShareUser(Long value) {
        this.maxAppShareUser = value;
    }

    /**
     * Gets the value of the maxDesktopShareDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxDesktopShareDuration() {
        return maxDesktopShareDuration;
    }

    /**
     * Sets the value of the maxDesktopShareDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxDesktopShareDuration(Long value) {
        this.maxDesktopShareDuration = value;
    }

    /**
     * Gets the value of the maxDesktopShareUser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxDesktopShareUser() {
        return maxDesktopShareUser;
    }

    /**
     * Sets the value of the maxDesktopShareUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxDesktopShareUser(Long value) {
        this.maxDesktopShareUser = value;
    }

    /**
     * Gets the value of the maxFileTransferUser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxFileTransferUser() {
        return maxFileTransferUser;
    }

    /**
     * Sets the value of the maxFileTransferUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxFileTransferUser(Long value) {
        this.maxFileTransferUser = value;
    }

    /**
     * Gets the value of the maxMeetingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxMeetingDuration() {
        return maxMeetingDuration;
    }

    /**
     * Sets the value of the maxMeetingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxMeetingDuration(Long value) {
        this.maxMeetingDuration = value;
    }

    /**
     * Gets the value of the maxMeetingUser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxMeetingUser() {
        return maxMeetingUser;
    }

    /**
     * Sets the value of the maxMeetingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxMeetingUser(Long value) {
        this.maxMeetingUser = value;
    }

    /**
     * Gets the value of the maxRecordUser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRecordUser() {
        return maxRecordUser;
    }

    /**
     * Sets the value of the maxRecordUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRecordUser(Long value) {
        this.maxRecordUser = value;
    }

    /**
     * Gets the value of the maxVideoDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxVideoDuration() {
        return maxVideoDuration;
    }

    /**
     * Sets the value of the maxVideoDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxVideoDuration(Long value) {
        this.maxVideoDuration = value;
    }

    /**
     * Gets the value of the maxVideoUser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxVideoUser() {
        return maxVideoUser;
    }

    /**
     * Sets the value of the maxVideoUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxVideoUser(Long value) {
        this.maxVideoUser = value;
    }

    /**
     * Gets the value of the maxWebTourDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxWebTourDuration() {
        return maxWebTourDuration;
    }

    /**
     * Sets the value of the maxWebTourDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxWebTourDuration(Long value) {
        this.maxWebTourDuration = value;
    }

    /**
     * Gets the value of the maxWebTourUser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxWebTourUser() {
        return maxWebTourUser;
    }

    /**
     * Sets the value of the maxWebTourUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxWebTourUser(Long value) {
        this.maxWebTourUser = value;
    }

}
