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
 * <p>Java class for metaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metaDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isEnterprise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="meetingTypes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="meetingTypeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="meetingTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeZone" type="{http://www.webex.com/schemas/2002/06/common}timeZoneType" minOccurs="0"/>
 *         &lt;element name="parterID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meetingDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telephonyDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pageVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pageLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activateStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="webPageType" type="{http://www.webex.com/schemas/2002/06/service/site}webPageTypeType" minOccurs="0"/>
 *         &lt;element name="iCalendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="myWebExDefaultPage" type="{http://www.webex.com/schemas/2002/06/service/site}myWebExPageType" minOccurs="0"/>
 *         &lt;element name="componentVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="activeUserCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="auoAccountNumLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="auoActiveUserCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="displayMeetingActualTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayOffset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected boolean isEnterprise;
    @XmlElement(required = true)
    protected List<String> serviceType;
    protected List<MetaDataType.MeetingTypes> meetingTypes;
    @XmlElement(required = true)
    protected String siteName;
    protected List<String> brandName;
    @XmlElement(required = true)
    protected String region;
    @XmlElement(required = true)
    protected String currency;
    protected long timeZoneID;
    protected TimeZoneType timeZone;
    @XmlElement(required = true)
    protected String parterID;
    @XmlElement(required = true)
    protected String webDomain;
    @XmlElement(required = true)
    protected String meetingDomain;
    @XmlElement(required = true)
    protected String telephonyDomain;
    @XmlElement(required = true)
    protected String pageVersion;
    @XmlElement(required = true)
    protected String clientVersion;
    @XmlElement(required = true)
    protected String pageLanguage;
    protected boolean activateStatus;
    @XmlElement(defaultValue = "PHP")
    protected WebPageTypeType webPageType;
    protected Boolean iCalendar;
    protected MyWebExPageType myWebExDefaultPage;
    protected String componentVersion;
    protected Long accountNumLimit;
    protected Long activeUserCount;
    protected Long auoAccountNumLimit;
    protected Long auoActiveUserCount;
    protected Boolean displayMeetingActualTime;
    protected Boolean displayOffset;

    /**
     * Gets the value of the isEnterprise property.
     * 
     */
    public boolean isIsEnterprise() {
        return isEnterprise;
    }

    /**
     * Sets the value of the isEnterprise property.
     * 
     */
    public void setIsEnterprise(boolean value) {
        this.isEnterprise = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<String>();
        }
        return this.serviceType;
    }

    /**
     * Gets the value of the meetingTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataType.MeetingTypes }
     * 
     * 
     */
    public List<MetaDataType.MeetingTypes> getMeetingTypes() {
        if (meetingTypes == null) {
            meetingTypes = new ArrayList<MetaDataType.MeetingTypes>();
        }
        return this.meetingTypes;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBrandName() {
        if (brandName == null) {
            brandName = new ArrayList<String>();
        }
        return this.brandName;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the timeZoneID property.
     * 
     */
    public long getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     */
    public void setTimeZoneID(long value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneType }
     *     
     */
    public TimeZoneType getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneType }
     *     
     */
    public void setTimeZone(TimeZoneType value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the parterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParterID() {
        return parterID;
    }

    /**
     * Sets the value of the parterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParterID(String value) {
        this.parterID = value;
    }

    /**
     * Gets the value of the webDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebDomain() {
        return webDomain;
    }

    /**
     * Sets the value of the webDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebDomain(String value) {
        this.webDomain = value;
    }

    /**
     * Gets the value of the meetingDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingDomain() {
        return meetingDomain;
    }

    /**
     * Sets the value of the meetingDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingDomain(String value) {
        this.meetingDomain = value;
    }

    /**
     * Gets the value of the telephonyDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephonyDomain() {
        return telephonyDomain;
    }

    /**
     * Sets the value of the telephonyDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephonyDomain(String value) {
        this.telephonyDomain = value;
    }

    /**
     * Gets the value of the pageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageVersion() {
        return pageVersion;
    }

    /**
     * Sets the value of the pageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageVersion(String value) {
        this.pageVersion = value;
    }

    /**
     * Gets the value of the clientVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * Sets the value of the clientVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientVersion(String value) {
        this.clientVersion = value;
    }

    /**
     * Gets the value of the pageLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageLanguage() {
        return pageLanguage;
    }

    /**
     * Sets the value of the pageLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageLanguage(String value) {
        this.pageLanguage = value;
    }

    /**
     * Gets the value of the activateStatus property.
     * 
     */
    public boolean isActivateStatus() {
        return activateStatus;
    }

    /**
     * Sets the value of the activateStatus property.
     * 
     */
    public void setActivateStatus(boolean value) {
        this.activateStatus = value;
    }

    /**
     * Gets the value of the webPageType property.
     * 
     * @return
     *     possible object is
     *     {@link WebPageTypeType }
     *     
     */
    public WebPageTypeType getWebPageType() {
        return webPageType;
    }

    /**
     * Sets the value of the webPageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPageTypeType }
     *     
     */
    public void setWebPageType(WebPageTypeType value) {
        this.webPageType = value;
    }

    /**
     * Gets the value of the iCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isICalendar() {
        return iCalendar;
    }

    /**
     * Sets the value of the iCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setICalendar(Boolean value) {
        this.iCalendar = value;
    }

    /**
     * Gets the value of the myWebExDefaultPage property.
     * 
     * @return
     *     possible object is
     *     {@link MyWebExPageType }
     *     
     */
    public MyWebExPageType getMyWebExDefaultPage() {
        return myWebExDefaultPage;
    }

    /**
     * Sets the value of the myWebExDefaultPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyWebExPageType }
     *     
     */
    public void setMyWebExDefaultPage(MyWebExPageType value) {
        this.myWebExDefaultPage = value;
    }

    /**
     * Gets the value of the componentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentVersion() {
        return componentVersion;
    }

    /**
     * Sets the value of the componentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentVersion(String value) {
        this.componentVersion = value;
    }

    /**
     * Gets the value of the accountNumLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountNumLimit() {
        return accountNumLimit;
    }

    /**
     * Sets the value of the accountNumLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountNumLimit(Long value) {
        this.accountNumLimit = value;
    }

    /**
     * Gets the value of the activeUserCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActiveUserCount() {
        return activeUserCount;
    }

    /**
     * Sets the value of the activeUserCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActiveUserCount(Long value) {
        this.activeUserCount = value;
    }

    /**
     * Gets the value of the auoAccountNumLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuoAccountNumLimit() {
        return auoAccountNumLimit;
    }

    /**
     * Sets the value of the auoAccountNumLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuoAccountNumLimit(Long value) {
        this.auoAccountNumLimit = value;
    }

    /**
     * Gets the value of the auoActiveUserCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuoActiveUserCount() {
        return auoActiveUserCount;
    }

    /**
     * Sets the value of the auoActiveUserCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuoActiveUserCount(Long value) {
        this.auoActiveUserCount = value;
    }

    /**
     * Gets the value of the displayMeetingActualTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayMeetingActualTime() {
        return displayMeetingActualTime;
    }

    /**
     * Sets the value of the displayMeetingActualTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayMeetingActualTime(Boolean value) {
        this.displayMeetingActualTime = value;
    }

    /**
     * Gets the value of the displayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayOffset() {
        return displayOffset;
    }

    /**
     * Sets the value of the displayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayOffset(Boolean value) {
        this.displayOffset = value;
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
     *         &lt;element name="meetingTypeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="meetingTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "meetingTypeID",
        "meetingTypeName"
    })
    public static class MeetingTypes
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected long meetingTypeID;
        @XmlElement(required = true)
        protected String meetingTypeName;

        /**
         * Gets the value of the meetingTypeID property.
         * 
         */
        public long getMeetingTypeID() {
            return meetingTypeID;
        }

        /**
         * Sets the value of the meetingTypeID property.
         * 
         */
        public void setMeetingTypeID(long value) {
            this.meetingTypeID = value;
        }

        /**
         * Gets the value of the meetingTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeetingTypeName() {
            return meetingTypeName;
        }

        /**
         * Sets the value of the meetingTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeetingTypeName(String value) {
            this.meetingTypeName = value;
        }

    }

}
