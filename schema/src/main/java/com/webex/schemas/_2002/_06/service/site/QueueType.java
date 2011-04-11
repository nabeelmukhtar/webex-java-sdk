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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.WebACDRoleType;


/**
 * The Class QueueType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queueType", propOrder = {
    "name",
    "numUsers",
    "modDate",
    "type"
})
public class QueueType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The name. */
    @XmlElement(required = true)
    protected String name;
    
    /** The num users. */
    protected Integer numUsers;
    
    /** The mod date. */
    protected String modDate;
    
    /** The type. */
    protected WebACDRoleType type;

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
     * Gets the num users.
     * 
     * @return the num users
     */
    public Integer getNumUsers() {
        return numUsers;
    }

    /**
     * Sets the num users.
     * 
     * @param value the new num users
     */
    public void setNumUsers(Integer value) {
        this.numUsers = value;
    }

    /**
     * Gets the mod date.
     * 
     * @return the mod date
     */
    public String getModDate() {
        return modDate;
    }

    /**
     * Sets the mod date.
     * 
     * @param value the new mod date
     */
    public void setModDate(String value) {
        this.modDate = value;
    }

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public WebACDRoleType getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param value the new type
     */
    public void setType(WebACDRoleType value) {
        this.type = value;
    }

}
