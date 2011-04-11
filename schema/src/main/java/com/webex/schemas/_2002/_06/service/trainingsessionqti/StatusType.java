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

package com.webex.schemas._2002._06.service.trainingsessionqti;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class StatusType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusType", propOrder = {
    "typeLabel",
    "datetime",
    "statusValue"
})
public class StatusType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The type label. */
    @XmlElement(name = "type_label")
    protected StatusType.TypeLabel typeLabel;
    
    /** The datetime. */
    protected String datetime;
    
    /** The status value. */
    @XmlElement(name = "status_value", required = true)
    protected String statusValue;

    /**
     * Gets the type label.
     * 
     * @return the type label
     */
    public StatusType.TypeLabel getTypeLabel() {
        return typeLabel;
    }

    /**
     * Sets the type label.
     * 
     * @param value the new type label
     */
    public void setTypeLabel(StatusType.TypeLabel value) {
        this.typeLabel = value;
    }

    /**
     * Gets the datetime.
     * 
     * @return the datetime
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * Sets the datetime.
     * 
     * @param value the new datetime
     */
    public void setDatetime(String value) {
        this.datetime = value;
    }

    /**
     * Gets the status value.
     * 
     * @return the status value
     */
    public String getStatusValue() {
        return statusValue;
    }

    /**
     * Sets the status value.
     * 
     * @param value the new status value
     */
    public void setStatusValue(String value) {
        this.statusValue = value;
    }


    /**
     * The Class TypeLabel.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TypeLabel
        extends TypeLabelType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;

    }

}
