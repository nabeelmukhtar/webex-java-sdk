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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.ListingType;


/**
 * The Class OpenSessionType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "openSessionType", propOrder = {
    "sessionKey",
    "sessionName",
    "hostWebExID",
    "startTime",
    "actualStartTime",
    "timeZoneID",
    "listStatus"
})
public class OpenSessionType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected long sessionKey;
    
    /** The session name. */
    @XmlElement(required = true)
    protected String sessionName;
    
    /** The host web ex id. */
    @XmlElement(required = true)
    protected String hostWebExID;
    
    /** The start time. */
    @XmlElement(required = true)
    protected String startTime;
    
    /** The actual start time. */
    @XmlElement(required = true)
    protected String actualStartTime;
    
    /** The time zone id. */
    protected long timeZoneID;
    
    /** The list status. */
    @XmlElement(required = true)
    protected ListingType listStatus;

    /**
     * Gets the session key.
     * 
     * @return the session key
     */
    public long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the session key.
     * 
     * @param value the new session key
     */
    public void setSessionKey(long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the session name.
     * 
     * @return the session name
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Sets the session name.
     * 
     * @param value the new session name
     */
    public void setSessionName(String value) {
        this.sessionName = value;
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
     * Gets the start time.
     * 
     * @return the start time
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the start time.
     * 
     * @param value the new start time
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the actual start time.
     * 
     * @return the actual start time
     */
    public String getActualStartTime() {
        return actualStartTime;
    }

    /**
     * Sets the actual start time.
     * 
     * @param value the new actual start time
     */
    public void setActualStartTime(String value) {
        this.actualStartTime = value;
    }

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public long getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(long value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the list status.
     * 
     * @return the list status
     */
    public ListingType getListStatus() {
        return listStatus;
    }

    /**
     * Sets the list status.
     * 
     * @param value the new list status
     */
    public void setListStatus(ListingType value) {
        this.listStatus = value;
    }

}
