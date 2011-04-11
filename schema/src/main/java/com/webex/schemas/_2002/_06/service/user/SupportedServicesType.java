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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SupportedServicesType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportedServicesType", propOrder = {
    "meetingCenter",
    "trainingCenter",
    "supportCenter",
    "eventCenter",
    "salesCenter"
})
public class SupportedServicesType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meeting center. */
    protected Boolean meetingCenter;
    
    /** The training center. */
    protected Boolean trainingCenter;
    
    /** The support center. */
    protected Boolean supportCenter;
    
    /** The event center. */
    protected Boolean eventCenter;
    
    /** The sales center. */
    protected Boolean salesCenter;

    /**
     * Checks if is meeting center.
     * 
     * @return the boolean
     */
    public Boolean isMeetingCenter() {
        return meetingCenter;
    }

    /**
     * Sets the meeting center.
     * 
     * @param value the new meeting center
     */
    public void setMeetingCenter(Boolean value) {
        this.meetingCenter = value;
    }

    /**
     * Checks if is training center.
     * 
     * @return the boolean
     */
    public Boolean isTrainingCenter() {
        return trainingCenter;
    }

    /**
     * Sets the training center.
     * 
     * @param value the new training center
     */
    public void setTrainingCenter(Boolean value) {
        this.trainingCenter = value;
    }

    /**
     * Checks if is support center.
     * 
     * @return the boolean
     */
    public Boolean isSupportCenter() {
        return supportCenter;
    }

    /**
     * Sets the support center.
     * 
     * @param value the new support center
     */
    public void setSupportCenter(Boolean value) {
        this.supportCenter = value;
    }

    /**
     * Checks if is event center.
     * 
     * @return the boolean
     */
    public Boolean isEventCenter() {
        return eventCenter;
    }

    /**
     * Sets the event center.
     * 
     * @param value the new event center
     */
    public void setEventCenter(Boolean value) {
        this.eventCenter = value;
    }

    /**
     * Checks if is sales center.
     * 
     * @return the boolean
     */
    public Boolean isSalesCenter() {
        return salesCenter;
    }

    /**
     * Sets the sales center.
     * 
     * @param value the new sales center
     */
    public void setSalesCenter(Boolean value) {
        this.salesCenter = value;
    }

}
