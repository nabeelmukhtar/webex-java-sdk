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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.meeting.TelephonyType;


/**
 * The Class GetJoinSessionInfoResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJoinSessionInfoResponse", propOrder = {
    "siteID",
    "confID",
    "confName",
    "attendeeID",
    "mzmAddress",
    "mccAddress",
    "enableOptions",
    "telephony"
})
public class GetJoinSessionInfoResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The site id. */
    protected long siteID;
    
    /** The conf id. */
    protected long confID;
    
    /** The conf name. */
    @XmlElement(required = true)
    protected String confName;
    
    /** The attendee id. */
    protected long attendeeID;
    
    /** The mzm address. */
    @XmlElement(required = true)
    protected String mzmAddress;
    
    /** The mcc address. */
    @XmlElement(required = true)
    protected String mccAddress;
    
    /** The enable options. */
    protected EnableOptionsType enableOptions;
    
    /** The telephony. */
    protected TelephonyType telephony;

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public long getSiteID() {
        return siteID;
    }

    /**
     * Sets the site id.
     * 
     * @param value the new site id
     */
    public void setSiteID(long value) {
        this.siteID = value;
    }

    /**
     * Gets the conf id.
     * 
     * @return the conf id
     */
    public long getConfID() {
        return confID;
    }

    /**
     * Sets the conf id.
     * 
     * @param value the new conf id
     */
    public void setConfID(long value) {
        this.confID = value;
    }

    /**
     * Gets the conf name.
     * 
     * @return the conf name
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the conf name.
     * 
     * @param value the new conf name
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Gets the attendee id.
     * 
     * @return the attendee id
     */
    public long getAttendeeID() {
        return attendeeID;
    }

    /**
     * Sets the attendee id.
     * 
     * @param value the new attendee id
     */
    public void setAttendeeID(long value) {
        this.attendeeID = value;
    }

    /**
     * Gets the mzm address.
     * 
     * @return the mzm address
     */
    public String getMzmAddress() {
        return mzmAddress;
    }

    /**
     * Sets the mzm address.
     * 
     * @param value the new mzm address
     */
    public void setMzmAddress(String value) {
        this.mzmAddress = value;
    }

    /**
     * Gets the mcc address.
     * 
     * @return the mcc address
     */
    public String getMccAddress() {
        return mccAddress;
    }

    /**
     * Sets the mcc address.
     * 
     * @param value the new mcc address
     */
    public void setMccAddress(String value) {
        this.mccAddress = value;
    }

    /**
     * Gets the enable options.
     * 
     * @return the enable options
     */
    public EnableOptionsType getEnableOptions() {
        return enableOptions;
    }

    /**
     * Sets the enable options.
     * 
     * @param value the new enable options
     */
    public void setEnableOptions(EnableOptionsType value) {
        this.enableOptions = value;
    }

    /**
     * Gets the telephony.
     * 
     * @return the telephony
     */
    public TelephonyType getTelephony() {
        return telephony;
    }

    /**
     * Sets the telephony.
     * 
     * @param value the new telephony
     */
    public void setTelephony(TelephonyType value) {
        this.telephony = value;
    }

}
