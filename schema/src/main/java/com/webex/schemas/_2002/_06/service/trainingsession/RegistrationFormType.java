
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardFields" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}standardFieldsType" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}customFieldsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationFormType", propOrder = {
    "standardFields",
    "customFields"
})
public class RegistrationFormType {

    protected StandardFieldsType standardFields;
    protected CustomFieldsType customFields;

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
     *     {@link CustomFieldsType }
     *     
     */
    public CustomFieldsType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldsType }
     *     
     */
    public void setCustomFields(CustomFieldsType value) {
        this.customFields = value;
    }

}
