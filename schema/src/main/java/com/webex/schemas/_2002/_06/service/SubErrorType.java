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

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SubErrorType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subErrorType", propOrder = {
    "exceptionID",
    "reason",
    "value"
})
public class SubErrorType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The exception id. */
    @XmlElement(required = true)
    protected String exceptionID;
    
    /** The reason. */
    @XmlElement(required = true)
    protected String reason;
    
    /** The value. */
    protected String value;

    /**
     * Gets the exception id.
     * 
     * @return the exception id
     */
    public String getExceptionID() {
        return exceptionID;
    }

    /**
     * Sets the exception id.
     * 
     * @param value the new exception id
     */
    public void setExceptionID(String value) {
        this.exceptionID = value;
    }

    /**
     * Gets the reason.
     * 
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the reason.
     * 
     * @param value the new reason
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public void setValue(String value) {
        this.value = value;
    }

}
