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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for securityOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="securityOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passwordExpires" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="passwordLifetime" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="allMeetingsUnlisted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allMeetingsPassword" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="joinBeforeHost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="audioBeforeHost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="changePersonalURL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="changeUserName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="meetings">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="strictPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="strictUserPassword" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accountNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requireLoginBeforeSiteAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changePWDWhenAutoLogin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enforceBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="passwordChangeIntervalOpt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="passwordChangeInterval" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityOptionsType", propOrder = {
    "passwordExpires",
    "passwordLifetime",
    "allMeetingsUnlisted",
    "allMeetingsPassword",
    "joinBeforeHost",
    "audioBeforeHost",
    "changePersonalURL",
    "changeUserName",
    "meetings",
    "strictUserPassword",
    "accountNotify",
    "requireLoginBeforeSiteAccess",
    "changePWDWhenAutoLogin",
    "enforceBaseline",
    "passwordChangeIntervalOpt",
    "passwordChangeInterval"
})
public class SecurityOptionsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected boolean passwordExpires;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long passwordLifetime;
    protected boolean allMeetingsUnlisted;
    protected boolean allMeetingsPassword;
    protected boolean joinBeforeHost;
    protected boolean audioBeforeHost;
    protected boolean changePersonalURL;
    protected boolean changeUserName;
    @XmlElement(required = true)
    protected SecurityOptionsType.Meetings meetings;
    protected boolean strictUserPassword;
    protected Boolean accountNotify;
    protected Boolean requireLoginBeforeSiteAccess;
    protected boolean changePWDWhenAutoLogin;
    protected boolean enforceBaseline;
    protected boolean passwordChangeIntervalOpt;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long passwordChangeInterval;

    /**
     * Gets the value of the passwordExpires property.
     * 
     */
    public boolean isPasswordExpires() {
        return passwordExpires;
    }

    /**
     * Sets the value of the passwordExpires property.
     * 
     */
    public void setPasswordExpires(boolean value) {
        this.passwordExpires = value;
    }

    /**
     * Gets the value of the passwordLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPasswordLifetime() {
        return passwordLifetime;
    }

    /**
     * Sets the value of the passwordLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordLifetime(Long value) {
        this.passwordLifetime = value;
    }

    /**
     * Gets the value of the allMeetingsUnlisted property.
     * 
     */
    public boolean isAllMeetingsUnlisted() {
        return allMeetingsUnlisted;
    }

    /**
     * Sets the value of the allMeetingsUnlisted property.
     * 
     */
    public void setAllMeetingsUnlisted(boolean value) {
        this.allMeetingsUnlisted = value;
    }

    /**
     * Gets the value of the allMeetingsPassword property.
     * 
     */
    public boolean isAllMeetingsPassword() {
        return allMeetingsPassword;
    }

    /**
     * Sets the value of the allMeetingsPassword property.
     * 
     */
    public void setAllMeetingsPassword(boolean value) {
        this.allMeetingsPassword = value;
    }

    /**
     * Gets the value of the joinBeforeHost property.
     * 
     */
    public boolean isJoinBeforeHost() {
        return joinBeforeHost;
    }

    /**
     * Sets the value of the joinBeforeHost property.
     * 
     */
    public void setJoinBeforeHost(boolean value) {
        this.joinBeforeHost = value;
    }

    /**
     * Gets the value of the audioBeforeHost property.
     * 
     */
    public boolean isAudioBeforeHost() {
        return audioBeforeHost;
    }

    /**
     * Sets the value of the audioBeforeHost property.
     * 
     */
    public void setAudioBeforeHost(boolean value) {
        this.audioBeforeHost = value;
    }

    /**
     * Gets the value of the changePersonalURL property.
     * 
     */
    public boolean isChangePersonalURL() {
        return changePersonalURL;
    }

    /**
     * Sets the value of the changePersonalURL property.
     * 
     */
    public void setChangePersonalURL(boolean value) {
        this.changePersonalURL = value;
    }

    /**
     * Gets the value of the changeUserName property.
     * 
     */
    public boolean isChangeUserName() {
        return changeUserName;
    }

    /**
     * Sets the value of the changeUserName property.
     * 
     */
    public void setChangeUserName(boolean value) {
        this.changeUserName = value;
    }

    /**
     * Gets the value of the meetings property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityOptionsType.Meetings }
     *     
     */
    public SecurityOptionsType.Meetings getMeetings() {
        return meetings;
    }

    /**
     * Sets the value of the meetings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityOptionsType.Meetings }
     *     
     */
    public void setMeetings(SecurityOptionsType.Meetings value) {
        this.meetings = value;
    }

    /**
     * Gets the value of the strictUserPassword property.
     * 
     */
    public boolean isStrictUserPassword() {
        return strictUserPassword;
    }

    /**
     * Sets the value of the strictUserPassword property.
     * 
     */
    public void setStrictUserPassword(boolean value) {
        this.strictUserPassword = value;
    }

    /**
     * Gets the value of the accountNotify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountNotify() {
        return accountNotify;
    }

    /**
     * Sets the value of the accountNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountNotify(Boolean value) {
        this.accountNotify = value;
    }

    /**
     * Gets the value of the requireLoginBeforeSiteAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireLoginBeforeSiteAccess() {
        return requireLoginBeforeSiteAccess;
    }

    /**
     * Sets the value of the requireLoginBeforeSiteAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireLoginBeforeSiteAccess(Boolean value) {
        this.requireLoginBeforeSiteAccess = value;
    }

    /**
     * Gets the value of the changePWDWhenAutoLogin property.
     * 
     */
    public boolean isChangePWDWhenAutoLogin() {
        return changePWDWhenAutoLogin;
    }

    /**
     * Sets the value of the changePWDWhenAutoLogin property.
     * 
     */
    public void setChangePWDWhenAutoLogin(boolean value) {
        this.changePWDWhenAutoLogin = value;
    }

    /**
     * Gets the value of the enforceBaseline property.
     * 
     */
    public boolean isEnforceBaseline() {
        return enforceBaseline;
    }

    /**
     * Sets the value of the enforceBaseline property.
     * 
     */
    public void setEnforceBaseline(boolean value) {
        this.enforceBaseline = value;
    }

    /**
     * Gets the value of the passwordChangeIntervalOpt property.
     * 
     */
    public boolean isPasswordChangeIntervalOpt() {
        return passwordChangeIntervalOpt;
    }

    /**
     * Sets the value of the passwordChangeIntervalOpt property.
     * 
     */
    public void setPasswordChangeIntervalOpt(boolean value) {
        this.passwordChangeIntervalOpt = value;
    }

    /**
     * Gets the value of the passwordChangeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPasswordChangeInterval() {
        return passwordChangeInterval;
    }

    /**
     * Sets the value of the passwordChangeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordChangeInterval(Long value) {
        this.passwordChangeInterval = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="strictPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "strictPasswords"
    })
    public static class Meetings
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected boolean strictPasswords;

        /**
         * Gets the value of the strictPasswords property.
         * 
         */
        public boolean isStrictPasswords() {
            return strictPasswords;
        }

        /**
         * Sets the value of the strictPasswords property.
         * 
         */
        public void setStrictPasswords(boolean value) {
            this.strictPasswords = value;
        }

    }

}
