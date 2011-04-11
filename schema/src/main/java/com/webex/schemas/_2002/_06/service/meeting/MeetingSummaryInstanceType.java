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

package com.webex.schemas._2002._06.service.meeting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.ListingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for meetingSummaryInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meetingSummaryInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="meetingKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="confName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meetingType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherHostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="listStatus" type="{http://www.webex.com/schemas/2002/06/common}listingType" minOccurs="0"/>
 *         &lt;element name="hostJoined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="participantsJoined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingSummaryInstanceType", propOrder = {
    "meetingKey",
    "confName",
    "meetingType",
    "hostWebExID",
    "otherHostWebExID",
    "timeZoneID",
    "timeZone",
    "status",
    "startDate",
    "duration",
    "listStatus",
    "hostJoined",
    "participantsJoined"
})
public class MeetingSummaryInstanceType
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected long meetingKey;
    @XmlElement(required = true)
    protected String confName;
    protected long meetingType;
    protected String hostWebExID;
    protected String otherHostWebExID;
    protected Long timeZoneID;
    protected String timeZone;
    protected String status;
    @XmlElement(required = true)
    protected String startDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long duration;
    protected ListingType listStatus;
    protected Boolean hostJoined;
    protected Boolean participantsJoined;

    /**
     * Gets the value of the meetingKey property.
     * 
     */
    public long getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the value of the meetingKey property.
     * 
     */
    public void setMeetingKey(long value) {
        this.meetingKey = value;
    }

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
     * Gets the value of the meetingType property.
     * 
     */
    public long getMeetingType() {
        return meetingType;
    }

    /**
     * Sets the value of the meetingType property.
     * 
     */
    public void setMeetingType(long value) {
        this.meetingType = value;
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
     * Gets the value of the otherHostWebExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherHostWebExID() {
        return otherHostWebExID;
    }

    /**
     * Sets the value of the otherHostWebExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherHostWebExID(String value) {
        this.otherHostWebExID = value;
    }

    /**
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
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
     *     {@link Long }
     *     
     */
    public void setTimeZoneID(Long value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

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
     * Gets the value of the listStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ListingType }
     *     
     */
    public ListingType getListStatus() {
        return listStatus;
    }

    /**
     * Sets the value of the listStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingType }
     *     
     */
    public void setListStatus(ListingType value) {
        this.listStatus = value;
    }

    /**
     * Gets the value of the hostJoined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostJoined() {
        return hostJoined;
    }

    /**
     * Sets the value of the hostJoined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostJoined(Boolean value) {
        this.hostJoined = value;
    }

    /**
     * Gets the value of the participantsJoined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParticipantsJoined() {
        return participantsJoined;
    }

    /**
     * Sets the value of the participantsJoined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticipantsJoined(Boolean value) {
        this.participantsJoined = value;
    }

}
