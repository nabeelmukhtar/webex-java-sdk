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

package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class QtimetadatafieldType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qtimetadatafieldType", propOrder = {
    "fieldlabel",
    "fieldentry"
})
public class QtimetadatafieldType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The fieldlabel. */
    @XmlElement(required = true)
    protected String fieldlabel;
    
    /** The fieldentry. */
    @XmlElement(required = true)
    protected String fieldentry;

    /**
     * Gets the fieldlabel.
     * 
     * @return the fieldlabel
     */
    public String getFieldlabel() {
        return fieldlabel;
    }

    /**
     * Sets the fieldlabel.
     * 
     * @param value the new fieldlabel
     */
    public void setFieldlabel(String value) {
        this.fieldlabel = value;
    }

    /**
     * Gets the fieldentry.
     * 
     * @return the fieldentry
     */
    public String getFieldentry() {
        return fieldentry;
    }

    /**
     * Sets the fieldentry.
     * 
     * @param value the new fieldentry
     */
    public void setFieldentry(String value) {
        this.fieldentry = value;
    }

}
