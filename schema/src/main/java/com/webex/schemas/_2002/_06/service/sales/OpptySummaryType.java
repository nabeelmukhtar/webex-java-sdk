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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class OpptySummaryType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opptySummaryType", propOrder = {
    "name",
    "intOpptyID",
    "extOpptyID"
})
public class OpptySummaryType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The name. */
    @XmlElement(required = true)
    protected String name;
    
    /** The int oppty id. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long intOpptyID;
    
    /** The ext oppty id. */
    protected String extOpptyID;

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the int oppty id.
     * 
     * @return the int oppty id
     */
    public Long getIntOpptyID() {
        return intOpptyID;
    }

    /**
     * Sets the int oppty id.
     * 
     * @param value the new int oppty id
     */
    public void setIntOpptyID(Long value) {
        this.intOpptyID = value;
    }

    /**
     * Gets the ext oppty id.
     * 
     * @return the ext oppty id
     */
    public String getExtOpptyID() {
        return extOpptyID;
    }

    /**
     * Sets the ext oppty id.
     * 
     * @param value the new ext oppty id
     */
    public void setExtOpptyID(String value) {
        this.extOpptyID = value;
    }

}
