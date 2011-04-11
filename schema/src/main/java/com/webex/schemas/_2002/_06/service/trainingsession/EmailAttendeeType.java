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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EmailAttendeeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailAttendeeType", propOrder = {
    "invite",
    "reminderAfterStart",
    "beforeDays",
    "beforeHours",
    "beforeMinutes",
    "sendToRegister",
    "notifySubmits"
})
public class EmailAttendeeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The invite. */
    protected Boolean invite;
    
    /** The reminder after start. */
    protected Boolean reminderAfterStart;
    
    /** The before days. */
    protected Integer beforeDays;
    
    /** The before hours. */
    protected Integer beforeHours;
    
    /** The before minutes. */
    protected Integer beforeMinutes;
    
    /** The send to register. */
    protected Boolean sendToRegister;
    
    /** The notify submits. */
    protected Boolean notifySubmits;

    /**
     * Checks if is invite.
     * 
     * @return the boolean
     */
    public Boolean isInvite() {
        return invite;
    }

    /**
     * Sets the invite.
     * 
     * @param value the new invite
     */
    public void setInvite(Boolean value) {
        this.invite = value;
    }

    /**
     * Checks if is reminder after start.
     * 
     * @return the boolean
     */
    public Boolean isReminderAfterStart() {
        return reminderAfterStart;
    }

    /**
     * Sets the reminder after start.
     * 
     * @param value the new reminder after start
     */
    public void setReminderAfterStart(Boolean value) {
        this.reminderAfterStart = value;
    }

    /**
     * Gets the before days.
     * 
     * @return the before days
     */
    public Integer getBeforeDays() {
        return beforeDays;
    }

    /**
     * Sets the before days.
     * 
     * @param value the new before days
     */
    public void setBeforeDays(Integer value) {
        this.beforeDays = value;
    }

    /**
     * Gets the before hours.
     * 
     * @return the before hours
     */
    public Integer getBeforeHours() {
        return beforeHours;
    }

    /**
     * Sets the before hours.
     * 
     * @param value the new before hours
     */
    public void setBeforeHours(Integer value) {
        this.beforeHours = value;
    }

    /**
     * Gets the before minutes.
     * 
     * @return the before minutes
     */
    public Integer getBeforeMinutes() {
        return beforeMinutes;
    }

    /**
     * Sets the before minutes.
     * 
     * @param value the new before minutes
     */
    public void setBeforeMinutes(Integer value) {
        this.beforeMinutes = value;
    }

    /**
     * Checks if is send to register.
     * 
     * @return the boolean
     */
    public Boolean isSendToRegister() {
        return sendToRegister;
    }

    /**
     * Sets the send to register.
     * 
     * @param value the new send to register
     */
    public void setSendToRegister(Boolean value) {
        this.sendToRegister = value;
    }

    /**
     * Checks if is notify submits.
     * 
     * @return the boolean
     */
    public Boolean isNotifySubmits() {
        return notifySubmits;
    }

    /**
     * Sets the notify submits.
     * 
     * @param value the new notify submits
     */
    public void setNotifySubmits(Boolean value) {
        this.notifySubmits = value;
    }

}
