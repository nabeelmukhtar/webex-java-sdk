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

package com.webex.schemas._2002._06.service.meeting;

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
    protected RegistrationFieldType phone;
    
    /** The title. */
    protected RegistrationFieldType title;
    
    /** The company. */
    protected RegistrationFieldType company;
    
    /** The address1. */
    protected RegistrationFieldType address1;
    
    /** The address2. */
    protected RegistrationFieldType address2;
    
    /** The city. */
    protected RegistrationFieldType city;
    
    /** The state. */
    protected RegistrationFieldType state;
    
    /** The postal code. */
    protected RegistrationFieldType postalCode;
    
    /** The country. */
    protected RegistrationFieldType country;
    
    /** The fax. */
    protected RegistrationFieldType fax;

    /**
     * Gets the phone.
     * 
     * @return the phone
     */
    public RegistrationFieldType getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     * 
     * @param value the new phone
     */
    public void setPhone(RegistrationFieldType value) {
        this.phone = value;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public RegistrationFieldType getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public void setTitle(RegistrationFieldType value) {
        this.title = value;
    }

    /**
     * Gets the company.
     * 
     * @return the company
     */
    public RegistrationFieldType getCompany() {
        return company;
    }

    /**
     * Sets the company.
     * 
     * @param value the new company
     */
    public void setCompany(RegistrationFieldType value) {
        this.company = value;
    }

    /**
     * Gets the address1.
     * 
     * @return the address1
     */
    public RegistrationFieldType getAddress1() {
        return address1;
    }

    /**
     * Sets the address1.
     * 
     * @param value the new address1
     */
    public void setAddress1(RegistrationFieldType value) {
        this.address1 = value;
    }

    /**
     * Gets the address2.
     * 
     * @return the address2
     */
    public RegistrationFieldType getAddress2() {
        return address2;
    }

    /**
     * Sets the address2.
     * 
     * @param value the new address2
     */
    public void setAddress2(RegistrationFieldType value) {
        this.address2 = value;
    }

    /**
     * Gets the city.
     * 
     * @return the city
     */
    public RegistrationFieldType getCity() {
        return city;
    }

    /**
     * Sets the city.
     * 
     * @param value the new city
     */
    public void setCity(RegistrationFieldType value) {
        this.city = value;
    }

    /**
     * Gets the state.
     * 
     * @return the state
     */
    public RegistrationFieldType getState() {
        return state;
    }

    /**
     * Sets the state.
     * 
     * @param value the new state
     */
    public void setState(RegistrationFieldType value) {
        this.state = value;
    }

    /**
     * Gets the postal code.
     * 
     * @return the postal code
     */
    public RegistrationFieldType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code.
     * 
     * @param value the new postal code
     */
    public void setPostalCode(RegistrationFieldType value) {
        this.postalCode = value;
    }

    /**
     * Gets the country.
     * 
     * @return the country
     */
    public RegistrationFieldType getCountry() {
        return country;
    }

    /**
     * Sets the country.
     * 
     * @param value the new country
     */
    public void setCountry(RegistrationFieldType value) {
        this.country = value;
    }

    /**
     * Gets the fax.
     * 
     * @return the fax
     */
    public RegistrationFieldType getFax() {
        return fax;
    }

    /**
     * Sets the fax.
     * 
     * @param value the new fax
     */
    public void setFax(RegistrationFieldType value) {
        this.fax = value;
    }

}
