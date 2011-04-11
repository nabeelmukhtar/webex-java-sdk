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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class GetTrainingSessionResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTrainingSessionResponse", propOrder = {
    "test",
    "hostKey",
    "eventID",
    "guestToken",
    "hostType"
})
public class GetTrainingSessionResponse
    extends TrainingSessionInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The test. */
    protected List<ScheduledTestType> test;
    
    /** The host key. */
    protected String hostKey;
    
    /** The event id. */
    protected Long eventID;
    
    /** The guest token. */
    protected String guestToken;
    
    /** The host type. */
    protected String hostType;

    /**
     * Gets the test.
     * 
     * @return the test
     */
    public List<ScheduledTestType> getTest() {
        if (test == null) {
            test = new ArrayList<ScheduledTestType>();
        }
        return this.test;
    }

    /**
     * Gets the host key.
     * 
     * @return the host key
     */
    public String getHostKey() {
        return hostKey;
    }

    /**
     * Sets the host key.
     * 
     * @param value the new host key
     */
    public void setHostKey(String value) {
        this.hostKey = value;
    }

    /**
     * Gets the event id.
     * 
     * @return the event id
     */
    public Long getEventID() {
        return eventID;
    }

    /**
     * Sets the event id.
     * 
     * @param value the new event id
     */
    public void setEventID(Long value) {
        this.eventID = value;
    }

    /**
     * Gets the guest token.
     * 
     * @return the guest token
     */
    public String getGuestToken() {
        return guestToken;
    }

    /**
     * Sets the guest token.
     * 
     * @param value the new guest token
     */
    public void setGuestToken(String value) {
        this.guestToken = value;
    }

    /**
     * Gets the host type.
     * 
     * @return the host type
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Sets the host type.
     * 
     * @param value the new host type
     */
    public void setHostType(String value) {
        this.hostType = value;
    }

}
