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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class RegFieldsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regFieldsType", propOrder = {
    "firstName",
    "lastName",
    "title",
    "company",
    "address1",
    "address2",
    "city",
    "state",
    "postalCode",
    "country",
    "phone",
    "fax",
    "customFields"
})
public class RegFieldsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The first name. */
    protected String firstName;
    
    /** The last name. */
    protected String lastName;
    
    /** The title. */
    protected String title;
    
    /** The company. */
    protected String company;
    
    /** The address1. */
    protected String address1;
    
    /** The address2. */
    protected String address2;
    
    /** The city. */
    protected String city;
    
    /** The state. */
    protected String state;
    
    /** The postal code. */
    protected String postalCode;
    
    /** The country. */
    protected String country;
    
    /** The phone. */
    protected String phone;
    
    /** The fax. */
    protected String fax;
    
    /** The custom fields. */
    protected List<CustomFieldsType> customFields;

    /**
     * Gets the first name.
     * 
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     * 
     * @param value the new first name
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the last name.
     * 
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     * 
     * @param value the new last name
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the company.
     * 
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company.
     * 
     * @param value the new company
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the address1.
     * 
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the address1.
     * 
     * @param value the new address1
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the address2.
     * 
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the address2.
     * 
     * @param value the new address2
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the city.
     * 
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     * 
     * @param value the new city
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the state.
     * 
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state.
     * 
     * @param value the new state
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the postal code.
     * 
     * @return the postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code.
     * 
     * @param value the new postal code
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the country.
     * 
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country.
     * 
     * @param value the new country
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the phone.
     * 
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     * 
     * @param value the new phone
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the fax.
     * 
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the fax.
     * 
     * @param value the new fax
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the custom fields.
     * 
     * @return the custom fields
     */
    public List<CustomFieldsType> getCustomFields() {
        if (customFields == null) {
            customFields = new ArrayList<CustomFieldsType>();
        }
        return this.customFields;
    }

}
