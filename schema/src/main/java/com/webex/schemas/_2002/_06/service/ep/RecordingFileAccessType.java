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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class RecordingFileAccessType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordingFileAccessType", propOrder = {
    "registration",
    "attendeeView",
    "attendeeDownload",
    "endPlayURL"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.ep.GetRecordingInfoResponse.FileAccess.class
})
public class RecordingFileAccessType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The registration. */
    protected Boolean registration;
    
    /** The attendee view. */
    protected Boolean attendeeView;
    
    /** The attendee download. */
    protected Boolean attendeeDownload;
    
    /** The end play url. */
    protected String endPlayURL;

    /**
     * Checks if is registration.
     * 
     * @return the boolean
     */
    public Boolean isRegistration() {
        return registration;
    }

    /**
     * Sets the registration.
     * 
     * @param value the new registration
     */
    public void setRegistration(Boolean value) {
        this.registration = value;
    }

    /**
     * Checks if is attendee view.
     * 
     * @return the boolean
     */
    public Boolean isAttendeeView() {
        return attendeeView;
    }

    /**
     * Sets the attendee view.
     * 
     * @param value the new attendee view
     */
    public void setAttendeeView(Boolean value) {
        this.attendeeView = value;
    }

    /**
     * Checks if is attendee download.
     * 
     * @return the boolean
     */
    public Boolean isAttendeeDownload() {
        return attendeeDownload;
    }

    /**
     * Sets the attendee download.
     * 
     * @param value the new attendee download
     */
    public void setAttendeeDownload(Boolean value) {
        this.attendeeDownload = value;
    }

    /**
     * Gets the end play url.
     * 
     * @return the end play url
     */
    public String getEndPlayURL() {
        return endPlayURL;
    }

    /**
     * Sets the end play url.
     * 
     * @param value the new end play url
     */
    public void setEndPlayURL(String value) {
        this.endPlayURL = value;
    }

}
