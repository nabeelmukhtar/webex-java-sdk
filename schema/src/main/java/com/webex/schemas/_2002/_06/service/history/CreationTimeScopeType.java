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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class CreationTimeScopeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creationTimeScopeType", propOrder = {
    "creationTimeStart",
    "creationTimeEnd"
})
public class CreationTimeScopeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The creation time start. */
    @XmlElement(required = true)
    protected String creationTimeStart;
    
    /** The creation time end. */
    @XmlElement(required = true)
    protected String creationTimeEnd;

    /**
     * Gets the creation time start.
     * 
     * @return the creation time start
     */
    public String getCreationTimeStart() {
        return creationTimeStart;
    }

    /**
     * Sets the creation time start.
     * 
     * @param value the new creation time start
     */
    public void setCreationTimeStart(String value) {
        this.creationTimeStart = value;
    }

    /**
     * Gets the creation time end.
     * 
     * @return the creation time end
     */
    public String getCreationTimeEnd() {
        return creationTimeEnd;
    }

    /**
     * Sets the creation time end.
     * 
     * @param value the new creation time end
     */
    public void setCreationTimeEnd(String value) {
        this.creationTimeEnd = value;
    }

}
