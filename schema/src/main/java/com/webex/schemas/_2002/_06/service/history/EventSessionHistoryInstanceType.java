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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class EventSessionHistoryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventSessionHistoryInstanceType", propOrder = {
    "confID",
    "sessionKey",
    "confName",
    "sessionStartTime",
    "sessionEndTime",
    "duration",
    "timezone",
    "trackingCode",
    "meetingType",
    "userID",
    "hostWebExID",
    "hostName",
    "hostEmail",
    "totalPeopleMinutes",
    "totalCallInMinutes",
    "totalCallInTollfreeMinutes",
    "totalCallOutDomestic",
    "totalCallOutInternational",
    "totalVoipMinutes",
    "totalParticipants",
    "totalParticipantsVoip",
    "totalParticipantsCallIn",
    "totalParticipantsCallOut",
    "source",
    "peakAttendee",
    "assistService"
})
public class EventSessionHistoryInstanceType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The conf id. */
    protected Long confID;
    
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
    
    /** The tracking code. */
    protected TrackingType trackingCode;
    
    /** The meeting type. */
    protected String meetingType;
    
    /** The user id. */
    protected Integer userID;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The host name. */
    protected String hostName;
    
    /** The host email. */
    protected String hostEmail;
    
    /** The total people minutes. */
    protected Integer totalPeopleMinutes;
    
    /** The total call in minutes. */
    protected Integer totalCallInMinutes;
    
    /** The total call in tollfree minutes. */
    protected Integer totalCallInTollfreeMinutes;
    
    /** The total call out domestic. */
    protected Integer totalCallOutDomestic;
    
    /** The total call out international. */
    protected Integer totalCallOutInternational;
    
    /** The total voip minutes. */
    protected Integer totalVoipMinutes;
    
    /** The total participants. */
    protected Integer totalParticipants;
    
    /** The total participants voip. */
    protected Integer totalParticipantsVoip;
    
    /** The total participants call in. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long totalParticipantsCallIn;
    
    /** The total participants call out. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long totalParticipantsCallOut;
    
    /** The source. */
    protected SourceType source;
    
    /** The peak attendee. */
    protected Long peakAttendee;
    
    /** The assist service. */
    protected MeetingAssistType assistService;

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
     * Gets the user id.
     * 
     * @return the user id
     */
    public Integer getUserID() {
        return userID;
    }

    /**
     * Sets the user id.
     * 
     * @param value the new user id
     */
    public void setUserID(Integer value) {
        this.userID = value;
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
     * Gets the total call in minutes.
     * 
     * @return the total call in minutes
     */
    public Integer getTotalCallInMinutes() {
        return totalCallInMinutes;
    }

    /**
     * Sets the total call in minutes.
     * 
     * @param value the new total call in minutes
     */
    public void setTotalCallInMinutes(Integer value) {
        this.totalCallInMinutes = value;
    }

    /**
     * Gets the total call in tollfree minutes.
     * 
     * @return the total call in tollfree minutes
     */
    public Integer getTotalCallInTollfreeMinutes() {
        return totalCallInTollfreeMinutes;
    }

    /**
     * Sets the total call in tollfree minutes.
     * 
     * @param value the new total call in tollfree minutes
     */
    public void setTotalCallInTollfreeMinutes(Integer value) {
        this.totalCallInTollfreeMinutes = value;
    }

    /**
     * Gets the total call out domestic.
     * 
     * @return the total call out domestic
     */
    public Integer getTotalCallOutDomestic() {
        return totalCallOutDomestic;
    }

    /**
     * Sets the total call out domestic.
     * 
     * @param value the new total call out domestic
     */
    public void setTotalCallOutDomestic(Integer value) {
        this.totalCallOutDomestic = value;
    }

    /**
     * Gets the total call out international.
     * 
     * @return the total call out international
     */
    public Integer getTotalCallOutInternational() {
        return totalCallOutInternational;
    }

    /**
     * Sets the total call out international.
     * 
     * @param value the new total call out international
     */
    public void setTotalCallOutInternational(Integer value) {
        this.totalCallOutInternational = value;
    }

    /**
     * Gets the total voip minutes.
     * 
     * @return the total voip minutes
     */
    public Integer getTotalVoipMinutes() {
        return totalVoipMinutes;
    }

    /**
     * Sets the total voip minutes.
     * 
     * @param value the new total voip minutes
     */
    public void setTotalVoipMinutes(Integer value) {
        this.totalVoipMinutes = value;
    }

    /**
     * Gets the total participants.
     * 
     * @return the total participants
     */
    public Integer getTotalParticipants() {
        return totalParticipants;
    }

    /**
     * Sets the total participants.
     * 
     * @param value the new total participants
     */
    public void setTotalParticipants(Integer value) {
        this.totalParticipants = value;
    }

    /**
     * Gets the total participants voip.
     * 
     * @return the total participants voip
     */
    public Integer getTotalParticipantsVoip() {
        return totalParticipantsVoip;
    }

    /**
     * Sets the total participants voip.
     * 
     * @param value the new total participants voip
     */
    public void setTotalParticipantsVoip(Integer value) {
        this.totalParticipantsVoip = value;
    }

    /**
     * Gets the total participants call in.
     * 
     * @return the total participants call in
     */
    public Long getTotalParticipantsCallIn() {
        return totalParticipantsCallIn;
    }

    /**
     * Sets the total participants call in.
     * 
     * @param value the new total participants call in
     */
    public void setTotalParticipantsCallIn(Long value) {
        this.totalParticipantsCallIn = value;
    }

    /**
     * Gets the total participants call out.
     * 
     * @return the total participants call out
     */
    public Long getTotalParticipantsCallOut() {
        return totalParticipantsCallOut;
    }

    /**
     * Sets the total participants call out.
     * 
     * @param value the new total participants call out
     */
    public void setTotalParticipantsCallOut(Long value) {
        this.totalParticipantsCallOut = value;
    }

    /**
     * Gets the source.
     * 
     * @return the source
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Sets the source.
     * 
     * @param value the new source
     */
    public void setSource(SourceType value) {
        this.source = value;
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
     * Gets the assist service.
     * 
     * @return the assist service
     */
    public MeetingAssistType getAssistService() {
        return assistService;
    }

    /**
     * Sets the assist service.
     * 
     * @param value the new assist service
     */
    public void setAssistService(MeetingAssistType value) {
        this.assistService = value;
    }

}
