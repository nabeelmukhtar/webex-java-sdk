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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class UserInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInstanceType", propOrder = {
    "registrationDate",
    "visitCount",
    "userId"
})
@XmlSeeAlso({
    GetUserResponse.class,
    SetUser.class
})
public class UserInstanceType
    extends UserType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The registration date. */
    protected String registrationDate;
    
    /** The visit count. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long visitCount;
    
    /** The user id. */
    @XmlElement(defaultValue = "-1")
    protected Long userId;

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
     * Gets the visit count.
     * 
     * @return the visit count
     */
    public Long getVisitCount() {
        return visitCount;
    }

    /**
     * Sets the visit count.
     * 
     * @param value the new visit count
     */
    public void setVisitCount(Long value) {
        this.visitCount = value;
    }

    /**
     * Gets the user id.
     * 
     * @return the user id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the user id.
     * 
     * @param value the new user id
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

}
