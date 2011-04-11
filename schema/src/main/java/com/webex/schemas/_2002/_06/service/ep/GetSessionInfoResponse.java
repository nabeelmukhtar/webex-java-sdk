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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.PhoneLabelNumType;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.CallInNumType;
import com.webex.schemas._2002._06.service.meeting.TelephonySupportType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class GetSessionInfoResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSessionInfoResponse", propOrder = {
    "status",
    "presenter",
    "panelistsInfo",
    "programName",
    "sessionkey",
    "confID",
    "verifyFlashMediaURL",
    "verifyWinMediaURL",
    "accessControl",
    "metaData",
    "telephony",
    "material",
    "test",
    "host",
    "schedule",
    "attendeeOptions",
    "audioStatus",
    "isAudioOnly"
})
public class GetSessionInfoResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The status. */
    protected String status;
    
    /** The presenter. */
    protected List<String> presenter;
    
    /** The panelists info. */
    protected String panelistsInfo;
    
    /** The program name. */
    protected String programName;
    
    /** The sessionkey. */
    protected long sessionkey;
    
    /** The conf id. */
    protected long confID;
    
    /** The verify flash media url. */
    protected String verifyFlashMediaURL;
    
    /** The verify win media url. */
    protected String verifyWinMediaURL;
    
    /** The access control. */
    protected GetSessionInfoResponse.AccessControl accessControl;
    
    /** The meta data. */
    protected GetSessionInfoResponse.MetaData metaData;
    
    /** The telephony. */
    protected GetSessionInfoResponse.Telephony telephony;
    
    /** The material. */
    protected GetSessionInfoResponse.Material material;
    
    /** The test. */
    protected List<GetSessionInfoResponse.Test> test;
    
    /** The host. */
    @XmlElement(required = true)
    protected GetSessionInfoResponse.Host host;
    
    /** The schedule. */
    @XmlElement(required = true)
    protected GetSessionInfoResponse.Schedule schedule;
    
    /** The attendee options. */
    protected GetSessionInfoResponse.AttendeeOptions attendeeOptions;
    
    /** The audio status. */
    protected String audioStatus;
    
    /** The is audio only. */
    protected Boolean isAudioOnly;

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param value the new status
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the presenter.
     * 
     * @return the presenter
     */
    public List<String> getPresenter() {
        if (presenter == null) {
            presenter = new ArrayList<String>();
        }
        return this.presenter;
    }

    /**
     * Gets the panelists info.
     * 
     * @return the panelists info
     */
    public String getPanelistsInfo() {
        return panelistsInfo;
    }

    /**
     * Sets the panelists info.
     * 
     * @param value the new panelists info
     */
    public void setPanelistsInfo(String value) {
        this.panelistsInfo = value;
    }

    /**
     * Gets the program name.
     * 
     * @return the program name
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the program name.
     * 
     * @param value the new program name
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the sessionkey.
     * 
     * @return the sessionkey
     */
    public long getSessionkey() {
        return sessionkey;
    }

    /**
     * Sets the sessionkey.
     * 
     * @param value the new sessionkey
     */
    public void setSessionkey(long value) {
        this.sessionkey = value;
    }

    /**
     * Gets the conf id.
     * 
     * @return the conf id
     */
    public long getConfID() {
        return confID;
    }

    /**
     * Sets the conf id.
     * 
     * @param value the new conf id
     */
    public void setConfID(long value) {
        this.confID = value;
    }

    /**
     * Gets the verify flash media url.
     * 
     * @return the verify flash media url
     */
    public String getVerifyFlashMediaURL() {
        return verifyFlashMediaURL;
    }

    /**
     * Sets the verify flash media url.
     * 
     * @param value the new verify flash media url
     */
    public void setVerifyFlashMediaURL(String value) {
        this.verifyFlashMediaURL = value;
    }

    /**
     * Gets the verify win media url.
     * 
     * @return the verify win media url
     */
    public String getVerifyWinMediaURL() {
        return verifyWinMediaURL;
    }

    /**
     * Sets the verify win media url.
     * 
     * @param value the new verify win media url
     */
    public void setVerifyWinMediaURL(String value) {
        this.verifyWinMediaURL = value;
    }

    /**
     * Gets the access control.
     * 
     * @return the access control
     */
    public GetSessionInfoResponse.AccessControl getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the access control.
     * 
     * @param value the new access control
     */
    public void setAccessControl(GetSessionInfoResponse.AccessControl value) {
        this.accessControl = value;
    }

    /**
     * Gets the meta data.
     * 
     * @return the meta data
     */
    public GetSessionInfoResponse.MetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the meta data.
     * 
     * @param value the new meta data
     */
    public void setMetaData(GetSessionInfoResponse.MetaData value) {
        this.metaData = value;
    }

    /**
     * Gets the telephony.
     * 
     * @return the telephony
     */
    public GetSessionInfoResponse.Telephony getTelephony() {
        return telephony;
    }

    /**
     * Sets the telephony.
     * 
     * @param value the new telephony
     */
    public void setTelephony(GetSessionInfoResponse.Telephony value) {
        this.telephony = value;
    }

    /**
     * Gets the material.
     * 
     * @return the material
     */
    public GetSessionInfoResponse.Material getMaterial() {
        return material;
    }

    /**
     * Sets the material.
     * 
     * @param value the new material
     */
    public void setMaterial(GetSessionInfoResponse.Material value) {
        this.material = value;
    }

    /**
     * Gets the test.
     * 
     * @return the test
     */
    public List<GetSessionInfoResponse.Test> getTest() {
        if (test == null) {
            test = new ArrayList<GetSessionInfoResponse.Test>();
        }
        return this.test;
    }

    /**
     * Gets the host.
     * 
     * @return the host
     */
    public GetSessionInfoResponse.Host getHost() {
        return host;
    }

    /**
     * Sets the host.
     * 
     * @param value the new host
     */
    public void setHost(GetSessionInfoResponse.Host value) {
        this.host = value;
    }

    /**
     * Gets the schedule.
     * 
     * @return the schedule
     */
    public GetSessionInfoResponse.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the schedule.
     * 
     * @param value the new schedule
     */
    public void setSchedule(GetSessionInfoResponse.Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the attendee options.
     * 
     * @return the attendee options
     */
    public GetSessionInfoResponse.AttendeeOptions getAttendeeOptions() {
        return attendeeOptions;
    }

    /**
     * Sets the attendee options.
     * 
     * @param value the new attendee options
     */
    public void setAttendeeOptions(GetSessionInfoResponse.AttendeeOptions value) {
        this.attendeeOptions = value;
    }

    /**
     * Gets the audio status.
     * 
     * @return the audio status
     */
    public String getAudioStatus() {
        return audioStatus;
    }

    /**
     * Sets the audio status.
     * 
     * @param value the new audio status
     */
    public void setAudioStatus(String value) {
        this.audioStatus = value;
    }

    /**
     * Checks if is is audio only.
     * 
     * @return the boolean
     */
    public Boolean isIsAudioOnly() {
        return isAudioOnly;
    }

    /**
     * Sets the checks if is audio only.
     * 
     * @param value the new checks if is audio only
     */
    public void setIsAudioOnly(Boolean value) {
        this.isAudioOnly = value;
    }


    /**
     * The Class AccessControl.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sessionPassword",
        "listStatus",
        "registration",
        "registrationURL",
        "passwordReq"
    })
    public static class AccessControl
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The session password. */
        protected String sessionPassword;
        
        /** The list status. */
        @XmlElement(required = true)
        protected ListingType listStatus;
        
        /** The registration. */
        protected boolean registration;
        
        /** The registration url. */
        protected String registrationURL;
        
        /** The password req. */
        protected Boolean passwordReq;

        /**
         * Gets the session password.
         * 
         * @return the session password
         */
        public String getSessionPassword() {
            return sessionPassword;
        }

        /**
         * Sets the session password.
         * 
         * @param value the new session password
         */
        public void setSessionPassword(String value) {
            this.sessionPassword = value;
        }

        /**
         * Gets the list status.
         * 
         * @return the list status
         */
        public ListingType getListStatus() {
            return listStatus;
        }

        /**
         * Sets the list status.
         * 
         * @param value the new list status
         */
        public void setListStatus(ListingType value) {
            this.listStatus = value;
        }

        /**
         * Checks if is registration.
         * 
         * @return true, if is registration
         */
        public boolean isRegistration() {
            return registration;
        }

        /**
         * Sets the registration.
         * 
         * @param value the new registration
         */
        public void setRegistration(boolean value) {
            this.registration = value;
        }

        /**
         * Gets the registration url.
         * 
         * @return the registration url
         */
        public String getRegistrationURL() {
            return registrationURL;
        }

        /**
         * Sets the registration url.
         * 
         * @param value the new registration url
         */
        public void setRegistrationURL(String value) {
            this.registrationURL = value;
        }

        /**
         * Checks if is password req.
         * 
         * @return the boolean
         */
        public Boolean isPasswordReq() {
            return passwordReq;
        }

        /**
         * Sets the password req.
         * 
         * @param value the new password req
         */
        public void setPasswordReq(Boolean value) {
            this.passwordReq = value;
        }

    }


    /**
     * The Class AttendeeOptions.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "joinRequiresAccount"
    })
    public static class AttendeeOptions
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The join requires account. */
        protected Boolean joinRequiresAccount;

        /**
         * Checks if is join requires account.
         * 
         * @return the boolean
         */
        public Boolean isJoinRequiresAccount() {
            return joinRequiresAccount;
        }

        /**
         * Sets the join requires account.
         * 
         * @param value the new join requires account
         */
        public void setJoinRequiresAccount(Boolean value) {
            this.joinRequiresAccount = value;
        }

    }


    /**
     * The Class Host.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firstName",
        "lastName",
        "email",
        "webExId",
        "alternateHost"
    })
    public static class Host
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The first name. */
        @XmlElement(required = true)
        protected String firstName;
        
        /** The last name. */
        @XmlElement(required = true)
        protected String lastName;
        
        /** The email. */
        @XmlElement(required = true)
        protected String email;
        
        /** The web ex id. */
        @XmlElement(required = true)
        protected String webExId;
        
        /** The alternate host. */
        protected List<String> alternateHost;

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
         * Gets the alternate host.
         * 
         * @return the alternate host
         */
        public List<String> getAlternateHost() {
            if (alternateHost == null) {
                alternateHost = new ArrayList<String>();
            }
            return this.alternateHost;
        }

    }


    /**
     * The Class Material.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "imageURL",
        "document"
    })
    public static class Material
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The image url. */
        protected String imageURL;
        
        /** The document. */
        protected List<GetSessionInfoResponse.Material.Document> document;

        /**
         * Gets the image url.
         * 
         * @return the image url
         */
        public String getImageURL() {
            return imageURL;
        }

        /**
         * Sets the image url.
         * 
         * @param value the new image url
         */
        public void setImageURL(String value) {
            this.imageURL = value;
        }

        /**
         * Gets the document.
         * 
         * @return the document
         */
        public List<GetSessionInfoResponse.Material.Document> getDocument() {
            if (document == null) {
                document = new ArrayList<GetSessionInfoResponse.Material.Document>();
            }
            return this.document;
        }


        /**
         * The Class Document.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "url",
            "size"
        })
        public static class Document
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The name. */
            @XmlElement(required = true)
            protected String name;
            
            /** The url. */
            @XmlElement(name = "URL", required = true)
            protected String url;
            
            /** The size. */
            @XmlElement(required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter1 .class)
            @XmlSchemaType(name = "integer")
            protected Long size;

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
             * Gets the uRL.
             * 
             * @return the uRL
             */
            public String getURL() {
                return url;
            }

            /**
             * Sets the uRL.
             * 
             * @param value the new uRL
             */
            public void setURL(String value) {
                this.url = value;
            }

            /**
             * Gets the size.
             * 
             * @return the size
             */
            public Long getSize() {
                return size;
            }

            /**
             * Sets the size.
             * 
             * @param value the new size
             */
            public void setSize(Long value) {
                this.size = value;
            }

        }

    }


    /**
     * The Class MetaData.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "confName",
        "sessionType",
        "serviceType",
        "agenda",
        "description",
        "account",
        "opportunity",
        "isRecurring"
    })
    public static class MetaData
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The conf name. */
        @XmlElement(required = true)
        protected String confName;
        
        /** The session type. */
        @XmlElement(required = true, type = String.class, defaultValue = "-1")
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "integer")
        protected Long sessionType;
        
        /** The service type. */
        @XmlElement(required = true)
        protected ServiceTypeType serviceType;
        
        /** The agenda. */
        protected String agenda;
        
        /** The description. */
        protected String description;
        
        /** The account. */
        protected String account;
        
        /** The opportunity. */
        protected String opportunity;
        
        /** The is recurring. */
        protected boolean isRecurring;

        /**
         * Gets the conf name.
         * 
         * @return the conf name
         */
        public String getConfName() {
            return confName;
        }

        /**
         * Sets the conf name.
         * 
         * @param value the new conf name
         */
        public void setConfName(String value) {
            this.confName = value;
        }

        /**
         * Gets the session type.
         * 
         * @return the session type
         */
        public Long getSessionType() {
            return sessionType;
        }

        /**
         * Sets the session type.
         * 
         * @param value the new session type
         */
        public void setSessionType(Long value) {
            this.sessionType = value;
        }

        /**
         * Gets the service type.
         * 
         * @return the service type
         */
        public ServiceTypeType getServiceType() {
            return serviceType;
        }

        /**
         * Sets the service type.
         * 
         * @param value the new service type
         */
        public void setServiceType(ServiceTypeType value) {
            this.serviceType = value;
        }

        /**
         * Gets the agenda.
         * 
         * @return the agenda
         */
        public String getAgenda() {
            return agenda;
        }

        /**
         * Sets the agenda.
         * 
         * @param value the new agenda
         */
        public void setAgenda(String value) {
            this.agenda = value;
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
         * Gets the account.
         * 
         * @return the account
         */
        public String getAccount() {
            return account;
        }

        /**
         * Sets the account.
         * 
         * @param value the new account
         */
        public void setAccount(String value) {
            this.account = value;
        }

        /**
         * Gets the opportunity.
         * 
         * @return the opportunity
         */
        public String getOpportunity() {
            return opportunity;
        }

        /**
         * Sets the opportunity.
         * 
         * @param value the new opportunity
         */
        public void setOpportunity(String value) {
            this.opportunity = value;
        }

        /**
         * Checks if is checks if is recurring.
         * 
         * @return true, if is checks if is recurring
         */
        public boolean isIsRecurring() {
            return isRecurring;
        }

        /**
         * Sets the checks if is recurring.
         * 
         * @param value the new checks if is recurring
         */
        public void setIsRecurring(boolean value) {
            this.isRecurring = value;
        }

    }


    /**
     * The Class Schedule.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startDate",
        "duration",
        "timeZone"
    })
    public static class Schedule
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The start date. */
        @XmlElement(required = true)
        protected String startDate;
        
        /** The duration. */
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "integer")
        protected Long duration;
        
        /** The time zone. */
        @XmlElement(required = true)
        protected String timeZone;

        /**
         * Gets the start date.
         * 
         * @return the start date
         */
        public String getStartDate() {
            return startDate;
        }

        /**
         * Sets the start date.
         * 
         * @param value the new start date
         */
        public void setStartDate(String value) {
            this.startDate = value;
        }

        /**
         * Gets the duration.
         * 
         * @return the duration
         */
        public Long getDuration() {
            return duration;
        }

        /**
         * Sets the duration.
         * 
         * @param value the new duration
         */
        public void setDuration(Long value) {
            this.duration = value;
        }

        /**
         * Gets the time zone.
         * 
         * @return the time zone
         */
        public String getTimeZone() {
            return timeZone;
        }

        /**
         * Sets the time zone.
         * 
         * @param value the new time zone
         */
        public void setTimeZone(String value) {
            this.timeZone = value;
        }

    }


    /**
     * The Class Telephony.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "telephonySupport",
        "extTelephonyDescription",
        "globalCallInNumbersURL",
        "tollFreeRestrictionsURL",
        "callInNum",
        "participantAccessCode",
        "participantLimitedAccessCode",
        "subscriberAccessCode",
        "labels",
        "mpAudio",
        "mpProfileNumber",
        "isMPAudio"
    })
    public static class Telephony
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The telephony support. */
        @XmlElement(required = true)
        protected TelephonySupportType telephonySupport;
        
        /** The ext telephony description. */
        protected String extTelephonyDescription;
        
        /** The global call in numbers url. */
        protected String globalCallInNumbersURL;
        
        /** The toll free restrictions url. */
        protected String tollFreeRestrictionsURL;
        
        /** The call in num. */
        protected GetSessionInfoResponse.Telephony.CallInNum callInNum;
        
        /** The participant access code. */
        protected String participantAccessCode;
        
        /** The participant limited access code. */
        protected String participantLimitedAccessCode;
        
        /** The subscriber access code. */
        protected String subscriberAccessCode;
        
        /** The labels. */
        protected GetSessionInfoResponse.Telephony.Labels labels;
        
        /** The mp audio. */
        protected List<PhoneLabelNumType> mpAudio;
        
        /** The mp profile number. */
        protected String mpProfileNumber;
        
        /** The is mp audio. */
        protected Boolean isMPAudio;

        /**
         * Gets the telephony support.
         * 
         * @return the telephony support
         */
        public TelephonySupportType getTelephonySupport() {
            return telephonySupport;
        }

        /**
         * Sets the telephony support.
         * 
         * @param value the new telephony support
         */
        public void setTelephonySupport(TelephonySupportType value) {
            this.telephonySupport = value;
        }

        /**
         * Gets the ext telephony description.
         * 
         * @return the ext telephony description
         */
        public String getExtTelephonyDescription() {
            return extTelephonyDescription;
        }

        /**
         * Sets the ext telephony description.
         * 
         * @param value the new ext telephony description
         */
        public void setExtTelephonyDescription(String value) {
            this.extTelephonyDescription = value;
        }

        /**
         * Gets the global call in numbers url.
         * 
         * @return the global call in numbers url
         */
        public String getGlobalCallInNumbersURL() {
            return globalCallInNumbersURL;
        }

        /**
         * Sets the global call in numbers url.
         * 
         * @param value the new global call in numbers url
         */
        public void setGlobalCallInNumbersURL(String value) {
            this.globalCallInNumbersURL = value;
        }

        /**
         * Gets the toll free restrictions url.
         * 
         * @return the toll free restrictions url
         */
        public String getTollFreeRestrictionsURL() {
            return tollFreeRestrictionsURL;
        }

        /**
         * Sets the toll free restrictions url.
         * 
         * @param value the new toll free restrictions url
         */
        public void setTollFreeRestrictionsURL(String value) {
            this.tollFreeRestrictionsURL = value;
        }

        /**
         * Gets the call in num.
         * 
         * @return the call in num
         */
        public GetSessionInfoResponse.Telephony.CallInNum getCallInNum() {
            return callInNum;
        }

        /**
         * Sets the call in num.
         * 
         * @param value the new call in num
         */
        public void setCallInNum(GetSessionInfoResponse.Telephony.CallInNum value) {
            this.callInNum = value;
        }

        /**
         * Gets the participant access code.
         * 
         * @return the participant access code
         */
        public String getParticipantAccessCode() {
            return participantAccessCode;
        }

        /**
         * Sets the participant access code.
         * 
         * @param value the new participant access code
         */
        public void setParticipantAccessCode(String value) {
            this.participantAccessCode = value;
        }

        /**
         * Gets the participant limited access code.
         * 
         * @return the participant limited access code
         */
        public String getParticipantLimitedAccessCode() {
            return participantLimitedAccessCode;
        }

        /**
         * Sets the participant limited access code.
         * 
         * @param value the new participant limited access code
         */
        public void setParticipantLimitedAccessCode(String value) {
            this.participantLimitedAccessCode = value;
        }

        /**
         * Gets the subscriber access code.
         * 
         * @return the subscriber access code
         */
        public String getSubscriberAccessCode() {
            return subscriberAccessCode;
        }

        /**
         * Sets the subscriber access code.
         * 
         * @param value the new subscriber access code
         */
        public void setSubscriberAccessCode(String value) {
            this.subscriberAccessCode = value;
        }

        /**
         * Gets the labels.
         * 
         * @return the labels
         */
        public GetSessionInfoResponse.Telephony.Labels getLabels() {
            return labels;
        }

        /**
         * Sets the labels.
         * 
         * @param value the new labels
         */
        public void setLabels(GetSessionInfoResponse.Telephony.Labels value) {
            this.labels = value;
        }

        /**
         * Gets the mp audio.
         * 
         * @return the mp audio
         */
        public List<PhoneLabelNumType> getMpAudio() {
            if (mpAudio == null) {
                mpAudio = new ArrayList<PhoneLabelNumType>();
            }
            return this.mpAudio;
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
         * Checks if is is mp audio.
         * 
         * @return the boolean
         */
        public Boolean isIsMPAudio() {
            return isMPAudio;
        }

        /**
         * Sets the checks if is mp audio.
         * 
         * @param value the new checks if is mp audio
         */
        public void setIsMPAudio(Boolean value) {
            this.isMPAudio = value;
        }


        /**
         * The Class CallInNum.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "backupTollNum"
        })
        public static class CallInNum
            extends CallInNumType
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The backup toll num. */
            protected String backupTollNum;

            /**
             * Gets the backup toll num.
             * 
             * @return the backup toll num
             */
            public String getBackupTollNum() {
                return backupTollNum;
            }

            /**
             * Sets the backup toll num.
             * 
             * @param value the new backup toll num
             */
            public void setBackupTollNum(String value) {
                this.backupTollNum = value;
            }

        }


        /**
         * The Class Labels.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tollFreeCallInLabel",
            "tollCallInLabel",
            "participantAccessLabel",
            "participantLimitedAccessLabel",
            "subscriberAccessLabel",
            "globalCallInNumbersLabel"
        })
        public static class Labels
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The toll free call in label. */
            @XmlElement(required = true)
            protected String tollFreeCallInLabel;
            
            /** The toll call in label. */
            @XmlElement(required = true)
            protected String tollCallInLabel;
            
            /** The participant access label. */
            protected String participantAccessLabel;
            
            /** The participant limited access label. */
            protected String participantLimitedAccessLabel;
            
            /** The subscriber access label. */
            protected String subscriberAccessLabel;
            
            /** The global call in numbers label. */
            protected String globalCallInNumbersLabel;

            /**
             * Gets the toll free call in label.
             * 
             * @return the toll free call in label
             */
            public String getTollFreeCallInLabel() {
                return tollFreeCallInLabel;
            }

            /**
             * Sets the toll free call in label.
             * 
             * @param value the new toll free call in label
             */
            public void setTollFreeCallInLabel(String value) {
                this.tollFreeCallInLabel = value;
            }

            /**
             * Gets the toll call in label.
             * 
             * @return the toll call in label
             */
            public String getTollCallInLabel() {
                return tollCallInLabel;
            }

            /**
             * Sets the toll call in label.
             * 
             * @param value the new toll call in label
             */
            public void setTollCallInLabel(String value) {
                this.tollCallInLabel = value;
            }

            /**
             * Gets the participant access label.
             * 
             * @return the participant access label
             */
            public String getParticipantAccessLabel() {
                return participantAccessLabel;
            }

            /**
             * Sets the participant access label.
             * 
             * @param value the new participant access label
             */
            public void setParticipantAccessLabel(String value) {
                this.participantAccessLabel = value;
            }

            /**
             * Gets the participant limited access label.
             * 
             * @return the participant limited access label
             */
            public String getParticipantLimitedAccessLabel() {
                return participantLimitedAccessLabel;
            }

            /**
             * Sets the participant limited access label.
             * 
             * @param value the new participant limited access label
             */
            public void setParticipantLimitedAccessLabel(String value) {
                this.participantLimitedAccessLabel = value;
            }

            /**
             * Gets the subscriber access label.
             * 
             * @return the subscriber access label
             */
            public String getSubscriberAccessLabel() {
                return subscriberAccessLabel;
            }

            /**
             * Sets the subscriber access label.
             * 
             * @param value the new subscriber access label
             */
            public void setSubscriberAccessLabel(String value) {
                this.subscriberAccessLabel = value;
            }

            /**
             * Gets the global call in numbers label.
             * 
             * @return the global call in numbers label
             */
            public String getGlobalCallInNumbersLabel() {
                return globalCallInNumbersLabel;
            }

            /**
             * Sets the global call in numbers label.
             * 
             * @param value the new global call in numbers label
             */
            public void setGlobalCallInNumbersLabel(String value) {
                this.globalCallInNumbersLabel = value;
            }

        }

    }


    /**
     * The Class Test.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title",
        "titleURL",
        "delivery",
        "status",
        "action",
        "actionURL"
    })
    public static class Test
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The title. */
        @XmlElement(required = true)
        protected String title;
        
        /** The title url. */
        @XmlElement(required = true)
        protected String titleURL;
        
        /** The delivery. */
        @XmlElement(required = true, defaultValue = "IN_SESSION")
        protected TestDeliveryType delivery;
        
        /** The status. */
        @XmlElement(required = true, defaultValue = "NOT_STARTED")
        protected TestStatusType status;
        
        /** The action. */
        protected String action;
        
        /** The action url. */
        protected String actionURL;

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
         * Gets the title url.
         * 
         * @return the title url
         */
        public String getTitleURL() {
            return titleURL;
        }

        /**
         * Sets the title url.
         * 
         * @param value the new title url
         */
        public void setTitleURL(String value) {
            this.titleURL = value;
        }

        /**
         * Gets the delivery.
         * 
         * @return the delivery
         */
        public TestDeliveryType getDelivery() {
            return delivery;
        }

        /**
         * Sets the delivery.
         * 
         * @param value the new delivery
         */
        public void setDelivery(TestDeliveryType value) {
            this.delivery = value;
        }

        /**
         * Gets the status.
         * 
         * @return the status
         */
        public TestStatusType getStatus() {
            return status;
        }

        /**
         * Sets the status.
         * 
         * @param value the new status
         */
        public void setStatus(TestStatusType value) {
            this.status = value;
        }

        /**
         * Gets the action.
         * 
         * @return the action
         */
        public String getAction() {
            return action;
        }

        /**
         * Sets the action.
         * 
         * @param value the new action
         */
        public void setAction(String value) {
            this.action = value;
        }

        /**
         * Gets the action url.
         * 
         * @return the action url
         */
        public String getActionURL() {
            return actionURL;
        }

        /**
         * Sets the action url.
         * 
         * @param value the new action url
         */
        public void setActionURL(String value) {
            this.actionURL = value;
        }

    }

}
