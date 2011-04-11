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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class DisplayMethodType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayMethodType", propOrder = {
    "email",
    "fax",
    "phone",
    "mail"
})
public class DisplayMethodType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The email. */
    protected Boolean email;
    
    /** The fax. */
    protected Boolean fax;
    
    /** The phone. */
    protected Boolean phone;
    
    /** The mail. */
    protected Boolean mail;

    /**
     * Checks if is email.
     * 
     * @return the boolean
     */
    public Boolean isEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param value the new email
     */
    public void setEmail(Boolean value) {
        this.email = value;
    }

    /**
     * Checks if is fax.
     * 
     * @return the boolean
     */
    public Boolean isFax() {
        return fax;
    }

    /**
     * Sets the fax.
     * 
     * @param value the new fax
     */
    public void setFax(Boolean value) {
        this.fax = value;
    }

    /**
     * Checks if is phone.
     * 
     * @return the boolean
     */
    public Boolean isPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     * 
     * @param value the new phone
     */
    public void setPhone(Boolean value) {
        this.phone = value;
    }

    /**
     * Checks if is mail.
     * 
     * @return the boolean
     */
    public Boolean isMail() {
        return mail;
    }

    /**
     * Sets the mail.
     * 
     * @param value the new mail
     */
    public void setMail(Boolean value) {
        this.mail = value;
    }

}
