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

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class DateScopeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateScopeType", propOrder = {
    "startDateStart",
    "startDateEnd",
    "timeZoneID",
    "returnSpecifiedTimeZone"
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
    
    /** The time zone id. */
    @XmlElement(type = String.class, defaultValue = "-1")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;
    
    /** The return specified time zone. */
    @XmlElement(defaultValue = "false")
    protected Boolean returnSpecifiedTimeZone;

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
     * Checks if is return specified time zone.
     * 
     * @return the boolean
     */
    public Boolean isReturnSpecifiedTimeZone() {
        return returnSpecifiedTimeZone;
    }

    /**
     * Sets the return specified time zone.
     * 
     * @param value the new return specified time zone
     */
    public void setReturnSpecifiedTimeZone(Boolean value) {
        this.returnSpecifiedTimeZone = value;
    }

}
