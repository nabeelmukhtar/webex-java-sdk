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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ProgramSummaryType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "programSummaryType", propOrder = {
    "programID",
    "programName",
    "hostWebExID",
    "expectedEnrollment",
    "budget",
    "status",
    "programURL",
    "afterEnrollmentURL"
})
public class ProgramSummaryType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The program id. */
    protected long programID;
    
    /** The program name. */
    @XmlElement(required = true)
    protected String programName;
    
    /** The host web ex id. */
    @XmlElement(required = true)
    protected String hostWebExID;
    
    /** The expected enrollment. */
    protected String expectedEnrollment;
    
    /** The budget. */
    protected String budget;
    
    /** The status. */
    protected ListingType status;
    
    /** The program url. */
    protected String programURL;
    
    /** The after enrollment url. */
    protected String afterEnrollmentURL;

    /**
     * Gets the program id.
     * 
     * @return the program id
     */
    public long getProgramID() {
        return programID;
    }

    /**
     * Sets the program id.
     * 
     * @param value the new program id
     */
    public void setProgramID(long value) {
        this.programID = value;
    }

    /**
     * Gets the program name.
     * 
     * @return the program name
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the program name.
     * 
     * @param value the new program name
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the host web ex id.
     * 
     * @return the host web ex id
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the host web ex id.
     * 
     * @param value the new host web ex id
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

    /**
     * Gets the expected enrollment.
     * 
     * @return the expected enrollment
     */
    public String getExpectedEnrollment() {
        return expectedEnrollment;
    }

    /**
     * Sets the expected enrollment.
     * 
     * @param value the new expected enrollment
     */
    public void setExpectedEnrollment(String value) {
        this.expectedEnrollment = value;
    }

    /**
     * Gets the budget.
     * 
     * @return the budget
     */
    public String getBudget() {
        return budget;
    }

    /**
     * Sets the budget.
     * 
     * @param value the new budget
     */
    public void setBudget(String value) {
        this.budget = value;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public ListingType getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(ListingType value) {
        this.status = value;
    }

    /**
     * Gets the program url.
     * 
     * @return the program url
     */
    public String getProgramURL() {
        return programURL;
    }

    /**
     * Sets the program url.
     * 
     * @param value the new program url
     */
    public void setProgramURL(String value) {
        this.programURL = value;
    }

    /**
     * Gets the after enrollment url.
     * 
     * @return the after enrollment url
     */
    public String getAfterEnrollmentURL() {
        return afterEnrollmentURL;
    }

    /**
     * Sets the after enrollment url.
     * 
     * @param value the new after enrollment url
     */
    public void setAfterEnrollmentURL(String value) {
        this.afterEnrollmentURL = value;
    }

}
