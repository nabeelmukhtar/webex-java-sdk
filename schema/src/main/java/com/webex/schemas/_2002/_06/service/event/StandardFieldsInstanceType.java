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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class StandardFieldsInstanceType.
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
public class StandardFieldsInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The first name. */
    @XmlElement(required = true)
    protected EnrollmentFieldInstanceType firstName;
    
    /** The last name. */
    @XmlElement(required = true)
    protected EnrollmentFieldInstanceType lastName;
    
    /** The email address. */
    @XmlElement(required = true)
    protected EnrollmentFieldInstanceType emailAddress;
    
    /** The phone. */
    protected EnrollmentFieldInstanceType phone;
    
    /** The company. */
    protected EnrollmentFieldInstanceType company;
    
    /** The title. */
    protected EnrollmentFieldInstanceType title;
    
    /** The num employees. */
    protected EnrollmentFieldInstanceType numEmployees;
    
    /** The future info. */
    protected EnrollmentFieldInstanceType futureInfo;
    
    /** The address1. */
    protected EnrollmentFieldInstanceType address1;
    
    /** The address2. */
    protected EnrollmentFieldInstanceType address2;
    
    /** The city. */
    protected EnrollmentFieldInstanceType city;
    
    /** The state. */
    protected EnrollmentFieldInstanceType state;
    
    /** The postal code. */
    protected EnrollmentFieldInstanceType postalCode;
    
    /** The country. */
    protected EnrollmentFieldInstanceType country;

    /**
     * Gets the first name.
     * 
     * @return the first name
     */
    public EnrollmentFieldInstanceType getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     * 
     * @param value the new first name
     */
    public void setFirstName(EnrollmentFieldInstanceType value) {
        this.firstName = value;
    }

    /**
     * Gets the last name.
     * 
     * @return the last name
     */
    public EnrollmentFieldInstanceType getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     * 
     * @param value the new last name
     */
    public void setLastName(EnrollmentFieldInstanceType value) {
        this.lastName = value;
    }

    /**
     * Gets the email address.
     * 
     * @return the email address
     */
    public EnrollmentFieldInstanceType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the email address.
     * 
     * @param value the new email address
     */
    public void setEmailAddress(EnrollmentFieldInstanceType value) {
        this.emailAddress = value;
    }

    /**
     * Gets the phone.
     * 
     * @return the phone
     */
    public EnrollmentFieldInstanceType getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     * 
     * @param value the new phone
     */
    public void setPhone(EnrollmentFieldInstanceType value) {
        this.phone = value;
    }

    /**
     * Gets the company.
     * 
     * @return the company
     */
    public EnrollmentFieldInstanceType getCompany() {
        return company;
    }

    /**
     * Sets the company.
     * 
     * @param value the new company
     */
    public void setCompany(EnrollmentFieldInstanceType value) {
        this.company = value;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public EnrollmentFieldInstanceType getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public void setTitle(EnrollmentFieldInstanceType value) {
        this.title = value;
    }

    /**
     * Gets the num employees.
     * 
     * @return the num employees
     */
    public EnrollmentFieldInstanceType getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the num employees.
     * 
     * @param value the new num employees
     */
    public void setNumEmployees(EnrollmentFieldInstanceType value) {
        this.numEmployees = value;
    }

    /**
     * Gets the future info.
     * 
     * @return the future info
     */
    public EnrollmentFieldInstanceType getFutureInfo() {
        return futureInfo;
    }

    /**
     * Sets the future info.
     * 
     * @param value the new future info
     */
    public void setFutureInfo(EnrollmentFieldInstanceType value) {
        this.futureInfo = value;
    }

    /**
     * Gets the address1.
     * 
     * @return the address1
     */
    public EnrollmentFieldInstanceType getAddress1() {
        return address1;
    }

    /**
     * Sets the address1.
     * 
     * @param value the new address1
     */
    public void setAddress1(EnrollmentFieldInstanceType value) {
        this.address1 = value;
    }

    /**
     * Gets the address2.
     * 
     * @return the address2
     */
    public EnrollmentFieldInstanceType getAddress2() {
        return address2;
    }

    /**
     * Sets the address2.
     * 
     * @param value the new address2
     */
    public void setAddress2(EnrollmentFieldInstanceType value) {
        this.address2 = value;
    }

    /**
     * Gets the city.
     * 
     * @return the city
     */
    public EnrollmentFieldInstanceType getCity() {
        return city;
    }

    /**
     * Sets the city.
     * 
     * @param value the new city
     */
    public void setCity(EnrollmentFieldInstanceType value) {
        this.city = value;
    }

    /**
     * Gets the state.
     * 
     * @return the state
     */
    public EnrollmentFieldInstanceType getState() {
        return state;
    }

    /**
     * Sets the state.
     * 
     * @param value the new state
     */
    public void setState(EnrollmentFieldInstanceType value) {
        this.state = value;
    }

    /**
     * Gets the postal code.
     * 
     * @return the postal code
     */
    public EnrollmentFieldInstanceType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code.
     * 
     * @param value the new postal code
     */
    public void setPostalCode(EnrollmentFieldInstanceType value) {
        this.postalCode = value;
    }

    /**
     * Gets the country.
     * 
     * @return the country
     */
    public EnrollmentFieldInstanceType getCountry() {
        return country;
    }

    /**
     * Sets the country.
     * 
     * @param value the new country
     */
    public void setCountry(EnrollmentFieldInstanceType value) {
        this.country = value;
    }

}
