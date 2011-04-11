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
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class EventSummaryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventSummaryInstanceType", propOrder = {
    "sessionKey",
    "sessionName",
    "sessionType",
    "hostWebExID",
    "startDate",
    "endDate",
    "timeZoneID",
    "duration",
    "description",
    "status",
    "panelists",
    "listStatus",
    "attendeeCount"
})
public class EventSummaryInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected long sessionKey;
    
    /** The session name. */
    @XmlElement(required = true)
    protected String sessionName;
    
    /** The session type. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long sessionType;
    
    /** The host web ex id. */
    @XmlElement(required = true)
    protected String hostWebExID;
    
    /** The start date. */
    protected String startDate;
    
    /** The end date. */
    protected String endDate;
    
    /** The time zone id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;
    
    /** The duration. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long duration;
    
    /** The description. */
    protected String description;
    
    /** The status. */
    protected String status;
    
    /** The panelists. */
    protected String panelists;
    
    /** The list status. */
    protected ListingType listStatus;
    
    /** The attendee count. */
    protected AttendeeCountType attendeeCount;

    /**
     * Gets the session key.
     * 
     * @return the session key
     */
    public long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the session key.
     * 
     * @param value the new session key
     */
    public void setSessionKey(long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the session name.
     * 
     * @return the session name
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Sets the session name.
     * 
     * @param value the new session name
     */
    public void setSessionName(String value) {
        this.sessionName = value;
    }

    /**
     * Gets the session type.
     * 
     * @return the session type
     */
    public Long getSessionType() {
        return sessionType;
    }

    /**
     * Sets the session type.
     * 
     * @param value the new session type
     */
    public void setSessionType(Long value) {
        this.sessionType = value;
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
     * Gets the end date.
     * 
     * @return the end date
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the end date.
     * 
     * @param value the new end date
     */
    public void setEndDate(String value) {
        this.endDate = value;
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
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param value the new description
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the panelists.
     * 
     * @return the panelists
     */
    public String getPanelists() {
        return panelists;
    }

    /**
     * Sets the panelists.
     * 
     * @param value the new panelists
     */
    public void setPanelists(String value) {
        this.panelists = value;
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
     * Gets the attendee count.
     * 
     * @return the attendee count
     */
    public AttendeeCountType getAttendeeCount() {
        return attendeeCount;
    }

    /**
     * Sets the attendee count.
     * 
     * @param value the new attendee count
     */
    public void setAttendeeCount(AttendeeCountType value) {
        this.attendeeCount = value;
    }

}
