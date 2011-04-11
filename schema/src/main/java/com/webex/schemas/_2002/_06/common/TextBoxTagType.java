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

package com.webex.schemas._2002._06.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class TextBoxTagType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textBoxTagType", propOrder = {
    "fieldID",
    "lable",
    "isMultiLines",
    "width",
    "height",
    "value",
    "isRequired",
    "isDisplay"
})
public class TextBoxTagType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The field id. */
    protected Long fieldID;
    
    /** The lable. */
    protected String lable;
    
    /** The is multi lines. */
    protected boolean isMultiLines;
    
    /** The width. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long width;
    
    /** The height. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long height;
    
    /** The value. */
    protected String value;
    
    /** The is required. */
    protected boolean isRequired;
    
    /** The is display. */
    protected boolean isDisplay;

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

    /**
     * Gets the lable.
     * 
     * @return the lable
     */
    public String getLable() {
        return lable;
    }

    /**
     * Sets the lable.
     * 
     * @param value the new lable
     */
    public void setLable(String value) {
        this.lable = value;
    }

    /**
     * Checks if is checks if is multi lines.
     * 
     * @return true, if is checks if is multi lines
     */
    public boolean isIsMultiLines() {
        return isMultiLines;
    }

    /**
     * Sets the checks if is multi lines.
     * 
     * @param value the new checks if is multi lines
     */
    public void setIsMultiLines(boolean value) {
        this.isMultiLines = value;
    }

    /**
     * Gets the width.
     * 
     * @return the width
     */
    public Long getWidth() {
        return width;
    }

    /**
     * Sets the width.
     * 
     * @param value the new width
     */
    public void setWidth(Long value) {
        this.width = value;
    }

    /**
     * Gets the height.
     * 
     * @return the height
     */
    public Long getHeight() {
        return height;
    }

    /**
     * Sets the height.
     * 
     * @param value the new height
     */
    public void setHeight(Long value) {
        this.height = value;
    }

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Checks if is checks if is required.
     * 
     * @return true, if is checks if is required
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the checks if is required.
     * 
     * @param value the new checks if is required
     */
    public void setIsRequired(boolean value) {
        this.isRequired = value;
    }

    /**
     * Checks if is checks if is display.
     * 
     * @return true, if is checks if is display
     */
    public boolean isIsDisplay() {
        return isDisplay;
    }

    /**
     * Sets the checks if is display.
     * 
     * @param value the new checks if is display
     */
    public void setIsDisplay(boolean value) {
        this.isDisplay = value;
    }

}
