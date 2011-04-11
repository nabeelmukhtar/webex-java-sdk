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
 * The Class StandardFieldsType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The phone. */
    protected EnrollmentFieldType phone;
    
    /** The title. */
    protected EnrollmentFieldType title;
    
    /** The company. */
    protected EnrollmentFieldType company;
    
    /** The address1. */
    protected EnrollmentFieldType address1;
    
    /** The address2. */
    protected EnrollmentFieldType address2;
    
    /** The city. */
    protected EnrollmentFieldType city;
    
    /** The state. */
    protected EnrollmentFieldType state;
    
    /** The postal code. */
    protected EnrollmentFieldType postalCode;
    
    /** The country. */
    protected EnrollmentFieldType country;
    
    /** The fax. */
    protected EnrollmentFieldType fax;

    /**
     * Gets the phone.
     * 
     * @return the phone
     */
    public EnrollmentFieldType getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     * 
     * @param value the new phone
     */
    public void setPhone(EnrollmentFieldType value) {
        this.phone = value;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public EnrollmentFieldType getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public void setTitle(EnrollmentFieldType value) {
        this.title = value;
    }

    /**
     * Gets the company.
     * 
     * @return the company
     */
    public EnrollmentFieldType getCompany() {
        return company;
    }

    /**
     * Sets the company.
     * 
     * @param value the new company
     */
    public void setCompany(EnrollmentFieldType value) {
        this.company = value;
    }

    /**
     * Gets the address1.
     * 
     * @return the address1
     */
    public EnrollmentFieldType getAddress1() {
        return address1;
    }

    /**
     * Sets the address1.
     * 
     * @param value the new address1
     */
    public void setAddress1(EnrollmentFieldType value) {
        this.address1 = value;
    }

    /**
     * Gets the address2.
     * 
     * @return the address2
     */
    public EnrollmentFieldType getAddress2() {
        return address2;
    }

    /**
     * Sets the address2.
     * 
     * @param value the new address2
     */
    public void setAddress2(EnrollmentFieldType value) {
        this.address2 = value;
    }

    /**
     * Gets the city.
     * 
     * @return the city
     */
    public EnrollmentFieldType getCity() {
        return city;
    }

    /**
     * Sets the city.
     * 
     * @param value the new city
     */
    public void setCity(EnrollmentFieldType value) {
        this.city = value;
    }

    /**
     * Gets the state.
     * 
     * @return the state
     */
    public EnrollmentFieldType getState() {
        return state;
    }

    /**
     * Sets the state.
     * 
     * @param value the new state
     */
    public void setState(EnrollmentFieldType value) {
        this.state = value;
    }

    /**
     * Gets the postal code.
     * 
     * @return the postal code
     */
    public EnrollmentFieldType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code.
     * 
     * @param value the new postal code
     */
    public void setPostalCode(EnrollmentFieldType value) {
        this.postalCode = value;
    }

    /**
     * Gets the country.
     * 
     * @return the country
     */
    public EnrollmentFieldType getCountry() {
        return country;
    }

    /**
     * Sets the country.
     * 
     * @param value the new country
     */
    public void setCountry(EnrollmentFieldType value) {
        this.country = value;
    }

    /**
     * Gets the fax.
     * 
     * @return the fax
     */
    public EnrollmentFieldType getFax() {
        return fax;
    }

    /**
     * Sets the fax.
     * 
     * @param value the new fax
     */
    public void setFax(EnrollmentFieldType value) {
        this.fax = value;
    }

}
