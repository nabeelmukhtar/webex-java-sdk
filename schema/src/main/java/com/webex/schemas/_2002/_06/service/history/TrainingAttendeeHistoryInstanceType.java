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
 * The Class TrainingAttendeeHistoryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainingAttendeeHistoryInstanceType", propOrder = {
    "sessionKey",
    "confName",
    "attendeeName",
    "attendeeEmail",
    "startTime",
    "endTime",
    "duration",
    "registered",
    "invited",
    "company",
    "title",
    "phone",
    "address1",
    "address2",
    "city",
    "state",
    "country",
    "zip",
    "ipAddress",
    "participantType",
    "voipDuration",
    "clientAgent",
    "confID"
})
public class TrainingAttendeeHistoryInstanceType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected Long sessionKey;
    
    /** The conf name. */
    protected String confName;
    
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
    
    /** The registered. */
    protected String registered;
    
    /** The invited. */
    protected String invited;
    
    /** The company. */
    protected String company;
    
    /** The title. */
    protected String title;
    
    /** The phone. */
    protected String phone;
    
    /** The address1. */
    protected String address1;
    
    /** The address2. */
    protected String address2;
    
    /** The city. */
    protected String city;
    
    /** The state. */
    protected String state;
    
    /** The country. */
    protected String country;
    
    /** The zip. */
    protected String zip;
    
    /** The ip address. */
    protected String ipAddress;
    
    /** The participant type. */
    protected ParticipantTypeType participantType;
    
    /** The voip duration. */
    protected Integer voipDuration;
    
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
     * Gets the registered.
     * 
     * @return the registered
     */
    public String getRegistered() {
        return registered;
    }

    /**
     * Sets the registered.
     * 
     * @param value the new registered
     */
    public void setRegistered(String value) {
        this.registered = value;
    }

    /**
     * Gets the invited.
     * 
     * @return the invited
     */
    public String getInvited() {
        return invited;
    }

    /**
     * Sets the invited.
     * 
     * @param value the new invited
     */
    public void setInvited(String value) {
        this.invited = value;
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
     * Gets the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the address1.
     * 
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the address1.
     * 
     * @param value the new address1
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the address2.
     * 
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the address2.
     * 
     * @param value the new address2
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the city.
     * 
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     * 
     * @param value the new city
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the state.
     * 
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state.
     * 
     * @param value the new state
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the country.
     * 
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country.
     * 
     * @param value the new country
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the zip.
     * 
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the zip.
     * 
     * @param value the new zip
     */
    public void setZip(String value) {
        this.zip = value;
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
     * Gets the voip duration.
     * 
     * @return the voip duration
     */
    public Integer getVoipDuration() {
        return voipDuration;
    }

    /**
     * Sets the voip duration.
     * 
     * @param value the new voip duration
     */
    public void setVoipDuration(Integer value) {
        this.voipDuration = value;
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
