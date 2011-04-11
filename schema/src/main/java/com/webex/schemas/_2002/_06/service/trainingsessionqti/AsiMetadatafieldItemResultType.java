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

package com.webex.schemas._2002._06.service.trainingsessionqti;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AsiMetadatafieldItemResultType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asi_metadatafield_item_resultType", propOrder = {
    "fieldName",
    "fieldValue"
})
public class AsiMetadatafieldItemResultType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The field name. */
    @XmlElement(name = "field_name", required = true, defaultValue = "question_comments")
    protected String fieldName;
    
    /** The field value. */
    @XmlElement(name = "field_value", required = true)
    protected String fieldValue;

    /**
     * Gets the field name.
     * 
     * @return the field name
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the field name.
     * 
     * @param value the new field name
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the field value.
     * 
     * @return the field value
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the field value.
     * 
     * @param value the new field value
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

}
