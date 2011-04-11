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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.TimeZoneType;


/**
 * The Class MetaDataType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaDataType", propOrder = {
    "isEnterprise",
    "serviceType",
    "meetingTypes",
    "siteName",
    "brandName",
    "region",
    "currency",
    "timeZoneID",
    "timeZone",
    "parterID",
    "webDomain",
    "meetingDomain",
    "telephonyDomain",
    "pageVersion",
    "clientVersion",
    "pageLanguage",
    "activateStatus",
    "webPageType",
    "iCalendar",
    "myWebExDefaultPage",
    "componentVersion",
    "accountNumLimit",
    "activeUserCount",
    "auoAccountNumLimit",
    "auoActiveUserCount",
    "displayMeetingActualTime",
    "displayOffset"
})
public class MetaDataType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The is enterprise. */
    protected boolean isEnterprise;
    
    /** The service type. */
    @XmlElement(required = true)
    protected List<String> serviceType;
    
    /** The meeting types. */
    protected List<MetaDataType.MeetingTypes> meetingTypes;
    
    /** The site name. */
    @XmlElement(required = true)
    protected String siteName;
    
    /** The brand name. */
    protected List<String> brandName;
    
    /** The region. */
    @XmlElement(required = true)
    protected String region;
    
    /** The currency. */
    @XmlElement(required = true)
    protected String currency;
    
    /** The time zone id. */
    protected long timeZoneID;
    
    /** The time zone. */
    protected TimeZoneType timeZone;
    
    /** The parter id. */
    @XmlElement(required = true)
    protected String parterID;
    
    /** The web domain. */
    @XmlElement(required = true)
    protected String webDomain;
    
    /** The meeting domain. */
    @XmlElement(required = true)
    protected String meetingDomain;
    
    /** The telephony domain. */
    @XmlElement(required = true)
    protected String telephonyDomain;
    
    /** The page version. */
    @XmlElement(required = true)
    protected String pageVersion;
    
    /** The client version. */
    @XmlElement(required = true)
    protected String clientVersion;
    
    /** The page language. */
    @XmlElement(required = true)
    protected String pageLanguage;
    
    /** The activate status. */
    protected boolean activateStatus;
    
    /** The web page type. */
    @XmlElement(defaultValue = "PHP")
    protected WebPageTypeType webPageType;
    
    /** The i calendar. */
    protected Boolean iCalendar;
    
    /** The my web ex default page. */
    protected MyWebExPageType myWebExDefaultPage;
    
    /** The component version. */
    protected String componentVersion;
    
    /** The account num limit. */
    protected Long accountNumLimit;
    
    /** The active user count. */
    protected Long activeUserCount;
    
    /** The auo account num limit. */
    protected Long auoAccountNumLimit;
    
    /** The auo active user count. */
    protected Long auoActiveUserCount;
    
    /** The display meeting actual time. */
    protected Boolean displayMeetingActualTime;
    
    /** The display offset. */
    protected Boolean displayOffset;

    /**
     * Checks if is checks if is enterprise.
     * 
     * @return true, if is checks if is enterprise
     */
    public boolean isIsEnterprise() {
        return isEnterprise;
    }

    /**
     * Sets the checks if is enterprise.
     * 
     * @param value the new checks if is enterprise
     */
    public void setIsEnterprise(boolean value) {
        this.isEnterprise = value;
    }

    /**
     * Gets the service type.
     * 
     * @return the service type
     */
    public List<String> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<String>();
        }
        return this.serviceType;
    }

    /**
     * Gets the meeting types.
     * 
     * @return the meeting types
     */
    public List<MetaDataType.MeetingTypes> getMeetingTypes() {
        if (meetingTypes == null) {
            meetingTypes = new ArrayList<MetaDataType.MeetingTypes>();
        }
        return this.meetingTypes;
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
     * Gets the brand name.
     * 
     * @return the brand name
     */
    public List<String> getBrandName() {
        if (brandName == null) {
            brandName = new ArrayList<String>();
        }
        return this.brandName;
    }

    /**
     * Gets the region.
     * 
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the region.
     * 
     * @param value the new region
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the currency.
     * 
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the currency.
     * 
     * @param value the new currency
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the time zone id.
     * 
     * @return the time zone id
     */
    public long getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the time zone id.
     * 
     * @param value the new time zone id
     */
    public void setTimeZoneID(long value) {
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
     * Gets the parter id.
     * 
     * @return the parter id
     */
    public String getParterID() {
        return parterID;
    }

    /**
     * Sets the parter id.
     * 
     * @param value the new parter id
     */
    public void setParterID(String value) {
        this.parterID = value;
    }

    /**
     * Gets the web domain.
     * 
     * @return the web domain
     */
    public String getWebDomain() {
        return webDomain;
    }

    /**
     * Sets the web domain.
     * 
     * @param value the new web domain
     */
    public void setWebDomain(String value) {
        this.webDomain = value;
    }

    /**
     * Gets the meeting domain.
     * 
     * @return the meeting domain
     */
    public String getMeetingDomain() {
        return meetingDomain;
    }

    /**
     * Sets the meeting domain.
     * 
     * @param value the new meeting domain
     */
    public void setMeetingDomain(String value) {
        this.meetingDomain = value;
    }

    /**
     * Gets the telephony domain.
     * 
     * @return the telephony domain
     */
    public String getTelephonyDomain() {
        return telephonyDomain;
    }

    /**
     * Sets the telephony domain.
     * 
     * @param value the new telephony domain
     */
    public void setTelephonyDomain(String value) {
        this.telephonyDomain = value;
    }

    /**
     * Gets the page version.
     * 
     * @return the page version
     */
    public String getPageVersion() {
        return pageVersion;
    }

    /**
     * Sets the page version.
     * 
     * @param value the new page version
     */
    public void setPageVersion(String value) {
        this.pageVersion = value;
    }

    /**
     * Gets the client version.
     * 
     * @return the client version
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * Sets the client version.
     * 
     * @param value the new client version
     */
    public void setClientVersion(String value) {
        this.clientVersion = value;
    }

    /**
     * Gets the page language.
     * 
     * @return the page language
     */
    public String getPageLanguage() {
        return pageLanguage;
    }

    /**
     * Sets the page language.
     * 
     * @param value the new page language
     */
    public void setPageLanguage(String value) {
        this.pageLanguage = value;
    }

    /**
     * Checks if is activate status.
     * 
     * @return true, if is activate status
     */
    public boolean isActivateStatus() {
        return activateStatus;
    }

    /**
     * Sets the activate status.
     * 
     * @param value the new activate status
     */
    public void setActivateStatus(boolean value) {
        this.activateStatus = value;
    }

    /**
     * Gets the web page type.
     * 
     * @return the web page type
     */
    public WebPageTypeType getWebPageType() {
        return webPageType;
    }

    /**
     * Sets the web page type.
     * 
     * @param value the new web page type
     */
    public void setWebPageType(WebPageTypeType value) {
        this.webPageType = value;
    }

    /**
     * Checks if is i calendar.
     * 
     * @return the boolean
     */
    public Boolean isICalendar() {
        return iCalendar;
    }

    /**
     * Sets the i calendar.
     * 
     * @param value the new i calendar
     */
    public void setICalendar(Boolean value) {
        this.iCalendar = value;
    }

    /**
     * Gets the my web ex default page.
     * 
     * @return the my web ex default page
     */
    public MyWebExPageType getMyWebExDefaultPage() {
        return myWebExDefaultPage;
    }

    /**
     * Sets the my web ex default page.
     * 
     * @param value the new my web ex default page
     */
    public void setMyWebExDefaultPage(MyWebExPageType value) {
        this.myWebExDefaultPage = value;
    }

    /**
     * Gets the component version.
     * 
     * @return the component version
     */
    public String getComponentVersion() {
        return componentVersion;
    }

    /**
     * Sets the component version.
     * 
     * @param value the new component version
     */
    public void setComponentVersion(String value) {
        this.componentVersion = value;
    }

    /**
     * Gets the account num limit.
     * 
     * @return the account num limit
     */
    public Long getAccountNumLimit() {
        return accountNumLimit;
    }

    /**
     * Sets the account num limit.
     * 
     * @param value the new account num limit
     */
    public void setAccountNumLimit(Long value) {
        this.accountNumLimit = value;
    }

    /**
     * Gets the active user count.
     * 
     * @return the active user count
     */
    public Long getActiveUserCount() {
        return activeUserCount;
    }

    /**
     * Sets the active user count.
     * 
     * @param value the new active user count
     */
    public void setActiveUserCount(Long value) {
        this.activeUserCount = value;
    }

    /**
     * Gets the auo account num limit.
     * 
     * @return the auo account num limit
     */
    public Long getAuoAccountNumLimit() {
        return auoAccountNumLimit;
    }

    /**
     * Sets the auo account num limit.
     * 
     * @param value the new auo account num limit
     */
    public void setAuoAccountNumLimit(Long value) {
        this.auoAccountNumLimit = value;
    }

    /**
     * Gets the auo active user count.
     * 
     * @return the auo active user count
     */
    public Long getAuoActiveUserCount() {
        return auoActiveUserCount;
    }

    /**
     * Sets the auo active user count.
     * 
     * @param value the new auo active user count
     */
    public void setAuoActiveUserCount(Long value) {
        this.auoActiveUserCount = value;
    }

    /**
     * Checks if is display meeting actual time.
     * 
     * @return the boolean
     */
    public Boolean isDisplayMeetingActualTime() {
        return displayMeetingActualTime;
    }

    /**
     * Sets the display meeting actual time.
     * 
     * @param value the new display meeting actual time
     */
    public void setDisplayMeetingActualTime(Boolean value) {
        this.displayMeetingActualTime = value;
    }

    /**
     * Checks if is display offset.
     * 
     * @return the boolean
     */
    public Boolean isDisplayOffset() {
        return displayOffset;
    }

    /**
     * Sets the display offset.
     * 
     * @param value the new display offset
     */
    public void setDisplayOffset(Boolean value) {
        this.displayOffset = value;
    }


    /**
     * The Class MeetingTypes.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "meetingTypeID",
        "meetingTypeName"
    })
    public static class MeetingTypes
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The meeting type id. */
        protected long meetingTypeID;
        
        /** The meeting type name. */
        @XmlElement(required = true)
        protected String meetingTypeName;

        /**
         * Gets the meeting type id.
         * 
         * @return the meeting type id
         */
        public long getMeetingTypeID() {
            return meetingTypeID;
        }

        /**
         * Sets the meeting type id.
         * 
         * @param value the new meeting type id
         */
        public void setMeetingTypeID(long value) {
            this.meetingTypeID = value;
        }

        /**
         * Gets the meeting type name.
         * 
         * @return the meeting type name
         */
        public String getMeetingTypeName() {
            return meetingTypeName;
        }

        /**
         * Sets the meeting type name.
         * 
         * @param value the new meeting type name
         */
        public void setMeetingTypeName(String value) {
            this.meetingTypeName = value;
        }

    }

}
