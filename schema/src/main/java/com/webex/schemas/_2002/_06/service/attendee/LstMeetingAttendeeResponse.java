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
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MatchingRecordsType;


/**
 * The Class LstMeetingAttendeeResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstMeetingAttendeeResponse", propOrder = {
    "matchingRecords",
    "attendee"
})
public class LstMeetingAttendeeResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The matching records. */
    protected MatchingRecordsType matchingRecords;
    
    /** The attendee. */
    protected List<AttendeeInstanceType> attendee;

    /**
     * Gets the matching records.
     * 
     * @return the matching records
     */
    public MatchingRecordsType getMatchingRecords() {
        return matchingRecords;
    }

    /**
     * Sets the matching records.
     * 
     * @param value the new matching records
     */
    public void setMatchingRecords(MatchingRecordsType value) {
        this.matchingRecords = value;
    }

    /**
     * Gets the attendee.
     * 
     * @return the attendee
     */
    public List<AttendeeInstanceType> getAttendee() {
        if (attendee == null) {
            attendee = new ArrayList<AttendeeInstanceType>();
        }
        return this.attendee;
    }

}
