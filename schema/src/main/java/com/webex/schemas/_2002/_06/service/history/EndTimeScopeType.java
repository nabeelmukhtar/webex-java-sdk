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
 * The Class EndTimeScopeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endTimeScopeType", propOrder = {
    "sessionEndTimeStart",
    "sessionEndTimeEnd"
})
public class EndTimeScopeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session end time start. */
    @XmlElement(required = true)
    protected String sessionEndTimeStart;
    
    /** The session end time end. */
    @XmlElement(required = true)
    protected String sessionEndTimeEnd;

    /**
     * Gets the session end time start.
     * 
     * @return the session end time start
     */
    public String getSessionEndTimeStart() {
        return sessionEndTimeStart;
    }

    /**
     * Sets the session end time start.
     * 
     * @param value the new session end time start
     */
    public void setSessionEndTimeStart(String value) {
        this.sessionEndTimeStart = value;
    }

    /**
     * Gets the session end time end.
     * 
     * @return the session end time end
     */
    public String getSessionEndTimeEnd() {
        return sessionEndTimeEnd;
    }

    /**
     * Sets the session end time end.
     * 
     * @param value the new session end time end
     */
    public void setSessionEndTimeEnd(String value) {
        this.sessionEndTimeEnd = value;
    }

}
