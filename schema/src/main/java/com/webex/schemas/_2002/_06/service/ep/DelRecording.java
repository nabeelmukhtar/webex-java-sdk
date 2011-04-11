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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class DelRecording.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delRecording", propOrder = {
    "recordingID",
    "isServiceRecording"
})
public class DelRecording
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The recording id. */
    protected int recordingID;
    
    /** The is service recording. */
    protected Boolean isServiceRecording;

    /**
     * Gets the recording id.
     * 
     * @return the recording id
     */
    public int getRecordingID() {
        return recordingID;
    }

    /**
     * Sets the recording id.
     * 
     * @param value the new recording id
     */
    public void setRecordingID(int value) {
        this.recordingID = value;
    }

    /**
     * Checks if is is service recording.
     * 
     * @return the boolean
     */
    public Boolean isIsServiceRecording() {
        return isServiceRecording;
    }

    /**
     * Sets the checks if is service recording.
     * 
     * @param value the new checks if is service recording
     */
    public void setIsServiceRecording(Boolean value) {
        this.isServiceRecording = value;
    }

}
