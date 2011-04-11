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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class DataScopeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataScopeType", propOrder = {
    "regDateStart",
    "timeZoneID",
    "regDateEnd"
})
public class DataScopeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The reg date start. */
    protected String regDateStart;
    
    /** The time zone id. */
    @XmlElement(defaultValue = "-1")
    protected Long timeZoneID;
    
    /** The reg date end. */
    protected String regDateEnd;

    /**
     * Gets the reg date start.
     * 
     * @return the reg date start
     */
    public String getRegDateStart() {
        return regDateStart;
    }

    /**
     * Sets the reg date start.
     * 
     * @param value the new reg date start
     */
    public void setRegDateStart(String value) {
        this.regDateStart = value;
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
     * Gets the reg date end.
     * 
     * @return the reg date end
     */
    public String getRegDateEnd() {
        return regDateEnd;
    }

    /**
     * Sets the reg date end.
     * 
     * @param value the new reg date end
     */
    public void setRegDateEnd(String value) {
        this.regDateEnd = value;
    }

}
