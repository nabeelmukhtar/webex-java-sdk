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
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class SupportAttendeeHistoryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportAttendeeHistoryInstanceType", propOrder = {
    "sessionKey",
    "attendeeName",
    "attendeeEmail",
    "startTime",
    "endTime",
    "duration",
    "company",
    "phone",
    "ipAddress",
    "participantType",
    "clientAgent",
    "confID"
})
public class SupportAttendeeHistoryInstanceType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The attendee name. */
    protected String attendeeName;
    
    /** The attendee email. */
    protected String attendeeEmail;
    
    /** The start time. */
    protected String startTime;
    
    /** The end time. */
    protected String endTime;
    
    /** The duration. */
    protected Integer duration;
    
    /** The company. */
    protected String company;
    
    /** The phone. */
    protected String phone;
    
    /** The ip address. */
    protected String ipAddress;
    
    /** The participant type. */
    protected ParticipantTypeType participantType;
    
    /** The client agent. */
    protected String clientAgent;
    
    /** The conf id. */
    protected Long confID;

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
     * Gets the attendee name.
     * 
     * @return the attendee name
     */
    public String getAttendeeName() {
        return attendeeName;
    }

    /**
     * Sets the attendee name.
     * 
     * @param value the new attendee name
     */
    public void setAttendeeName(String value) {
        this.attendeeName = value;
    }

    /**
     * Gets the attendee email.
     * 
     * @return the attendee email
     */
    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    /**
     * Sets the attendee email.
     * 
     * @param value the new attendee email
     */
    public void setAttendeeEmail(String value) {
        this.attendeeEmail = value;
    }

    /**
     * Gets the start time.
     * 
     * @return the start time
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the start time.
     * 
     * @param value the new start time
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the end time.
     * 
     * @return the end time
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the end time.
     * 
     * @param value the new end time
     */
    public void setEndTime(String value) {
        this.endTime = value;
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
     * Gets the company.
     * 
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company.
     * 
     * @param value the new company
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the phone.
     * 
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     * 
     * @param value the new phone
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the ip address.
     * 
     * @return the ip address
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the ip address.
     * 
     * @param value the new ip address
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the participant type.
     * 
     * @return the participant type
     */
    public ParticipantTypeType getParticipantType() {
        return participantType;
    }

    /**
     * Sets the participant type.
     * 
     * @param value the new participant type
     */
    public void setParticipantType(ParticipantTypeType value) {
        this.participantType = value;
    }

    /**
     * Gets the client agent.
     * 
     * @return the client agent
     */
    public String getClientAgent() {
        return clientAgent;
    }

    /**
     * Sets the client agent.
     * 
     * @param value the new client agent
     */
    public void setClientAgent(String value) {
        this.clientAgent = value;
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

}
