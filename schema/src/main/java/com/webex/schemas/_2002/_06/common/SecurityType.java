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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.SecurityContextType;


/**
 * The Class SecurityType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityType", propOrder = {
    "webExID",
    "password",
    "siteID",
    "siteName",
    "partnerID",
    "email",
    "sessionTicket"
})
@XmlSeeAlso({
    SecurityContextType.class
})
public class SecurityType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The web ex id. */
    protected String webExID;
    
    /** The password. */
    protected String password;
    
    /** The site id. */
    protected Long siteID;
    
    /** The site name. */
    protected String siteName;
    
    /** The partner id. */
    protected String partnerID;
    
    /** The email. */
    protected String email;
    
    /** The session ticket. */
    protected String sessionTicket;

    /**
     * Gets the web ex id.
     * 
     * @return the web ex id
     */
    public String getWebExID() {
        return webExID;
    }

    /**
     * Sets the web ex id.
     * 
     * @param value the new web ex id
     */
    public void setWebExID(String value) {
        this.webExID = value;
    }

    /**
     * Gets the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * 
     * @param value the new password
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public Long getSiteID() {
        return siteID;
    }

    /**
     * Sets the site id.
     * 
     * @param value the new site id
     */
    public void setSiteID(Long value) {
        this.siteID = value;
    }

    /**
     * Gets the site name.
     * 
     * @return the site name
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the site name.
     * 
     * @param value the new site name
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the partner id.
     * 
     * @return the partner id
     */
    public String getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the partner id.
     * 
     * @param value the new partner id
     */
    public void setPartnerID(String value) {
        this.partnerID = value;
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
     * Gets the session ticket.
     * 
     * @return the session ticket
     */
    public String getSessionTicket() {
        return sessionTicket;
    }

    /**
     * Sets the session ticket.
     * 
     * @param value the new session ticket
     */
    public void setSessionTicket(String value) {
        this.sessionTicket = value;
    }

}
