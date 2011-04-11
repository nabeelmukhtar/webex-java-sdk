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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class ScheduleLabType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleLabType", propOrder = {
    "labName",
    "confName",
    "timeZoneID",
    "sessionStartTime",
    "sessionEndTime",
    "hostWebExID",
    "numComputers"
})
public class ScheduleLabType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The lab name. */
    @XmlElement(required = true)
    protected String labName;
    
    /** The conf name. */
    @XmlElement(required = true)
    protected String confName;
    
    /** The time zone id. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;
    
    /** The session start time. */
    @XmlElement(required = true)
    protected String sessionStartTime;
    
    /** The session end time. */
    @XmlElement(required = true)
    protected String sessionEndTime;
    
    /** The host web ex id. */
    @XmlElement(required = true)
    protected String hostWebExID;
    
    /** The num computers. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numComputers;

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
     * Gets the conf name.
     * 
     * @return the conf name
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the conf name.
     * 
     * @param value the new conf name
     */
    public void setConfName(String value) {
        this.confName = value;
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
     * Gets the num computers.
     * 
     * @return the num computers
     */
    public Long getNumComputers() {
        return numComputers;
    }

    /**
     * Sets the num computers.
     * 
     * @param value the new num computers
     */
    public void setNumComputers(Long value) {
        this.numComputers = value;
    }

}
