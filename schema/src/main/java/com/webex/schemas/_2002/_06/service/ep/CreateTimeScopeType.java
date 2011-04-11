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


/**
 * The Class CreateTimeScopeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTimeScopeType", propOrder = {
    "createTimeStart",
    "createTimeEnd",
    "timeZoneID"
})
public class CreateTimeScopeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The create time start. */
    @XmlElement(required = true)
    protected String createTimeStart;
    
    /** The create time end. */
    @XmlElement(required = true)
    protected String createTimeEnd;
    
    /** The time zone id. */
    @XmlElement(defaultValue = "-1")
    protected Integer timeZoneID;

    /**
     * Gets the creates the time start.
     * 
     * @return the creates the time start
     */
    public String getCreateTimeStart() {
        return createTimeStart;
    }

    /**
     * Sets the creates the time start.
     * 
     * @param value the new creates the time start
     */
    public void setCreateTimeStart(String value) {
        this.createTimeStart = value;
    }

    /**
     * Gets the creates the time end.
     * 
     * @return the creates the time end
     */
    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    /**
     * Sets the creates the time end.
     * 
     * @param value the new creates the time end
     */
    public void setCreateTimeEnd(String value) {
        this.createTimeEnd = value;
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
