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
 * The Class StartTimeScopeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startTimeScopeType", propOrder = {
    "sessionStartTimeStart",
    "sessionStartTimeEnd"
})
public class StartTimeScopeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session start time start. */
    @XmlElement(required = true)
    protected String sessionStartTimeStart;
    
    /** The session start time end. */
    @XmlElement(required = true)
    protected String sessionStartTimeEnd;

    /**
     * Gets the session start time start.
     * 
     * @return the session start time start
     */
    public String getSessionStartTimeStart() {
        return sessionStartTimeStart;
    }

    /**
     * Sets the session start time start.
     * 
     * @param value the new session start time start
     */
    public void setSessionStartTimeStart(String value) {
        this.sessionStartTimeStart = value;
    }

    /**
     * Gets the session start time end.
     * 
     * @return the session start time end
     */
    public String getSessionStartTimeEnd() {
        return sessionStartTimeEnd;
    }

    /**
     * Sets the session start time end.
     * 
     * @param value the new session start time end
     */
    public void setSessionStartTimeEnd(String value) {
        this.sessionStartTimeEnd = value;
    }

}
