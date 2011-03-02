
package com.webex.schemas._2002._06.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for globalCallInNumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="globalCallInNumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tollFree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "globalCallInNumType", propOrder = {
    "countryAlias",
    "phoneNumber",
    "tollFree"
})
public class GlobalCallInNumType {

    @XmlElement(required = true)
    protected String countryAlias;
    @XmlElement(required = true)
    protected String phoneNumber;
    protected boolean tollFree;

    /**
     * Gets the value of the countryAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryAlias() {
        return countryAlias;
    }

    /**
     * Sets the value of the countryAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryAlias(String value) {
        this.countryAlias = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the tollFree property.
     * 
     */
    public boolean isTollFree() {
        return tollFree;
    }

    /**
     * Sets the value of the tollFree property.
     * 
     */
    public void setTollFree(boolean value) {
        this.tollFree = value;
    }

}
