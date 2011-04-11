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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AttendeeCountType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attendeeCountType", propOrder = {
    "estEnrollment",
    "estAttendance",
    "source"
})
public class AttendeeCountType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The est enrollment. */
    protected long estEnrollment;
    
    /** The est attendance. */
    protected long estAttendance;
    
    /** The source. */
    protected List<SourceType> source;

    /**
     * Gets the est enrollment.
     * 
     * @return the est enrollment
     */
    public long getEstEnrollment() {
        return estEnrollment;
    }

    /**
     * Sets the est enrollment.
     * 
     * @param value the new est enrollment
     */
    public void setEstEnrollment(long value) {
        this.estEnrollment = value;
    }

    /**
     * Gets the est attendance.
     * 
     * @return the est attendance
     */
    public long getEstAttendance() {
        return estAttendance;
    }

    /**
     * Sets the est attendance.
     * 
     * @param value the new est attendance
     */
    public void setEstAttendance(long value) {
        this.estAttendance = value;
    }

    /**
     * Gets the source.
     * 
     * @return the source
     */
    public List<SourceType> getSource() {
        if (source == null) {
            source = new ArrayList<SourceType>();
        }
        return this.source;
    }

}
