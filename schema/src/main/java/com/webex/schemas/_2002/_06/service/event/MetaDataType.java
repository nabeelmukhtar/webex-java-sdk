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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.SessionTemplateType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class MetaDataType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaDataType", propOrder = {
    "sessionName",
    "sessionType",
    "description",
    "defaultHighestMT",
    "sessionTemplate",
    "programID",
    "postEventSurvey"
})
public class MetaDataType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session name. */
    protected String sessionName;
    
    /** The session type. */
    @XmlElement(type = String.class, defaultValue = "-1")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long sessionType;
    
    /** The description. */
    protected String description;
    
    /** The default highest mt. */
    @XmlElement(defaultValue = "true")
    protected Boolean defaultHighestMT;
    
    /** The session template. */
    protected SessionTemplateType sessionTemplate;
    
    /** The program id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long programID;
    
    /** The post event survey. */
    protected PostEventSurveyType postEventSurvey;

    /**
     * Gets the session name.
     * 
     * @return the session name
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Sets the session name.
     * 
     * @param value the new session name
     */
    public void setSessionName(String value) {
        this.sessionName = value;
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
     * Gets the program id.
     * 
     * @return the program id
     */
    public Long getProgramID() {
        return programID;
    }

    /**
     * Sets the program id.
     * 
     * @param value the new program id
     */
    public void setProgramID(Long value) {
        this.programID = value;
    }

    /**
     * Gets the post event survey.
     * 
     * @return the post event survey
     */
    public PostEventSurveyType getPostEventSurvey() {
        return postEventSurvey;
    }

    /**
     * Sets the post event survey.
     * 
     * @param value the new post event survey
     */
    public void setPostEventSurvey(PostEventSurveyType value) {
        this.postEventSurvey = value;
    }

}
