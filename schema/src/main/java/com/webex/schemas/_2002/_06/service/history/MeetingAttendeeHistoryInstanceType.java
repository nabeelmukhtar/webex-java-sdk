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
import com.webex.schemas._2002._06.service.BodyContentType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class MeetingAttendeeHistoryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingAttendeeHistoryInstanceType", propOrder = {
    "meetingKey",
    "confName",
    "ipAddress",
    "clientAgent",
    "company",
    "title",
    "phoneNumber",
    "address1",
    "address2",
    "city",
    "state",
    "country",
    "zipCode",
    "name",
    "email",
    "joinTime",
    "leaveTime",
    "duration",
    "participantType",
    "voipDuration",
    "confID"
})
@XmlSeeAlso({
    SalesAttendeeHistoryInstanceType.class
})
public class MeetingAttendeeHistoryInstanceType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meeting key. */
    protected Long meetingKey;
    
    /** The conf name. */
    protected String confName;
    
    /** The ip address. */
    protected String ipAddress;
    
    /** The client agent. */
    protected String clientAgent;
    
    /** The company. */
    protected String company;
    
    /** The title. */
    protected String title;
    
    /** The phone number. */
    protected String phoneNumber;
    
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
    
    /** The zip code. */
    protected String zipCode;
    
    /** The name. */
    protected String name;
    
    /** The email. */
    protected String email;
    
    /** The join time. */
    protected String joinTime;
    
    /** The leave time. */
    protected String leaveTime;
    
    /** The duration. */
    protected String duration;
    
    /** The participant type. */
    protected ParticipantTypeType participantType;
    
    /** The voip duration. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long voipDuration;
    
    /** The conf id. */
    protected Long confID;

    /**
     * Gets the meeting key.
     * 
     * @return the meeting key
     */
    public Long getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the meeting key.
     * 
     * @param value the new meeting key
     */
    public void setMeetingKey(Long value) {
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
     * Gets the phone number.
     * 
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number.
     * 
     * @param value the new phone number
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
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
     * Gets the zip code.
     * 
     * @return the zip code
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the zip code.
     * 
     * @param value the new zip code
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param value the new email
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the join time.
     * 
     * @return the join time
     */
    public String getJoinTime() {
        return joinTime;
    }

    /**
     * Sets the join time.
     * 
     * @param value the new join time
     */
    public void setJoinTime(String value) {
        this.joinTime = value;
    }

    /**
     * Gets the leave time.
     * 
     * @return the leave time
     */
    public String getLeaveTime() {
        return leaveTime;
    }

    /**
     * Sets the leave time.
     * 
     * @param value the new leave time
     */
    public void setLeaveTime(String value) {
        this.leaveTime = value;
    }

    /**
     * Gets the duration.
     * 
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the duration.
     * 
     * @param value the new duration
     */
    public void setDuration(String value) {
        this.duration = value;
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
    public Long getVoipDuration() {
        return voipDuration;
    }

    /**
     * Sets the voip duration.
     * 
     * @param value the new voip duration
     */
    public void setVoipDuration(Long value) {
        this.voipDuration = value;
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
