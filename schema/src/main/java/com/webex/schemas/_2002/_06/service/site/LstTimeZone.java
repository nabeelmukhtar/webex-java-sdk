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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.service.BodyContentType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class LstTimeZone.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstTimeZone", propOrder = {
    "timeZoneID",
    "date"
})
public class LstTimeZone
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The time zone id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected List<Long> timeZoneID;
    
    /** The date. */
    protected String date;

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public List<Long> getTimeZoneID() {
        if (timeZoneID == null) {
            timeZoneID = new ArrayList<Long>();
        }
        return this.timeZoneID;
    }

    /**
     * Gets the date.
     * 
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date.
     * 
     * @param value the new date
     */
    public void setDate(String value) {
        this.date = value;
    }

}
