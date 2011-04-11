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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.AddressType;
import com.webex.schemas._2002._06.common.TimeZoneType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class UserType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userType", propOrder = {
    "firstName",
    "lastName",
    "title",
    "categoryId",
    "description",
    "officeGreeting",
    "company",
    "webExId",
    "address",
    "phones",
    "email",
    "email2",
    "officeurl",
    "password",
    "passwordHint",
    "passwordHintAnswer",
    "personalUrl",
    "expirationDate",
    "commOptions",
    "meetingTypes",
    "options",
    "timeZoneID",
    "timeZone",
    "timeZoneWithDST",
    "tracking",
    "service",
    "privilege",
    "language",
    "locale",
    "schedulingPermission",
    "active",
    "tspAccount",
    "supportedServices",
    "myWebEx",
    "personalTeleconf",
    "thirdPartyTeleconf",
    "personalMeetingRoom",
    "sessionOptions",
    "supportCenter",
    "mpProfileNumber",
    "security",
    "languageID",
    "webACDPrefs",
    "remoteSupport",
    "remoteAccess"
})
@XmlSeeAlso({
    CreateUser.class,
    UserInstanceType.class
})
public class UserType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The first name. */
    protected String firstName;
    
    /** The last name. */
    protected String lastName;
    
    /** The title. */
    protected String title;
    
    /** The category id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long categoryId;
    
    /** The description. */
    protected String description;
    
    /** The office greeting. */
    protected String officeGreeting;
    
    /** The company. */
    protected String company;
    
    /** The web ex id. */
    @XmlElement(required = true)
    protected String webExId;
    
    /** The address. */
    protected AddressType address;
    
    /** The phones. */
    protected UserPhonesType phones;
    
    /** The email. */
    protected String email;
    
    /** The email2. */
    protected String email2;
    
    /** The officeurl. */
    protected String officeurl;
    
    /** The password. */
    protected String password;
    
    /** The password hint. */
    protected String passwordHint;
    
    /** The password hint answer. */
    protected String passwordHintAnswer;
    
    /** The personal url. */
    protected String personalUrl;
    
    /** The expiration date. */
    protected String expirationDate;
    
    /** The comm options. */
    protected CommOptionsType commOptions;
    
    /** The meeting types. */
    protected UserType.MeetingTypes meetingTypes;
    
    /** The options. */
    protected OptionsType options;
    
    /** The time zone id. */
    @XmlElement(defaultValue = "-1")
    protected Long timeZoneID;
    
    /** The time zone. */
    protected TimeZoneType timeZone;
    
    /** The time zone with dst. */
    protected String timeZoneWithDST;
    
    /** The tracking. */
    protected TrackingType tracking;
    
    /** The service. */
    protected ServiceType service;
    
    /** The privilege. */
    protected PrivilegeType privilege;
    
    /** The language. */
    protected String language;
    
    /** The locale. */
    protected String locale;
    
    /** The scheduling permission. */
    protected String schedulingPermission;
    
    /** The active. */
    protected ActiveType active;
    
    /** The tsp account. */
    protected UserType.TspAccount tspAccount;
    
    /** The supported services. */
    protected SupportedServicesType supportedServices;
    
    /** The my web ex. */
    protected MywebexType myWebEx;
    
    /** The personal teleconf. */
    protected UserType.PersonalTeleconf personalTeleconf;
    
    /** The third party teleconf. */
    protected UserType.ThirdPartyTeleconf thirdPartyTeleconf;
    
    /** The personal meeting room. */
    protected PersonalMeetingRoomType personalMeetingRoom;
    
    /** The session options. */
    protected SessionOptionsType sessionOptions;
    
    /** The support center. */
    protected UserType.SupportCenter supportCenter;
    
    /** The mp profile number. */
    protected String mpProfileNumber;
    
    /** The security. */
    protected SecurityType security;
    
    /** The language id. */
    protected Long languageID;
    
    /** The web acd prefs. */
    protected UserType.WebACDPrefs webACDPrefs;
    
    /** The remote support. */
    protected UserType.RemoteSupport remoteSupport;
    
    /** The remote access. */
    protected SharingAndRecordingType remoteAccess;

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
     * Gets the category id.
     * 
     * @return the category id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the category id.
     * 
     * @param value the new category id
     */
    public void setCategoryId(Long value) {
        this.categoryId = value;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param value the new description
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the office greeting.
     * 
     * @return the office greeting
     */
    public String getOfficeGreeting() {
        return officeGreeting;
    }

    /**
     * Sets the office greeting.
     * 
     * @param value the new office greeting
     */
    public void setOfficeGreeting(String value) {
        this.officeGreeting = value;
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
    public UserPhonesType getPhones() {
        return phones;
    }

    /**
     * Sets the phones.
     * 
     * @param value the new phones
     */
    public void setPhones(UserPhonesType value) {
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
     * Gets the email2.
     * 
     * @return the email2
     */
    public String getEmail2() {
        return email2;
    }

    /**
     * Sets the email2.
     * 
     * @param value the new email2
     */
    public void setEmail2(String value) {
        this.email2 = value;
    }

    /**
     * Gets the officeurl.
     * 
     * @return the officeurl
     */
    public String getOfficeurl() {
        return officeurl;
    }

    /**
     * Sets the officeurl.
     * 
     * @param value the new officeurl
     */
    public void setOfficeurl(String value) {
        this.officeurl = value;
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
     * Gets the password hint.
     * 
     * @return the password hint
     */
    public String getPasswordHint() {
        return passwordHint;
    }

    /**
     * Sets the password hint.
     * 
     * @param value the new password hint
     */
    public void setPasswordHint(String value) {
        this.passwordHint = value;
    }

    /**
     * Gets the password hint answer.
     * 
     * @return the password hint answer
     */
    public String getPasswordHintAnswer() {
        return passwordHintAnswer;
    }

    /**
     * Sets the password hint answer.
     * 
     * @param value the new password hint answer
     */
    public void setPasswordHintAnswer(String value) {
        this.passwordHintAnswer = value;
    }

    /**
     * Gets the personal url.
     * 
     * @return the personal url
     */
    public String getPersonalUrl() {
        return personalUrl;
    }

    /**
     * Sets the personal url.
     * 
     * @param value the new personal url
     */
    public void setPersonalUrl(String value) {
        this.personalUrl = value;
    }

    /**
     * Gets the expiration date.
     * 
     * @return the expiration date
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the expiration date.
     * 
     * @param value the new expiration date
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the comm options.
     * 
     * @return the comm options
     */
    public CommOptionsType getCommOptions() {
        return commOptions;
    }

    /**
     * Sets the comm options.
     * 
     * @param value the new comm options
     */
    public void setCommOptions(CommOptionsType value) {
        this.commOptions = value;
    }

    /**
     * Gets the meeting types.
     * 
     * @return the meeting types
     */
    public UserType.MeetingTypes getMeetingTypes() {
        return meetingTypes;
    }

    /**
     * Sets the meeting types.
     * 
     * @param value the new meeting types
     */
    public void setMeetingTypes(UserType.MeetingTypes value) {
        this.meetingTypes = value;
    }

    /**
     * Gets the options.
     * 
     * @return the options
     */
    public OptionsType getOptions() {
        return options;
    }

    /**
     * Sets the options.
     * 
     * @param value the new options
     */
    public void setOptions(OptionsType value) {
        this.options = value;
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
     * Gets the time zone.
     * 
     * @return the time zone
     */
    public TimeZoneType getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the time zone.
     * 
     * @param value the new time zone
     */
    public void setTimeZone(TimeZoneType value) {
        this.timeZone = value;
    }

    /**
     * Gets the time zone with dst.
     * 
     * @return the time zone with dst
     */
    public String getTimeZoneWithDST() {
        return timeZoneWithDST;
    }

    /**
     * Sets the time zone with dst.
     * 
     * @param value the new time zone with dst
     */
    public void setTimeZoneWithDST(String value) {
        this.timeZoneWithDST = value;
    }

    /**
     * Gets the tracking.
     * 
     * @return the tracking
     */
    public TrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the tracking.
     * 
     * @param value the new tracking
     */
    public void setTracking(TrackingType value) {
        this.tracking = value;
    }

    /**
     * Gets the service.
     * 
     * @return the service
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * Sets the service.
     * 
     * @param value the new service
     */
    public void setService(ServiceType value) {
        this.service = value;
    }

    /**
     * Gets the privilege.
     * 
     * @return the privilege
     */
    public PrivilegeType getPrivilege() {
        return privilege;
    }

    /**
     * Sets the privilege.
     * 
     * @param value the new privilege
     */
    public void setPrivilege(PrivilegeType value) {
        this.privilege = value;
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
     * Gets the scheduling permission.
     * 
     * @return the scheduling permission
     */
    public String getSchedulingPermission() {
        return schedulingPermission;
    }

    /**
     * Sets the scheduling permission.
     * 
     * @param value the new scheduling permission
     */
    public void setSchedulingPermission(String value) {
        this.schedulingPermission = value;
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
     * Gets the tsp account.
     * 
     * @return the tsp account
     */
    public UserType.TspAccount getTspAccount() {
        return tspAccount;
    }

    /**
     * Sets the tsp account.
     * 
     * @param value the new tsp account
     */
    public void setTspAccount(UserType.TspAccount value) {
        this.tspAccount = value;
    }

    /**
     * Gets the supported services.
     * 
     * @return the supported services
     */
    public SupportedServicesType getSupportedServices() {
        return supportedServices;
    }

    /**
     * Sets the supported services.
     * 
     * @param value the new supported services
     */
    public void setSupportedServices(SupportedServicesType value) {
        this.supportedServices = value;
    }

    /**
     * Gets the my web ex.
     * 
     * @return the my web ex
     */
    public MywebexType getMyWebEx() {
        return myWebEx;
    }

    /**
     * Sets the my web ex.
     * 
     * @param value the new my web ex
     */
    public void setMyWebEx(MywebexType value) {
        this.myWebEx = value;
    }

    /**
     * Gets the personal teleconf.
     * 
     * @return the personal teleconf
     */
    public UserType.PersonalTeleconf getPersonalTeleconf() {
        return personalTeleconf;
    }

    /**
     * Sets the personal teleconf.
     * 
     * @param value the new personal teleconf
     */
    public void setPersonalTeleconf(UserType.PersonalTeleconf value) {
        this.personalTeleconf = value;
    }

    /**
     * Gets the third party teleconf.
     * 
     * @return the third party teleconf
     */
    public UserType.ThirdPartyTeleconf getThirdPartyTeleconf() {
        return thirdPartyTeleconf;
    }

    /**
     * Sets the third party teleconf.
     * 
     * @param value the new third party teleconf
     */
    public void setThirdPartyTeleconf(UserType.ThirdPartyTeleconf value) {
        this.thirdPartyTeleconf = value;
    }

    /**
     * Gets the personal meeting room.
     * 
     * @return the personal meeting room
     */
    public PersonalMeetingRoomType getPersonalMeetingRoom() {
        return personalMeetingRoom;
    }

    /**
     * Sets the personal meeting room.
     * 
     * @param value the new personal meeting room
     */
    public void setPersonalMeetingRoom(PersonalMeetingRoomType value) {
        this.personalMeetingRoom = value;
    }

    /**
     * Gets the session options.
     * 
     * @return the session options
     */
    public SessionOptionsType getSessionOptions() {
        return sessionOptions;
    }

    /**
     * Sets the session options.
     * 
     * @param value the new session options
     */
    public void setSessionOptions(SessionOptionsType value) {
        this.sessionOptions = value;
    }

    /**
     * Gets the support center.
     * 
     * @return the support center
     */
    public UserType.SupportCenter getSupportCenter() {
        return supportCenter;
    }

    /**
     * Sets the support center.
     * 
     * @param value the new support center
     */
    public void setSupportCenter(UserType.SupportCenter value) {
        this.supportCenter = value;
    }

    /**
     * Gets the mp profile number.
     * 
     * @return the mp profile number
     */
    public String getMpProfileNumber() {
        return mpProfileNumber;
    }

    /**
     * Sets the mp profile number.
     * 
     * @param value the new mp profile number
     */
    public void setMpProfileNumber(String value) {
        this.mpProfileNumber = value;
    }

    /**
     * Gets the security.
     * 
     * @return the security
     */
    public SecurityType getSecurity() {
        return security;
    }

    /**
     * Sets the security.
     * 
     * @param value the new security
     */
    public void setSecurity(SecurityType value) {
        this.security = value;
    }

    /**
     * Gets the language id.
     * 
     * @return the language id
     */
    public Long getLanguageID() {
        return languageID;
    }

    /**
     * Sets the language id.
     * 
     * @param value the new language id
     */
    public void setLanguageID(Long value) {
        this.languageID = value;
    }

    /**
     * Gets the web acd prefs.
     * 
     * @return the web acd prefs
     */
    public UserType.WebACDPrefs getWebACDPrefs() {
        return webACDPrefs;
    }

    /**
     * Sets the web acd prefs.
     * 
     * @param value the new web acd prefs
     */
    public void setWebACDPrefs(UserType.WebACDPrefs value) {
        this.webACDPrefs = value;
    }

    /**
     * Gets the remote support.
     * 
     * @return the remote support
     */
    public UserType.RemoteSupport getRemoteSupport() {
        return remoteSupport;
    }

    /**
     * Sets the remote support.
     * 
     * @param value the new remote support
     */
    public void setRemoteSupport(UserType.RemoteSupport value) {
        this.remoteSupport = value;
    }

    /**
     * Gets the remote access.
     * 
     * @return the remote access
     */
    public SharingAndRecordingType getRemoteAccess() {
        return remoteAccess;
    }

    /**
     * Sets the remote access.
     * 
     * @param value the new remote access
     */
    public void setRemoteAccess(SharingAndRecordingType value) {
        this.remoteAccess = value;
    }


    /**
     * The Class MeetingTypes.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "meetingType"
    })
    public static class MeetingTypes
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The meeting type. */
        @XmlElement(type = Long.class)
        protected List<Long> meetingType;

        /**
         * Gets the meeting type.
         * 
         * @return the meeting type
         */
        public List<Long> getMeetingType() {
            if (meetingType == null) {
                meetingType = new ArrayList<Long>();
            }
            return this.meetingType;
        }

    }


    /**
     * The Class PersonalTeleconf.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "account"
    })
    public static class PersonalTeleconf
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The account. */
        protected List<PersonalAccountType> account;

        /**
         * Gets the account.
         * 
         * @return the account
         */
        public List<PersonalAccountType> getAccount() {
            if (account == null) {
                account = new ArrayList<PersonalAccountType>();
            }
            return this.account;
        }

    }


    /**
     * The Class RemoteSupport.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "autoRequest",
        "defaultClient"
    })
    public static class RemoteSupport
        extends SharingAndRecordingType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The auto request. */
        protected UserType.RemoteSupport.AutoRequest autoRequest;
        
        /** The default client. */
        protected UserType.RemoteSupport.DefaultClient defaultClient;

        /**
         * Gets the auto request.
         * 
         * @return the auto request
         */
        public UserType.RemoteSupport.AutoRequest getAutoRequest() {
            return autoRequest;
        }

        /**
         * Sets the auto request.
         * 
         * @param value the new auto request
         */
        public void setAutoRequest(UserType.RemoteSupport.AutoRequest value) {
            this.autoRequest = value;
        }

        /**
         * Gets the default client.
         * 
         * @return the default client
         */
        public UserType.RemoteSupport.DefaultClient getDefaultClient() {
            return defaultClient;
        }

        /**
         * Sets the default client.
         * 
         * @param value the new default client
         */
        public void setDefaultClient(UserType.RemoteSupport.DefaultClient value) {
            this.defaultClient = value;
        }


        /**
         * The Class AutoRequest.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "enable",
            "request"
        })
        public static class AutoRequest
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The enable. */
            protected boolean enable;
            
            /** The request. */
            protected ScRequestType request;

            /**
             * Checks if is enable.
             * 
             * @return true, if is enable
             */
            public boolean isEnable() {
                return enable;
            }

            /**
             * Sets the enable.
             * 
             * @param value the new enable
             */
            public void setEnable(boolean value) {
                this.enable = value;
            }

            /**
             * Gets the request.
             * 
             * @return the request
             */
            public ScRequestType getRequest() {
                return request;
            }

            /**
             * Sets the request.
             * 
             * @param value the new request
             */
            public void setRequest(ScRequestType value) {
                this.request = value;
            }

        }


        /**
         * The Class DefaultClient.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type",
            "singleSessClient"
        })
        public static class DefaultClient
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The type. */
            @XmlElement(required = true)
            protected ScClientType type;
            
            /** The single sess client. */
            protected ScConsoleType singleSessClient;

            /**
             * Gets the type.
             * 
             * @return the type
             */
            public ScClientType getType() {
                return type;
            }

            /**
             * Sets the type.
             * 
             * @param value the new type
             */
            public void setType(ScClientType value) {
                this.type = value;
            }

            /**
             * Gets the single sess client.
             * 
             * @return the single sess client
             */
            public ScConsoleType getSingleSessClient() {
                return singleSessClient;
            }

            /**
             * Sets the single sess client.
             * 
             * @param value the new single sess client
             */
            public void setSingleSessClient(ScConsoleType value) {
                this.singleSessClient = value;
            }

        }

    }


    /**
     * The Class SupportCenter.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderTabs",
        "serviceDesk"
    })
    public static class SupportCenter
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The order tabs. */
        protected UserType.SupportCenter.OrderTabs orderTabs;
        
        /** The service desk. */
        protected UserType.SupportCenter.ServiceDesk serviceDesk;

        /**
         * Gets the order tabs.
         * 
         * @return the order tabs
         */
        public UserType.SupportCenter.OrderTabs getOrderTabs() {
            return orderTabs;
        }

        /**
         * Sets the order tabs.
         * 
         * @param value the new order tabs
         */
        public void setOrderTabs(UserType.SupportCenter.OrderTabs value) {
            this.orderTabs = value;
        }

        /**
         * Gets the service desk.
         * 
         * @return the service desk
         */
        public UserType.SupportCenter.ServiceDesk getServiceDesk() {
            return serviceDesk;
        }

        /**
         * Sets the service desk.
         * 
         * @param value the new service desk
         */
        public void setServiceDesk(UserType.SupportCenter.ServiceDesk value) {
            this.serviceDesk = value;
        }


        /**
         * The Class OrderTabs.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tab"
        })
        public static class OrderTabs
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The tab. */
            @XmlElement(required = true)
            protected List<ScTabType> tab;

            /**
             * Gets the tab.
             * 
             * @return the tab
             */
            public List<ScTabType> getTab() {
                if (tab == null) {
                    tab = new ArrayList<ScTabType>();
                }
                return this.tab;
            }

        }


        /**
         * The Class ServiceDesk.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "enable"
        })
        public static class ServiceDesk
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The enable. */
            protected Boolean enable;

            /**
             * Checks if is enable.
             * 
             * @return the boolean
             */
            public Boolean isEnable() {
                return enable;
            }

            /**
             * Sets the enable.
             * 
             * @param value the new enable
             */
            public void setEnable(Boolean value) {
                this.enable = value;
            }

        }

    }


    /**
     * The Class ThirdPartyTeleconf.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "account"
    })
    public static class ThirdPartyTeleconf
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The account. */
        protected List<ThirdPartyAccountType> account;

        /**
         * Gets the account.
         * 
         * @return the account
         */
        public List<ThirdPartyAccountType> getAccount() {
            if (account == null) {
                account = new ArrayList<ThirdPartyAccountType>();
            }
            return this.account;
        }

    }


    /**
     * The Class TspAccount.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tspAccount"
    })
    public static class TspAccount
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The tsp account. */
        protected List<TspAccountType> tspAccount;

        /**
         * Gets the tsp account.
         * 
         * @return the tsp account
         */
        public List<TspAccountType> getTspAccount() {
            if (tspAccount == null) {
                tspAccount = new ArrayList<TspAccountType>();
            }
            return this.tspAccount;
        }

    }


    /**
     * The Class WebACDPrefs.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "numAgentSessions",
        "agentMonitorAllRSQueues",
        "managerMonitorAllRSQueues",
        "monitorAllRSAgents"
    })
    public static class WebACDPrefs
        extends WebACDUserRoleType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The num agent sessions. */
        protected Integer numAgentSessions;
        
        /** The agent monitor all rs queues. */
        protected Boolean agentMonitorAllRSQueues;
        
        /** The manager monitor all rs queues. */
        protected Boolean managerMonitorAllRSQueues;
        
        /** The monitor all rs agents. */
        protected Boolean monitorAllRSAgents;

        /**
         * Gets the num agent sessions.
         * 
         * @return the num agent sessions
         */
        public Integer getNumAgentSessions() {
            return numAgentSessions;
        }

        /**
         * Sets the num agent sessions.
         * 
         * @param value the new num agent sessions
         */
        public void setNumAgentSessions(Integer value) {
            this.numAgentSessions = value;
        }

        /**
         * Checks if is agent monitor all rs queues.
         * 
         * @return the boolean
         */
        public Boolean isAgentMonitorAllRSQueues() {
            return agentMonitorAllRSQueues;
        }

        /**
         * Sets the agent monitor all rs queues.
         * 
         * @param value the new agent monitor all rs queues
         */
        public void setAgentMonitorAllRSQueues(Boolean value) {
            this.agentMonitorAllRSQueues = value;
        }

        /**
         * Checks if is manager monitor all rs queues.
         * 
         * @return the boolean
         */
        public Boolean isManagerMonitorAllRSQueues() {
            return managerMonitorAllRSQueues;
        }

        /**
         * Sets the manager monitor all rs queues.
         * 
         * @param value the new manager monitor all rs queues
         */
        public void setManagerMonitorAllRSQueues(Boolean value) {
            this.managerMonitorAllRSQueues = value;
        }

        /**
         * Checks if is monitor all rs agents.
         * 
         * @return the boolean
         */
        public Boolean isMonitorAllRSAgents() {
            return monitorAllRSAgents;
        }

        /**
         * Sets the monitor all rs agents.
         * 
         * @param value the new monitor all rs agents
         */
        public void setMonitorAllRSAgents(Boolean value) {
            this.monitorAllRSAgents = value;
        }

    }

}
