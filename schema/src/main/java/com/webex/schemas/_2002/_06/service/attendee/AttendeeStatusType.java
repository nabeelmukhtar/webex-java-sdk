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

package com.webex.schemas._2002._06.service.attendee;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AttendeeStatusType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeStatusType", propOrder = {
    "invited",
    "registered",
    "rejected",
    "accepted"
})
public class AttendeeStatusType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The invited. */
    protected boolean invited;
    
    /** The registered. */
    protected boolean registered;
    
    /** The rejected. */
    protected boolean rejected;
    
    /** The accepted. */
    protected boolean accepted;

    /**
     * Checks if is invited.
     * 
     * @return true, if is invited
     */
    public boolean isInvited() {
        return invited;
    }

    /**
     * Sets the invited.
     * 
     * @param value the new invited
     */
    public void setInvited(boolean value) {
        this.invited = value;
    }

    /**
     * Checks if is registered.
     * 
     * @return true, if is registered
     */
    public boolean isRegistered() {
        return registered;
    }

    /**
     * Sets the registered.
     * 
     * @param value the new registered
     */
    public void setRegistered(boolean value) {
        this.registered = value;
    }

    /**
     * Checks if is rejected.
     * 
     * @return true, if is rejected
     */
    public boolean isRejected() {
        return rejected;
    }

    /**
     * Sets the rejected.
     * 
     * @param value the new rejected
     */
    public void setRejected(boolean value) {
        this.rejected = value;
    }

    /**
     * Checks if is accepted.
     * 
     * @return true, if is accepted
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the accepted.
     * 
     * @param value the new accepted
     */
    public void setAccepted(boolean value) {
        this.accepted = value;
    }

}
