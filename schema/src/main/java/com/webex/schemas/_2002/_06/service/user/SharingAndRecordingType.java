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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.RecordingType;
import com.webex.schemas._2002._06.common.SharingViewType;


/**
 * The Class SharingAndRecordingType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sharingAndRecordingType", propOrder = {
    "sharingView",
    "sharingColor",
    "recording"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.user.UserType.RemoteSupport.class
})
public class SharingAndRecordingType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The sharing view. */
    protected SharingViewType sharingView;
    
    /** The sharing color. */
    protected String sharingColor;
    
    /** The recording. */
    protected SharingAndRecordingType.Recording recording;

    /**
     * Gets the sharing view.
     * 
     * @return the sharing view
     */
    public SharingViewType getSharingView() {
        return sharingView;
    }

    /**
     * Sets the sharing view.
     * 
     * @param value the new sharing view
     */
    public void setSharingView(SharingViewType value) {
        this.sharingView = value;
    }

    /**
     * Gets the sharing color.
     * 
     * @return the sharing color
     */
    public String getSharingColor() {
        return sharingColor;
    }

    /**
     * Sets the sharing color.
     * 
     * @param value the new sharing color
     */
    public void setSharingColor(String value) {
        this.sharingColor = value;
    }

    /**
     * Gets the recording.
     * 
     * @return the recording
     */
    public SharingAndRecordingType.Recording getRecording() {
        return recording;
    }

    /**
     * Sets the recording.
     * 
     * @param value the new recording
     */
    public void setRecording(SharingAndRecordingType.Recording value) {
        this.recording = value;
    }


    /**
     * The Class Recording.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enforce",
        "type",
        "location"
    })
    public static class Recording
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The enforce. */
        protected boolean enforce;
        
        /** The type. */
        protected RecordingType type;
        
        /** The location. */
        protected String location;

        /**
         * Checks if is enforce.
         * 
         * @return true, if is enforce
         */
        public boolean isEnforce() {
            return enforce;
        }

        /**
         * Sets the enforce.
         * 
         * @param value the new enforce
         */
        public void setEnforce(boolean value) {
            this.enforce = value;
        }

        /**
         * Gets the type.
         * 
         * @return the type
         */
        public RecordingType getType() {
            return type;
        }

        /**
         * Sets the type.
         * 
         * @param value the new type
         */
        public void setType(RecordingType value) {
            this.type = value;
        }

        /**
         * Gets the location.
         * 
         * @return the location
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the location.
         * 
         * @param value the new location
         */
        public void setLocation(String value) {
            this.location = value;
        }

    }

}
