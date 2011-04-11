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
 * The Class CreateMeetingAttendeeResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMeetingAttendeeResponse", propOrder = {
    "attendeeId",
    "register"
})
public class CreateMeetingAttendeeResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The attendee id. */
    @XmlElement(type = Long.class)
    protected List<Long> attendeeId;
    
    /** The register. */
    protected List<CreateMeetingAttendeeResponse.Register> register;

    /**
     * Gets the attendee id.
     * 
     * @return the attendee id
     */
    public List<Long> getAttendeeId() {
        if (attendeeId == null) {
            attendeeId = new ArrayList<Long>();
        }
        return this.attendeeId;
    }

    /**
     * Gets the register.
     * 
     * @return the register
     */
    public List<CreateMeetingAttendeeResponse.Register> getRegister() {
        if (register == null) {
            register = new ArrayList<CreateMeetingAttendeeResponse.Register>();
        }
        return this.register;
    }


    /**
     * The Class Register.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attendeeID",
        "registerID"
    })
    public static class Register
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The attendee id. */
        protected long attendeeID;
        
        /** The register id. */
        protected long registerID;

        /**
         * Gets the attendee id.
         * 
         * @return the attendee id
         */
        public long getAttendeeID() {
            return attendeeID;
        }

        /**
         * Sets the attendee id.
         * 
         * @param value the new attendee id
         */
        public void setAttendeeID(long value) {
            this.attendeeID = value;
        }

        /**
         * Gets the register id.
         * 
         * @return the register id
         */
        public long getRegisterID() {
            return registerID;
        }

        /**
         * Sets the register id.
         * 
         * @param value the new register id
         */
        public void setRegisterID(long value) {
            this.registerID = value;
        }

    }

}
