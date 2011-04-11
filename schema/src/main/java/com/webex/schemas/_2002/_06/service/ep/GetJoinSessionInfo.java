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
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class GetJoinSessionInfo.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJoinSessionInfo", propOrder = {
    "sessionKey",
    "sessionPassword",
    "attendeeName",
    "attendeeEmail"
})
public class GetJoinSessionInfo
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session key. */
    protected long sessionKey;
    
    /** The session password. */
    @XmlElement(required = true)
    protected String sessionPassword;
    
    /** The attendee name. */
    @XmlElement(required = true)
    protected String attendeeName;
    
    /** The attendee email. */
    @XmlElement(required = true)
    protected String attendeeEmail;

    /**
     * Gets the session key.
     * 
     * @return the session key
     */
    public long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the session key.
     * 
     * @param value the new session key
     */
    public void setSessionKey(long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the session password.
     * 
     * @return the session password
     */
    public String getSessionPassword() {
        return sessionPassword;
    }

    /**
     * Sets the session password.
     * 
     * @param value the new session password
     */
    public void setSessionPassword(String value) {
        this.sessionPassword = value;
    }

    /**
     * Gets the attendee name.
     * 
     * @return the attendee name
     */
    public String getAttendeeName() {
        return attendeeName;
    }

    /**
     * Sets the attendee name.
     * 
     * @param value the new attendee name
     */
    public void setAttendeeName(String value) {
        this.attendeeName = value;
    }

    /**
     * Gets the attendee email.
     * 
     * @return the attendee email
     */
    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    /**
     * Sets the attendee email.
     * 
     * @param value the new attendee email
     */
    public void setAttendeeEmail(String value) {
        this.attendeeEmail = value;
    }

}
