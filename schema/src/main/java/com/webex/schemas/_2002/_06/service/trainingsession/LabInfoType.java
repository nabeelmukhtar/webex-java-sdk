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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class LabInfoType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "labInfoType", propOrder = {
    "labName",
    "description",
    "totalComputers",
    "computersInSession"
})
public class LabInfoType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The lab name. */
    @XmlElement(required = true)
    protected String labName;
    
    /** The description. */
    protected String description;
    
    /** The total computers. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long totalComputers;
    
    /** The computers in session. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long computersInSession;

    /**
     * Gets the lab name.
     * 
     * @return the lab name
     */
    public String getLabName() {
        return labName;
    }

    /**
     * Sets the lab name.
     * 
     * @param value the new lab name
     */
    public void setLabName(String value) {
        this.labName = value;
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
     * Gets the total computers.
     * 
     * @return the total computers
     */
    public Long getTotalComputers() {
        return totalComputers;
    }

    /**
     * Sets the total computers.
     * 
     * @param value the new total computers
     */
    public void setTotalComputers(Long value) {
        this.totalComputers = value;
    }

    /**
     * Gets the computers in session.
     * 
     * @return the computers in session
     */
    public Long getComputersInSession() {
        return computersInSession;
    }

    /**
     * Sets the computers in session.
     * 
     * @param value the new computers in session
     */
    public void setComputersInSession(Long value) {
        this.computersInSession = value;
    }

}
