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

package com.webex.schemas._2002._06.service.meeting.auo;

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
    "requireUcfDiagnosis",
    "excludePassword",
    "requireAccount",
    "emailInvitations"
})
public class AttendeeOptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The require ucf diagnosis. */
    protected Boolean requireUcfDiagnosis;
    
    /** The exclude password. */
    protected Boolean excludePassword;
    
    /** The require account. */
    protected Boolean requireAccount;
    
    /** The email invitations. */
    @XmlElement(defaultValue = "false")
    protected Boolean emailInvitations;

    /**
     * Checks if is require ucf diagnosis.
     * 
     * @return the boolean
     */
    public Boolean isRequireUcfDiagnosis() {
        return requireUcfDiagnosis;
    }

    /**
     * Sets the require ucf diagnosis.
     * 
     * @param value the new require ucf diagnosis
     */
    public void setRequireUcfDiagnosis(Boolean value) {
        this.requireUcfDiagnosis = value;
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
     * Checks if is require account.
     * 
     * @return the boolean
     */
    public Boolean isRequireAccount() {
        return requireAccount;
    }

    /**
     * Sets the require account.
     * 
     * @param value the new require account
     */
    public void setRequireAccount(Boolean value) {
        this.requireAccount = value;
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

}
