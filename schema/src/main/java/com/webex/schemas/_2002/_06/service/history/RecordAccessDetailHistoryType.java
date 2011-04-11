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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class RecordAccessDetailHistoryType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordAccessDetailHistoryType", propOrder = {
    "viewID",
    "participantName",
    "participantEmail",
    "accessTime",
    "registered",
    "registerDate",
    "downloaded",
    "viewed",
    "timeZoneID",
    "regFields"
})
public class RecordAccessDetailHistoryType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The view id. */
    protected Long viewID;
    
    /** The participant name. */
    protected String participantName;
    
    /** The participant email. */
    protected String participantEmail;
    
    /** The access time. */
    protected String accessTime;
    
    /** The registered. */
    protected Boolean registered;
    
    /** The register date. */
    protected String registerDate;
    
    /** The downloaded. */
    protected Boolean downloaded;
    
    /** The viewed. */
    protected Boolean viewed;
    
    /** The time zone id. */
    @XmlElement(defaultValue = "-1")
    protected Integer timeZoneID;
    
    /** The reg fields. */
    protected RegFieldsType regFields;

    /**
     * Gets the view id.
     * 
     * @return the view id
     */
    public Long getViewID() {
        return viewID;
    }

    /**
     * Sets the view id.
     * 
     * @param value the new view id
     */
    public void setViewID(Long value) {
        this.viewID = value;
    }

    /**
     * Gets the participant name.
     * 
     * @return the participant name
     */
    public String getParticipantName() {
        return participantName;
    }

    /**
     * Sets the participant name.
     * 
     * @param value the new participant name
     */
    public void setParticipantName(String value) {
        this.participantName = value;
    }

    /**
     * Gets the participant email.
     * 
     * @return the participant email
     */
    public String getParticipantEmail() {
        return participantEmail;
    }

    /**
     * Sets the participant email.
     * 
     * @param value the new participant email
     */
    public void setParticipantEmail(String value) {
        this.participantEmail = value;
    }

    /**
     * Gets the access time.
     * 
     * @return the access time
     */
    public String getAccessTime() {
        return accessTime;
    }

    /**
     * Sets the access time.
     * 
     * @param value the new access time
     */
    public void setAccessTime(String value) {
        this.accessTime = value;
    }

    /**
     * Checks if is registered.
     * 
     * @return the boolean
     */
    public Boolean isRegistered() {
        return registered;
    }

    /**
     * Sets the registered.
     * 
     * @param value the new registered
     */
    public void setRegistered(Boolean value) {
        this.registered = value;
    }

    /**
     * Gets the register date.
     * 
     * @return the register date
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the register date.
     * 
     * @param value the new register date
     */
    public void setRegisterDate(String value) {
        this.registerDate = value;
    }

    /**
     * Checks if is downloaded.
     * 
     * @return the boolean
     */
    public Boolean isDownloaded() {
        return downloaded;
    }

    /**
     * Sets the downloaded.
     * 
     * @param value the new downloaded
     */
    public void setDownloaded(Boolean value) {
        this.downloaded = value;
    }

    /**
     * Checks if is viewed.
     * 
     * @return the boolean
     */
    public Boolean isViewed() {
        return viewed;
    }

    /**
     * Sets the viewed.
     * 
     * @param value the new viewed
     */
    public void setViewed(Boolean value) {
        this.viewed = value;
    }

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public Integer getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(Integer value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the reg fields.
     * 
     * @return the reg fields
     */
    public RegFieldsType getRegFields() {
        return regFields;
    }

    /**
     * Sets the reg fields.
     * 
     * @param value the new reg fields
     */
    public void setRegFields(RegFieldsType value) {
        this.regFields = value;
    }

}
