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
 * The Class MeetingSummaryInstanceType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meeting key. */
    protected long meetingKey;
    
    /** The conf name. */
    @XmlElement(required = true)
    protected String confName;
    
    /** The meeting type. */
    protected long meetingType;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The other host web ex id. */
    protected String otherHostWebExID;
    
    /** The time zone id. */
    protected Long timeZoneID;
    
    /** The time zone. */
    protected String timeZone;
    
    /** The status. */
    protected String status;
    
    /** The start date. */
    @XmlElement(required = true)
    protected String startDate;
    
    /** The duration. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long duration;
    
    /** The list status. */
    protected ListingType listStatus;
    
    /** The host joined. */
    protected Boolean hostJoined;
    
    /** The participants joined. */
    protected Boolean participantsJoined;

    /**
     * Gets the meeting key.
     * 
     * @return the meeting key
     */
    public long getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the meeting key.
     * 
     * @param value the new meeting key
     */
    public void setMeetingKey(long value) {
        this.meetingKey = value;
    }

    /**
     * Gets the conf name.
     * 
     * @return the conf name
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the conf name.
     * 
     * @param value the new conf name
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Gets the meeting type.
     * 
     * @return the meeting type
     */
    public long getMeetingType() {
        return meetingType;
    }

    /**
     * Sets the meeting type.
     * 
     * @param value the new meeting type
     */
    public void setMeetingType(long value) {
        this.meetingType = value;
    }

    /**
     * Gets the host web ex id.
     * 
     * @return the host web ex id
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the host web ex id.
     * 
     * @param value the new host web ex id
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

    /**
     * Gets the other host web ex id.
     * 
     * @return the other host web ex id
     */
    public String getOtherHostWebExID() {
        return otherHostWebExID;
    }

    /**
     * Sets the other host web ex id.
     * 
     * @param value the new other host web ex id
     */
    public void setOtherHostWebExID(String value) {
        this.otherHostWebExID = value;
    }

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public Long getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(Long value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the time zone.
     * 
     * @return the time zone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the time zone.
     * 
     * @param value the new time zone
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the start date.
     * 
     * @return the start date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date.
     * 
     * @param value the new start date
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the duration.
     * 
     * @return the duration
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets the duration.
     * 
     * @param value the new duration
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Gets the list status.
     * 
     * @return the list status
     */
    public ListingType getListStatus() {
        return listStatus;
    }

    /**
     * Sets the list status.
     * 
     * @param value the new list status
     */
    public void setListStatus(ListingType value) {
        this.listStatus = value;
    }

    /**
     * Checks if is host joined.
     * 
     * @return the boolean
     */
    public Boolean isHostJoined() {
        return hostJoined;
    }

    /**
     * Sets the host joined.
     * 
     * @param value the new host joined
     */
    public void setHostJoined(Boolean value) {
        this.hostJoined = value;
    }

    /**
     * Checks if is participants joined.
     * 
     * @return the boolean
     */
    public Boolean isParticipantsJoined() {
        return participantsJoined;
    }

    /**
     * Sets the participants joined.
     * 
     * @param value the new participants joined
     */
    public void setParticipantsJoined(Boolean value) {
        this.participantsJoined = value;
    }

}
