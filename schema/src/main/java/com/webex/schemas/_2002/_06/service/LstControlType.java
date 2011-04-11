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

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class LstControlType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstControlType", propOrder = {
    "startFrom",
    "maximumNum",
    "listMethod"
})
public class LstControlType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The start from. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long startFrom;
    
    /** The maximum num. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long maximumNum;
    
    /** The list method. */
    protected LstMethodType listMethod;

    /**
     * Gets the start from.
     * 
     * @return the start from
     */
    public Long getStartFrom() {
        return startFrom;
    }

    /**
     * Sets the start from.
     * 
     * @param value the new start from
     */
    public void setStartFrom(Long value) {
        this.startFrom = value;
    }

    /**
     * Gets the maximum num.
     * 
     * @return the maximum num
     */
    public Long getMaximumNum() {
        return maximumNum;
    }

    /**
     * Sets the maximum num.
     * 
     * @param value the new maximum num
     */
    public void setMaximumNum(Long value) {
        this.maximumNum = value;
    }

    /**
     * Gets the list method.
     * 
     * @return the list method
     */
    public LstMethodType getListMethod() {
        return listMethod;
    }

    /**
     * Sets the list method.
     * 
     * @param value the new list method
     */
    public void setListMethod(LstMethodType value) {
        this.listMethod = value;
    }

}
