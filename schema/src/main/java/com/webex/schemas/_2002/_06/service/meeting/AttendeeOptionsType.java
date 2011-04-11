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

package com.webex.schemas._2002._06.service.meeting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class AttendeeOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeOptionsType", propOrder = {
    "request",
    "registration",
    "auto",
    "emailInvitations",
    "participantLimit",
    "excludePassword",
    "joinRequiresAccount"
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
    
    /** The email invitations. */
    @XmlElement(defaultValue = "false")
    protected Boolean emailInvitations;
    
    /** The participant limit. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long participantLimit;
    
    /** The exclude password. */
    @XmlElement(defaultValue = "false")
    protected Boolean excludePassword;
    
    /** The join requires account. */
    @XmlElement(defaultValue = "false")
    protected Boolean joinRequiresAccount;

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
    public Long getParticipantLimit() {
        return participantLimit;
    }

    /**
     * Sets the participant limit.
     * 
     * @param value the new participant limit
     */
    public void setParticipantLimit(Long value) {
        this.participantLimit = value;
    }

    /**
     * Checks if is exclude password.
     * 
     * @return the boolean
     */
    public Boolean isExcludePassword() {
        return excludePassword;
    }

    /**
     * Sets the exclude password.
     * 
     * @param value the new exclude password
     */
    public void setExcludePassword(Boolean value) {
        this.excludePassword = value;
    }

    /**
     * Checks if is join requires account.
     * 
     * @return the boolean
     */
    public Boolean isJoinRequiresAccount() {
        return joinRequiresAccount;
    }

    /**
     * Sets the join requires account.
     * 
     * @param value the new join requires account
     */
    public void setJoinRequiresAccount(Boolean value) {
        this.joinRequiresAccount = value;
    }

}
