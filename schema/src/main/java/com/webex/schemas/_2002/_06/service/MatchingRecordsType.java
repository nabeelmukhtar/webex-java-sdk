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
 * The Class MatchingRecordsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchingRecordsType", propOrder = {
    "total",
    "returned",
    "startFrom"
})
public class MatchingRecordsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The total. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long total;
    
    /** The returned. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long returned;
    
    /** The start from. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long startFrom;

    /**
     * Gets the total.
     * 
     * @return the total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * Sets the total.
     * 
     * @param value the new total
     */
    public void setTotal(Long value) {
        this.total = value;
    }

    /**
     * Gets the returned.
     * 
     * @return the returned
     */
    public Long getReturned() {
        return returned;
    }

    /**
     * Sets the returned.
     * 
     * @param value the new returned
     */
    public void setReturned(Long value) {
        this.returned = value;
    }

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

}
