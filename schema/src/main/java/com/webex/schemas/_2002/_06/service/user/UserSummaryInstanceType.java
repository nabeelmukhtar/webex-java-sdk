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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class UserSummaryInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userSummaryInstanceType", propOrder = {
    "webExId",
    "firstName",
    "lastName",
    "email",
    "registrationDate",
    "active",
    "timeZoneID",
    "webACD"
})
public class UserSummaryInstanceType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The web ex id. */
    @XmlElement(required = true)
    protected String webExId;
    
    /** The first name. */
    @XmlElement(required = true)
    protected String firstName;
    
    /** The last name. */
    @XmlElement(required = true)
    protected String lastName;
    
    /** The email. */
    @XmlElement(required = true)
    protected String email;
    
    /** The registration date. */
    protected String registrationDate;
    
    /** The active. */
    @XmlElement(required = true)
    protected ActiveType active;
    
    /** The time zone id. */
    @XmlElement(defaultValue = "-1")
    protected Long timeZoneID;
    
    /** The web acd. */
    protected WebACDUserRoleType webACD;

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
     * Gets the registration date.
     * 
     * @return the registration date
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the registration date.
     * 
     * @param value the new registration date
     */
    public void setRegistrationDate(String value) {
        this.registrationDate = value;
    }

    /**
     * Gets the active.
     * 
     * @return the active
     */
    public ActiveType getActive() {
        return active;
    }

    /**
     * Sets the active.
     * 
     * @param value the new active
     */
    public void setActive(ActiveType value) {
        this.active = value;
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

    /**
     * Gets the web acd.
     * 
     * @return the web acd
     */
    public WebACDUserRoleType getWebACD() {
        return webACD;
    }

    /**
     * Sets the web acd.
     * 
     * @param value the new web acd
     */
    public void setWebACD(WebACDUserRoleType value) {
        this.webACD = value;
    }

}
