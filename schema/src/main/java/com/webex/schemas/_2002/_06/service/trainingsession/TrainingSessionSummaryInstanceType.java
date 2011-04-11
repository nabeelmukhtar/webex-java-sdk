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
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.session.ListingType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class TrainingSessionSummaryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainingSessionSummaryInstanceType", propOrder = {
    "sessionKey",
    "confName",
    "meetingType",
    "hostWebExID",
    "otherHostWebExID",
    "timeZoneID",
    "timeZone",
    "status",
    "startDate",
    "duration",
    "listStatus"
})
public class TrainingSessionSummaryInstanceType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The conf name. */
    protected String confName;
    
    /** The meeting type. */
    protected Long meetingType;
    
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
    protected String startDate;
    
    /** The duration. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long duration;
    
    /** The list status. */
    protected ListingType listStatus;

    /**
     * Gets the session key.
     * 
     * @return the session key
     */
    public Long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the session key.
     * 
     * @param value the new session key
     */
    public void setSessionKey(Long value) {
        this.sessionKey = value;
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
    public Long getMeetingType() {
        return meetingType;
    }

    /**
     * Sets the meeting type.
     * 
     * @param value the new meeting type
     */
    public void setMeetingType(Long value) {
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

}
