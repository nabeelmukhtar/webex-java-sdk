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
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.PersonalTeleServerType;


/**
 * The Class TelephonyConfigType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telephonyConfigType", propOrder = {
    "isTSPUsingTelephonyAPI",
    "serviceName",
    "participantAccessCodeLabel",
    "subscriberAccessCodeLabel",
    "attendeeIDLabel",
    "primaryAdaptorURL",
    "secondaryAdaptorURL",
    "internetPhone",
    "callInTeleconferencing",
    "tollFreeCallinTeleconferencing",
    "callBackTeleconferencing",
    "callInNumber",
    "defaultTeleServerSubject",
    "subscribeName",
    "subscribePassword",
    "defaultPhoneLines",
    "defaultSpeakingLines",
    "majorCountryCode",
    "majorAreaCode",
    "publicName",
    "hybridTeleconference",
    "instantHelp",
    "customerManage",
    "tsRouting",
    "teleServerName",
    "maxCallersNumber",
    "isSpecified",
    "isContinue",
    "intlCallBackTeleconferencing",
    "personalTeleconf",
    "multiMediaPlatform",
    "multiMediaHostName",
    "broadcastAudioStream",
    "tspAdaptorSettings",
    "meetingPlace",
    "otherTeleServiceName",
    "supportAdapterlessTSP",
    "displayAttendeeID",
    "provisionTeleAccount",
    "choosePCN",
    "audioOnly",
    "configTollAndTollFreeNum",
    "configPrimaryTS"
})
public class TelephonyConfigType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The is tsp using telephony api. */
    protected Boolean isTSPUsingTelephonyAPI;
    
    /** The service name. */
    protected String serviceName;
    
    /** The participant access code label. */
    protected String participantAccessCodeLabel;
    
    /** The subscriber access code label. */
    protected String subscriberAccessCodeLabel;
    
    /** The attendee id label. */
    protected String attendeeIDLabel;
    
    /** The primary adaptor url. */
    protected String primaryAdaptorURL;
    
    /** The secondary adaptor url. */
    protected String secondaryAdaptorURL;
    
    /** The internet phone. */
    protected Boolean internetPhone;
    
    /** The call in teleconferencing. */
    protected Boolean callInTeleconferencing;
    
    /** The toll free callin teleconferencing. */
    protected Boolean tollFreeCallinTeleconferencing;
    
    /** The call back teleconferencing. */
    @XmlElement(defaultValue = "false")
    protected Boolean callBackTeleconferencing;
    
    /** The call in number. */
    protected String callInNumber;
    
    /** The default tele server subject. */
    protected String defaultTeleServerSubject;
    
    /** The subscribe name. */
    protected String subscribeName;
    
    /** The subscribe password. */
    protected String subscribePassword;
    
    /** The default phone lines. */
    protected String defaultPhoneLines;
    
    /** The default speaking lines. */
    protected String defaultSpeakingLines;
    
    /** The major country code. */
    protected String majorCountryCode;
    
    /** The major area code. */
    protected String majorAreaCode;
    
    /** The public name. */
    protected String publicName;
    
    /** The hybrid teleconference. */
    protected Boolean hybridTeleconference;
    
    /** The instant help. */
    protected Boolean instantHelp;
    
    /** The customer manage. */
    protected Boolean customerManage;
    
    /** The ts routing. */
    @XmlElement(name = "TSRouting")
    protected TSRouting tsRouting;
    
    /** The tele server name. */
    protected String teleServerName;
    
    /** The max callers number. */
    protected Long maxCallersNumber;
    
    /** The is specified. */
    protected Boolean isSpecified;
    
    /** The is continue. */
    protected Boolean isContinue;
    
    /** The intl call back teleconferencing. */
    protected Boolean intlCallBackTeleconferencing;
    
    /** The personal teleconf. */
    protected TelephonyConfigType.PersonalTeleconf personalTeleconf;
    
    /** The multi media platform. */
    protected Boolean multiMediaPlatform;
    
    /** The multi media host name. */
    protected String multiMediaHostName;
    
    /** The broadcast audio stream. */
    protected Boolean broadcastAudioStream;
    
    /** The tsp adaptor settings. */
    @XmlElement(required = true)
    protected TelephonyConfigType.TspAdaptorSettings tspAdaptorSettings;
    
    /** The meeting place. */
    @XmlElement(required = true)
    protected MeetingPlaceTelephonyType meetingPlace;
    
    /** The other tele service name. */
    protected String otherTeleServiceName;
    
    /** The support adapterless tsp. */
    protected Boolean supportAdapterlessTSP;
    
    /** The display attendee id. */
    protected Boolean displayAttendeeID;
    
    /** The provision tele account. */
    protected Boolean provisionTeleAccount;
    
    /** The choose pcn. */
    protected Boolean choosePCN;
    
    /** The audio only. */
    protected Boolean audioOnly;
    
    /** The config toll and toll free num. */
    protected Boolean configTollAndTollFreeNum;
    
    /** The config primary ts. */
    protected Boolean configPrimaryTS;

    /**
     * Checks if is is tsp using telephony api.
     * 
     * @return the boolean
     */
    public Boolean isIsTSPUsingTelephonyAPI() {
        return isTSPUsingTelephonyAPI;
    }

    /**
     * Sets the checks if is tsp using telephony api.
     * 
     * @param value the new checks if is tsp using telephony api
     */
    public void setIsTSPUsingTelephonyAPI(Boolean value) {
        this.isTSPUsingTelephonyAPI = value;
    }

    /**
     * Gets the service name.
     * 
     * @return the service name
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the service name.
     * 
     * @param value the new service name
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the participant access code label.
     * 
     * @return the participant access code label
     */
    public String getParticipantAccessCodeLabel() {
        return participantAccessCodeLabel;
    }

    /**
     * Sets the participant access code label.
     * 
     * @param value the new participant access code label
     */
    public void setParticipantAccessCodeLabel(String value) {
        this.participantAccessCodeLabel = value;
    }

    /**
     * Gets the subscriber access code label.
     * 
     * @return the subscriber access code label
     */
    public String getSubscriberAccessCodeLabel() {
        return subscriberAccessCodeLabel;
    }

    /**
     * Sets the subscriber access code label.
     * 
     * @param value the new subscriber access code label
     */
    public void setSubscriberAccessCodeLabel(String value) {
        this.subscriberAccessCodeLabel = value;
    }

    /**
     * Gets the attendee id label.
     * 
     * @return the attendee id label
     */
    public String getAttendeeIDLabel() {
        return attendeeIDLabel;
    }

    /**
     * Sets the attendee id label.
     * 
     * @param value the new attendee id label
     */
    public void setAttendeeIDLabel(String value) {
        this.attendeeIDLabel = value;
    }

    /**
     * Gets the primary adaptor url.
     * 
     * @return the primary adaptor url
     */
    public String getPrimaryAdaptorURL() {
        return primaryAdaptorURL;
    }

    /**
     * Sets the primary adaptor url.
     * 
     * @param value the new primary adaptor url
     */
    public void setPrimaryAdaptorURL(String value) {
        this.primaryAdaptorURL = value;
    }

    /**
     * Gets the secondary adaptor url.
     * 
     * @return the secondary adaptor url
     */
    public String getSecondaryAdaptorURL() {
        return secondaryAdaptorURL;
    }

    /**
     * Sets the secondary adaptor url.
     * 
     * @param value the new secondary adaptor url
     */
    public void setSecondaryAdaptorURL(String value) {
        this.secondaryAdaptorURL = value;
    }

    /**
     * Checks if is internet phone.
     * 
     * @return the boolean
     */
    public Boolean isInternetPhone() {
        return internetPhone;
    }

    /**
     * Sets the internet phone.
     * 
     * @param value the new internet phone
     */
    public void setInternetPhone(Boolean value) {
        this.internetPhone = value;
    }

    /**
     * Checks if is call in teleconferencing.
     * 
     * @return the boolean
     */
    public Boolean isCallInTeleconferencing() {
        return callInTeleconferencing;
    }

    /**
     * Sets the call in teleconferencing.
     * 
     * @param value the new call in teleconferencing
     */
    public void setCallInTeleconferencing(Boolean value) {
        this.callInTeleconferencing = value;
    }

    /**
     * Checks if is toll free callin teleconferencing.
     * 
     * @return the boolean
     */
    public Boolean isTollFreeCallinTeleconferencing() {
        return tollFreeCallinTeleconferencing;
    }

    /**
     * Sets the toll free callin teleconferencing.
     * 
     * @param value the new toll free callin teleconferencing
     */
    public void setTollFreeCallinTeleconferencing(Boolean value) {
        this.tollFreeCallinTeleconferencing = value;
    }

    /**
     * Checks if is call back teleconferencing.
     * 
     * @return the boolean
     */
    public Boolean isCallBackTeleconferencing() {
        return callBackTeleconferencing;
    }

    /**
     * Sets the call back teleconferencing.
     * 
     * @param value the new call back teleconferencing
     */
    public void setCallBackTeleconferencing(Boolean value) {
        this.callBackTeleconferencing = value;
    }

    /**
     * Gets the call in number.
     * 
     * @return the call in number
     */
    public String getCallInNumber() {
        return callInNumber;
    }

    /**
     * Sets the call in number.
     * 
     * @param value the new call in number
     */
    public void setCallInNumber(String value) {
        this.callInNumber = value;
    }

    /**
     * Gets the default tele server subject.
     * 
     * @return the default tele server subject
     */
    public String getDefaultTeleServerSubject() {
        return defaultTeleServerSubject;
    }

    /**
     * Sets the default tele server subject.
     * 
     * @param value the new default tele server subject
     */
    public void setDefaultTeleServerSubject(String value) {
        this.defaultTeleServerSubject = value;
    }

    /**
     * Gets the subscribe name.
     * 
     * @return the subscribe name
     */
    public String getSubscribeName() {
        return subscribeName;
    }

    /**
     * Sets the subscribe name.
     * 
     * @param value the new subscribe name
     */
    public void setSubscribeName(String value) {
        this.subscribeName = value;
    }

    /**
     * Gets the subscribe password.
     * 
     * @return the subscribe password
     */
    public String getSubscribePassword() {
        return subscribePassword;
    }

    /**
     * Sets the subscribe password.
     * 
     * @param value the new subscribe password
     */
    public void setSubscribePassword(String value) {
        this.subscribePassword = value;
    }

    /**
     * Gets the default phone lines.
     * 
     * @return the default phone lines
     */
    public String getDefaultPhoneLines() {
        return defaultPhoneLines;
    }

    /**
     * Sets the default phone lines.
     * 
     * @param value the new default phone lines
     */
    public void setDefaultPhoneLines(String value) {
        this.defaultPhoneLines = value;
    }

    /**
     * Gets the default speaking lines.
     * 
     * @return the default speaking lines
     */
    public String getDefaultSpeakingLines() {
        return defaultSpeakingLines;
    }

    /**
     * Sets the default speaking lines.
     * 
     * @param value the new default speaking lines
     */
    public void setDefaultSpeakingLines(String value) {
        this.defaultSpeakingLines = value;
    }

    /**
     * Gets the major country code.
     * 
     * @return the major country code
     */
    public String getMajorCountryCode() {
        return majorCountryCode;
    }

    /**
     * Sets the major country code.
     * 
     * @param value the new major country code
     */
    public void setMajorCountryCode(String value) {
        this.majorCountryCode = value;
    }

    /**
     * Gets the major area code.
     * 
     * @return the major area code
     */
    public String getMajorAreaCode() {
        return majorAreaCode;
    }

    /**
     * Sets the major area code.
     * 
     * @param value the new major area code
     */
    public void setMajorAreaCode(String value) {
        this.majorAreaCode = value;
    }

    /**
     * Gets the public name.
     * 
     * @return the public name
     */
    public String getPublicName() {
        return publicName;
    }

    /**
     * Sets the public name.
     * 
     * @param value the new public name
     */
    public void setPublicName(String value) {
        this.publicName = value;
    }

    /**
     * Checks if is hybrid teleconference.
     * 
     * @return the boolean
     */
    public Boolean isHybridTeleconference() {
        return hybridTeleconference;
    }

    /**
     * Sets the hybrid teleconference.
     * 
     * @param value the new hybrid teleconference
     */
    public void setHybridTeleconference(Boolean value) {
        this.hybridTeleconference = value;
    }

    /**
     * Checks if is instant help.
     * 
     * @return the boolean
     */
    public Boolean isInstantHelp() {
        return instantHelp;
    }

    /**
     * Sets the instant help.
     * 
     * @param value the new instant help
     */
    public void setInstantHelp(Boolean value) {
        this.instantHelp = value;
    }

    /**
     * Checks if is customer manage.
     * 
     * @return the boolean
     */
    public Boolean isCustomerManage() {
        return customerManage;
    }

    /**
     * Sets the customer manage.
     * 
     * @param value the new customer manage
     */
    public void setCustomerManage(Boolean value) {
        this.customerManage = value;
    }

    /**
     * Gets the tS routing.
     * 
     * @return the tS routing
     */
    public TSRouting getTSRouting() {
        return tsRouting;
    }

    /**
     * Sets the tS routing.
     * 
     * @param value the new tS routing
     */
    public void setTSRouting(TSRouting value) {
        this.tsRouting = value;
    }

    /**
     * Gets the tele server name.
     * 
     * @return the tele server name
     */
    public String getTeleServerName() {
        return teleServerName;
    }

    /**
     * Sets the tele server name.
     * 
     * @param value the new tele server name
     */
    public void setTeleServerName(String value) {
        this.teleServerName = value;
    }

    /**
     * Gets the max callers number.
     * 
     * @return the max callers number
     */
    public Long getMaxCallersNumber() {
        return maxCallersNumber;
    }

    /**
     * Sets the max callers number.
     * 
     * @param value the new max callers number
     */
    public void setMaxCallersNumber(Long value) {
        this.maxCallersNumber = value;
    }

    /**
     * Checks if is is specified.
     * 
     * @return the boolean
     */
    public Boolean isIsSpecified() {
        return isSpecified;
    }

    /**
     * Sets the checks if is specified.
     * 
     * @param value the new checks if is specified
     */
    public void setIsSpecified(Boolean value) {
        this.isSpecified = value;
    }

    /**
     * Checks if is is continue.
     * 
     * @return the boolean
     */
    public Boolean isIsContinue() {
        return isContinue;
    }

    /**
     * Sets the checks if is continue.
     * 
     * @param value the new checks if is continue
     */
    public void setIsContinue(Boolean value) {
        this.isContinue = value;
    }

    /**
     * Checks if is intl call back teleconferencing.
     * 
     * @return the boolean
     */
    public Boolean isIntlCallBackTeleconferencing() {
        return intlCallBackTeleconferencing;
    }

    /**
     * Sets the intl call back teleconferencing.
     * 
     * @param value the new intl call back teleconferencing
     */
    public void setIntlCallBackTeleconferencing(Boolean value) {
        this.intlCallBackTeleconferencing = value;
    }

    /**
     * Gets the personal teleconf.
     * 
     * @return the personal teleconf
     */
    public TelephonyConfigType.PersonalTeleconf getPersonalTeleconf() {
        return personalTeleconf;
    }

    /**
     * Sets the personal teleconf.
     * 
     * @param value the new personal teleconf
     */
    public void setPersonalTeleconf(TelephonyConfigType.PersonalTeleconf value) {
        this.personalTeleconf = value;
    }

    /**
     * Checks if is multi media platform.
     * 
     * @return the boolean
     */
    public Boolean isMultiMediaPlatform() {
        return multiMediaPlatform;
    }

    /**
     * Sets the multi media platform.
     * 
     * @param value the new multi media platform
     */
    public void setMultiMediaPlatform(Boolean value) {
        this.multiMediaPlatform = value;
    }

    /**
     * Gets the multi media host name.
     * 
     * @return the multi media host name
     */
    public String getMultiMediaHostName() {
        return multiMediaHostName;
    }

    /**
     * Sets the multi media host name.
     * 
     * @param value the new multi media host name
     */
    public void setMultiMediaHostName(String value) {
        this.multiMediaHostName = value;
    }

    /**
     * Checks if is broadcast audio stream.
     * 
     * @return the boolean
     */
    public Boolean isBroadcastAudioStream() {
        return broadcastAudioStream;
    }

    /**
     * Sets the broadcast audio stream.
     * 
     * @param value the new broadcast audio stream
     */
    public void setBroadcastAudioStream(Boolean value) {
        this.broadcastAudioStream = value;
    }

    /**
     * Gets the tsp adaptor settings.
     * 
     * @return the tsp adaptor settings
     */
    public TelephonyConfigType.TspAdaptorSettings getTspAdaptorSettings() {
        return tspAdaptorSettings;
    }

    /**
     * Sets the tsp adaptor settings.
     * 
     * @param value the new tsp adaptor settings
     */
    public void setTspAdaptorSettings(TelephonyConfigType.TspAdaptorSettings value) {
        this.tspAdaptorSettings = value;
    }

    /**
     * Gets the meeting place.
     * 
     * @return the meeting place
     */
    public MeetingPlaceTelephonyType getMeetingPlace() {
        return meetingPlace;
    }

    /**
     * Sets the meeting place.
     * 
     * @param value the new meeting place
     */
    public void setMeetingPlace(MeetingPlaceTelephonyType value) {
        this.meetingPlace = value;
    }

    /**
     * Gets the other tele service name.
     * 
     * @return the other tele service name
     */
    public String getOtherTeleServiceName() {
        return otherTeleServiceName;
    }

    /**
     * Sets the other tele service name.
     * 
     * @param value the new other tele service name
     */
    public void setOtherTeleServiceName(String value) {
        this.otherTeleServiceName = value;
    }

    /**
     * Checks if is support adapterless tsp.
     * 
     * @return the boolean
     */
    public Boolean isSupportAdapterlessTSP() {
        return supportAdapterlessTSP;
    }

    /**
     * Sets the support adapterless tsp.
     * 
     * @param value the new support adapterless tsp
     */
    public void setSupportAdapterlessTSP(Boolean value) {
        this.supportAdapterlessTSP = value;
    }

    /**
     * Checks if is display attendee id.
     * 
     * @return the boolean
     */
    public Boolean isDisplayAttendeeID() {
        return displayAttendeeID;
    }

    /**
     * Sets the display attendee id.
     * 
     * @param value the new display attendee id
     */
    public void setDisplayAttendeeID(Boolean value) {
        this.displayAttendeeID = value;
    }

    /**
     * Checks if is provision tele account.
     * 
     * @return the boolean
     */
    public Boolean isProvisionTeleAccount() {
        return provisionTeleAccount;
    }

    /**
     * Sets the provision tele account.
     * 
     * @param value the new provision tele account
     */
    public void setProvisionTeleAccount(Boolean value) {
        this.provisionTeleAccount = value;
    }

    /**
     * Checks if is choose pcn.
     * 
     * @return the boolean
     */
    public Boolean isChoosePCN() {
        return choosePCN;
    }

    /**
     * Sets the choose pcn.
     * 
     * @param value the new choose pcn
     */
    public void setChoosePCN(Boolean value) {
        this.choosePCN = value;
    }

    /**
     * Checks if is audio only.
     * 
     * @return the boolean
     */
    public Boolean isAudioOnly() {
        return audioOnly;
    }

    /**
     * Sets the audio only.
     * 
     * @param value the new audio only
     */
    public void setAudioOnly(Boolean value) {
        this.audioOnly = value;
    }

    /**
     * Checks if is config toll and toll free num.
     * 
     * @return the boolean
     */
    public Boolean isConfigTollAndTollFreeNum() {
        return configTollAndTollFreeNum;
    }

    /**
     * Sets the config toll and toll free num.
     * 
     * @param value the new config toll and toll free num
     */
    public void setConfigTollAndTollFreeNum(Boolean value) {
        this.configTollAndTollFreeNum = value;
    }

    /**
     * Checks if is config primary ts.
     * 
     * @return the boolean
     */
    public Boolean isConfigPrimaryTS() {
        return configPrimaryTS;
    }

    /**
     * Sets the config primary ts.
     * 
     * @param value the new config primary ts
     */
    public void setConfigPrimaryTS(Boolean value) {
        this.configPrimaryTS = value;
    }


    /**
     * The Class PersonalTeleconf.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "primaryLargeServer",
        "backup1LargeServer",
        "backup2LargeServer",
        "primarySmallServer",
        "backup1SmallServer",
        "backup2SmallServer"
    })
    public static class PersonalTeleconf
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The primary large server. */
        protected PersonalTeleServerType primaryLargeServer;
        
        /** The backup1 large server. */
        protected PersonalTeleServerType backup1LargeServer;
        
        /** The backup2 large server. */
        protected PersonalTeleServerType backup2LargeServer;
        
        /** The primary small server. */
        protected PersonalTeleServerType primarySmallServer;
        
        /** The backup1 small server. */
        protected PersonalTeleServerType backup1SmallServer;
        
        /** The backup2 small server. */
        protected PersonalTeleServerType backup2SmallServer;

        /**
         * Gets the primary large server.
         * 
         * @return the primary large server
         */
        public PersonalTeleServerType getPrimaryLargeServer() {
            return primaryLargeServer;
        }

        /**
         * Sets the primary large server.
         * 
         * @param value the new primary large server
         */
        public void setPrimaryLargeServer(PersonalTeleServerType value) {
            this.primaryLargeServer = value;
        }

        /**
         * Gets the backup1 large server.
         * 
         * @return the backup1 large server
         */
        public PersonalTeleServerType getBackup1LargeServer() {
            return backup1LargeServer;
        }

        /**
         * Sets the backup1 large server.
         * 
         * @param value the new backup1 large server
         */
        public void setBackup1LargeServer(PersonalTeleServerType value) {
            this.backup1LargeServer = value;
        }

        /**
         * Gets the backup2 large server.
         * 
         * @return the backup2 large server
         */
        public PersonalTeleServerType getBackup2LargeServer() {
            return backup2LargeServer;
        }

        /**
         * Sets the backup2 large server.
         * 
         * @param value the new backup2 large server
         */
        public void setBackup2LargeServer(PersonalTeleServerType value) {
            this.backup2LargeServer = value;
        }

        /**
         * Gets the primary small server.
         * 
         * @return the primary small server
         */
        public PersonalTeleServerType getPrimarySmallServer() {
            return primarySmallServer;
        }

        /**
         * Sets the primary small server.
         * 
         * @param value the new primary small server
         */
        public void setPrimarySmallServer(PersonalTeleServerType value) {
            this.primarySmallServer = value;
        }

        /**
         * Gets the backup1 small server.
         * 
         * @return the backup1 small server
         */
        public PersonalTeleServerType getBackup1SmallServer() {
            return backup1SmallServer;
        }

        /**
         * Sets the backup1 small server.
         * 
         * @param value the new backup1 small server
         */
        public void setBackup1SmallServer(PersonalTeleServerType value) {
            this.backup1SmallServer = value;
        }

        /**
         * Gets the backup2 small server.
         * 
         * @return the backup2 small server
         */
        public PersonalTeleServerType getBackup2SmallServer() {
            return backup2SmallServer;
        }

        /**
         * Sets the backup2 small server.
         * 
         * @param value the new backup2 small server
         */
        public void setBackup2SmallServer(PersonalTeleServerType value) {
            this.backup2SmallServer = value;
        }

    }


    /**
     * The Class TspAdaptorSettings.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "primaryLarge",
        "backup1Large",
        "backup2Large"
    })
    public static class TspAdaptorSettings
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The primary large. */
        protected TspServerType primaryLarge;
        
        /** The backup1 large. */
        protected TspServerType backup1Large;
        
        /** The backup2 large. */
        protected TspServerType backup2Large;

        /**
         * Gets the primary large.
         * 
         * @return the primary large
         */
        public TspServerType getPrimaryLarge() {
            return primaryLarge;
        }

        /**
         * Sets the primary large.
         * 
         * @param value the new primary large
         */
        public void setPrimaryLarge(TspServerType value) {
            this.primaryLarge = value;
        }

        /**
         * Gets the backup1 large.
         * 
         * @return the backup1 large
         */
        public TspServerType getBackup1Large() {
            return backup1Large;
        }

        /**
         * Sets the backup1 large.
         * 
         * @param value the new backup1 large
         */
        public void setBackup1Large(TspServerType value) {
            this.backup1Large = value;
        }

        /**
         * Gets the backup2 large.
         * 
         * @return the backup2 large
         */
        public TspServerType getBackup2Large() {
            return backup2Large;
        }

        /**
         * Sets the backup2 large.
         * 
         * @param value the new backup2 large
         */
        public void setBackup2Large(TspServerType value) {
            this.backup2Large = value;
        }

    }

}
