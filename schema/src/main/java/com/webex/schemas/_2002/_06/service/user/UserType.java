
package com.webex.schemas._2002._06.service.user;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.AddressType;
import com.webex.schemas._2002._06.common.TimeZoneType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for userType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeGreeting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webExId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.webex.com/schemas/2002/06/common}addressType" minOccurs="0"/>
 *         &lt;element name="phones" type="{http://www.webex.com/schemas/2002/06/service/user}userPhonesType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="passwordHint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordHintAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commOptions" type="{http://www.webex.com/schemas/2002/06/service/user}commOptionsType" minOccurs="0"/>
 *         &lt;element name="meetingTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="meetingType" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="options" type="{http://www.webex.com/schemas/2002/06/service/user}optionsType" minOccurs="0"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.webex.com/schemas/2002/06/common}timeZoneType" minOccurs="0"/>
 *         &lt;element name="timeZoneWithDST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tracking" type="{http://www.webex.com/schemas/2002/06/common}trackingType" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.webex.com/schemas/2002/06/service/user}serviceType" minOccurs="0"/>
 *         &lt;element name="privilege" type="{http://www.webex.com/schemas/2002/06/service/user}privilegeType" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schedulingPermission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.webex.com/schemas/2002/06/service/user}activeType" minOccurs="0"/>
 *         &lt;element name="tspAccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tspAccount" type="{http://www.webex.com/schemas/2002/06/service/user}tspAccountType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="supportedServices" type="{http://www.webex.com/schemas/2002/06/service/user}supportedServicesType" minOccurs="0"/>
 *         &lt;element name="myWebEx" type="{http://www.webex.com/schemas/2002/06/service/user}mywebexType" minOccurs="0"/>
 *         &lt;element name="personalTeleconf" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account" type="{http://www.webex.com/schemas/2002/06/service/user}personalAccountType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="thirdPartyTeleconf" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account" type="{http://www.webex.com/schemas/2002/06/service/user}thirdPartyAccountType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="personalMeetingRoom" type="{http://www.webex.com/schemas/2002/06/service/user}personalMeetingRoomType" minOccurs="0"/>
 *         &lt;element name="sessionOptions" type="{http://www.webex.com/schemas/2002/06/service/user}sessionOptionsType" minOccurs="0"/>
 *         &lt;element name="supportCenter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orderTabs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tab" type="{http://www.webex.com/schemas/2002/06/service/user}scTabType" maxOccurs="4" minOccurs="4"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="serviceDesk" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mpProfileNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="security" type="{http://www.webex.com/schemas/2002/06/service/user}securityType" minOccurs="0"/>
 *         &lt;element name="languageID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="webACDPrefs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/user}webACDUserRoleType">
 *                 &lt;sequence>
 *                   &lt;element name="numAgentSessions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="agentMonitorAllRSQueues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="managerMonitorAllRSQueues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="monitorAllRSAgents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="remoteSupport" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/user}sharingAndRecordingType">
 *                 &lt;sequence>
 *                   &lt;element name="autoRequest" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="request" type="{http://www.webex.com/schemas/2002/06/service/user}scRequestType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="defaultClient" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="type" type="{http://www.webex.com/schemas/2002/06/service/user}scClientType"/>
 *                             &lt;element name="singleSessClient" type="{http://www.webex.com/schemas/2002/06/service/user}scConsoleType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="remoteAccess" type="{http://www.webex.com/schemas/2002/06/service/user}sharingAndRecordingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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
{

    protected String firstName;
    protected String lastName;
    protected String title;
    protected BigInteger categoryId;
    protected String description;
    protected String officeGreeting;
    protected String company;
    @XmlElement(required = true)
    protected String webExId;
    protected AddressType address;
    protected UserPhonesType phones;
    protected String email;
    protected String email2;
    protected String officeurl;
    protected String password;
    protected String passwordHint;
    protected String passwordHintAnswer;
    protected String personalUrl;
    protected String expirationDate;
    protected CommOptionsType commOptions;
    protected UserType.MeetingTypes meetingTypes;
    protected OptionsType options;
    @XmlElement(defaultValue = "-1")
    protected Long timeZoneID;
    protected TimeZoneType timeZone;
    protected String timeZoneWithDST;
    protected TrackingType tracking;
    protected ServiceType service;
    protected PrivilegeType privilege;
    protected String language;
    protected String locale;
    protected String schedulingPermission;
    protected ActiveType active;
    protected UserType.TspAccount tspAccount;
    protected SupportedServicesType supportedServices;
    protected MywebexType myWebEx;
    protected UserType.PersonalTeleconf personalTeleconf;
    protected UserType.ThirdPartyTeleconf thirdPartyTeleconf;
    protected PersonalMeetingRoomType personalMeetingRoom;
    protected SessionOptionsType sessionOptions;
    protected UserType.SupportCenter supportCenter;
    protected String mpProfileNumber;
    protected SecurityType security;
    protected Long languageID;
    protected UserType.WebACDPrefs webACDPrefs;
    protected UserType.RemoteSupport remoteSupport;
    protected SharingAndRecordingType remoteAccess;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategoryId(BigInteger value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the officeGreeting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeGreeting() {
        return officeGreeting;
    }

    /**
     * Sets the value of the officeGreeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeGreeting(String value) {
        this.officeGreeting = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the webExId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebExId() {
        return webExId;
    }

    /**
     * Sets the value of the webExId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebExId(String value) {
        this.webExId = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link UserPhonesType }
     *     
     */
    public UserPhonesType getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPhonesType }
     *     
     */
    public void setPhones(UserPhonesType value) {
        this.phones = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the email2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail2() {
        return email2;
    }

    /**
     * Sets the value of the email2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail2(String value) {
        this.email2 = value;
    }

    /**
     * Gets the value of the officeurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeurl() {
        return officeurl;
    }

    /**
     * Sets the value of the officeurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeurl(String value) {
        this.officeurl = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the passwordHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordHint() {
        return passwordHint;
    }

    /**
     * Sets the value of the passwordHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordHint(String value) {
        this.passwordHint = value;
    }

    /**
     * Gets the value of the passwordHintAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordHintAnswer() {
        return passwordHintAnswer;
    }

    /**
     * Sets the value of the passwordHintAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordHintAnswer(String value) {
        this.passwordHintAnswer = value;
    }

    /**
     * Gets the value of the personalUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalUrl() {
        return personalUrl;
    }

    /**
     * Sets the value of the personalUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalUrl(String value) {
        this.personalUrl = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the commOptions property.
     * 
     * @return
     *     possible object is
     *     {@link CommOptionsType }
     *     
     */
    public CommOptionsType getCommOptions() {
        return commOptions;
    }

    /**
     * Sets the value of the commOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommOptionsType }
     *     
     */
    public void setCommOptions(CommOptionsType value) {
        this.commOptions = value;
    }

    /**
     * Gets the value of the meetingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link UserType.MeetingTypes }
     *     
     */
    public UserType.MeetingTypes getMeetingTypes() {
        return meetingTypes;
    }

    /**
     * Sets the value of the meetingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType.MeetingTypes }
     *     
     */
    public void setMeetingTypes(UserType.MeetingTypes value) {
        this.meetingTypes = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link OptionsType }
     *     
     */
    public OptionsType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsType }
     *     
     */
    public void setOptions(OptionsType value) {
        this.options = value;
    }

    /**
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeZoneID(Long value) {
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
     * Gets the value of the timeZoneWithDST property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneWithDST() {
        return timeZoneWithDST;
    }

    /**
     * Sets the value of the timeZoneWithDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneWithDST(String value) {
        this.timeZoneWithDST = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingType }
     *     
     */
    public TrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingType }
     *     
     */
    public void setTracking(TrackingType value) {
        this.tracking = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setService(ServiceType value) {
        this.service = value;
    }

    /**
     * Gets the value of the privilege property.
     * 
     * @return
     *     possible object is
     *     {@link PrivilegeType }
     *     
     */
    public PrivilegeType getPrivilege() {
        return privilege;
    }

    /**
     * Sets the value of the privilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivilegeType }
     *     
     */
    public void setPrivilege(PrivilegeType value) {
        this.privilege = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the schedulingPermission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulingPermission() {
        return schedulingPermission;
    }

    /**
     * Sets the value of the schedulingPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulingPermission(String value) {
        this.schedulingPermission = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveType }
     *     
     */
    public ActiveType getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveType }
     *     
     */
    public void setActive(ActiveType value) {
        this.active = value;
    }

    /**
     * Gets the value of the tspAccount property.
     * 
     * @return
     *     possible object is
     *     {@link UserType.TspAccount }
     *     
     */
    public UserType.TspAccount getTspAccount() {
        return tspAccount;
    }

    /**
     * Sets the value of the tspAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType.TspAccount }
     *     
     */
    public void setTspAccount(UserType.TspAccount value) {
        this.tspAccount = value;
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
     * Gets the value of the myWebEx property.
     * 
     * @return
     *     possible object is
     *     {@link MywebexType }
     *     
     */
    public MywebexType getMyWebEx() {
        return myWebEx;
    }

    /**
     * Sets the value of the myWebEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link MywebexType }
     *     
     */
    public void setMyWebEx(MywebexType value) {
        this.myWebEx = value;
    }

    /**
     * Gets the value of the personalTeleconf property.
     * 
     * @return
     *     possible object is
     *     {@link UserType.PersonalTeleconf }
     *     
     */
    public UserType.PersonalTeleconf getPersonalTeleconf() {
        return personalTeleconf;
    }

    /**
     * Sets the value of the personalTeleconf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType.PersonalTeleconf }
     *     
     */
    public void setPersonalTeleconf(UserType.PersonalTeleconf value) {
        this.personalTeleconf = value;
    }

    /**
     * Gets the value of the thirdPartyTeleconf property.
     * 
     * @return
     *     possible object is
     *     {@link UserType.ThirdPartyTeleconf }
     *     
     */
    public UserType.ThirdPartyTeleconf getThirdPartyTeleconf() {
        return thirdPartyTeleconf;
    }

    /**
     * Sets the value of the thirdPartyTeleconf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType.ThirdPartyTeleconf }
     *     
     */
    public void setThirdPartyTeleconf(UserType.ThirdPartyTeleconf value) {
        this.thirdPartyTeleconf = value;
    }

    /**
     * Gets the value of the personalMeetingRoom property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalMeetingRoomType }
     *     
     */
    public PersonalMeetingRoomType getPersonalMeetingRoom() {
        return personalMeetingRoom;
    }

    /**
     * Sets the value of the personalMeetingRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalMeetingRoomType }
     *     
     */
    public void setPersonalMeetingRoom(PersonalMeetingRoomType value) {
        this.personalMeetingRoom = value;
    }

    /**
     * Gets the value of the sessionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SessionOptionsType }
     *     
     */
    public SessionOptionsType getSessionOptions() {
        return sessionOptions;
    }

    /**
     * Sets the value of the sessionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionOptionsType }
     *     
     */
    public void setSessionOptions(SessionOptionsType value) {
        this.sessionOptions = value;
    }

    /**
     * Gets the value of the supportCenter property.
     * 
     * @return
     *     possible object is
     *     {@link UserType.SupportCenter }
     *     
     */
    public UserType.SupportCenter getSupportCenter() {
        return supportCenter;
    }

    /**
     * Sets the value of the supportCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType.SupportCenter }
     *     
     */
    public void setSupportCenter(UserType.SupportCenter value) {
        this.supportCenter = value;
    }

    /**
     * Gets the value of the mpProfileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpProfileNumber() {
        return mpProfileNumber;
    }

    /**
     * Sets the value of the mpProfileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpProfileNumber(String value) {
        this.mpProfileNumber = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityType }
     *     
     */
    public SecurityType getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityType }
     *     
     */
    public void setSecurity(SecurityType value) {
        this.security = value;
    }

    /**
     * Gets the value of the languageID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLanguageID() {
        return languageID;
    }

    /**
     * Sets the value of the languageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLanguageID(Long value) {
        this.languageID = value;
    }

    /**
     * Gets the value of the webACDPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link UserType.WebACDPrefs }
     *     
     */
    public UserType.WebACDPrefs getWebACDPrefs() {
        return webACDPrefs;
    }

    /**
     * Sets the value of the webACDPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType.WebACDPrefs }
     *     
     */
    public void setWebACDPrefs(UserType.WebACDPrefs value) {
        this.webACDPrefs = value;
    }

    /**
     * Gets the value of the remoteSupport property.
     * 
     * @return
     *     possible object is
     *     {@link UserType.RemoteSupport }
     *     
     */
    public UserType.RemoteSupport getRemoteSupport() {
        return remoteSupport;
    }

    /**
     * Sets the value of the remoteSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType.RemoteSupport }
     *     
     */
    public void setRemoteSupport(UserType.RemoteSupport value) {
        this.remoteSupport = value;
    }

    /**
     * Gets the value of the remoteAccess property.
     * 
     * @return
     *     possible object is
     *     {@link SharingAndRecordingType }
     *     
     */
    public SharingAndRecordingType getRemoteAccess() {
        return remoteAccess;
    }

    /**
     * Sets the value of the remoteAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingAndRecordingType }
     *     
     */
    public void setRemoteAccess(SharingAndRecordingType value) {
        this.remoteAccess = value;
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
     *         &lt;element name="meetingType" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
        "meetingType"
    })
    public static class MeetingTypes {

        @XmlElement(type = Long.class)
        protected List<Long> meetingType;

        /**
         * Gets the value of the meetingType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the meetingType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMeetingType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getMeetingType() {
            if (meetingType == null) {
                meetingType = new ArrayList<Long>();
            }
            return this.meetingType;
        }

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
     *         &lt;element name="account" type="{http://www.webex.com/schemas/2002/06/service/user}personalAccountType" maxOccurs="3" minOccurs="0"/>
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
        "account"
    })
    public static class PersonalTeleconf {

        protected List<PersonalAccountType> account;

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonalAccountType }
         * 
         * 
         */
        public List<PersonalAccountType> getAccount() {
            if (account == null) {
                account = new ArrayList<PersonalAccountType>();
            }
            return this.account;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/user}sharingAndRecordingType">
     *       &lt;sequence>
     *         &lt;element name="autoRequest" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="request" type="{http://www.webex.com/schemas/2002/06/service/user}scRequestType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="defaultClient" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="type" type="{http://www.webex.com/schemas/2002/06/service/user}scClientType"/>
     *                   &lt;element name="singleSessClient" type="{http://www.webex.com/schemas/2002/06/service/user}scConsoleType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "autoRequest",
        "defaultClient"
    })
    public static class RemoteSupport
        extends SharingAndRecordingType
    {

        protected UserType.RemoteSupport.AutoRequest autoRequest;
        protected UserType.RemoteSupport.DefaultClient defaultClient;

        /**
         * Gets the value of the autoRequest property.
         * 
         * @return
         *     possible object is
         *     {@link UserType.RemoteSupport.AutoRequest }
         *     
         */
        public UserType.RemoteSupport.AutoRequest getAutoRequest() {
            return autoRequest;
        }

        /**
         * Sets the value of the autoRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserType.RemoteSupport.AutoRequest }
         *     
         */
        public void setAutoRequest(UserType.RemoteSupport.AutoRequest value) {
            this.autoRequest = value;
        }

        /**
         * Gets the value of the defaultClient property.
         * 
         * @return
         *     possible object is
         *     {@link UserType.RemoteSupport.DefaultClient }
         *     
         */
        public UserType.RemoteSupport.DefaultClient getDefaultClient() {
            return defaultClient;
        }

        /**
         * Sets the value of the defaultClient property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserType.RemoteSupport.DefaultClient }
         *     
         */
        public void setDefaultClient(UserType.RemoteSupport.DefaultClient value) {
            this.defaultClient = value;
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
         *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="request" type="{http://www.webex.com/schemas/2002/06/service/user}scRequestType" minOccurs="0"/>
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
            "enable",
            "request"
        })
        public static class AutoRequest {

            protected boolean enable;
            protected ScRequestType request;

            /**
             * Gets the value of the enable property.
             * 
             */
            public boolean isEnable() {
                return enable;
            }

            /**
             * Sets the value of the enable property.
             * 
             */
            public void setEnable(boolean value) {
                this.enable = value;
            }

            /**
             * Gets the value of the request property.
             * 
             * @return
             *     possible object is
             *     {@link ScRequestType }
             *     
             */
            public ScRequestType getRequest() {
                return request;
            }

            /**
             * Sets the value of the request property.
             * 
             * @param value
             *     allowed object is
             *     {@link ScRequestType }
             *     
             */
            public void setRequest(ScRequestType value) {
                this.request = value;
            }

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
         *         &lt;element name="type" type="{http://www.webex.com/schemas/2002/06/service/user}scClientType"/>
         *         &lt;element name="singleSessClient" type="{http://www.webex.com/schemas/2002/06/service/user}scConsoleType" minOccurs="0"/>
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
            "type",
            "singleSessClient"
        })
        public static class DefaultClient {

            @XmlElement(required = true)
            protected ScClientType type;
            protected ScConsoleType singleSessClient;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link ScClientType }
             *     
             */
            public ScClientType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link ScClientType }
             *     
             */
            public void setType(ScClientType value) {
                this.type = value;
            }

            /**
             * Gets the value of the singleSessClient property.
             * 
             * @return
             *     possible object is
             *     {@link ScConsoleType }
             *     
             */
            public ScConsoleType getSingleSessClient() {
                return singleSessClient;
            }

            /**
             * Sets the value of the singleSessClient property.
             * 
             * @param value
             *     allowed object is
             *     {@link ScConsoleType }
             *     
             */
            public void setSingleSessClient(ScConsoleType value) {
                this.singleSessClient = value;
            }

        }

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
     *         &lt;element name="orderTabs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tab" type="{http://www.webex.com/schemas/2002/06/service/user}scTabType" maxOccurs="4" minOccurs="4"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="serviceDesk" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "orderTabs",
        "serviceDesk"
    })
    public static class SupportCenter {

        protected UserType.SupportCenter.OrderTabs orderTabs;
        protected UserType.SupportCenter.ServiceDesk serviceDesk;

        /**
         * Gets the value of the orderTabs property.
         * 
         * @return
         *     possible object is
         *     {@link UserType.SupportCenter.OrderTabs }
         *     
         */
        public UserType.SupportCenter.OrderTabs getOrderTabs() {
            return orderTabs;
        }

        /**
         * Sets the value of the orderTabs property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserType.SupportCenter.OrderTabs }
         *     
         */
        public void setOrderTabs(UserType.SupportCenter.OrderTabs value) {
            this.orderTabs = value;
        }

        /**
         * Gets the value of the serviceDesk property.
         * 
         * @return
         *     possible object is
         *     {@link UserType.SupportCenter.ServiceDesk }
         *     
         */
        public UserType.SupportCenter.ServiceDesk getServiceDesk() {
            return serviceDesk;
        }

        /**
         * Sets the value of the serviceDesk property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserType.SupportCenter.ServiceDesk }
         *     
         */
        public void setServiceDesk(UserType.SupportCenter.ServiceDesk value) {
            this.serviceDesk = value;
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
         *         &lt;element name="tab" type="{http://www.webex.com/schemas/2002/06/service/user}scTabType" maxOccurs="4" minOccurs="4"/>
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
            "tab"
        })
        public static class OrderTabs {

            @XmlElement(required = true)
            protected List<ScTabType> tab;

            /**
             * Gets the value of the tab property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tab property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTab().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ScTabType }
             * 
             * 
             */
            public List<ScTabType> getTab() {
                if (tab == null) {
                    tab = new ArrayList<ScTabType>();
                }
                return this.tab;
            }

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
         *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "enable"
        })
        public static class ServiceDesk {

            protected Boolean enable;

            /**
             * Gets the value of the enable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEnable() {
                return enable;
            }

            /**
             * Sets the value of the enable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEnable(Boolean value) {
                this.enable = value;
            }

        }

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
     *         &lt;element name="account" type="{http://www.webex.com/schemas/2002/06/service/user}thirdPartyAccountType" maxOccurs="3" minOccurs="0"/>
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
        "account"
    })
    public static class ThirdPartyTeleconf {

        protected List<ThirdPartyAccountType> account;

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ThirdPartyAccountType }
         * 
         * 
         */
        public List<ThirdPartyAccountType> getAccount() {
            if (account == null) {
                account = new ArrayList<ThirdPartyAccountType>();
            }
            return this.account;
        }

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
     *         &lt;element name="tspAccount" type="{http://www.webex.com/schemas/2002/06/service/user}tspAccountType" maxOccurs="3" minOccurs="0"/>
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
        "tspAccount"
    })
    public static class TspAccount {

        protected List<TspAccountType> tspAccount;

        /**
         * Gets the value of the tspAccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tspAccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTspAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TspAccountType }
         * 
         * 
         */
        public List<TspAccountType> getTspAccount() {
            if (tspAccount == null) {
                tspAccount = new ArrayList<TspAccountType>();
            }
            return this.tspAccount;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/user}webACDUserRoleType">
     *       &lt;sequence>
     *         &lt;element name="numAgentSessions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="agentMonitorAllRSQueues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="managerMonitorAllRSQueues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="monitorAllRSAgents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
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
    {

        protected Integer numAgentSessions;
        protected Boolean agentMonitorAllRSQueues;
        protected Boolean managerMonitorAllRSQueues;
        protected Boolean monitorAllRSAgents;

        /**
         * Gets the value of the numAgentSessions property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumAgentSessions() {
            return numAgentSessions;
        }

        /**
         * Sets the value of the numAgentSessions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumAgentSessions(Integer value) {
            this.numAgentSessions = value;
        }

        /**
         * Gets the value of the agentMonitorAllRSQueues property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAgentMonitorAllRSQueues() {
            return agentMonitorAllRSQueues;
        }

        /**
         * Sets the value of the agentMonitorAllRSQueues property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAgentMonitorAllRSQueues(Boolean value) {
            this.agentMonitorAllRSQueues = value;
        }

        /**
         * Gets the value of the managerMonitorAllRSQueues property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isManagerMonitorAllRSQueues() {
            return managerMonitorAllRSQueues;
        }

        /**
         * Sets the value of the managerMonitorAllRSQueues property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setManagerMonitorAllRSQueues(Boolean value) {
            this.managerMonitorAllRSQueues = value;
        }

        /**
         * Gets the value of the monitorAllRSAgents property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMonitorAllRSAgents() {
            return monitorAllRSAgents;
        }

        /**
         * Sets the value of the monitorAllRSAgents property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMonitorAllRSAgents(Boolean value) {
            this.monitorAllRSAgents = value;
        }

    }

}
