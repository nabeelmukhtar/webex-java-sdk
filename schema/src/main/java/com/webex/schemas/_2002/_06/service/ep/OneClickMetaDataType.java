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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class OneClickMetaDataType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneClickMetaDataType", propOrder = {
    "confName",
    "sessionPassword",
    "listing",
    "cuvcMeetingID",
    "isInternal"
})
@XmlSeeAlso({
    OcMetaDataType.class
})
public class OneClickMetaDataType
    extends OneClickMetaData
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The conf name. */
    @XmlElement(required = true)
    protected String confName;
    
    /** The session password. */
    protected String sessionPassword;
    
    /** The listing. */
    protected ListingType listing;
    
    /** The cuvc meeting id. */
    @XmlElement(name = "CUVCMeetingID")
    protected String cuvcMeetingID;
    
    /** The is internal. */
    protected Boolean isInternal;

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
     * Gets the session password.
     * 
     * @return the session password
     */
    public String getSessionPassword() {
        return sessionPassword;
    }

    /**
     * Sets the session password.
     * 
     * @param value the new session password
     */
    public void setSessionPassword(String value) {
        this.sessionPassword = value;
    }

    /**
     * Gets the listing.
     * 
     * @return the listing
     */
    public ListingType getListing() {
        return listing;
    }

    /**
     * Sets the listing.
     * 
     * @param value the new listing
     */
    public void setListing(ListingType value) {
        this.listing = value;
    }

    /**
     * Gets the cUVC meeting id.
     * 
     * @return the cUVC meeting id
     */
    public String getCUVCMeetingID() {
        return cuvcMeetingID;
    }

    /**
     * Sets the cUVC meeting id.
     * 
     * @param value the new cUVC meeting id
     */
    public void setCUVCMeetingID(String value) {
        this.cuvcMeetingID = value;
    }

    /**
     * Checks if is is internal.
     * 
     * @return the boolean
     */
    public Boolean isIsInternal() {
        return isInternal;
    }

    /**
     * Sets the checks if is internal.
     * 
     * @param value the new checks if is internal
     */
    public void setIsInternal(Boolean value) {
        this.isInternal = value;
    }

}
