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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.AddressType;
import com.webex.schemas._2002._06.common.JoinStatusType;
import com.webex.schemas._2002._06.common.PersonTypeType;
import com.webex.schemas._2002._06.common.PhonesType;


/**
 * The Class ContactType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactType", propOrder = {
    "name",
    "title",
    "company",
    "webExId",
    "address",
    "phones",
    "email",
    "notes",
    "url",
    "type",
    "joinStatus",
    "language",
    "locale",
    "timeZoneID"
})
public class ContactType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The name. */
    protected String name;
    
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
    protected PersonTypeType type;
    
    /** The join status. */
    protected JoinStatusType joinStatus;
    
    /** The language. */
    protected String language;
    
    /** The locale. */
    protected String locale;
    
    /** The time zone id. */
    protected Long timeZoneID;

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

    /**
     * Gets the join status.
     * 
     * @return the join status
     */
    public JoinStatusType getJoinStatus() {
        return joinStatus;
    }

    /**
     * Sets the join status.
     * 
     * @param value the new join status
     */
    public void setJoinStatus(JoinStatusType value) {
        this.joinStatus = value;
    }

    /**
     * Gets the language.
     * 
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language.
     * 
     * @param value the new language
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the locale.
     * 
     * @return the locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the locale.
     * 
     * @param value the new locale
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public Long getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(Long value) {
        this.timeZoneID = value;
    }

}
