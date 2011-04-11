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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class SupportSessionHistoryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportSessionHistoryInstanceType", propOrder = {
    "sessionKey",
    "confName",
    "sessionStartTime",
    "sessionEndTime",
    "duration",
    "timezone",
    "meetingType",
    "hostWebExID",
    "hostName",
    "hostEmail",
    "totalPeopleMinutes",
    "confID",
    "peakAttendee",
    "trackingCode"
})
public class SupportSessionHistoryInstanceType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The conf name. */
    protected String confName;
    
    /** The session start time. */
    protected String sessionStartTime;
    
    /** The session end time. */
    protected String sessionEndTime;
    
    /** The duration. */
    protected Integer duration;
    
    /** The timezone. */
    protected Long timezone;
    
    /** The meeting type. */
    protected String meetingType;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The host name. */
    protected String hostName;
    
    /** The host email. */
    protected String hostEmail;
    
    /** The total people minutes. */
    protected Integer totalPeopleMinutes;
    
    /** The conf id. */
    protected Long confID;
    
    /** The peak attendee. */
    protected Long peakAttendee;
    
    /** The tracking code. */
    protected TrackingType trackingCode;

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
     * Gets the session start time.
     * 
     * @return the session start time
     */
    public String getSessionStartTime() {
        return sessionStartTime;
    }

    /**
     * Sets the session start time.
     * 
     * @param value the new session start time
     */
    public void setSessionStartTime(String value) {
        this.sessionStartTime = value;
    }

    /**
     * Gets the session end time.
     * 
     * @return the session end time
     */
    public String getSessionEndTime() {
        return sessionEndTime;
    }

    /**
     * Sets the session end time.
     * 
     * @param value the new session end time
     */
    public void setSessionEndTime(String value) {
        this.sessionEndTime = value;
    }

    /**
     * Gets the duration.
     * 
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the duration.
     * 
     * @param value the new duration
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the timezone.
     * 
     * @return the timezone
     */
    public Long getTimezone() {
        return timezone;
    }

    /**
     * Sets the timezone.
     * 
     * @param value the new timezone
     */
    public void setTimezone(Long value) {
        this.timezone = value;
    }

    /**
     * Gets the meeting type.
     * 
     * @return the meeting type
     */
    public String getMeetingType() {
        return meetingType;
    }

    /**
     * Sets the meeting type.
     * 
     * @param value the new meeting type
     */
    public void setMeetingType(String value) {
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
     * Gets the host name.
     * 
     * @return the host name
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the host name.
     * 
     * @param value the new host name
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the host email.
     * 
     * @return the host email
     */
    public String getHostEmail() {
        return hostEmail;
    }

    /**
     * Sets the host email.
     * 
     * @param value the new host email
     */
    public void setHostEmail(String value) {
        this.hostEmail = value;
    }

    /**
     * Gets the total people minutes.
     * 
     * @return the total people minutes
     */
    public Integer getTotalPeopleMinutes() {
        return totalPeopleMinutes;
    }

    /**
     * Sets the total people minutes.
     * 
     * @param value the new total people minutes
     */
    public void setTotalPeopleMinutes(Integer value) {
        this.totalPeopleMinutes = value;
    }

    /**
     * Gets the conf id.
     * 
     * @return the conf id
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the conf id.
     * 
     * @param value the new conf id
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

    /**
     * Gets the peak attendee.
     * 
     * @return the peak attendee
     */
    public Long getPeakAttendee() {
        return peakAttendee;
    }

    /**
     * Sets the peak attendee.
     * 
     * @param value the new peak attendee
     */
    public void setPeakAttendee(Long value) {
        this.peakAttendee = value;
    }

    /**
     * Gets the tracking code.
     * 
     * @return the tracking code
     */
    public TrackingType getTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the tracking code.
     * 
     * @param value the new tracking code
     */
    public void setTrackingCode(TrackingType value) {
        this.trackingCode = value;
    }

}
