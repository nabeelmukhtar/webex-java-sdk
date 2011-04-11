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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AttendeeOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeOptionsType", propOrder = {
    "request",
    "registration",
    "auto",
    "registrationPWD",
    "maxRegistrations",
    "registrationCloseDate",
    "emailInvitations",
    "participantLimit"
})
public class AttendeeOptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The request. */
    protected Boolean request;
    
    /** The registration. */
    protected Boolean registration;
    
    /** The auto. */
    protected Boolean auto;
    
    /** The registration pwd. */
    protected String registrationPWD;
    
    /** The max registrations. */
    protected Long maxRegistrations;
    
    /** The registration close date. */
    protected String registrationCloseDate;
    
    /** The email invitations. */
    @XmlElement(defaultValue = "false")
    protected Boolean emailInvitations;
    
    /** The participant limit. */
    protected Integer participantLimit;

    /**
     * Checks if is request.
     * 
     * @return the boolean
     */
    public Boolean isRequest() {
        return request;
    }

    /**
     * Sets the request.
     * 
     * @param value the new request
     */
    public void setRequest(Boolean value) {
        this.request = value;
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
     * Checks if is auto.
     * 
     * @return the boolean
     */
    public Boolean isAuto() {
        return auto;
    }

    /**
     * Sets the auto.
     * 
     * @param value the new auto
     */
    public void setAuto(Boolean value) {
        this.auto = value;
    }

    /**
     * Gets the registration pwd.
     * 
     * @return the registration pwd
     */
    public String getRegistrationPWD() {
        return registrationPWD;
    }

    /**
     * Sets the registration pwd.
     * 
     * @param value the new registration pwd
     */
    public void setRegistrationPWD(String value) {
        this.registrationPWD = value;
    }

    /**
     * Gets the max registrations.
     * 
     * @return the max registrations
     */
    public Long getMaxRegistrations() {
        return maxRegistrations;
    }

    /**
     * Sets the max registrations.
     * 
     * @param value the new max registrations
     */
    public void setMaxRegistrations(Long value) {
        this.maxRegistrations = value;
    }

    /**
     * Gets the registration close date.
     * 
     * @return the registration close date
     */
    public String getRegistrationCloseDate() {
        return registrationCloseDate;
    }

    /**
     * Sets the registration close date.
     * 
     * @param value the new registration close date
     */
    public void setRegistrationCloseDate(String value) {
        this.registrationCloseDate = value;
    }

    /**
     * Checks if is email invitations.
     * 
     * @return the boolean
     */
    public Boolean isEmailInvitations() {
        return emailInvitations;
    }

    /**
     * Sets the email invitations.
     * 
     * @param value the new email invitations
     */
    public void setEmailInvitations(Boolean value) {
        this.emailInvitations = value;
    }

    /**
     * Gets the participant limit.
     * 
     * @return the participant limit
     */
    public Integer getParticipantLimit() {
        return participantLimit;
    }

    /**
     * Sets the participant limit.
     * 
     * @param value the new participant limit
     */
    public void setParticipantLimit(Integer value) {
        this.participantLimit = value;
    }

}
