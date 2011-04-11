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

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.sales.ICalendarURL;


/**
 * The Class ICalendarURLType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iCalendarURLType", propOrder = {
    "host",
    "attendee"
})
@XmlSeeAlso({
    ICalendarURL.class
})
public class ICalendarURLType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The host. */
    @XmlElement(required = true)
    protected String host;
    
    /** The attendee. */
    @XmlElement(required = true)
    protected String attendee;

    /**
     * Gets the host.
     * 
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the host.
     * 
     * @param value the new host
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the attendee.
     * 
     * @return the attendee
     */
    public String getAttendee() {
        return attendee;
    }

    /**
     * Sets the attendee.
     * 
     * @param value the new attendee
     */
    public void setAttendee(String value) {
        this.attendee = value;
    }

}
