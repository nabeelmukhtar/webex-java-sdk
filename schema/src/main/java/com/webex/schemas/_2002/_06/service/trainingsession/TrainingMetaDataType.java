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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.SessionTemplateType;
import com.webex.schemas._2002._06.service.session.MetaDataType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class TrainingMetaDataType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainingMetaDataType", propOrder = {
    "agenda",
    "description",
    "greeting",
    "location",
    "invitation",
    "sessionType",
    "defaultHighestMT",
    "sessionTemplate",
    "enableGreeting"
})
public class TrainingMetaDataType
    extends MetaDataType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The agenda. */
    protected String agenda;
    
    /** The description. */
    protected String description;
    
    /** The greeting. */
    protected String greeting;
    
    /** The location. */
    protected String location;
    
    /** The invitation. */
    protected String invitation;
    
    /** The session type. */
    @XmlElement(type = String.class, defaultValue = "-1")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long sessionType;
    
    /** The default highest mt. */
    @XmlElement(defaultValue = "true")
    protected Boolean defaultHighestMT;
    
    /** The session template. */
    protected SessionTemplateType sessionTemplate;
    
    /** The enable greeting. */
    protected Boolean enableGreeting;

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
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param value the new description
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the session type.
     * 
     * @return the session type
     */
    public Long getSessionType() {
        return sessionType;
    }

    /**
     * Sets the session type.
     * 
     * @param value the new session type
     */
    public void setSessionType(Long value) {
        this.sessionType = value;
    }

    /**
     * Checks if is default highest mt.
     * 
     * @return the boolean
     */
    public Boolean isDefaultHighestMT() {
        return defaultHighestMT;
    }

    /**
     * Sets the default highest mt.
     * 
     * @param value the new default highest mt
     */
    public void setDefaultHighestMT(Boolean value) {
        this.defaultHighestMT = value;
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
     * Checks if is enable greeting.
     * 
     * @return the boolean
     */
    public Boolean isEnableGreeting() {
        return enableGreeting;
    }

    /**
     * Sets the enable greeting.
     * 
     * @param value the new enable greeting
     */
    public void setEnableGreeting(Boolean value) {
        this.enableGreeting = value;
    }

}
