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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class DateScopeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateScopeType", propOrder = {
    "startDateStart",
    "startDateEnd",
    "endDateStart",
    "endDateEnd",
    "timeZoneID"
})
public class DateScopeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The start date start. */
    protected String startDateStart;
    
    /** The start date end. */
    protected String startDateEnd;
    
    /** The end date start. */
    protected String endDateStart;
    
    /** The end date end. */
    protected String endDateEnd;
    
    /** The time zone id. */
    @XmlElement(defaultValue = "-1")
    protected Long timeZoneID;

    /**
     * Gets the start date start.
     * 
     * @return the start date start
     */
    public String getStartDateStart() {
        return startDateStart;
    }

    /**
     * Sets the start date start.
     * 
     * @param value the new start date start
     */
    public void setStartDateStart(String value) {
        this.startDateStart = value;
    }

    /**
     * Gets the start date end.
     * 
     * @return the start date end
     */
    public String getStartDateEnd() {
        return startDateEnd;
    }

    /**
     * Sets the start date end.
     * 
     * @param value the new start date end
     */
    public void setStartDateEnd(String value) {
        this.startDateEnd = value;
    }

    /**
     * Gets the end date start.
     * 
     * @return the end date start
     */
    public String getEndDateStart() {
        return endDateStart;
    }

    /**
     * Sets the end date start.
     * 
     * @param value the new end date start
     */
    public void setEndDateStart(String value) {
        this.endDateStart = value;
    }

    /**
     * Gets the end date end.
     * 
     * @return the end date end
     */
    public String getEndDateEnd() {
        return endDateEnd;
    }

    /**
     * Sets the end date end.
     * 
     * @param value the new end date end
     */
    public void setEndDateEnd(String value) {
        this.endDateEnd = value;
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

}
