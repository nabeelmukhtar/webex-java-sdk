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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EnrollmentFormCreateType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollmentFormCreateType", propOrder = {
    "standardFields",
    "customFields"
})
public class EnrollmentFormCreateType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The standard fields. */
    protected StandardFieldsType standardFields;
    
    /** The custom fields. */
    protected CustomFieldsType customFields;

    /**
     * Gets the standard fields.
     * 
     * @return the standard fields
     */
    public StandardFieldsType getStandardFields() {
        return standardFields;
    }

    /**
     * Sets the standard fields.
     * 
     * @param value the new standard fields
     */
    public void setStandardFields(StandardFieldsType value) {
        this.standardFields = value;
    }

    /**
     * Gets the custom fields.
     * 
     * @return the custom fields
     */
    public CustomFieldsType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the custom fields.
     * 
     * @param value the new custom fields
     */
    public void setCustomFields(CustomFieldsType value) {
        this.customFields = value;
    }

}
