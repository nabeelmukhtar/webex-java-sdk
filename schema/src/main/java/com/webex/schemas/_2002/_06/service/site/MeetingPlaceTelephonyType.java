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


/**
 * The Class MeetingPlaceTelephonyType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingPlaceTelephonyType", propOrder = {
    "persistentTSP",
    "mpAudioConferencing"
})
public class MeetingPlaceTelephonyType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The persistent tsp. */
    protected boolean persistentTSP;
    
    /** The mp audio conferencing. */
    @XmlElement(required = true)
    protected DirectoryServiceType mpAudioConferencing;

    /**
     * Checks if is persistent tsp.
     * 
     * @return true, if is persistent tsp
     */
    public boolean isPersistentTSP() {
        return persistentTSP;
    }

    /**
     * Sets the persistent tsp.
     * 
     * @param value the new persistent tsp
     */
    public void setPersistentTSP(boolean value) {
        this.persistentTSP = value;
    }

    /**
     * Gets the mp audio conferencing.
     * 
     * @return the mp audio conferencing
     */
    public DirectoryServiceType getMpAudioConferencing() {
        return mpAudioConferencing;
    }

    /**
     * Sets the mp audio conferencing.
     * 
     * @param value the new mp audio conferencing
     */
    public void setMpAudioConferencing(DirectoryServiceType value) {
        this.mpAudioConferencing = value;
    }

}
