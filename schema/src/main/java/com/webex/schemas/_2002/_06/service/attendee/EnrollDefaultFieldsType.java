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

package com.webex.schemas._2002._06.service.attendee;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EnrollDefaultFieldsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollDefaultFieldsType", propOrder = {
    "firstName",
    "lastName",
    "email",
    "company",
    "phoneNum",
    "title",
    "numEmployees",
    "receiveInfo",
    "address1",
    "address2",
    "city",
    "state",
    "zipcode",
    "country",
    "leadSourceID",
    "leadScore"
})
public class EnrollDefaultFieldsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The first name. */
    protected String firstName;
    
    /** The last name. */
    protected String lastName;
    
    /** The email. */
    protected String email;
    
    /** The company. */
    protected String company;
    
    /** The phone num. */
    protected String phoneNum;
    
    /** The title. */
    protected String title;
    
    /** The num employees. */
    protected String numEmployees;
    
    /** The receive info. */
    protected Boolean receiveInfo;
    
    /** The address1. */
    protected String address1;
    
    /** The address2. */
    protected String address2;
    
    /** The city. */
    protected String city;
    
    /** The state. */
    protected String state;
    
    /** The zipcode. */
    protected String zipcode;
    
    /** The country. */
    protected String country;
    
    /** The lead source id. */
    protected String leadSourceID;
    
    /** The lead score. */
    protected String leadScore;

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
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param value the new email
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the phone num.
     * 
     * @return the phone num
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the phone num.
     * 
     * @param value the new phone num
     */
    public void setPhoneNum(String value) {
        this.phoneNum = value;
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
     * Gets the num employees.
     * 
     * @return the num employees
     */
    public String getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the num employees.
     * 
     * @param value the new num employees
     */
    public void setNumEmployees(String value) {
        this.numEmployees = value;
    }

    /**
     * Checks if is receive info.
     * 
     * @return the boolean
     */
    public Boolean isReceiveInfo() {
        return receiveInfo;
    }

    /**
     * Sets the receive info.
     * 
     * @param value the new receive info
     */
    public void setReceiveInfo(Boolean value) {
        this.receiveInfo = value;
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
     * Gets the zipcode.
     * 
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the zipcode.
     * 
     * @param value the new zipcode
     */
    public void setZipcode(String value) {
        this.zipcode = value;
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
     * Gets the lead source id.
     * 
     * @return the lead source id
     */
    public String getLeadSourceID() {
        return leadSourceID;
    }

    /**
     * Sets the lead source id.
     * 
     * @param value the new lead source id
     */
    public void setLeadSourceID(String value) {
        this.leadSourceID = value;
    }

    /**
     * Gets the lead score.
     * 
     * @return the lead score
     */
    public String getLeadScore() {
        return leadScore;
    }

    /**
     * Sets the lead score.
     * 
     * @param value the new lead score
     */
    public void setLeadScore(String value) {
        this.leadScore = value;
    }

}
