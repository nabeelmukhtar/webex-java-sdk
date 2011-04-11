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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class GetLabSchedule.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLabSchedule", propOrder = {
    "labName",
    "timeZoneID",
    "sessionStartTime",
    "sessionEndTime"
})
public class GetLabSchedule
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The lab name. */
    @XmlElement(required = true)
    protected String labName;
    
    /** The time zone id. */
    @XmlElement(defaultValue = "-1")
    protected int timeZoneID;
    
    /** The session start time. */
    @XmlElement(required = true)
    protected String sessionStartTime;
    
    /** The session end time. */
    @XmlElement(required = true)
    protected String sessionEndTime;

    /**
     * Gets the lab name.
     * 
     * @return the lab name
     */
    public String getLabName() {
        return labName;
    }

    /**
     * Sets the lab name.
     * 
     * @param value the new lab name
     */
    public void setLabName(String value) {
        this.labName = value;
    }

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public int getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(int value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the session start time.
     * 
     * @return the session start time
     */
    public String getSessionStartTime() {
        return sessionStartTime;
    }

    /**
     * Sets the session start time.
     * 
     * @param value the new session start time
     */
    public void setSessionStartTime(String value) {
        this.sessionStartTime = value;
    }

    /**
     * Gets the session end time.
     * 
     * @return the session end time
     */
    public String getSessionEndTime() {
        return sessionEndTime;
    }

    /**
     * Sets the session end time.
     * 
     * @param value the new session end time
     */
    public void setSessionEndTime(String value) {
        this.sessionEndTime = value;
    }

}
