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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.EntryExitToneType;


/**
 * The Class DefaultsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaultsType", propOrder = {
    "emailReminders",
    "entryExitTone",
    "voip",
    "teleconference",
    "joinTeleconfNotPress1",
    "updateTSPAccount"
})
public class DefaultsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The email reminders. */
    protected boolean emailReminders;
    
    /** The entry exit tone. */
    @XmlElement(required = true)
    protected EntryExitToneType entryExitTone;
    
    /** The voip. */
    protected boolean voip;
    
    /** The teleconference. */
    @XmlElement(required = true)
    protected TeleconferenceType teleconference;
    
    /** The join teleconf not press1. */
    protected boolean joinTeleconfNotPress1;
    
    /** The update tsp account. */
    protected Boolean updateTSPAccount;

    /**
     * Checks if is email reminders.
     * 
     * @return true, if is email reminders
     */
    public boolean isEmailReminders() {
        return emailReminders;
    }

    /**
     * Sets the email reminders.
     * 
     * @param value the new email reminders
     */
    public void setEmailReminders(boolean value) {
        this.emailReminders = value;
    }

    /**
     * Gets the entry exit tone.
     * 
     * @return the entry exit tone
     */
    public EntryExitToneType getEntryExitTone() {
        return entryExitTone;
    }

    /**
     * Sets the entry exit tone.
     * 
     * @param value the new entry exit tone
     */
    public void setEntryExitTone(EntryExitToneType value) {
        this.entryExitTone = value;
    }

    /**
     * Checks if is voip.
     * 
     * @return true, if is voip
     */
    public boolean isVoip() {
        return voip;
    }

    /**
     * Sets the voip.
     * 
     * @param value the new voip
     */
    public void setVoip(boolean value) {
        this.voip = value;
    }

    /**
     * Gets the teleconference.
     * 
     * @return the teleconference
     */
    public TeleconferenceType getTeleconference() {
        return teleconference;
    }

    /**
     * Sets the teleconference.
     * 
     * @param value the new teleconference
     */
    public void setTeleconference(TeleconferenceType value) {
        this.teleconference = value;
    }

    /**
     * Checks if is join teleconf not press1.
     * 
     * @return true, if is join teleconf not press1
     */
    public boolean isJoinTeleconfNotPress1() {
        return joinTeleconfNotPress1;
    }

    /**
     * Sets the join teleconf not press1.
     * 
     * @param value the new join teleconf not press1
     */
    public void setJoinTeleconfNotPress1(boolean value) {
        this.joinTeleconfNotPress1 = value;
    }

    /**
     * Checks if is update tsp account.
     * 
     * @return the boolean
     */
    public Boolean isUpdateTSPAccount() {
        return updateTSPAccount;
    }

    /**
     * Sets the update tsp account.
     * 
     * @param value the new update tsp account
     */
    public void setUpdateTSPAccount(Boolean value) {
        this.updateTSPAccount = value;
    }

}
