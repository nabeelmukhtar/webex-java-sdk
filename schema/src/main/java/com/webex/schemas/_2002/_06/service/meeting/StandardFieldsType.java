
package com.webex.schemas._2002._06.service.meeting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standardFieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="standardFieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone" type="{http://www.webex.com/schemas/2002/06/service/meeting}registrationFieldType" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.webex.com/schemas/2002/06/service/meeting}registrationFieldType" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.webex.com/schemas/2002/06/service/meeting}registrationFieldType" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.webex.com/schemas/2002/06/service/meeting}registrationFieldType" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.webex.com/schemas/2002/06/service/meeting}registrationFieldType" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.webex.com/schemas/2002/06/service/meeting}registrationFieldType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.webex.com/schemas/2002/06/service/meeting}registrationFieldType" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.webex.com/schemas/2002/06/service/meeting}registrationFieldType" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.webex.com/schemas/2002/06/service/meeting}registrationFieldType" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.webex.com/schemas/2002/06/service/meeting}registrationFieldType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standardFieldsType", propOrder = {
    "phone",
    "title",
    "company",
    "address1",
    "address2",
    "city",
    "state",
    "postalCode",
    "country",
    "fax"
})
public class StandardFieldsType {

    protected RegistrationFieldType phone;
    protected RegistrationFieldType title;
    protected RegistrationFieldType company;
    protected RegistrationFieldType address1;
    protected RegistrationFieldType address2;
    protected RegistrationFieldType city;
    protected RegistrationFieldType state;
    protected RegistrationFieldType postalCode;
    protected RegistrationFieldType country;
    protected RegistrationFieldType fax;

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationFieldType }
     *     
     */
    public RegistrationFieldType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationFieldType }
     *     
     */
    public void setPhone(RegistrationFieldType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationFieldType }
     *     
     */
    public RegistrationFieldType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationFieldType }
     *     
     */
    public void setTitle(RegistrationFieldType value) {
        this.title = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationFieldType }
     *     
     */
    public RegistrationFieldType getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationFieldType }
     *     
     */
    public void setCompany(RegistrationFieldType value) {
        this.company = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationFieldType }
     *     
     */
    public RegistrationFieldType getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationFieldType }
     *     
     */
    public void setAddress1(RegistrationFieldType value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationFieldType }
     *     
     */
    public RegistrationFieldType getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationFieldType }
     *     
     */
    public void setAddress2(RegistrationFieldType value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationFieldType }
     *     
     */
    public RegistrationFieldType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationFieldType }
     *     
     */
    public void setCity(RegistrationFieldType value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationFieldType }
     *     
     */
    public RegistrationFieldType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationFieldType }
     *     
     */
    public void setState(RegistrationFieldType value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationFieldType }
     *     
     */
    public RegistrationFieldType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationFieldType }
     *     
     */
    public void setPostalCode(RegistrationFieldType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationFieldType }
     *     
     */
    public RegistrationFieldType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationFieldType }
     *     
     */
    public void setCountry(RegistrationFieldType value) {
        this.country = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationFieldType }
     *     
     */
    public RegistrationFieldType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationFieldType }
     *     
     */
    public void setFax(RegistrationFieldType value) {
        this.fax = value;
    }

}
