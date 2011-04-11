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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class PersonalMeetingRoomType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalMeetingRoomType", propOrder = {
    "welcomeMessage",
    "photoURL",
    "headerImageBranding",
    "headerImageURL"
})
public class PersonalMeetingRoomType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The welcome message. */
    protected String welcomeMessage;
    
    /** The photo url. */
    protected String photoURL;
    
    /** The header image branding. */
    protected Boolean headerImageBranding;
    
    /** The header image url. */
    protected String headerImageURL;

    /**
     * Gets the welcome message.
     * 
     * @return the welcome message
     */
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    /**
     * Sets the welcome message.
     * 
     * @param value the new welcome message
     */
    public void setWelcomeMessage(String value) {
        this.welcomeMessage = value;
    }

    /**
     * Gets the photo url.
     * 
     * @return the photo url
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the photo url.
     * 
     * @param value the new photo url
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

    /**
     * Checks if is header image branding.
     * 
     * @return the boolean
     */
    public Boolean isHeaderImageBranding() {
        return headerImageBranding;
    }

    /**
     * Sets the header image branding.
     * 
     * @param value the new header image branding
     */
    public void setHeaderImageBranding(Boolean value) {
        this.headerImageBranding = value;
    }

    /**
     * Gets the header image url.
     * 
     * @return the header image url
     */
    public String getHeaderImageURL() {
        return headerImageURL;
    }

    /**
     * Sets the header image url.
     * 
     * @param value the new header image url
     */
    public void setHeaderImageURL(String value) {
        this.headerImageURL = value;
    }

}
