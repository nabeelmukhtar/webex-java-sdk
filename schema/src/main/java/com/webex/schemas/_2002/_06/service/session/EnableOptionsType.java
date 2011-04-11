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

package com.webex.schemas._2002._06.service.session;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.trainingsession.TrainingEnableOptionsType;


/**
 * The Class EnableOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableOptionsType", propOrder = {
    "attendeeList",
    "javaClient",
    "nativeClient"
})
@XmlSeeAlso({
    TrainingEnableOptionsType.class
})
public class EnableOptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The attendee list. */
    @XmlElement(defaultValue = "false")
    protected Boolean attendeeList;
    
    /** The java client. */
    @XmlElement(defaultValue = "false")
    protected Boolean javaClient;
    
    /** The native client. */
    @XmlElement(defaultValue = "true")
    protected Boolean nativeClient;

    /**
     * Checks if is attendee list.
     * 
     * @return the boolean
     */
    public Boolean isAttendeeList() {
        return attendeeList;
    }

    /**
     * Sets the attendee list.
     * 
     * @param value the new attendee list
     */
    public void setAttendeeList(Boolean value) {
        this.attendeeList = value;
    }

    /**
     * Checks if is java client.
     * 
     * @return the boolean
     */
    public Boolean isJavaClient() {
        return javaClient;
    }

    /**
     * Sets the java client.
     * 
     * @param value the new java client
     */
    public void setJavaClient(Boolean value) {
        this.javaClient = value;
    }

    /**
     * Checks if is native client.
     * 
     * @return the boolean
     */
    public Boolean isNativeClient() {
        return nativeClient;
    }

    /**
     * Sets the native client.
     * 
     * @param value the new native client
     */
    public void setNativeClient(Boolean value) {
        this.nativeClient = value;
    }

}
