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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ScheduleOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleOptionsType", propOrder = {
    "scheduleOnBehalf",
    "saveSessionTemplate"
})
public class ScheduleOptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The schedule on behalf. */
    protected Boolean scheduleOnBehalf;
    
    /** The save session template. */
    protected Boolean saveSessionTemplate;

    /**
     * Checks if is schedule on behalf.
     * 
     * @return the boolean
     */
    public Boolean isScheduleOnBehalf() {
        return scheduleOnBehalf;
    }

    /**
     * Sets the schedule on behalf.
     * 
     * @param value the new schedule on behalf
     */
    public void setScheduleOnBehalf(Boolean value) {
        this.scheduleOnBehalf = value;
    }

    /**
     * Checks if is save session template.
     * 
     * @return the boolean
     */
    public Boolean isSaveSessionTemplate() {
        return saveSessionTemplate;
    }

    /**
     * Sets the save session template.
     * 
     * @param value the new save session template
     */
    public void setSaveSessionTemplate(Boolean value) {
        this.saveSessionTemplate = value;
    }

}
