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
import com.webex.schemas._2002._06.common.EntryExitToneType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class ScheduleType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleType", propOrder = {
    "startDate",
    "timeZoneID",
    "duration",
    "openTime",
    "hostWebExID",
    "entryExitTone",
    "extURL",
    "extNotifyTime",
    "joinNotifyURL",
    "joinTeleconfBeforeHost"
})
public class ScheduleType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The start date. */
    protected String startDate;
    
    /** The time zone id. */
    @XmlElement(type = String.class, defaultValue = "-1")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;
    
    /** The duration. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long duration;
    
    /** The open time. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long openTime;
    
    /** The host web ex id. */
    protected String hostWebExID;
    
    /** The entry exit tone. */
    protected EntryExitToneType entryExitTone;
    
    /** The ext url. */
    protected String extURL;
    
    /** The ext notify time. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long extNotifyTime;
    
    /** The join notify url. */
    protected String joinNotifyURL;
    
    /** The join teleconf before host. */
    protected Boolean joinTeleconfBeforeHost;

    /**
     * Gets the start date.
     * 
     * @return the start date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date.
     * 
     * @param value the new start date
     */
    public void setStartDate(String value) {
        this.startDate = value;
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
     * Gets the duration.
     * 
     * @return the duration
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets the duration.
     * 
     * @param value the new duration
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Gets the open time.
     * 
     * @return the open time
     */
    public Long getOpenTime() {
        return openTime;
    }

    /**
     * Sets the open time.
     * 
     * @param value the new open time
     */
    public void setOpenTime(Long value) {
        this.openTime = value;
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
     * Gets the ext url.
     * 
     * @return the ext url
     */
    public String getExtURL() {
        return extURL;
    }

    /**
     * Sets the ext url.
     * 
     * @param value the new ext url
     */
    public void setExtURL(String value) {
        this.extURL = value;
    }

    /**
     * Gets the ext notify time.
     * 
     * @return the ext notify time
     */
    public Long getExtNotifyTime() {
        return extNotifyTime;
    }

    /**
     * Sets the ext notify time.
     * 
     * @param value the new ext notify time
     */
    public void setExtNotifyTime(Long value) {
        this.extNotifyTime = value;
    }

    /**
     * Gets the join notify url.
     * 
     * @return the join notify url
     */
    public String getJoinNotifyURL() {
        return joinNotifyURL;
    }

    /**
     * Sets the join notify url.
     * 
     * @param value the new join notify url
     */
    public void setJoinNotifyURL(String value) {
        this.joinNotifyURL = value;
    }

    /**
     * Checks if is join teleconf before host.
     * 
     * @return the boolean
     */
    public Boolean isJoinTeleconfBeforeHost() {
        return joinTeleconfBeforeHost;
    }

    /**
     * Sets the join teleconf before host.
     * 
     * @param value the new join teleconf before host
     */
    public void setJoinTeleconfBeforeHost(Boolean value) {
        this.joinTeleconfBeforeHost = value;
    }

}
