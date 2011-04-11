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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class TimeZoneType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeZoneType", propOrder = {
    "timeZoneID",
    "gmtOffset",
    "description",
    "shortName",
    "hideTimeZoneName",
    "fallInDST",
    "standardLabel",
    "daylightLabel"
})
public class TimeZoneType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The time zone id. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long timeZoneID;
    
    /** The gmt offset. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long gmtOffset;
    
    /** The description. */
    @XmlElement(required = true)
    protected String description;
    
    /** The short name. */
    protected String shortName;
    
    /** The hide time zone name. */
    protected Boolean hideTimeZoneName;
    
    /** The fall in dst. */
    protected Boolean fallInDST;
    
    /** The standard label. */
    protected String standardLabel;
    
    /** The daylight label. */
    protected String daylightLabel;

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public Long getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(Long value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the gmt offset.
     * 
     * @return the gmt offset
     */
    public Long getGmtOffset() {
        return gmtOffset;
    }

    /**
     * Sets the gmt offset.
     * 
     * @param value the new gmt offset
     */
    public void setGmtOffset(Long value) {
        this.gmtOffset = value;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param value the new description
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the short name.
     * 
     * @return the short name
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the short name.
     * 
     * @param value the new short name
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Checks if is hide time zone name.
     * 
     * @return the boolean
     */
    public Boolean isHideTimeZoneName() {
        return hideTimeZoneName;
    }

    /**
     * Sets the hide time zone name.
     * 
     * @param value the new hide time zone name
     */
    public void setHideTimeZoneName(Boolean value) {
        this.hideTimeZoneName = value;
    }

    /**
     * Checks if is fall in dst.
     * 
     * @return the boolean
     */
    public Boolean isFallInDST() {
        return fallInDST;
    }

    /**
     * Sets the fall in dst.
     * 
     * @param value the new fall in dst
     */
    public void setFallInDST(Boolean value) {
        this.fallInDST = value;
    }

    /**
     * Gets the standard label.
     * 
     * @return the standard label
     */
    public String getStandardLabel() {
        return standardLabel;
    }

    /**
     * Sets the standard label.
     * 
     * @param value the new standard label
     */
    public void setStandardLabel(String value) {
        this.standardLabel = value;
    }

    /**
     * Gets the daylight label.
     * 
     * @return the daylight label
     */
    public String getDaylightLabel() {
        return daylightLabel;
    }

    /**
     * Sets the daylight label.
     * 
     * @param value the new daylight label
     */
    public void setDaylightLabel(String value) {
        this.daylightLabel = value;
    }

}
