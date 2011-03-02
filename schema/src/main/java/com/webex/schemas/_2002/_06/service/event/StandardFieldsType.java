
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 *         &lt;element name="phone" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="numEmployees" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="futureInfo" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.webex.com/schemas/2002/06/service/event}enrollmentFieldType" minOccurs="0"/>
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
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.site.EventCenterType.StandardFields.class
})
public class StandardFieldsType {

    protected EnrollmentFieldType phone;
    protected EnrollmentFieldType company;
    protected EnrollmentFieldType title;
    protected EnrollmentFieldType numEmployees;
    protected EnrollmentFieldType futureInfo;
    protected EnrollmentFieldType address1;
    protected EnrollmentFieldType address2;
    protected EnrollmentFieldType city;
    protected EnrollmentFieldType state;
    protected EnrollmentFieldType postalCode;
    protected EnrollmentFieldType country;

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setPhone(EnrollmentFieldType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setCompany(EnrollmentFieldType value) {
        this.company = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setTitle(EnrollmentFieldType value) {
        this.title = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setNumEmployees(EnrollmentFieldType value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the futureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getFutureInfo() {
        return futureInfo;
    }

    /**
     * Sets the value of the futureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setFutureInfo(EnrollmentFieldType value) {
        this.futureInfo = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setAddress1(EnrollmentFieldType value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setAddress2(EnrollmentFieldType value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setCity(EnrollmentFieldType value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setState(EnrollmentFieldType value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setPostalCode(EnrollmentFieldType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setCountry(EnrollmentFieldType value) {
        this.country = value;
    }

}
