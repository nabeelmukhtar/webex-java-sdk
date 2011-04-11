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
import com.webex.schemas._2002._06.common.SessionTemplateType;


/**
 * The Class MetaDataType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaDataType", propOrder = {
    "confName",
    "meetingType",
    "agenda",
    "greeting",
    "location",
    "invitation",
    "setNonMTOptions",
    "sessionTemplate",
    "isInternal"
})
public class MetaDataType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The conf name. */
    protected String confName;
    
    /** The meeting type. */
    @XmlElement(defaultValue = "-1")
    protected Long meetingType;
    
    /** The agenda. */
    protected String agenda;
    
    /** The greeting. */
    protected String greeting;
    
    /** The location. */
    protected String location;
    
    /** The invitation. */
    protected String invitation;
    
    /** The set non mt options. */
    protected Boolean setNonMTOptions;
    
    /** The session template. */
    protected SessionTemplateType sessionTemplate;
    
    /** The is internal. */
    protected Boolean isInternal;

    /**
     * Gets the conf name.
     * 
     * @return the conf name
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the conf name.
     * 
     * @param value the new conf name
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Gets the meeting type.
     * 
     * @return the meeting type
     */
    public Long getMeetingType() {
        return meetingType;
    }

    /**
     * Sets the meeting type.
     * 
     * @param value the new meeting type
     */
    public void setMeetingType(Long value) {
        this.meetingType = value;
    }

    /**
     * Gets the agenda.
     * 
     * @return the agenda
     */
    public String getAgenda() {
        return agenda;
    }

    /**
     * Sets the agenda.
     * 
     * @param value the new agenda
     */
    public void setAgenda(String value) {
        this.agenda = value;
    }

    /**
     * Gets the greeting.
     * 
     * @return the greeting
     */
    public String getGreeting() {
        return greeting;
    }

    /**
     * Sets the greeting.
     * 
     * @param value the new greeting
     */
    public void setGreeting(String value) {
        this.greeting = value;
    }

    /**
     * Gets the location.
     * 
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location.
     * 
     * @param value the new location
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the invitation.
     * 
     * @return the invitation
     */
    public String getInvitation() {
        return invitation;
    }

    /**
     * Sets the invitation.
     * 
     * @param value the new invitation
     */
    public void setInvitation(String value) {
        this.invitation = value;
    }

    /**
     * Checks if is set non mt options.
     * 
     * @return the boolean
     */
    public Boolean isSetNonMTOptions() {
        return setNonMTOptions;
    }

    /**
     * Sets the sets the non mt options.
     * 
     * @param value the new sets the non mt options
     */
    public void setSetNonMTOptions(Boolean value) {
        this.setNonMTOptions = value;
    }

    /**
     * Gets the session template.
     * 
     * @return the session template
     */
    public SessionTemplateType getSessionTemplate() {
        return sessionTemplate;
    }

    /**
     * Sets the session template.
     * 
     * @param value the new session template
     */
    public void setSessionTemplate(SessionTemplateType value) {
        this.sessionTemplate = value;
    }

    /**
     * Checks if is is internal.
     * 
     * @return the boolean
     */
    public Boolean isIsInternal() {
        return isInternal;
    }

    /**
     * Sets the checks if is internal.
     * 
     * @param value the new checks if is internal
     */
    public void setIsInternal(Boolean value) {
        this.isInternal = value;
    }

}
