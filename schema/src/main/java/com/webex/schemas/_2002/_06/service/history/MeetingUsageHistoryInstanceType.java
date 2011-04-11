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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.TimeZoneType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class MeetingUsageHistoryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingUsageHistoryInstanceType", propOrder = {
    "sessionKey",
    "confName",
    "meetingStartTime",
    "meetingEndTime",
    "duration",
    "timezone",
    "trackingCode",
    "meetingType",
    "hostWebExID",
    "hostName",
    "hostEmail",
    "totalCallInMinutes",
    "totalPeopleMinutes",
    "totalCallInTollfreeMinutes",
    "totalCallOutDomestic",
    "totalCallOutInternational",
    "totalVoipMinutes",
    "userID",
    "totalParticipants",
    "totalParticipantsVoip",
    "totalParticipantsCallIn",
    "totalParticipantsCallOut",
    "confID",
    "peakAttendee",
    "assistService"
})
@XmlSeeAlso({
    SalesSessionHistoryInstanceType.class
})
public class MeetingUsageHistoryInstanceType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The conf name. */
    protected String confName;
    
    /** The meeting start time. */
    protected String meetingStartTime;
    
    /** The meeting end time. */
    protected String meetingEndTime;
    
    /** The duration. */
    protected Long duration;
    
    /** The timezone. */
    protected TimeZoneType timezone;
    
    /** The tracking code. */
    protected TrackingType trackingCode;
    
    /** The meeting type. */
    protected String meetingType;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The host name. */
    protected String hostName;
    
    /** The host email. */
    protected String hostEmail;
    
    /** The total call in minutes. */
    protected Long totalCallInMinutes;
    
    /** The total people minutes. */
    protected Long totalPeopleMinutes;
    
    /** The total call in tollfree minutes. */
    protected Long totalCallInTollfreeMinutes;
    
    /** The total call out domestic. */
    protected Long totalCallOutDomestic;
    
    /** The total call out international. */
    protected Long totalCallOutInternational;
    
    /** The total voip minutes. */
    protected Long totalVoipMinutes;
    
    /** The user id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long userID;
    
    /** The total participants. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long totalParticipants;
    
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
    
    /** The conf id. */
    protected Long confID;
    
    /** The peak attendee. */
    protected Long peakAttendee;
    
    /** The assist service. */
    protected MeetingAssistType assistService;

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
     * Gets the meeting start time.
     * 
     * @return the meeting start time
     */
    public String getMeetingStartTime() {
        return meetingStartTime;
    }

    /**
     * Sets the meeting start time.
     * 
     * @param value the new meeting start time
     */
    public void setMeetingStartTime(String value) {
        this.meetingStartTime = value;
    }

    /**
     * Gets the meeting end time.
     * 
     * @return the meeting end time
     */
    public String getMeetingEndTime() {
        return meetingEndTime;
    }

    /**
     * Sets the meeting end time.
     * 
     * @param value the new meeting end time
     */
    public void setMeetingEndTime(String value) {
        this.meetingEndTime = value;
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
     * Gets the timezone.
     * 
     * @return the timezone
     */
    public TimeZoneType getTimezone() {
        return timezone;
    }

    /**
     * Sets the timezone.
     * 
     * @param value the new timezone
     */
    public void setTimezone(TimeZoneType value) {
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
     * Gets the total call in minutes.
     * 
     * @return the total call in minutes
     */
    public Long getTotalCallInMinutes() {
        return totalCallInMinutes;
    }

    /**
     * Sets the total call in minutes.
     * 
     * @param value the new total call in minutes
     */
    public void setTotalCallInMinutes(Long value) {
        this.totalCallInMinutes = value;
    }

    /**
     * Gets the total people minutes.
     * 
     * @return the total people minutes
     */
    public Long getTotalPeopleMinutes() {
        return totalPeopleMinutes;
    }

    /**
     * Sets the total people minutes.
     * 
     * @param value the new total people minutes
     */
    public void setTotalPeopleMinutes(Long value) {
        this.totalPeopleMinutes = value;
    }

    /**
     * Gets the total call in tollfree minutes.
     * 
     * @return the total call in tollfree minutes
     */
    public Long getTotalCallInTollfreeMinutes() {
        return totalCallInTollfreeMinutes;
    }

    /**
     * Sets the total call in tollfree minutes.
     * 
     * @param value the new total call in tollfree minutes
     */
    public void setTotalCallInTollfreeMinutes(Long value) {
        this.totalCallInTollfreeMinutes = value;
    }

    /**
     * Gets the total call out domestic.
     * 
     * @return the total call out domestic
     */
    public Long getTotalCallOutDomestic() {
        return totalCallOutDomestic;
    }

    /**
     * Sets the total call out domestic.
     * 
     * @param value the new total call out domestic
     */
    public void setTotalCallOutDomestic(Long value) {
        this.totalCallOutDomestic = value;
    }

    /**
     * Gets the total call out international.
     * 
     * @return the total call out international
     */
    public Long getTotalCallOutInternational() {
        return totalCallOutInternational;
    }

    /**
     * Sets the total call out international.
     * 
     * @param value the new total call out international
     */
    public void setTotalCallOutInternational(Long value) {
        this.totalCallOutInternational = value;
    }

    /**
     * Gets the total voip minutes.
     * 
     * @return the total voip minutes
     */
    public Long getTotalVoipMinutes() {
        return totalVoipMinutes;
    }

    /**
     * Sets the total voip minutes.
     * 
     * @param value the new total voip minutes
     */
    public void setTotalVoipMinutes(Long value) {
        this.totalVoipMinutes = value;
    }

    /**
     * Gets the user id.
     * 
     * @return the user id
     */
    public Long getUserID() {
        return userID;
    }

    /**
     * Sets the user id.
     * 
     * @param value the new user id
     */
    public void setUserID(Long value) {
        this.userID = value;
    }

    /**
     * Gets the total participants.
     * 
     * @return the total participants
     */
    public Long getTotalParticipants() {
        return totalParticipants;
    }

    /**
     * Sets the total participants.
     * 
     * @param value the new total participants
     */
    public void setTotalParticipants(Long value) {
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
