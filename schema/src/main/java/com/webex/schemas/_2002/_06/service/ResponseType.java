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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ResponseType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseType", propOrder = {
    "result",
    "reason",
    "gsbStatus",
    "exceptionID",
    "subErrors",
    "value"
})
public class ResponseType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The result. */
    @XmlElement(required = true)
    protected ResultTypeType result;
    
    /** The reason. */
    protected String reason;
    
    /** The gsb status. */
    protected GsbStatusType gsbStatus;
    
    /** The exception id. */
    protected String exceptionID;
    
    /** The sub errors. */
    protected ResponseType.SubErrors subErrors;
    
    /** The value. */
    protected String value;

    /**
     * Gets the result.
     * 
     * @return the result
     */
    public ResultTypeType getResult() {
        return result;
    }

    /**
     * Sets the result.
     * 
     * @param value the new result
     */
    public void setResult(ResultTypeType value) {
        this.result = value;
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
     * Gets the gsb status.
     * 
     * @return the gsb status
     */
    public GsbStatusType getGsbStatus() {
        return gsbStatus;
    }

    /**
     * Sets the gsb status.
     * 
     * @param value the new gsb status
     */
    public void setGsbStatus(GsbStatusType value) {
        this.gsbStatus = value;
    }

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
     * Gets the sub errors.
     * 
     * @return the sub errors
     */
    public ResponseType.SubErrors getSubErrors() {
        return subErrors;
    }

    /**
     * Sets the sub errors.
     * 
     * @param value the new sub errors
     */
    public void setSubErrors(ResponseType.SubErrors value) {
        this.subErrors = value;
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


    /**
     * The Class SubErrors.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subError"
    })
    public static class SubErrors
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The sub error. */
        @XmlElement(required = true)
        protected List<SubErrorType> subError;

        /**
         * Gets the sub error.
         * 
         * @return the sub error
         */
        public List<SubErrorType> getSubError() {
            if (subError == null) {
                subError = new ArrayList<SubErrorType>();
            }
            return this.subError;
        }

    }

}
