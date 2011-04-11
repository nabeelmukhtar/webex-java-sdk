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
 * The Class StartTimeRangeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startTimeRangeType", propOrder = {
    "startTimeStart",
    "startTimeEnd"
})
public class StartTimeRangeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The start time start. */
    @XmlElement(required = true)
    protected String startTimeStart;
    
    /** The start time end. */
    @XmlElement(required = true)
    protected String startTimeEnd;

    /**
     * Gets the start time start.
     * 
     * @return the start time start
     */
    public String getStartTimeStart() {
        return startTimeStart;
    }

    /**
     * Sets the start time start.
     * 
     * @param value the new start time start
     */
    public void setStartTimeStart(String value) {
        this.startTimeStart = value;
    }

    /**
     * Gets the start time end.
     * 
     * @return the start time end
     */
    public String getStartTimeEnd() {
        return startTimeEnd;
    }

    /**
     * Sets the start time end.
     * 
     * @param value the new start time end
     */
    public void setStartTimeEnd(String value) {
        this.startTimeEnd = value;
    }

}
