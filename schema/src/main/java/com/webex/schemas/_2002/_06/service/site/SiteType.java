
package com.webex.schemas._2002._06.service.site;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for siteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="siteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="metaData" type="{http://www.webex.com/schemas/2002/06/service/site}metaDataType" minOccurs="0"/>
 *         &lt;element name="ucf" type="{http://www.webex.com/schemas/2002/06/service/site}ucfType"/>
 *         &lt;element name="clientPlatforms" type="{http://www.webex.com/schemas/2002/06/service/site}clientPlatformsType" minOccurs="0"/>
 *         &lt;element name="resourceRestrictions" type="{http://www.webex.com/schemas/2002/06/service/site}resourceRestrictionsType"/>
 *         &lt;element name="supportAPI" type="{http://www.webex.com/schemas/2002/06/service/site}supportAPIType"/>
 *         &lt;element name="myWebExConfig" type="{http://www.webex.com/schemas/2002/06/service/site}myWebExConfigType" minOccurs="0"/>
 *         &lt;element name="telephonyConfig" type="{http://www.webex.com/schemas/2002/06/service/site}telephonyConfigType" minOccurs="0"/>
 *         &lt;element name="commerceAndReporting" type="{http://www.webex.com/schemas/2002/06/service/site}commerceAndReportingType" minOccurs="0"/>
 *         &lt;element name="tools" type="{http://www.webex.com/schemas/2002/06/service/site}toolsType" minOccurs="0"/>
 *         &lt;element name="custCommunications" type="{http://www.webex.com/schemas/2002/06/service/site}custCommunicationsType" minOccurs="0"/>
 *         &lt;element name="trackingCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trackingCode" type="{http://www.webex.com/schemas/2002/06/service/site}trackingCodeType" maxOccurs="10" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="supportedServices" type="{http://www.webex.com/schemas/2002/06/service/site}supportedServicesType" minOccurs="0"/>
 *         &lt;element name="securityOptions" type="{http://www.webex.com/schemas/2002/06/service/site}securityOptionsType" minOccurs="0"/>
 *         &lt;element name="defaults" type="{http://www.webex.com/schemas/2002/06/service/site}defaultsType" minOccurs="0"/>
 *         &lt;element name="scheduleMeetingOptions" type="{http://www.webex.com/schemas/2002/06/service/site}scheduleOptionsType" minOccurs="0"/>
 *         &lt;element name="navBarTop" type="{http://www.webex.com/schemas/2002/06/service/site}topBarType" minOccurs="0"/>
 *         &lt;element name="navMyWebEx" type="{http://www.webex.com/schemas/2002/06/service/site}myWebExBarType" minOccurs="0"/>
 *         &lt;element name="navAllServices" type="{http://www.webex.com/schemas/2002/06/service/site}allServiceBarType" minOccurs="0"/>
 *         &lt;element name="passwordCriteria" type="{http://www.webex.com/schemas/2002/06/service/site}passwordCriteriaType"/>
 *         &lt;element name="accountPasswordCriteria" type="{http://www.webex.com/schemas/2002/06/service/site}accountPasswordCriteriaType"/>
 *         &lt;element name="productivityTools" type="{http://www.webex.com/schemas/2002/06/service/site}productivityToolType" minOccurs="0"/>
 *         &lt;element name="meetingPlace" type="{http://www.webex.com/schemas/2002/06/service/site}meetingPlaceType"/>
 *         &lt;element name="eventCenter" type="{http://www.webex.com/schemas/2002/06/service/site}eventCenterType" minOccurs="0"/>
 *         &lt;element name="salesCenter" type="{http://www.webex.com/schemas/2002/06/service/site}SalesCenterType" minOccurs="0"/>
 *         &lt;element name="connectIntegration" type="{http://www.webex.com/schemas/2002/06/service/site}connectIntegrationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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
{

    protected MetaDataType metaData;
    @XmlElement(required = true)
    protected UcfType ucf;
    protected ClientPlatformsType clientPlatforms;
    @XmlElement(required = true)
    protected ResourceRestrictionsType resourceRestrictions;
    @XmlElement(required = true)
    protected SupportAPIType supportAPI;
    protected MyWebExConfigType myWebExConfig;
    protected TelephonyConfigType telephonyConfig;
    protected CommerceAndReportingType commerceAndReporting;
    protected ToolsType tools;
    protected CustCommunicationsType custCommunications;
    protected SiteType.TrackingCodes trackingCodes;
    protected SupportedServicesType supportedServices;
    protected SecurityOptionsType securityOptions;
    protected DefaultsType defaults;
    protected ScheduleOptionsType scheduleMeetingOptions;
    protected TopBarType navBarTop;
    protected MyWebExBarType navMyWebEx;
    protected AllServiceBarType navAllServices;
    @XmlElement(required = true)
    protected PasswordCriteriaType passwordCriteria;
    @XmlElement(required = true)
    protected AccountPasswordCriteriaType accountPasswordCriteria;
    protected ProductivityToolType productivityTools;
    @XmlElement(required = true)
    protected MeetingPlaceType meetingPlace;
    protected EventCenterType eventCenter;
    protected SalesCenterType salesCenter;
    protected ConnectIntegrationType connectIntegration;

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataType }
     *     
     */
    public MetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataType }
     *     
     */
    public void setMetaData(MetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the ucf property.
     * 
     * @return
     *     possible object is
     *     {@link UcfType }
     *     
     */
    public UcfType getUcf() {
        return ucf;
    }

    /**
     * Sets the value of the ucf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UcfType }
     *     
     */
    public void setUcf(UcfType value) {
        this.ucf = value;
    }

    /**
     * Gets the value of the clientPlatforms property.
     * 
     * @return
     *     possible object is
     *     {@link ClientPlatformsType }
     *     
     */
    public ClientPlatformsType getClientPlatforms() {
        return clientPlatforms;
    }

    /**
     * Sets the value of the clientPlatforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientPlatformsType }
     *     
     */
    public void setClientPlatforms(ClientPlatformsType value) {
        this.clientPlatforms = value;
    }

    /**
     * Gets the value of the resourceRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceRestrictionsType }
     *     
     */
    public ResourceRestrictionsType getResourceRestrictions() {
        return resourceRestrictions;
    }

    /**
     * Sets the value of the resourceRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceRestrictionsType }
     *     
     */
    public void setResourceRestrictions(ResourceRestrictionsType value) {
        this.resourceRestrictions = value;
    }

    /**
     * Gets the value of the supportAPI property.
     * 
     * @return
     *     possible object is
     *     {@link SupportAPIType }
     *     
     */
    public SupportAPIType getSupportAPI() {
        return supportAPI;
    }

    /**
     * Sets the value of the supportAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportAPIType }
     *     
     */
    public void setSupportAPI(SupportAPIType value) {
        this.supportAPI = value;
    }

    /**
     * Gets the value of the myWebExConfig property.
     * 
     * @return
     *     possible object is
     *     {@link MyWebExConfigType }
     *     
     */
    public MyWebExConfigType getMyWebExConfig() {
        return myWebExConfig;
    }

    /**
     * Sets the value of the myWebExConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyWebExConfigType }
     *     
     */
    public void setMyWebExConfig(MyWebExConfigType value) {
        this.myWebExConfig = value;
    }

    /**
     * Gets the value of the telephonyConfig property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyConfigType }
     *     
     */
    public TelephonyConfigType getTelephonyConfig() {
        return telephonyConfig;
    }

    /**
     * Sets the value of the telephonyConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyConfigType }
     *     
     */
    public void setTelephonyConfig(TelephonyConfigType value) {
        this.telephonyConfig = value;
    }

    /**
     * Gets the value of the commerceAndReporting property.
     * 
     * @return
     *     possible object is
     *     {@link CommerceAndReportingType }
     *     
     */
    public CommerceAndReportingType getCommerceAndReporting() {
        return commerceAndReporting;
    }

    /**
     * Sets the value of the commerceAndReporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommerceAndReportingType }
     *     
     */
    public void setCommerceAndReporting(CommerceAndReportingType value) {
        this.commerceAndReporting = value;
    }

    /**
     * Gets the value of the tools property.
     * 
     * @return
     *     possible object is
     *     {@link ToolsType }
     *     
     */
    public ToolsType getTools() {
        return tools;
    }

    /**
     * Sets the value of the tools property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolsType }
     *     
     */
    public void setTools(ToolsType value) {
        this.tools = value;
    }

    /**
     * Gets the value of the custCommunications property.
     * 
     * @return
     *     possible object is
     *     {@link CustCommunicationsType }
     *     
     */
    public CustCommunicationsType getCustCommunications() {
        return custCommunications;
    }

    /**
     * Sets the value of the custCommunications property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustCommunicationsType }
     *     
     */
    public void setCustCommunications(CustCommunicationsType value) {
        this.custCommunications = value;
    }

    /**
     * Gets the value of the trackingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SiteType.TrackingCodes }
     *     
     */
    public SiteType.TrackingCodes getTrackingCodes() {
        return trackingCodes;
    }

    /**
     * Sets the value of the trackingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteType.TrackingCodes }
     *     
     */
    public void setTrackingCodes(SiteType.TrackingCodes value) {
        this.trackingCodes = value;
    }

    /**
     * Gets the value of the supportedServices property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedServicesType }
     *     
     */
    public SupportedServicesType getSupportedServices() {
        return supportedServices;
    }

    /**
     * Sets the value of the supportedServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedServicesType }
     *     
     */
    public void setSupportedServices(SupportedServicesType value) {
        this.supportedServices = value;
    }

    /**
     * Gets the value of the securityOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityOptionsType }
     *     
     */
    public SecurityOptionsType getSecurityOptions() {
        return securityOptions;
    }

    /**
     * Sets the value of the securityOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityOptionsType }
     *     
     */
    public void setSecurityOptions(SecurityOptionsType value) {
        this.securityOptions = value;
    }

    /**
     * Gets the value of the defaults property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultsType }
     *     
     */
    public DefaultsType getDefaults() {
        return defaults;
    }

    /**
     * Sets the value of the defaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultsType }
     *     
     */
    public void setDefaults(DefaultsType value) {
        this.defaults = value;
    }

    /**
     * Gets the value of the scheduleMeetingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleOptionsType }
     *     
     */
    public ScheduleOptionsType getScheduleMeetingOptions() {
        return scheduleMeetingOptions;
    }

    /**
     * Sets the value of the scheduleMeetingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleOptionsType }
     *     
     */
    public void setScheduleMeetingOptions(ScheduleOptionsType value) {
        this.scheduleMeetingOptions = value;
    }

    /**
     * Gets the value of the navBarTop property.
     * 
     * @return
     *     possible object is
     *     {@link TopBarType }
     *     
     */
    public TopBarType getNavBarTop() {
        return navBarTop;
    }

    /**
     * Sets the value of the navBarTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopBarType }
     *     
     */
    public void setNavBarTop(TopBarType value) {
        this.navBarTop = value;
    }

    /**
     * Gets the value of the navMyWebEx property.
     * 
     * @return
     *     possible object is
     *     {@link MyWebExBarType }
     *     
     */
    public MyWebExBarType getNavMyWebEx() {
        return navMyWebEx;
    }

    /**
     * Sets the value of the navMyWebEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyWebExBarType }
     *     
     */
    public void setNavMyWebEx(MyWebExBarType value) {
        this.navMyWebEx = value;
    }

    /**
     * Gets the value of the navAllServices property.
     * 
     * @return
     *     possible object is
     *     {@link AllServiceBarType }
     *     
     */
    public AllServiceBarType getNavAllServices() {
        return navAllServices;
    }

    /**
     * Sets the value of the navAllServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllServiceBarType }
     *     
     */
    public void setNavAllServices(AllServiceBarType value) {
        this.navAllServices = value;
    }

    /**
     * Gets the value of the passwordCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordCriteriaType }
     *     
     */
    public PasswordCriteriaType getPasswordCriteria() {
        return passwordCriteria;
    }

    /**
     * Sets the value of the passwordCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordCriteriaType }
     *     
     */
    public void setPasswordCriteria(PasswordCriteriaType value) {
        this.passwordCriteria = value;
    }

    /**
     * Gets the value of the accountPasswordCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AccountPasswordCriteriaType }
     *     
     */
    public AccountPasswordCriteriaType getAccountPasswordCriteria() {
        return accountPasswordCriteria;
    }

    /**
     * Sets the value of the accountPasswordCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountPasswordCriteriaType }
     *     
     */
    public void setAccountPasswordCriteria(AccountPasswordCriteriaType value) {
        this.accountPasswordCriteria = value;
    }

    /**
     * Gets the value of the productivityTools property.
     * 
     * @return
     *     possible object is
     *     {@link ProductivityToolType }
     *     
     */
    public ProductivityToolType getProductivityTools() {
        return productivityTools;
    }

    /**
     * Sets the value of the productivityTools property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductivityToolType }
     *     
     */
    public void setProductivityTools(ProductivityToolType value) {
        this.productivityTools = value;
    }

    /**
     * Gets the value of the meetingPlace property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingPlaceType }
     *     
     */
    public MeetingPlaceType getMeetingPlace() {
        return meetingPlace;
    }

    /**
     * Sets the value of the meetingPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingPlaceType }
     *     
     */
    public void setMeetingPlace(MeetingPlaceType value) {
        this.meetingPlace = value;
    }

    /**
     * Gets the value of the eventCenter property.
     * 
     * @return
     *     possible object is
     *     {@link EventCenterType }
     *     
     */
    public EventCenterType getEventCenter() {
        return eventCenter;
    }

    /**
     * Sets the value of the eventCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCenterType }
     *     
     */
    public void setEventCenter(EventCenterType value) {
        this.eventCenter = value;
    }

    /**
     * Gets the value of the salesCenter property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCenterType }
     *     
     */
    public SalesCenterType getSalesCenter() {
        return salesCenter;
    }

    /**
     * Sets the value of the salesCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCenterType }
     *     
     */
    public void setSalesCenter(SalesCenterType value) {
        this.salesCenter = value;
    }

    /**
     * Gets the value of the connectIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectIntegrationType }
     *     
     */
    public ConnectIntegrationType getConnectIntegration() {
        return connectIntegration;
    }

    /**
     * Sets the value of the connectIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectIntegrationType }
     *     
     */
    public void setConnectIntegration(ConnectIntegrationType value) {
        this.connectIntegration = value;
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
     *         &lt;element name="trackingCode" type="{http://www.webex.com/schemas/2002/06/service/site}trackingCodeType" maxOccurs="10" minOccurs="0"/>
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
        "trackingCode"
    })
    public static class TrackingCodes {

        protected List<TrackingCodeType> trackingCode;

        /**
         * Gets the value of the trackingCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trackingCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrackingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrackingCodeType }
         * 
         * 
         */
        public List<TrackingCodeType> getTrackingCode() {
            if (trackingCode == null) {
                trackingCode = new ArrayList<TrackingCodeType>();
            }
            return this.trackingCode;
        }

    }

}
