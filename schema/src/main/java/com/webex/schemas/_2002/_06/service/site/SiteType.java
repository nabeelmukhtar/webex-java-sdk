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
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class SiteType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siteType", propOrder = {
    "metaData",
    "ucf",
    "clientPlatforms",
    "resourceRestrictions",
    "supportAPI",
    "myWebExConfig",
    "telephonyConfig",
    "commerceAndReporting",
    "tools",
    "custCommunications",
    "trackingCodes",
    "supportedServices",
    "securityOptions",
    "defaults",
    "scheduleMeetingOptions",
    "navBarTop",
    "navMyWebEx",
    "navAllServices",
    "passwordCriteria",
    "accountPasswordCriteria",
    "productivityTools",
    "meetingPlace",
    "eventCenter",
    "salesCenter",
    "connectIntegration"
})
public class SiteType
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The meta data. */
    protected MetaDataType metaData;
    
    /** The ucf. */
    @XmlElement(required = true)
    protected UcfType ucf;
    
    /** The client platforms. */
    protected ClientPlatformsType clientPlatforms;
    
    /** The resource restrictions. */
    @XmlElement(required = true)
    protected ResourceRestrictionsType resourceRestrictions;
    
    /** The support api. */
    @XmlElement(required = true)
    protected SupportAPIType supportAPI;
    
    /** The my web ex config. */
    protected MyWebExConfigType myWebExConfig;
    
    /** The telephony config. */
    protected TelephonyConfigType telephonyConfig;
    
    /** The commerce and reporting. */
    protected CommerceAndReportingType commerceAndReporting;
    
    /** The tools. */
    protected ToolsType tools;
    
    /** The cust communications. */
    protected CustCommunicationsType custCommunications;
    
    /** The tracking codes. */
    protected SiteType.TrackingCodes trackingCodes;
    
    /** The supported services. */
    protected SupportedServicesType supportedServices;
    
    /** The security options. */
    protected SecurityOptionsType securityOptions;
    
    /** The defaults. */
    protected DefaultsType defaults;
    
    /** The schedule meeting options. */
    protected ScheduleOptionsType scheduleMeetingOptions;
    
    /** The nav bar top. */
    protected TopBarType navBarTop;
    
    /** The nav my web ex. */
    protected MyWebExBarType navMyWebEx;
    
    /** The nav all services. */
    protected AllServiceBarType navAllServices;
    
    /** The password criteria. */
    @XmlElement(required = true)
    protected PasswordCriteriaType passwordCriteria;
    
    /** The account password criteria. */
    @XmlElement(required = true)
    protected AccountPasswordCriteriaType accountPasswordCriteria;
    
    /** The productivity tools. */
    protected ProductivityToolType productivityTools;
    
    /** The meeting place. */
    @XmlElement(required = true)
    protected MeetingPlaceType meetingPlace;
    
    /** The event center. */
    protected EventCenterType eventCenter;
    
    /** The sales center. */
    protected SalesCenterType salesCenter;
    
    /** The connect integration. */
    protected ConnectIntegrationType connectIntegration;

    /**
     * Gets the meta data.
     * 
     * @return the meta data
     */
    public MetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the meta data.
     * 
     * @param value the new meta data
     */
    public void setMetaData(MetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the ucf.
     * 
     * @return the ucf
     */
    public UcfType getUcf() {
        return ucf;
    }

    /**
     * Sets the ucf.
     * 
     * @param value the new ucf
     */
    public void setUcf(UcfType value) {
        this.ucf = value;
    }

    /**
     * Gets the client platforms.
     * 
     * @return the client platforms
     */
    public ClientPlatformsType getClientPlatforms() {
        return clientPlatforms;
    }

    /**
     * Sets the client platforms.
     * 
     * @param value the new client platforms
     */
    public void setClientPlatforms(ClientPlatformsType value) {
        this.clientPlatforms = value;
    }

    /**
     * Gets the resource restrictions.
     * 
     * @return the resource restrictions
     */
    public ResourceRestrictionsType getResourceRestrictions() {
        return resourceRestrictions;
    }

    /**
     * Sets the resource restrictions.
     * 
     * @param value the new resource restrictions
     */
    public void setResourceRestrictions(ResourceRestrictionsType value) {
        this.resourceRestrictions = value;
    }

    /**
     * Gets the support api.
     * 
     * @return the support api
     */
    public SupportAPIType getSupportAPI() {
        return supportAPI;
    }

    /**
     * Sets the support api.
     * 
     * @param value the new support api
     */
    public void setSupportAPI(SupportAPIType value) {
        this.supportAPI = value;
    }

    /**
     * Gets the my web ex config.
     * 
     * @return the my web ex config
     */
    public MyWebExConfigType getMyWebExConfig() {
        return myWebExConfig;
    }

    /**
     * Sets the my web ex config.
     * 
     * @param value the new my web ex config
     */
    public void setMyWebExConfig(MyWebExConfigType value) {
        this.myWebExConfig = value;
    }

    /**
     * Gets the telephony config.
     * 
     * @return the telephony config
     */
    public TelephonyConfigType getTelephonyConfig() {
        return telephonyConfig;
    }

    /**
     * Sets the telephony config.
     * 
     * @param value the new telephony config
     */
    public void setTelephonyConfig(TelephonyConfigType value) {
        this.telephonyConfig = value;
    }

    /**
     * Gets the commerce and reporting.
     * 
     * @return the commerce and reporting
     */
    public CommerceAndReportingType getCommerceAndReporting() {
        return commerceAndReporting;
    }

    /**
     * Sets the commerce and reporting.
     * 
     * @param value the new commerce and reporting
     */
    public void setCommerceAndReporting(CommerceAndReportingType value) {
        this.commerceAndReporting = value;
    }

    /**
     * Gets the tools.
     * 
     * @return the tools
     */
    public ToolsType getTools() {
        return tools;
    }

    /**
     * Sets the tools.
     * 
     * @param value the new tools
     */
    public void setTools(ToolsType value) {
        this.tools = value;
    }

    /**
     * Gets the cust communications.
     * 
     * @return the cust communications
     */
    public CustCommunicationsType getCustCommunications() {
        return custCommunications;
    }

    /**
     * Sets the cust communications.
     * 
     * @param value the new cust communications
     */
    public void setCustCommunications(CustCommunicationsType value) {
        this.custCommunications = value;
    }

    /**
     * Gets the tracking codes.
     * 
     * @return the tracking codes
     */
    public SiteType.TrackingCodes getTrackingCodes() {
        return trackingCodes;
    }

    /**
     * Sets the tracking codes.
     * 
     * @param value the new tracking codes
     */
    public void setTrackingCodes(SiteType.TrackingCodes value) {
        this.trackingCodes = value;
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
     * Gets the security options.
     * 
     * @return the security options
     */
    public SecurityOptionsType getSecurityOptions() {
        return securityOptions;
    }

    /**
     * Sets the security options.
     * 
     * @param value the new security options
     */
    public void setSecurityOptions(SecurityOptionsType value) {
        this.securityOptions = value;
    }

    /**
     * Gets the defaults.
     * 
     * @return the defaults
     */
    public DefaultsType getDefaults() {
        return defaults;
    }

    /**
     * Sets the defaults.
     * 
     * @param value the new defaults
     */
    public void setDefaults(DefaultsType value) {
        this.defaults = value;
    }

    /**
     * Gets the schedule meeting options.
     * 
     * @return the schedule meeting options
     */
    public ScheduleOptionsType getScheduleMeetingOptions() {
        return scheduleMeetingOptions;
    }

    /**
     * Sets the schedule meeting options.
     * 
     * @param value the new schedule meeting options
     */
    public void setScheduleMeetingOptions(ScheduleOptionsType value) {
        this.scheduleMeetingOptions = value;
    }

    /**
     * Gets the nav bar top.
     * 
     * @return the nav bar top
     */
    public TopBarType getNavBarTop() {
        return navBarTop;
    }

    /**
     * Sets the nav bar top.
     * 
     * @param value the new nav bar top
     */
    public void setNavBarTop(TopBarType value) {
        this.navBarTop = value;
    }

    /**
     * Gets the nav my web ex.
     * 
     * @return the nav my web ex
     */
    public MyWebExBarType getNavMyWebEx() {
        return navMyWebEx;
    }

    /**
     * Sets the nav my web ex.
     * 
     * @param value the new nav my web ex
     */
    public void setNavMyWebEx(MyWebExBarType value) {
        this.navMyWebEx = value;
    }

    /**
     * Gets the nav all services.
     * 
     * @return the nav all services
     */
    public AllServiceBarType getNavAllServices() {
        return navAllServices;
    }

    /**
     * Sets the nav all services.
     * 
     * @param value the new nav all services
     */
    public void setNavAllServices(AllServiceBarType value) {
        this.navAllServices = value;
    }

    /**
     * Gets the password criteria.
     * 
     * @return the password criteria
     */
    public PasswordCriteriaType getPasswordCriteria() {
        return passwordCriteria;
    }

    /**
     * Sets the password criteria.
     * 
     * @param value the new password criteria
     */
    public void setPasswordCriteria(PasswordCriteriaType value) {
        this.passwordCriteria = value;
    }

    /**
     * Gets the account password criteria.
     * 
     * @return the account password criteria
     */
    public AccountPasswordCriteriaType getAccountPasswordCriteria() {
        return accountPasswordCriteria;
    }

    /**
     * Sets the account password criteria.
     * 
     * @param value the new account password criteria
     */
    public void setAccountPasswordCriteria(AccountPasswordCriteriaType value) {
        this.accountPasswordCriteria = value;
    }

    /**
     * Gets the productivity tools.
     * 
     * @return the productivity tools
     */
    public ProductivityToolType getProductivityTools() {
        return productivityTools;
    }

    /**
     * Sets the productivity tools.
     * 
     * @param value the new productivity tools
     */
    public void setProductivityTools(ProductivityToolType value) {
        this.productivityTools = value;
    }

    /**
     * Gets the meeting place.
     * 
     * @return the meeting place
     */
    public MeetingPlaceType getMeetingPlace() {
        return meetingPlace;
    }

    /**
     * Sets the meeting place.
     * 
     * @param value the new meeting place
     */
    public void setMeetingPlace(MeetingPlaceType value) {
        this.meetingPlace = value;
    }

    /**
     * Gets the event center.
     * 
     * @return the event center
     */
    public EventCenterType getEventCenter() {
        return eventCenter;
    }

    /**
     * Sets the event center.
     * 
     * @param value the new event center
     */
    public void setEventCenter(EventCenterType value) {
        this.eventCenter = value;
    }

    /**
     * Gets the sales center.
     * 
     * @return the sales center
     */
    public SalesCenterType getSalesCenter() {
        return salesCenter;
    }

    /**
     * Sets the sales center.
     * 
     * @param value the new sales center
     */
    public void setSalesCenter(SalesCenterType value) {
        this.salesCenter = value;
    }

    /**
     * Gets the connect integration.
     * 
     * @return the connect integration
     */
    public ConnectIntegrationType getConnectIntegration() {
        return connectIntegration;
    }

    /**
     * Sets the connect integration.
     * 
     * @param value the new connect integration
     */
    public void setConnectIntegration(ConnectIntegrationType value) {
        this.connectIntegration = value;
    }


    /**
     * The Class TrackingCodes.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trackingCode"
    })
    public static class TrackingCodes
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The tracking code. */
        protected List<TrackingCodeType> trackingCode;

        /**
         * Gets the tracking code.
         * 
         * @return the tracking code
         */
        public List<TrackingCodeType> getTrackingCode() {
            if (trackingCode == null) {
                trackingCode = new ArrayList<TrackingCodeType>();
            }
            return this.trackingCode;
        }

    }

}
