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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class SetEvent.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setEvent", propOrder = {
    "enrollment",
    "enrollmentForm",
    "validateFormat"
})
public class SetEvent
    extends EventInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The enrollment. */
    protected EnrollmentType enrollment;
    
    /** The enrollment form. */
    protected EnrollmentFormSetType enrollmentForm;
    
    /** The validate format. */
    protected Boolean validateFormat;

    /**
     * Gets the enrollment.
     * 
     * @return the enrollment
     */
    public EnrollmentType getEnrollment() {
        return enrollment;
    }

    /**
     * Sets the enrollment.
     * 
     * @param value the new enrollment
     */
    public void setEnrollment(EnrollmentType value) {
        this.enrollment = value;
    }

    /**
     * Gets the enrollment form.
     * 
     * @return the enrollment form
     */
    public EnrollmentFormSetType getEnrollmentForm() {
        return enrollmentForm;
    }

    /**
     * Sets the enrollment form.
     * 
     * @param value the new enrollment form
     */
    public void setEnrollmentForm(EnrollmentFormSetType value) {
        this.enrollmentForm = value;
    }

    /**
     * Checks if is validate format.
     * 
     * @return the boolean
     */
    public Boolean isValidateFormat() {
        return validateFormat;
    }

    /**
     * Sets the validate format.
     * 
     * @param value the new validate format
     */
    public void setValidateFormat(Boolean value) {
        this.validateFormat = value;
    }

}
