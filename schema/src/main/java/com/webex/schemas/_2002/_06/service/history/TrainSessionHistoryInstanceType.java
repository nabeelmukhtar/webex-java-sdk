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
import com.webex.schemas._2002._06.common.PsoFieldsType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class TrainSessionHistoryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainSessionHistoryInstanceType", propOrder = {
    "sessionKey",
    "confName",
    "sessionStartTime",
    "sessionEndTime",
    "duration",
    "totalAttendee",
    "totalRegistered",
    "totalInvited",
    "timezone",
    "trackingCode",
    "userID",
    "hostWebExID",
    "hostEmail",
    "totalPeopleMinutes",
    "totalCallInMinutes",
    "totalCallInTolllfreeMinutes",
    "totalCallOutDomestic",
    "totalCallOutInternational",
    "totalVoipMinutes",
    "totalParticipants",
    "totalParticipantsVoip",
    "totalParticipantsCallIn",
    "totalParticipantsCallOut",
    "confID",
    "peakAttendee",
    "psoFields",
    "assistService"
})
public class TrainSessionHistoryInstanceType
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
    protected Long duration;
    
    /** The total attendee. */
    protected Long totalAttendee;
    
    /** The total registered. */
    protected Long totalRegistered;
    
    /** The total invited. */
    protected Long totalInvited;
    
    /** The timezone. */
    protected Long timezone;
    
    /** The tracking code. */
    protected TrackingType trackingCode;
    
    /** The user id. */
    protected Integer userID;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The host email. */
    protected String hostEmail;
    
    /** The total people minutes. */
    protected Integer totalPeopleMinutes;
    
    /** The total call in minutes. */
    protected Integer totalCallInMinutes;
    
    /** The total call in tolllfree minutes. */
    protected Integer totalCallInTolllfreeMinutes;
    
    /** The total call out domestic. */
    protected Integer totalCallOutDomestic;
    
    /** The total call out international. */
    protected Integer totalCallOutInternational;
    
    /** The total voip minutes. */
    protected Integer totalVoipMinutes;
    
    /** The total participants. */
    protected Integer totalParticipants;
    
    /** The total participants voip. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long totalParticipantsVoip;
    
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
    
    /** The pso fields. */
    protected PsoFieldsType psoFields;
    
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
     * Gets the total attendee.
     * 
     * @return the total attendee
     */
    public Long getTotalAttendee() {
        return totalAttendee;
    }

    /**
     * Sets the total attendee.
     * 
     * @param value the new total attendee
     */
    public void setTotalAttendee(Long value) {
        this.totalAttendee = value;
    }

    /**
     * Gets the total registered.
     * 
     * @return the total registered
     */
    public Long getTotalRegistered() {
        return totalRegistered;
    }

    /**
     * Sets the total registered.
     * 
     * @param value the new total registered
     */
    public void setTotalRegistered(Long value) {
        this.totalRegistered = value;
    }

    /**
     * Gets the total invited.
     * 
     * @return the total invited
     */
    public Long getTotalInvited() {
        return totalInvited;
    }

    /**
     * Sets the total invited.
     * 
     * @param value the new total invited
     */
    public void setTotalInvited(Long value) {
        this.totalInvited = value;
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
     * Gets the total call in tolllfree minutes.
     * 
     * @return the total call in tolllfree minutes
     */
    public Integer getTotalCallInTolllfreeMinutes() {
        return totalCallInTolllfreeMinutes;
    }

    /**
     * Sets the total call in tolllfree minutes.
     * 
     * @param value the new total call in tolllfree minutes
     */
    public void setTotalCallInTolllfreeMinutes(Integer value) {
        this.totalCallInTolllfreeMinutes = value;
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
    public Long getTotalParticipantsVoip() {
        return totalParticipantsVoip;
    }

    /**
     * Sets the total participants voip.
     * 
     * @param value the new total participants voip
     */
    public void setTotalParticipantsVoip(Long value) {
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
     * Gets the pso fields.
     * 
     * @return the pso fields
     */
    public PsoFieldsType getPsoFields() {
        return psoFields;
    }

    /**
     * Sets the pso fields.
     * 
     * @param value the new pso fields
     */
    public void setPsoFields(PsoFieldsType value) {
        this.psoFields = value;
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
