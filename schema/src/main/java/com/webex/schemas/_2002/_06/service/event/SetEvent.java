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
 * <p>Java class for setEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}eventInstanceType">
 *       &lt;sequence>
 *         &lt;element name="enrollment" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentType" minOccurs="0"/>
 *         &lt;element name="enrollmentForm" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFormSetType" minOccurs="0"/>
 *         &lt;element name="validateFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected EnrollmentType enrollment;
    protected EnrollmentFormSetType enrollmentForm;
    protected Boolean validateFormat;

    /**
     * Gets the value of the enrollment property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentType }
     *     
     */
    public EnrollmentType getEnrollment() {
        return enrollment;
    }

    /**
     * Sets the value of the enrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentType }
     *     
     */
    public void setEnrollment(EnrollmentType value) {
        this.enrollment = value;
    }

    /**
     * Gets the value of the enrollmentForm property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFormSetType }
     *     
     */
    public EnrollmentFormSetType getEnrollmentForm() {
        return enrollmentForm;
    }

    /**
     * Sets the value of the enrollmentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFormSetType }
     *     
     */
    public void setEnrollmentForm(EnrollmentFormSetType value) {
        this.enrollmentForm = value;
    }

    /**
     * Gets the value of the validateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateFormat() {
        return validateFormat;
    }

    /**
     * Sets the value of the validateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateFormat(Boolean value) {
        this.validateFormat = value;
    }

}
