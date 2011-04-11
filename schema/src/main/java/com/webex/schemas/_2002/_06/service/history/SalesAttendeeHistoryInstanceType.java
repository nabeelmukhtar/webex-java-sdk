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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SalesAttendeeHistoryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesAttendeeHistoryInstanceType", propOrder = {
    "account",
    "opportunity",
    "attendeeType"
})
public class SalesAttendeeHistoryInstanceType
    extends MeetingAttendeeHistoryInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The account. */
    protected String account;
    
    /** The opportunity. */
    protected String opportunity;
    
    /** The attendee type. */
    protected AttendeeTypeType attendeeType;

    /**
     * Gets the account.
     * 
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the account.
     * 
     * @param value the new account
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the opportunity.
     * 
     * @return the opportunity
     */
    public String getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the opportunity.
     * 
     * @param value the new opportunity
     */
    public void setOpportunity(String value) {
        this.opportunity = value;
    }

    /**
     * Gets the attendee type.
     * 
     * @return the attendee type
     */
    public AttendeeTypeType getAttendeeType() {
        return attendeeType;
    }

    /**
     * Sets the attendee type.
     * 
     * @param value the new attendee type
     */
    public void setAttendeeType(AttendeeTypeType value) {
        this.attendeeType = value;
    }

}
