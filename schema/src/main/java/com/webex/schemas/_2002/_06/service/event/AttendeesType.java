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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.JoinStatusType;
import com.webex.schemas._2002._06.common.PersonType;


/**
 * The Class AttendeesType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeesType", propOrder = {
    "attendee"
})
public class AttendeesType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The attendee. */
    protected List<AttendeesType.Attendee> attendee;

    /**
     * Gets the attendee.
     * 
     * @return the attendee
     */
    public List<AttendeesType.Attendee> getAttendee() {
        if (attendee == null) {
            attendee = new ArrayList<AttendeesType.Attendee>();
        }
        return this.attendee;
    }


    /**
     * The Class Attendee.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "joinStatus"
    })
    public static class Attendee
        extends PersonType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The join status. */
        protected JoinStatusType joinStatus;

        /**
         * Gets the join status.
         * 
         * @return the join status
         */
        public JoinStatusType getJoinStatus() {
            return joinStatus;
        }

        /**
         * Sets the join status.
         * 
         * @param value the new join status
         */
        public void setJoinStatus(JoinStatusType value) {
            this.joinStatus = value;
        }

    }

}
