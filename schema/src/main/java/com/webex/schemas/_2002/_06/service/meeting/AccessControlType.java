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

package com.webex.schemas._2002._06.service.meeting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AccessControlType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessControlType", propOrder = {
    "listToPublic",
    "isPublic",
    "meetingPassword",
    "enforcePassword"
})
public class AccessControlType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The list to public. */
    protected Boolean listToPublic;
    
    /** The is public. */
    protected Boolean isPublic;
    
    /** The meeting password. */
    protected String meetingPassword;
    
    /** The enforce password. */
    @XmlElement(defaultValue = "true")
    protected Boolean enforcePassword;

    /**
     * Checks if is list to public.
     * 
     * @return the boolean
     */
    public Boolean isListToPublic() {
        return listToPublic;
    }

    /**
     * Sets the list to public.
     * 
     * @param value the new list to public
     */
    public void setListToPublic(Boolean value) {
        this.listToPublic = value;
    }

    /**
     * Checks if is is public.
     * 
     * @return the boolean
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Sets the checks if is public.
     * 
     * @param value the new checks if is public
     */
    public void setIsPublic(Boolean value) {
        this.isPublic = value;
    }

    /**
     * Gets the meeting password.
     * 
     * @return the meeting password
     */
    public String getMeetingPassword() {
        return meetingPassword;
    }

    /**
     * Sets the meeting password.
     * 
     * @param value the new meeting password
     */
    public void setMeetingPassword(String value) {
        this.meetingPassword = value;
    }

    /**
     * Checks if is enforce password.
     * 
     * @return the boolean
     */
    public Boolean isEnforcePassword() {
        return enforcePassword;
    }

    /**
     * Sets the enforce password.
     * 
     * @param value the new enforce password
     */
    public void setEnforcePassword(Boolean value) {
        this.enforcePassword = value;
    }

}
