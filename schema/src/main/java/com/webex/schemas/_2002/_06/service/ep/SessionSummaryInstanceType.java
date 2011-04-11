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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.ListingType;
import com.webex.schemas._2002._06.common.PsoFieldsType;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class SessionSummaryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionSummaryInstanceType", propOrder = {
    "sessionKey",
    "confName",
    "sessionType",
    "serviceType",
    "hostWebExID",
    "hostFirstName",
    "hostLastName",
    "otherHostWebExID",
    "timeZoneID",
    "timeZone",
    "status",
    "startTime",
    "actualStartTime",
    "openTime",
    "duration",
    "listStatus",
    "hostEmail",
    "passwordReq",
    "hostJoined",
    "participantsJoined",
    "confID",
    "registration",
    "isRecurring",
    "altHost",
    "psoFields",
    "assistService",
    "hostType",
    "audioStatus",
    "isAudioOnly"
})
public class SessionSummaryInstanceType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected long sessionKey;
    
    /** The conf name. */
    @XmlElement(required = true)
    protected String confName;
    
    /** The session type. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long sessionType;
    
    /** The service type. */
    @XmlElement(required = true)
    protected ServiceTypeType serviceType;
    
    /** The host web ex id. */
    @XmlElement(required = true)
    protected String hostWebExID;
    
    /** The host first name. */
    protected String hostFirstName;
    
    /** The host last name. */
    protected String hostLastName;
    
    /** The other host web ex id. */
    protected String otherHostWebExID;
    
    /** The time zone id. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;
    
    /** The time zone. */
    protected String timeZone;
    
    /** The status. */
    protected String status;
    
    /** The start time. */
    @XmlElement(required = true)
    protected String startTime;
    
    /** The actual start time. */
    protected String actualStartTime;
    
    /** The open time. */
    protected Integer openTime;
    
    /** The duration. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long duration;
    
    /** The list status. */
    @XmlElement(required = true)
    protected ListingType listStatus;
    
    /** The host email. */
    protected String hostEmail;
    
    /** The password req. */
    protected Boolean passwordReq;
    
    /** The host joined. */
    protected Boolean hostJoined;
    
    /** The participants joined. */
    protected Boolean participantsJoined;
    
    /** The conf id. */
    protected long confID;
    
    /** The registration. */
    protected Boolean registration;
    
    /** The is recurring. */
    protected boolean isRecurring;
    
    /** The alt host. */
    protected Boolean altHost;
    
    /** The pso fields. */
    protected PsoFieldsType psoFields;
    
    /** The assist service. */
    protected MeetingAssistType assistService;
    
    /** The host type. */
    protected String hostType;
    
    /** The audio status. */
    protected String audioStatus;
    
    /** The is audio only. */
    protected Boolean isAudioOnly;

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
     * Gets the service type.
     * 
     * @return the service type
     */
    public ServiceTypeType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the service type.
     * 
     * @param value the new service type
     */
    public void setServiceType(ServiceTypeType value) {
        this.serviceType = value;
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
     * Gets the host first name.
     * 
     * @return the host first name
     */
    public String getHostFirstName() {
        return hostFirstName;
    }

    /**
     * Sets the host first name.
     * 
     * @param value the new host first name
     */
    public void setHostFirstName(String value) {
        this.hostFirstName = value;
    }

    /**
     * Gets the host last name.
     * 
     * @return the host last name
     */
    public String getHostLastName() {
        return hostLastName;
    }

    /**
     * Sets the host last name.
     * 
     * @param value the new host last name
     */
    public void setHostLastName(String value) {
        this.hostLastName = value;
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
     * Gets the actual start time.
     * 
     * @return the actual start time
     */
    public String getActualStartTime() {
        return actualStartTime;
    }

    /**
     * Sets the actual start time.
     * 
     * @param value the new actual start time
     */
    public void setActualStartTime(String value) {
        this.actualStartTime = value;
    }

    /**
     * Gets the open time.
     * 
     * @return the open time
     */
    public Integer getOpenTime() {
        return openTime;
    }

    /**
     * Sets the open time.
     * 
     * @param value the new open time
     */
    public void setOpenTime(Integer value) {
        this.openTime = value;
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
     * Checks if is password req.
     * 
     * @return the boolean
     */
    public Boolean isPasswordReq() {
        return passwordReq;
    }

    /**
     * Sets the password req.
     * 
     * @param value the new password req
     */
    public void setPasswordReq(Boolean value) {
        this.passwordReq = value;
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

    /**
     * Gets the conf id.
     * 
     * @return the conf id
     */
    public long getConfID() {
        return confID;
    }

    /**
     * Sets the conf id.
     * 
     * @param value the new conf id
     */
    public void setConfID(long value) {
        this.confID = value;
    }

    /**
     * Checks if is registration.
     * 
     * @return the boolean
     */
    public Boolean isRegistration() {
        return registration;
    }

    /**
     * Sets the registration.
     * 
     * @param value the new registration
     */
    public void setRegistration(Boolean value) {
        this.registration = value;
    }

    /**
     * Checks if is checks if is recurring.
     * 
     * @return true, if is checks if is recurring
     */
    public boolean isIsRecurring() {
        return isRecurring;
    }

    /**
     * Sets the checks if is recurring.
     * 
     * @param value the new checks if is recurring
     */
    public void setIsRecurring(boolean value) {
        this.isRecurring = value;
    }

    /**
     * Checks if is alt host.
     * 
     * @return the boolean
     */
    public Boolean isAltHost() {
        return altHost;
    }

    /**
     * Sets the alt host.
     * 
     * @param value the new alt host
     */
    public void setAltHost(Boolean value) {
        this.altHost = value;
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

    /**
     * Gets the host type.
     * 
     * @return the host type
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Sets the host type.
     * 
     * @param value the new host type
     */
    public void setHostType(String value) {
        this.hostType = value;
    }

    /**
     * Gets the audio status.
     * 
     * @return the audio status
     */
    public String getAudioStatus() {
        return audioStatus;
    }

    /**
     * Sets the audio status.
     * 
     * @param value the new audio status
     */
    public void setAudioStatus(String value) {
        this.audioStatus = value;
    }

    /**
     * Checks if is is audio only.
     * 
     * @return the boolean
     */
    public Boolean isIsAudioOnly() {
        return isAudioOnly;
    }

    /**
     * Sets the checks if is audio only.
     * 
     * @param value the new checks if is audio only
     */
    public void setIsAudioOnly(Boolean value) {
        this.isAudioOnly = value;
    }

}
