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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.AttendeeListViewType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class ExtOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extOptionsType", propOrder = {
    "enrollmentNumber",
    "destinationURL",
    "allowInviteFriend",
    "viewAttendeeList",
    "participantLimit",
    "displayQuickStartHost",
    "voip",
    "emailInvitations",
    "registration"
})
public class ExtOptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The enrollment number. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long enrollmentNumber;
    
    /** The destination url. */
    protected String destinationURL;
    
    /** The allow invite friend. */
    protected Boolean allowInviteFriend;
    
    /** The view attendee list. */
    protected AttendeeListViewType viewAttendeeList;
    
    /** The participant limit. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long participantLimit;
    
    /** The display quick start host. */
    protected Boolean displayQuickStartHost;
    
    /** The voip. */
    protected Boolean voip;
    
    /** The email invitations. */
    protected Boolean emailInvitations;
    
    /** The registration. */
    protected Boolean registration;

    /**
     * Gets the enrollment number.
     * 
     * @return the enrollment number
     */
    public Long getEnrollmentNumber() {
        return enrollmentNumber;
    }

    /**
     * Sets the enrollment number.
     * 
     * @param value the new enrollment number
     */
    public void setEnrollmentNumber(Long value) {
        this.enrollmentNumber = value;
    }

    /**
     * Gets the destination url.
     * 
     * @return the destination url
     */
    public String getDestinationURL() {
        return destinationURL;
    }

    /**
     * Sets the destination url.
     * 
     * @param value the new destination url
     */
    public void setDestinationURL(String value) {
        this.destinationURL = value;
    }

    /**
     * Checks if is allow invite friend.
     * 
     * @return the boolean
     */
    public Boolean isAllowInviteFriend() {
        return allowInviteFriend;
    }

    /**
     * Sets the allow invite friend.
     * 
     * @param value the new allow invite friend
     */
    public void setAllowInviteFriend(Boolean value) {
        this.allowInviteFriend = value;
    }

    /**
     * Gets the view attendee list.
     * 
     * @return the view attendee list
     */
    public AttendeeListViewType getViewAttendeeList() {
        return viewAttendeeList;
    }

    /**
     * Sets the view attendee list.
     * 
     * @param value the new view attendee list
     */
    public void setViewAttendeeList(AttendeeListViewType value) {
        this.viewAttendeeList = value;
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
     * Checks if is display quick start host.
     * 
     * @return the boolean
     */
    public Boolean isDisplayQuickStartHost() {
        return displayQuickStartHost;
    }

    /**
     * Sets the display quick start host.
     * 
     * @param value the new display quick start host
     */
    public void setDisplayQuickStartHost(Boolean value) {
        this.displayQuickStartHost = value;
    }

    /**
     * Checks if is voip.
     * 
     * @return the boolean
     */
    public Boolean isVoip() {
        return voip;
    }

    /**
     * Sets the voip.
     * 
     * @param value the new voip
     */
    public void setVoip(Boolean value) {
        this.voip = value;
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

}
