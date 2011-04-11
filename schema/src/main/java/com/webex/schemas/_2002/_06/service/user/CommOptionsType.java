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


/**
 * The Class CommOptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commOptionsType", propOrder = {
    "prodAnnounce",
    "trainingInfo",
    "electronicInfo",
    "promos",
    "press",
    "email",
    "fax",
    "phone",
    "mail"
})
public class CommOptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The prod announce. */
    @XmlElement(defaultValue = "false")
    protected Boolean prodAnnounce;
    
    /** The training info. */
    @XmlElement(defaultValue = "false")
    protected Boolean trainingInfo;
    
    /** The electronic info. */
    @XmlElement(defaultValue = "false")
    protected Boolean electronicInfo;
    
    /** The promos. */
    @XmlElement(defaultValue = "false")
    protected Boolean promos;
    
    /** The press. */
    @XmlElement(defaultValue = "false")
    protected Boolean press;
    
    /** The email. */
    @XmlElement(defaultValue = "false")
    protected Boolean email;
    
    /** The fax. */
    @XmlElement(defaultValue = "false")
    protected Boolean fax;
    
    /** The phone. */
    @XmlElement(defaultValue = "false")
    protected Boolean phone;
    
    /** The mail. */
    @XmlElement(defaultValue = "false")
    protected Boolean mail;

    /**
     * Checks if is prod announce.
     * 
     * @return the boolean
     */
    public Boolean isProdAnnounce() {
        return prodAnnounce;
    }

    /**
     * Sets the prod announce.
     * 
     * @param value the new prod announce
     */
    public void setProdAnnounce(Boolean value) {
        this.prodAnnounce = value;
    }

    /**
     * Checks if is training info.
     * 
     * @return the boolean
     */
    public Boolean isTrainingInfo() {
        return trainingInfo;
    }

    /**
     * Sets the training info.
     * 
     * @param value the new training info
     */
    public void setTrainingInfo(Boolean value) {
        this.trainingInfo = value;
    }

    /**
     * Checks if is electronic info.
     * 
     * @return the boolean
     */
    public Boolean isElectronicInfo() {
        return electronicInfo;
    }

    /**
     * Sets the electronic info.
     * 
     * @param value the new electronic info
     */
    public void setElectronicInfo(Boolean value) {
        this.electronicInfo = value;
    }

    /**
     * Checks if is promos.
     * 
     * @return the boolean
     */
    public Boolean isPromos() {
        return promos;
    }

    /**
     * Sets the promos.
     * 
     * @param value the new promos
     */
    public void setPromos(Boolean value) {
        this.promos = value;
    }

    /**
     * Checks if is press.
     * 
     * @return the boolean
     */
    public Boolean isPress() {
        return press;
    }

    /**
     * Sets the press.
     * 
     * @param value the new press
     */
    public void setPress(Boolean value) {
        this.press = value;
    }

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
