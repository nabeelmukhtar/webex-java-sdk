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
 * The Class CheckboxGroupInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkboxGroupInstanceType", propOrder = {
    "fieldID"
})
public class CheckboxGroupInstanceType
    extends CheckboxGroupType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The field id. */
    protected Long fieldID;

    /**
     * Gets the field id.
     * 
     * @return the field id
     */
    public Long getFieldID() {
        return fieldID;
    }

    /**
     * Sets the field id.
     * 
     * @param value the new field id
     */
    public void setFieldID(Long value) {
        this.fieldID = value;
    }

}
