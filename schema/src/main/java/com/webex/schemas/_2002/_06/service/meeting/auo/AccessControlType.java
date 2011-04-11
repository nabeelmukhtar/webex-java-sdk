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

package com.webex.schemas._2002._06.service.meeting.auo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AccessControlType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessControlType", propOrder = {
    "listing",
    "sessionPassword"
})
public class AccessControlType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The listing. */
    protected ListingType listing;
    
    /** The session password. */
    protected String sessionPassword;

    /**
     * Gets the listing.
     * 
     * @return the listing
     */
    public ListingType getListing() {
        return listing;
    }

    /**
     * Sets the listing.
     * 
     * @param value the new listing
     */
    public void setListing(ListingType value) {
        this.listing = value;
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

}
