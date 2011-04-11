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
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class RecordedEventType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordedEventType", propOrder = {
    "eventName",
    "eventType",
    "recordingStartTime",
    "timeZoneID",
    "playTime",
    "panelistsInfo",
    "description",
    "recordFilePath",
    "destinationURL",
    "size",
    "isAccessPassword",
    "isEnrollmentPassword",
    "hostWebExID",
    "viewURL"
})
public class RecordedEventType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The event name. */
    @XmlElement(required = true)
    protected String eventName;
    
    /** The event type. */
    @XmlElement(required = true)
    protected String eventType;
    
    /** The recording start time. */
    protected String recordingStartTime;
    
    /** The time zone id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;
    
    /** The play time. */
    protected Long playTime;
    
    /** The panelists info. */
    protected String panelistsInfo;
    
    /** The description. */
    protected String description;
    
    /** The record file path. */
    protected String recordFilePath;
    
    /** The destination url. */
    @XmlElement(required = true)
    protected String destinationURL;
    
    /** The size. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long size;
    
    /** The is access password. */
    protected Boolean isAccessPassword;
    
    /** The is enrollment password. */
    protected Boolean isEnrollmentPassword;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The view url. */
    @XmlElement(required = true)
    protected String viewURL;

    /**
     * Gets the event name.
     * 
     * @return the event name
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the event name.
     * 
     * @param value the new event name
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Gets the event type.
     * 
     * @return the event type
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the event type.
     * 
     * @param value the new event type
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the recording start time.
     * 
     * @return the recording start time
     */
    public String getRecordingStartTime() {
        return recordingStartTime;
    }

    /**
     * Sets the recording start time.
     * 
     * @param value the new recording start time
     */
    public void setRecordingStartTime(String value) {
        this.recordingStartTime = value;
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
     * Gets the play time.
     * 
     * @return the play time
     */
    public Long getPlayTime() {
        return playTime;
    }

    /**
     * Sets the play time.
     * 
     * @param value the new play time
     */
    public void setPlayTime(Long value) {
        this.playTime = value;
    }

    /**
     * Gets the panelists info.
     * 
     * @return the panelists info
     */
    public String getPanelistsInfo() {
        return panelistsInfo;
    }

    /**
     * Sets the panelists info.
     * 
     * @param value the new panelists info
     */
    public void setPanelistsInfo(String value) {
        this.panelistsInfo = value;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param value the new description
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the record file path.
     * 
     * @return the record file path
     */
    public String getRecordFilePath() {
        return recordFilePath;
    }

    /**
     * Sets the record file path.
     * 
     * @param value the new record file path
     */
    public void setRecordFilePath(String value) {
        this.recordFilePath = value;
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
     * Gets the size.
     * 
     * @return the size
     */
    public Long getSize() {
        return size;
    }

    /**
     * Sets the size.
     * 
     * @param value the new size
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Checks if is is access password.
     * 
     * @return the boolean
     */
    public Boolean isIsAccessPassword() {
        return isAccessPassword;
    }

    /**
     * Sets the checks if is access password.
     * 
     * @param value the new checks if is access password
     */
    public void setIsAccessPassword(Boolean value) {
        this.isAccessPassword = value;
    }

    /**
     * Checks if is is enrollment password.
     * 
     * @return the boolean
     */
    public Boolean isIsEnrollmentPassword() {
        return isEnrollmentPassword;
    }

    /**
     * Sets the checks if is enrollment password.
     * 
     * @param value the new checks if is enrollment password
     */
    public void setIsEnrollmentPassword(Boolean value) {
        this.isEnrollmentPassword = value;
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
     * Gets the view url.
     * 
     * @return the view url
     */
    public String getViewURL() {
        return viewURL;
    }

    /**
     * Sets the view url.
     * 
     * @param value the new view url
     */
    public void setViewURL(String value) {
        this.viewURL = value;
    }

}
