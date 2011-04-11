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
 * The Class RecordAccessHistoryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordAccessHistoryInstanceType", propOrder = {
    "recordID",
    "recordName",
    "creationTime",
    "registered",
    "downloaded",
    "viewed",
    "timeZoneID"
})
public class RecordAccessHistoryInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The record id. */
    protected Long recordID;
    
    /** The record name. */
    protected String recordName;
    
    /** The creation time. */
    protected String creationTime;
    
    /** The registered. */
    protected Long registered;
    
    /** The downloaded. */
    protected Long downloaded;
    
    /** The viewed. */
    protected Long viewed;
    
    /** The time zone id. */
    @XmlElement(defaultValue = "-1")
    protected Integer timeZoneID;

    /**
     * Gets the record id.
     * 
     * @return the record id
     */
    public Long getRecordID() {
        return recordID;
    }

    /**
     * Sets the record id.
     * 
     * @param value the new record id
     */
    public void setRecordID(Long value) {
        this.recordID = value;
    }

    /**
     * Gets the record name.
     * 
     * @return the record name
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the record name.
     * 
     * @param value the new record name
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the creation time.
     * 
     * @return the creation time
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the creation time.
     * 
     * @param value the new creation time
     */
    public void setCreationTime(String value) {
        this.creationTime = value;
    }

    /**
     * Gets the registered.
     * 
     * @return the registered
     */
    public Long getRegistered() {
        return registered;
    }

    /**
     * Sets the registered.
     * 
     * @param value the new registered
     */
    public void setRegistered(Long value) {
        this.registered = value;
    }

    /**
     * Gets the downloaded.
     * 
     * @return the downloaded
     */
    public Long getDownloaded() {
        return downloaded;
    }

    /**
     * Sets the downloaded.
     * 
     * @param value the new downloaded
     */
    public void setDownloaded(Long value) {
        this.downloaded = value;
    }

    /**
     * Gets the viewed.
     * 
     * @return the viewed
     */
    public Long getViewed() {
        return viewed;
    }

    /**
     * Sets the viewed.
     * 
     * @param value the new viewed
     */
    public void setViewed(Long value) {
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

}
