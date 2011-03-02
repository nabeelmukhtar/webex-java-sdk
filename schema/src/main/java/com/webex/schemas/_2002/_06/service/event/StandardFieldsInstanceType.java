
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standardFieldsInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="standardFieldsInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType"/>
 *         &lt;element name="lastName" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType"/>
 *         &lt;element name="emailAddress" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType"/>
 *         &lt;element name="phone" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *         &lt;element name="numEmployees" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *         &lt;element name="futureInfo" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldInstanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standardFieldsInstanceType", propOrder = {
    "firstName",
    "lastName",
    "emailAddress",
    "phone",
    "company",
    "title",
    "numEmployees",
    "futureInfo",
    "address1",
    "address2",
    "city",
    "state",
    "postalCode",
    "country"
})
public class StandardFieldsInstanceType {

    @XmlElement(required = true)
    protected EnrollmentFieldInstanceType firstName;
    @XmlElement(required = true)
    protected EnrollmentFieldInstanceType lastName;
    @XmlElement(required = true)
    protected EnrollmentFieldInstanceType emailAddress;
    protected EnrollmentFieldInstanceType phone;
    protected EnrollmentFieldInstanceType company;
    protected EnrollmentFieldInstanceType title;
    protected EnrollmentFieldInstanceType numEmployees;
    protected EnrollmentFieldInstanceType futureInfo;
    protected EnrollmentFieldInstanceType address1;
    protected EnrollmentFieldInstanceType address2;
    protected EnrollmentFieldInstanceType city;
    protected EnrollmentFieldInstanceType state;
    protected EnrollmentFieldInstanceType postalCode;
    protected EnrollmentFieldInstanceType country;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setFirstName(EnrollmentFieldInstanceType value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setLastName(EnrollmentFieldInstanceType value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setEmailAddress(EnrollmentFieldInstanceType value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setPhone(EnrollmentFieldInstanceType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setCompany(EnrollmentFieldInstanceType value) {
        this.company = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setTitle(EnrollmentFieldInstanceType value) {
        this.title = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setNumEmployees(EnrollmentFieldInstanceType value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the futureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getFutureInfo() {
        return futureInfo;
    }

    /**
     * Sets the value of the futureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setFutureInfo(EnrollmentFieldInstanceType value) {
        this.futureInfo = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setAddress1(EnrollmentFieldInstanceType value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setAddress2(EnrollmentFieldInstanceType value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setCity(EnrollmentFieldInstanceType value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setState(EnrollmentFieldInstanceType value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setPostalCode(EnrollmentFieldInstanceType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public EnrollmentFieldInstanceType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldInstanceType }
     *     
     */
    public void setCountry(EnrollmentFieldInstanceType value) {
        this.country = value;
    }

}
