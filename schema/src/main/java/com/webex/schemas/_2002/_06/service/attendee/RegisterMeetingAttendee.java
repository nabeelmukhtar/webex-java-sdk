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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class RegisterMeetingAttendee.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerMeetingAttendee", propOrder = {
    "attendees",
    "validateFormat"
})
public class RegisterMeetingAttendee
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The attendees. */
    @XmlElement(required = true)
    protected List<RegisterAttendeeType> attendees;
    
    /** The validate format. */
    protected Boolean validateFormat;

    /**
     * Gets the attendees.
     * 
     * @return the attendees
     */
    public List<RegisterAttendeeType> getAttendees() {
        if (attendees == null) {
            attendees = new ArrayList<RegisterAttendeeType>();
        }
        return this.attendees;
    }

    /**
     * Checks if is validate format.
     * 
     * @return the boolean
     */
    public Boolean isValidateFormat() {
        return validateFormat;
    }

    /**
     * Sets the validate format.
     * 
     * @param value the new validate format
     */
    public void setValidateFormat(Boolean value) {
        this.validateFormat = value;
    }

}
