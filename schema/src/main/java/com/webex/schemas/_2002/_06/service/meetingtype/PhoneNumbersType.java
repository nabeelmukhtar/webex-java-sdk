
package com.webex.schemas._2002._06.service.meetingtype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoneNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoneNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryTollCallInNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryTollFreeCallInNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneNumbersType", propOrder = {
    "primaryTollCallInNumber",
    "primaryTollFreeCallInNumber"
})
public class PhoneNumbersType {

    protected String primaryTollCallInNumber;
    protected String primaryTollFreeCallInNumber;

    /**
     * Gets the value of the primaryTollCallInNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryTollCallInNumber() {
        return primaryTollCallInNumber;
    }

    /**
     * Sets the value of the primaryTollCallInNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryTollCallInNumber(String value) {
        this.primaryTollCallInNumber = value;
    }

    /**
     * Gets the value of the primaryTollFreeCallInNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryTollFreeCallInNumber() {
        return primaryTollFreeCallInNumber;
    }

    /**
     * Sets the value of the primaryTollFreeCallInNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryTollFreeCallInNumber(String value) {
        this.primaryTollFreeCallInNumber = value;
    }

}
