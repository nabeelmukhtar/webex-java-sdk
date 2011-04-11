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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class MeetingPlaceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingPlaceType", propOrder = {
    "mpProfileURL",
    "mpLogoutURL",
    "mpInternalMeetingLink",
    "nbrProfileNumber",
    "nbrProfilePassword"
})
public class MeetingPlaceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The mp profile url. */
    protected String mpProfileURL;
    
    /** The mp logout url. */
    protected String mpLogoutURL;
    
    /** The mp internal meeting link. */
    protected String mpInternalMeetingLink;
    
    /** The nbr profile number. */
    protected String nbrProfileNumber;
    
    /** The nbr profile password. */
    protected String nbrProfilePassword;

    /**
     * Gets the mp profile url.
     * 
     * @return the mp profile url
     */
    public String getMpProfileURL() {
        return mpProfileURL;
    }

    /**
     * Sets the mp profile url.
     * 
     * @param value the new mp profile url
     */
    public void setMpProfileURL(String value) {
        this.mpProfileURL = value;
    }

    /**
     * Gets the mp logout url.
     * 
     * @return the mp logout url
     */
    public String getMpLogoutURL() {
        return mpLogoutURL;
    }

    /**
     * Sets the mp logout url.
     * 
     * @param value the new mp logout url
     */
    public void setMpLogoutURL(String value) {
        this.mpLogoutURL = value;
    }

    /**
     * Gets the mp internal meeting link.
     * 
     * @return the mp internal meeting link
     */
    public String getMpInternalMeetingLink() {
        return mpInternalMeetingLink;
    }

    /**
     * Sets the mp internal meeting link.
     * 
     * @param value the new mp internal meeting link
     */
    public void setMpInternalMeetingLink(String value) {
        this.mpInternalMeetingLink = value;
    }

    /**
     * Gets the nbr profile number.
     * 
     * @return the nbr profile number
     */
    public String getNbrProfileNumber() {
        return nbrProfileNumber;
    }

    /**
     * Sets the nbr profile number.
     * 
     * @param value the new nbr profile number
     */
    public void setNbrProfileNumber(String value) {
        this.nbrProfileNumber = value;
    }

    /**
     * Gets the nbr profile password.
     * 
     * @return the nbr profile password
     */
    public String getNbrProfilePassword() {
        return nbrProfilePassword;
    }

    /**
     * Sets the nbr profile password.
     * 
     * @param value the new nbr profile password
     */
    public void setNbrProfilePassword(String value) {
        this.nbrProfilePassword = value;
    }

}
