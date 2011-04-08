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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
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
 *         &lt;element name="phone" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}enrollmentFieldType" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}enrollmentFieldType" minOccurs="0"/>
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
public class StandardFieldsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected EnrollmentFieldType phone;
    protected EnrollmentFieldType title;
    protected EnrollmentFieldType company;
    protected EnrollmentFieldType address1;
    protected EnrollmentFieldType address2;
    protected EnrollmentFieldType city;
    protected EnrollmentFieldType state;
    protected EnrollmentFieldType postalCode;
    protected EnrollmentFieldType country;
    protected EnrollmentFieldType fax;

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

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public EnrollmentFieldType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentFieldType }
     *     
     */
    public void setFax(EnrollmentFieldType value) {
        this.fax = value;
    }

}
