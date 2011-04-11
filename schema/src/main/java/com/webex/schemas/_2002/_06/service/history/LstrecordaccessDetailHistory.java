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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * The Class LstrecordaccessDetailHistory.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstrecordaccessDetailHistory", propOrder = {
    "recordID",
    "listControl",
    "timeZoneID",
    "returnRegFields"
})
public class LstrecordaccessDetailHistory
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The record id. */
    protected Long recordID;
    
    /** The list control. */
    protected LstControlType listControl;
    
    /** The time zone id. */
    @XmlElement(defaultValue = "-1")
    protected Integer timeZoneID;
    
    /** The return reg fields. */
    protected Boolean returnRegFields;

    /**
     * Gets the record id.
     * 
     * @return the record id
     */
    public Long getRecordID() {
        return recordID;
    }

    /**
     * Sets the record id.
     * 
     * @param value the new record id
     */
    public void setRecordID(Long value) {
        this.recordID = value;
    }

    /**
     * Gets the list control.
     * 
     * @return the list control
     */
    public LstControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the list control.
     * 
     * @param value the new list control
     */
    public void setListControl(LstControlType value) {
        this.listControl = value;
    }

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public Integer getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(Integer value) {
        this.timeZoneID = value;
    }

    /**
     * Checks if is return reg fields.
     * 
     * @return the boolean
     */
    public Boolean isReturnRegFields() {
        return returnRegFields;
    }

    /**
     * Sets the return reg fields.
     * 
     * @param value the new return reg fields
     */
    public void setReturnRegFields(Boolean value) {
        this.returnRegFields = value;
    }

}
