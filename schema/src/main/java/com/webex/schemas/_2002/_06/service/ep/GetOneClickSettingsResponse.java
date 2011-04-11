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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class GetOneClickSettingsResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOneClickSettingsResponse", propOrder = {
    "metaData",
    "trackingCodes",
    "telephony",
    "enableOptions",
    "attendeeOptions"
})
public class GetOneClickSettingsResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meta data. */
    protected OcMetaDataType metaData;
    
    /** The tracking codes. */
    protected GetOneClickSettingsResponse.TrackingCodes trackingCodes;
    
    /** The telephony. */
    protected OneClickTelephonyType telephony;
    
    /** The enable options. */
    protected OneClickEnableOptionsType enableOptions;
    
    /** The attendee options. */
    protected AttendeeOptionsType attendeeOptions;

    /**
     * Gets the meta data.
     * 
     * @return the meta data
     */
    public OcMetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the meta data.
     * 
     * @param value the new meta data
     */
    public void setMetaData(OcMetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the tracking codes.
     * 
     * @return the tracking codes
     */
    public GetOneClickSettingsResponse.TrackingCodes getTrackingCodes() {
        return trackingCodes;
    }

    /**
     * Sets the tracking codes.
     * 
     * @param value the new tracking codes
     */
    public void setTrackingCodes(GetOneClickSettingsResponse.TrackingCodes value) {
        this.trackingCodes = value;
    }

    /**
     * Gets the telephony.
     * 
     * @return the telephony
     */
    public OneClickTelephonyType getTelephony() {
        return telephony;
    }

    /**
     * Sets the telephony.
     * 
     * @param value the new telephony
     */
    public void setTelephony(OneClickTelephonyType value) {
        this.telephony = value;
    }

    /**
     * Gets the enable options.
     * 
     * @return the enable options
     */
    public OneClickEnableOptionsType getEnableOptions() {
        return enableOptions;
    }

    /**
     * Sets the enable options.
     * 
     * @param value the new enable options
     */
    public void setEnableOptions(OneClickEnableOptionsType value) {
        this.enableOptions = value;
    }

    /**
     * Gets the attendee options.
     * 
     * @return the attendee options
     */
    public AttendeeOptionsType getAttendeeOptions() {
        return attendeeOptions;
    }

    /**
     * Sets the attendee options.
     * 
     * @param value the new attendee options
     */
    public void setAttendeeOptions(AttendeeOptionsType value) {
        this.attendeeOptions = value;
    }


    /**
     * The Class TrackingCodes.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trackingCode"
    })
    public static class TrackingCodes
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The tracking code. */
        protected List<OneClickTrackingCodeType> trackingCode;

        /**
         * Gets the tracking code.
         * 
         * @return the tracking code
         */
        public List<OneClickTrackingCodeType> getTrackingCode() {
            if (trackingCode == null) {
                trackingCode = new ArrayList<OneClickTrackingCodeType>();
            }
            return this.trackingCode;
        }

    }

}
