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
 * The Class SecurityOptionsType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The password expires. */
    protected boolean passwordExpires;
    
    /** The password lifetime. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long passwordLifetime;
    
    /** The all meetings unlisted. */
    protected boolean allMeetingsUnlisted;
    
    /** The all meetings password. */
    protected boolean allMeetingsPassword;
    
    /** The join before host. */
    protected boolean joinBeforeHost;
    
    /** The audio before host. */
    protected boolean audioBeforeHost;
    
    /** The change personal url. */
    protected boolean changePersonalURL;
    
    /** The change user name. */
    protected boolean changeUserName;
    
    /** The meetings. */
    @XmlElement(required = true)
    protected SecurityOptionsType.Meetings meetings;
    
    /** The strict user password. */
    protected boolean strictUserPassword;
    
    /** The account notify. */
    protected Boolean accountNotify;
    
    /** The require login before site access. */
    protected Boolean requireLoginBeforeSiteAccess;
    
    /** The change pwd when auto login. */
    protected boolean changePWDWhenAutoLogin;
    
    /** The enforce baseline. */
    protected boolean enforceBaseline;
    
    /** The password change interval opt. */
    protected boolean passwordChangeIntervalOpt;
    
    /** The password change interval. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long passwordChangeInterval;

    /**
     * Checks if is password expires.
     * 
     * @return true, if is password expires
     */
    public boolean isPasswordExpires() {
        return passwordExpires;
    }

    /**
     * Sets the password expires.
     * 
     * @param value the new password expires
     */
    public void setPasswordExpires(boolean value) {
        this.passwordExpires = value;
    }

    /**
     * Gets the password lifetime.
     * 
     * @return the password lifetime
     */
    public Long getPasswordLifetime() {
        return passwordLifetime;
    }

    /**
     * Sets the password lifetime.
     * 
     * @param value the new password lifetime
     */
    public void setPasswordLifetime(Long value) {
        this.passwordLifetime = value;
    }

    /**
     * Checks if is all meetings unlisted.
     * 
     * @return true, if is all meetings unlisted
     */
    public boolean isAllMeetingsUnlisted() {
        return allMeetingsUnlisted;
    }

    /**
     * Sets the all meetings unlisted.
     * 
     * @param value the new all meetings unlisted
     */
    public void setAllMeetingsUnlisted(boolean value) {
        this.allMeetingsUnlisted = value;
    }

    /**
     * Checks if is all meetings password.
     * 
     * @return true, if is all meetings password
     */
    public boolean isAllMeetingsPassword() {
        return allMeetingsPassword;
    }

    /**
     * Sets the all meetings password.
     * 
     * @param value the new all meetings password
     */
    public void setAllMeetingsPassword(boolean value) {
        this.allMeetingsPassword = value;
    }

    /**
     * Checks if is join before host.
     * 
     * @return true, if is join before host
     */
    public boolean isJoinBeforeHost() {
        return joinBeforeHost;
    }

    /**
     * Sets the join before host.
     * 
     * @param value the new join before host
     */
    public void setJoinBeforeHost(boolean value) {
        this.joinBeforeHost = value;
    }

    /**
     * Checks if is audio before host.
     * 
     * @return true, if is audio before host
     */
    public boolean isAudioBeforeHost() {
        return audioBeforeHost;
    }

    /**
     * Sets the audio before host.
     * 
     * @param value the new audio before host
     */
    public void setAudioBeforeHost(boolean value) {
        this.audioBeforeHost = value;
    }

    /**
     * Checks if is change personal url.
     * 
     * @return true, if is change personal url
     */
    public boolean isChangePersonalURL() {
        return changePersonalURL;
    }

    /**
     * Sets the change personal url.
     * 
     * @param value the new change personal url
     */
    public void setChangePersonalURL(boolean value) {
        this.changePersonalURL = value;
    }

    /**
     * Checks if is change user name.
     * 
     * @return true, if is change user name
     */
    public boolean isChangeUserName() {
        return changeUserName;
    }

    /**
     * Sets the change user name.
     * 
     * @param value the new change user name
     */
    public void setChangeUserName(boolean value) {
        this.changeUserName = value;
    }

    /**
     * Gets the meetings.
     * 
     * @return the meetings
     */
    public SecurityOptionsType.Meetings getMeetings() {
        return meetings;
    }

    /**
     * Sets the meetings.
     * 
     * @param value the new meetings
     */
    public void setMeetings(SecurityOptionsType.Meetings value) {
        this.meetings = value;
    }

    /**
     * Checks if is strict user password.
     * 
     * @return true, if is strict user password
     */
    public boolean isStrictUserPassword() {
        return strictUserPassword;
    }

    /**
     * Sets the strict user password.
     * 
     * @param value the new strict user password
     */
    public void setStrictUserPassword(boolean value) {
        this.strictUserPassword = value;
    }

    /**
     * Checks if is account notify.
     * 
     * @return the boolean
     */
    public Boolean isAccountNotify() {
        return accountNotify;
    }

    /**
     * Sets the account notify.
     * 
     * @param value the new account notify
     */
    public void setAccountNotify(Boolean value) {
        this.accountNotify = value;
    }

    /**
     * Checks if is require login before site access.
     * 
     * @return the boolean
     */
    public Boolean isRequireLoginBeforeSiteAccess() {
        return requireLoginBeforeSiteAccess;
    }

    /**
     * Sets the require login before site access.
     * 
     * @param value the new require login before site access
     */
    public void setRequireLoginBeforeSiteAccess(Boolean value) {
        this.requireLoginBeforeSiteAccess = value;
    }

    /**
     * Checks if is change pwd when auto login.
     * 
     * @return true, if is change pwd when auto login
     */
    public boolean isChangePWDWhenAutoLogin() {
        return changePWDWhenAutoLogin;
    }

    /**
     * Sets the change pwd when auto login.
     * 
     * @param value the new change pwd when auto login
     */
    public void setChangePWDWhenAutoLogin(boolean value) {
        this.changePWDWhenAutoLogin = value;
    }

    /**
     * Checks if is enforce baseline.
     * 
     * @return true, if is enforce baseline
     */
    public boolean isEnforceBaseline() {
        return enforceBaseline;
    }

    /**
     * Sets the enforce baseline.
     * 
     * @param value the new enforce baseline
     */
    public void setEnforceBaseline(boolean value) {
        this.enforceBaseline = value;
    }

    /**
     * Checks if is password change interval opt.
     * 
     * @return true, if is password change interval opt
     */
    public boolean isPasswordChangeIntervalOpt() {
        return passwordChangeIntervalOpt;
    }

    /**
     * Sets the password change interval opt.
     * 
     * @param value the new password change interval opt
     */
    public void setPasswordChangeIntervalOpt(boolean value) {
        this.passwordChangeIntervalOpt = value;
    }

    /**
     * Gets the password change interval.
     * 
     * @return the password change interval
     */
    public Long getPasswordChangeInterval() {
        return passwordChangeInterval;
    }

    /**
     * Sets the password change interval.
     * 
     * @param value the new password change interval
     */
    public void setPasswordChangeInterval(Long value) {
        this.passwordChangeInterval = value;
    }


    /**
     * The Class Meetings.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "strictPasswords"
    })
    public static class Meetings
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The strict passwords. */
        protected boolean strictPasswords;

        /**
         * Checks if is strict passwords.
         * 
         * @return true, if is strict passwords
         */
        public boolean isStrictPasswords() {
            return strictPasswords;
        }

        /**
         * Sets the strict passwords.
         * 
         * @param value the new strict passwords
         */
        public void setStrictPasswords(boolean value) {
            this.strictPasswords = value;
        }

    }

}
