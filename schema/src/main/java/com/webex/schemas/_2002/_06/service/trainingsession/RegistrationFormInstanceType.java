
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationFormInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationFormInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardFields" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}standardFieldsType" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}customFieldsInstanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationFormInstanceType", propOrder = {
    "standardFields",
    "customFields"
})
public class RegistrationFormInstanceType {

    protected StandardFieldsType standardFields;
    protected CustomFieldsInstanceType customFields;

    /**
     * Gets the value of the standardFields property.
     * 
     * @return
     *     possible object is
     *     {@link StandardFieldsType }
     *     
     */
    public StandardFieldsType getStandardFields() {
        return standardFields;
    }

    /**
     * Sets the value of the standardFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardFieldsType }
     *     
     */
    public void setStandardFields(StandardFieldsType value) {
        this.standardFields = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldsInstanceType }
     *     
     */
    public CustomFieldsInstanceType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldsInstanceType }
     *     
     */
    public void setCustomFields(CustomFieldsInstanceType value) {
        this.customFields = value;
    }

}
