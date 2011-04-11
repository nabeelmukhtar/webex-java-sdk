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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class DelSessionTemplates.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delSessionTemplates", propOrder = {
    "sessionTemplate",
    "templateType"
})
public class DelSessionTemplates
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The session template. */
    @XmlElement(required = true)
    protected List<SessionTemplateType> sessionTemplate;
    
    /** The template type. */
    @XmlElement(defaultValue = "User")
    protected TemplateTypeType templateType;

    /**
     * Gets the session template.
     * 
     * @return the session template
     */
    public List<SessionTemplateType> getSessionTemplate() {
        if (sessionTemplate == null) {
            sessionTemplate = new ArrayList<SessionTemplateType>();
        }
        return this.sessionTemplate;
    }

    /**
     * Gets the template type.
     * 
     * @return the template type
     */
    public TemplateTypeType getTemplateType() {
        return templateType;
    }

    /**
     * Sets the template type.
     * 
     * @param value the new template type
     */
    public void setTemplateType(TemplateTypeType value) {
        this.templateType = value;
    }

}
