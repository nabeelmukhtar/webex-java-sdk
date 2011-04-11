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

package com.webex.schemas._2002._06.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class PersonType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personType", propOrder = {
    "name",
    "firstName",
    "lastName",
    "title",
    "company",
    "webExId",
    "address",
    "phones",
    "email",
    "notes",
    "url",
    "type"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.event.AttendeesType.Attendee.class
})
public class PersonType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The name. */
    protected String name;
    
    /** The first name. */
    protected String firstName;
    
    /** The last name. */
    protected String lastName;
    
    /** The title. */
    protected String title;
    
    /** The company. */
    protected String company;
    
    /** The web ex id. */
    protected String webExId;
    
    /** The address. */
    protected AddressType address;
    
    /** The phones. */
    protected PhonesType phones;
    
    /** The email. */
    @XmlElement(required = true)
    protected String email;
    
    /** The notes. */
    protected String notes;
    
    /** The url. */
    protected String url;
    
    /** The type. */
    @XmlElement(defaultValue = "VISITOR")
    protected PersonTypeType type;

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the web ex id.
     * 
     * @return the web ex id
     */
    public String getWebExId() {
        return webExId;
    }

    /**
     * Sets the web ex id.
     * 
     * @param value the new web ex id
     */
    public void setWebExId(String value) {
        this.webExId = value;
    }

    /**
     * Gets the address.
     * 
     * @return the address
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the address.
     * 
     * @param value the new address
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the phones.
     * 
     * @return the phones
     */
    public PhonesType getPhones() {
        return phones;
    }

    /**
     * Sets the phones.
     * 
     * @param value the new phones
     */
    public void setPhones(PhonesType value) {
        this.phones = value;
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
     * Gets the notes.
     * 
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the notes.
     * 
     * @param value the new notes
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the url.
     * 
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url.
     * 
     * @param value the new url
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public PersonTypeType getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param value the new type
     */
    public void setType(PersonTypeType value) {
        this.type = value;
    }

}
