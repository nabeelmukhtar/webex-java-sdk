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

package com.webex.schemas._2002._06.service.meetingtype;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class LimitsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "limitsType", propOrder = {
    "maxAppShareDuration",
    "maxAppShareUser",
    "maxDesktopShareDuration",
    "maxDesktopShareUser",
    "maxFileTransferUser",
    "maxMeetingDuration",
    "maxMeetingUser",
    "maxRecordUser",
    "maxVideoDuration",
    "maxVideoUser",
    "maxWebTourDuration",
    "maxWebTourUser"
})
public class LimitsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The max app share duration. */
    @XmlElement(defaultValue = "999999")
    protected Long maxAppShareDuration;
    
    /** The max app share user. */
    @XmlElement(defaultValue = "999999")
    protected Long maxAppShareUser;
    
    /** The max desktop share duration. */
    @XmlElement(defaultValue = "999999")
    protected Long maxDesktopShareDuration;
    
    /** The max desktop share user. */
    @XmlElement(defaultValue = "999999")
    protected Long maxDesktopShareUser;
    
    /** The max file transfer user. */
    @XmlElement(defaultValue = "999999")
    protected Long maxFileTransferUser;
    
    /** The max meeting duration. */
    @XmlElement(defaultValue = "999999")
    protected Long maxMeetingDuration;
    
    /** The max meeting user. */
    @XmlElement(defaultValue = "999999")
    protected Long maxMeetingUser;
    
    /** The max record user. */
    @XmlElement(defaultValue = "999999")
    protected Long maxRecordUser;
    
    /** The max video duration. */
    @XmlElement(defaultValue = "999999")
    protected Long maxVideoDuration;
    
    /** The max video user. */
    @XmlElement(defaultValue = "999999")
    protected Long maxVideoUser;
    
    /** The max web tour duration. */
    @XmlElement(defaultValue = "999999")
    protected Long maxWebTourDuration;
    
    /** The max web tour user. */
    @XmlElement(defaultValue = "999999")
    protected Long maxWebTourUser;

    /**
     * Gets the max app share duration.
     * 
     * @return the max app share duration
     */
    public Long getMaxAppShareDuration() {
        return maxAppShareDuration;
    }

    /**
     * Sets the max app share duration.
     * 
     * @param value the new max app share duration
     */
    public void setMaxAppShareDuration(Long value) {
        this.maxAppShareDuration = value;
    }

    /**
     * Gets the max app share user.
     * 
     * @return the max app share user
     */
    public Long getMaxAppShareUser() {
        return maxAppShareUser;
    }

    /**
     * Sets the max app share user.
     * 
     * @param value the new max app share user
     */
    public void setMaxAppShareUser(Long value) {
        this.maxAppShareUser = value;
    }

    /**
     * Gets the max desktop share duration.
     * 
     * @return the max desktop share duration
     */
    public Long getMaxDesktopShareDuration() {
        return maxDesktopShareDuration;
    }

    /**
     * Sets the max desktop share duration.
     * 
     * @param value the new max desktop share duration
     */
    public void setMaxDesktopShareDuration(Long value) {
        this.maxDesktopShareDuration = value;
    }

    /**
     * Gets the max desktop share user.
     * 
     * @return the max desktop share user
     */
    public Long getMaxDesktopShareUser() {
        return maxDesktopShareUser;
    }

    /**
     * Sets the max desktop share user.
     * 
     * @param value the new max desktop share user
     */
    public void setMaxDesktopShareUser(Long value) {
        this.maxDesktopShareUser = value;
    }

    /**
     * Gets the max file transfer user.
     * 
     * @return the max file transfer user
     */
    public Long getMaxFileTransferUser() {
        return maxFileTransferUser;
    }

    /**
     * Sets the max file transfer user.
     * 
     * @param value the new max file transfer user
     */
    public void setMaxFileTransferUser(Long value) {
        this.maxFileTransferUser = value;
    }

    /**
     * Gets the max meeting duration.
     * 
     * @return the max meeting duration
     */
    public Long getMaxMeetingDuration() {
        return maxMeetingDuration;
    }

    /**
     * Sets the max meeting duration.
     * 
     * @param value the new max meeting duration
     */
    public void setMaxMeetingDuration(Long value) {
        this.maxMeetingDuration = value;
    }

    /**
     * Gets the max meeting user.
     * 
     * @return the max meeting user
     */
    public Long getMaxMeetingUser() {
        return maxMeetingUser;
    }

    /**
     * Sets the max meeting user.
     * 
     * @param value the new max meeting user
     */
    public void setMaxMeetingUser(Long value) {
        this.maxMeetingUser = value;
    }

    /**
     * Gets the max record user.
     * 
     * @return the max record user
     */
    public Long getMaxRecordUser() {
        return maxRecordUser;
    }

    /**
     * Sets the max record user.
     * 
     * @param value the new max record user
     */
    public void setMaxRecordUser(Long value) {
        this.maxRecordUser = value;
    }

    /**
     * Gets the max video duration.
     * 
     * @return the max video duration
     */
    public Long getMaxVideoDuration() {
        return maxVideoDuration;
    }

    /**
     * Sets the max video duration.
     * 
     * @param value the new max video duration
     */
    public void setMaxVideoDuration(Long value) {
        this.maxVideoDuration = value;
    }

    /**
     * Gets the max video user.
     * 
     * @return the max video user
     */
    public Long getMaxVideoUser() {
        return maxVideoUser;
    }

    /**
     * Sets the max video user.
     * 
     * @param value the new max video user
     */
    public void setMaxVideoUser(Long value) {
        this.maxVideoUser = value;
    }

    /**
     * Gets the max web tour duration.
     * 
     * @return the max web tour duration
     */
    public Long getMaxWebTourDuration() {
        return maxWebTourDuration;
    }

    /**
     * Sets the max web tour duration.
     * 
     * @param value the new max web tour duration
     */
    public void setMaxWebTourDuration(Long value) {
        this.maxWebTourDuration = value;
    }

    /**
     * Gets the max web tour user.
     * 
     * @return the max web tour user
     */
    public Long getMaxWebTourUser() {
        return maxWebTourUser;
    }

    /**
     * Sets the max web tour user.
     * 
     * @param value the new max web tour user
     */
    public void setMaxWebTourUser(Long value) {
        this.maxWebTourUser = value;
    }

}
