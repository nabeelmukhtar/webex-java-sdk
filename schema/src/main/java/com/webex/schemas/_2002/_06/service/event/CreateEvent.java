
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}eventType">
 *       &lt;sequence>
 *         &lt;element name="enrollment" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentType" minOccurs="0"/>
 *         &lt;element name="enrollmentForm" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFormCreateType" minOccurs="0"/>
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
@XmlType(name = "createEvent", propOrder = {
    "enrollment",
    "enrollmentForm",
    "validateFormat"
})
public class CreateEvent
    extends EventType
{

    protected EnrollmentType enrollment;
    protected EnrollmentFormCreateType enrollmentForm;
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
     *     {@link EnrollmentFormCreateType }
     *     
     */
    public EnrollmentFormCreateType getEnrollmentForm() {
        return enrollmentForm;
    }

    /**
     * Sets the value of the enrollmentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFormCreateType }
     *     
     */
    public void setEnrollmentForm(EnrollmentFormCreateType value) {
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
