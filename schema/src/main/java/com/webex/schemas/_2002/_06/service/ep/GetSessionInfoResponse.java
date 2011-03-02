
package com.webex.schemas._2002._06.service.ep;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.PhoneLabelNumType;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.CallInNumType;
import com.webex.schemas._2002._06.service.meeting.TelephonySupportType;


/**
 * <p>Java class for getSessionInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSessionInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presenter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="panelistsInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionkey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="verifyFlashMediaURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verifyWinMediaURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessControl" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sessionPassword" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="listStatus" type="{http://www.webex.com/schemas/2002/06/service/ep}listingType"/>
 *                   &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="registrationURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="passwordReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="metaData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="confName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="serviceType" type="{http://www.webex.com/schemas/2002/06/common}serviceTypeType"/>
 *                   &lt;element name="agenda" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="account" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="128"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="opportunity" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="128"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="isRecurring" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="telephony" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="telephonySupport" type="{http://www.webex.com/schemas/2002/06/service/meeting}telephonySupportType"/>
 *                   &lt;element name="extTelephonyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="globalCallInNumbersURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tollFreeRestrictionsURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="callInNum" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.webex.com/schemas/2002/06/service}callInNumType">
 *                           &lt;sequence>
 *                             &lt;element name="backupTollNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="participantAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="participantLimitedAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="subscriberAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="labels" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tollFreeCallInLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tollCallInLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="participantAccessLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="participantLimitedAccessLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subscriberAccessLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="globalCallInNumbersLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mpAudio" type="{http://www.webex.com/schemas/2002/06/common}phoneLabelNumType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="mpProfileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isMPAudio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="material" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="imageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="document" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
 *         &lt;element name="test" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="titleURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="delivery" type="{http://www.webex.com/schemas/2002/06/service/ep}testDeliveryType"/>
 *                   &lt;element name="status" type="{http://www.webex.com/schemas/2002/06/service/ep}testStatusType"/>
 *                   &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="actionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="host">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="email">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.webex.com/schemas/2002/06/common}emailType">
 *                         &lt;maxLength value="64"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="webExId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="alternateHost" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="schedule">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attendeeOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="joinRequiresAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="audioStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAudioOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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
{

    protected String status;
    protected List<String> presenter;
    protected String panelistsInfo;
    protected String programName;
    protected long sessionkey;
    protected long confID;
    protected String verifyFlashMediaURL;
    protected String verifyWinMediaURL;
    protected GetSessionInfoResponse.AccessControl accessControl;
    protected GetSessionInfoResponse.MetaData metaData;
    protected GetSessionInfoResponse.Telephony telephony;
    protected GetSessionInfoResponse.Material material;
    protected List<GetSessionInfoResponse.Test> test;
    @XmlElement(required = true)
    protected GetSessionInfoResponse.Host host;
    @XmlElement(required = true)
    protected GetSessionInfoResponse.Schedule schedule;
    protected GetSessionInfoResponse.AttendeeOptions attendeeOptions;
    protected String audioStatus;
    protected Boolean isAudioOnly;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the presenter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presenter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresenter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPresenter() {
        if (presenter == null) {
            presenter = new ArrayList<String>();
        }
        return this.presenter;
    }

    /**
     * Gets the value of the panelistsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanelistsInfo() {
        return panelistsInfo;
    }

    /**
     * Sets the value of the panelistsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanelistsInfo(String value) {
        this.panelistsInfo = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the sessionkey property.
     * 
     */
    public long getSessionkey() {
        return sessionkey;
    }

    /**
     * Sets the value of the sessionkey property.
     * 
     */
    public void setSessionkey(long value) {
        this.sessionkey = value;
    }

    /**
     * Gets the value of the confID property.
     * 
     */
    public long getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     */
    public void setConfID(long value) {
        this.confID = value;
    }

    /**
     * Gets the value of the verifyFlashMediaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyFlashMediaURL() {
        return verifyFlashMediaURL;
    }

    /**
     * Sets the value of the verifyFlashMediaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyFlashMediaURL(String value) {
        this.verifyFlashMediaURL = value;
    }

    /**
     * Gets the value of the verifyWinMediaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyWinMediaURL() {
        return verifyWinMediaURL;
    }

    /**
     * Sets the value of the verifyWinMediaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyWinMediaURL(String value) {
        this.verifyWinMediaURL = value;
    }

    /**
     * Gets the value of the accessControl property.
     * 
     * @return
     *     possible object is
     *     {@link GetSessionInfoResponse.AccessControl }
     *     
     */
    public GetSessionInfoResponse.AccessControl getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSessionInfoResponse.AccessControl }
     *     
     */
    public void setAccessControl(GetSessionInfoResponse.AccessControl value) {
        this.accessControl = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link GetSessionInfoResponse.MetaData }
     *     
     */
    public GetSessionInfoResponse.MetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSessionInfoResponse.MetaData }
     *     
     */
    public void setMetaData(GetSessionInfoResponse.MetaData value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the telephony property.
     * 
     * @return
     *     possible object is
     *     {@link GetSessionInfoResponse.Telephony }
     *     
     */
    public GetSessionInfoResponse.Telephony getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSessionInfoResponse.Telephony }
     *     
     */
    public void setTelephony(GetSessionInfoResponse.Telephony value) {
        this.telephony = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link GetSessionInfoResponse.Material }
     *     
     */
    public GetSessionInfoResponse.Material getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSessionInfoResponse.Material }
     *     
     */
    public void setMaterial(GetSessionInfoResponse.Material value) {
        this.material = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the test property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetSessionInfoResponse.Test }
     * 
     * 
     */
    public List<GetSessionInfoResponse.Test> getTest() {
        if (test == null) {
            test = new ArrayList<GetSessionInfoResponse.Test>();
        }
        return this.test;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link GetSessionInfoResponse.Host }
     *     
     */
    public GetSessionInfoResponse.Host getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSessionInfoResponse.Host }
     *     
     */
    public void setHost(GetSessionInfoResponse.Host value) {
        this.host = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link GetSessionInfoResponse.Schedule }
     *     
     */
    public GetSessionInfoResponse.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSessionInfoResponse.Schedule }
     *     
     */
    public void setSchedule(GetSessionInfoResponse.Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the attendeeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link GetSessionInfoResponse.AttendeeOptions }
     *     
     */
    public GetSessionInfoResponse.AttendeeOptions getAttendeeOptions() {
        return attendeeOptions;
    }

    /**
     * Sets the value of the attendeeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSessionInfoResponse.AttendeeOptions }
     *     
     */
    public void setAttendeeOptions(GetSessionInfoResponse.AttendeeOptions value) {
        this.attendeeOptions = value;
    }

    /**
     * Gets the value of the audioStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioStatus() {
        return audioStatus;
    }

    /**
     * Sets the value of the audioStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioStatus(String value) {
        this.audioStatus = value;
    }

    /**
     * Gets the value of the isAudioOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAudioOnly() {
        return isAudioOnly;
    }

    /**
     * Sets the value of the isAudioOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAudioOnly(Boolean value) {
        this.isAudioOnly = value;
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
     *         &lt;element name="sessionPassword" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="listStatus" type="{http://www.webex.com/schemas/2002/06/service/ep}listingType"/>
     *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="registrationURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="passwordReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "sessionPassword",
        "listStatus",
        "registration",
        "registrationURL",
        "passwordReq"
    })
    public static class AccessControl {

        protected String sessionPassword;
        @XmlElement(required = true)
        protected ListingType listStatus;
        protected boolean registration;
        protected String registrationURL;
        protected Boolean passwordReq;

        /**
         * Gets the value of the sessionPassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionPassword() {
            return sessionPassword;
        }

        /**
         * Sets the value of the sessionPassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionPassword(String value) {
            this.sessionPassword = value;
        }

        /**
         * Gets the value of the listStatus property.
         * 
         * @return
         *     possible object is
         *     {@link ListingType }
         *     
         */
        public ListingType getListStatus() {
            return listStatus;
        }

        /**
         * Sets the value of the listStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListingType }
         *     
         */
        public void setListStatus(ListingType value) {
            this.listStatus = value;
        }

        /**
         * Gets the value of the registration property.
         * 
         */
        public boolean isRegistration() {
            return registration;
        }

        /**
         * Sets the value of the registration property.
         * 
         */
        public void setRegistration(boolean value) {
            this.registration = value;
        }

        /**
         * Gets the value of the registrationURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationURL() {
            return registrationURL;
        }

        /**
         * Sets the value of the registrationURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationURL(String value) {
            this.registrationURL = value;
        }

        /**
         * Gets the value of the passwordReq property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPasswordReq() {
            return passwordReq;
        }

        /**
         * Sets the value of the passwordReq property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPasswordReq(Boolean value) {
            this.passwordReq = value;
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
     *         &lt;element name="joinRequiresAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "joinRequiresAccount"
    })
    public static class AttendeeOptions {

        protected Boolean joinRequiresAccount;

        /**
         * Gets the value of the joinRequiresAccount property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isJoinRequiresAccount() {
            return joinRequiresAccount;
        }

        /**
         * Sets the value of the joinRequiresAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setJoinRequiresAccount(Boolean value) {
            this.joinRequiresAccount = value;
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
     *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="email">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.webex.com/schemas/2002/06/common}emailType">
     *               &lt;maxLength value="64"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="webExId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="alternateHost" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "firstName",
        "lastName",
        "email",
        "webExId",
        "alternateHost"
    })
    public static class Host {

        @XmlElement(required = true)
        protected String firstName;
        @XmlElement(required = true)
        protected String lastName;
        @XmlElement(required = true)
        protected String email;
        @XmlElement(required = true)
        protected String webExId;
        protected List<String> alternateHost;

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
         * Gets the value of the alternateHost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternateHost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternateHost().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAlternateHost() {
            if (alternateHost == null) {
                alternateHost = new ArrayList<String>();
            }
            return this.alternateHost;
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
     *         &lt;element name="imageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="document" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "imageURL",
        "document"
    })
    public static class Material {

        protected String imageURL;
        protected List<GetSessionInfoResponse.Material.Document> document;

        /**
         * Gets the value of the imageURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImageURL() {
            return imageURL;
        }

        /**
         * Sets the value of the imageURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImageURL(String value) {
            this.imageURL = value;
        }

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetSessionInfoResponse.Material.Document }
         * 
         * 
         */
        public List<GetSessionInfoResponse.Material.Document> getDocument() {
            if (document == null) {
                document = new ArrayList<GetSessionInfoResponse.Material.Document>();
            }
            return this.document;
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
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            "name",
            "url",
            "size"
        })
        public static class Document {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(name = "URL", required = true)
            protected String url;
            @XmlElement(required = true)
            protected BigInteger size;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the url property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getURL() {
                return url;
            }

            /**
             * Sets the value of the url property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setURL(String value) {
                this.url = value;
            }

            /**
             * Gets the value of the size property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSize(BigInteger value) {
                this.size = value;
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
     *         &lt;element name="confName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="serviceType" type="{http://www.webex.com/schemas/2002/06/common}serviceTypeType"/>
     *         &lt;element name="agenda" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="account" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="128"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="opportunity" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="128"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="isRecurring" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "confName",
        "sessionType",
        "serviceType",
        "agenda",
        "description",
        "account",
        "opportunity",
        "isRecurring"
    })
    public static class MetaData {

        @XmlElement(required = true)
        protected String confName;
        @XmlElement(required = true, defaultValue = "-1")
        protected BigInteger sessionType;
        @XmlElement(required = true)
        protected ServiceTypeType serviceType;
        protected String agenda;
        protected String description;
        protected String account;
        protected String opportunity;
        protected boolean isRecurring;

        /**
         * Gets the value of the confName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfName() {
            return confName;
        }

        /**
         * Sets the value of the confName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfName(String value) {
            this.confName = value;
        }

        /**
         * Gets the value of the sessionType property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSessionType() {
            return sessionType;
        }

        /**
         * Sets the value of the sessionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSessionType(BigInteger value) {
            this.sessionType = value;
        }

        /**
         * Gets the value of the serviceType property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceTypeType }
         *     
         */
        public ServiceTypeType getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceTypeType }
         *     
         */
        public void setServiceType(ServiceTypeType value) {
            this.serviceType = value;
        }

        /**
         * Gets the value of the agenda property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgenda() {
            return agenda;
        }

        /**
         * Sets the value of the agenda property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgenda(String value) {
            this.agenda = value;
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
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccount() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccount(String value) {
            this.account = value;
        }

        /**
         * Gets the value of the opportunity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpportunity() {
            return opportunity;
        }

        /**
         * Sets the value of the opportunity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpportunity(String value) {
            this.opportunity = value;
        }

        /**
         * Gets the value of the isRecurring property.
         * 
         */
        public boolean isIsRecurring() {
            return isRecurring;
        }

        /**
         * Sets the value of the isRecurring property.
         * 
         */
        public void setIsRecurring(boolean value) {
            this.isRecurring = value;
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
     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "startDate",
        "duration",
        "timeZone"
    })
    public static class Schedule {

        @XmlElement(required = true)
        protected String startDate;
        @XmlElement(required = true)
        protected BigInteger duration;
        @XmlElement(required = true)
        protected String timeZone;

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartDate(String value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
            this.duration = value;
        }

        /**
         * Gets the value of the timeZone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeZone() {
            return timeZone;
        }

        /**
         * Sets the value of the timeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeZone(String value) {
            this.timeZone = value;
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
     *         &lt;element name="telephonySupport" type="{http://www.webex.com/schemas/2002/06/service/meeting}telephonySupportType"/>
     *         &lt;element name="extTelephonyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="globalCallInNumbersURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tollFreeRestrictionsURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="callInNum" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service}callInNumType">
     *                 &lt;sequence>
     *                   &lt;element name="backupTollNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="participantAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="participantLimitedAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="subscriberAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="labels" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tollFreeCallInLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tollCallInLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="participantAccessLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="participantLimitedAccessLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subscriberAccessLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="globalCallInNumbersLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mpAudio" type="{http://www.webex.com/schemas/2002/06/common}phoneLabelNumType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="mpProfileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="isMPAudio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    public static class Telephony {

        @XmlElement(required = true)
        protected TelephonySupportType telephonySupport;
        protected String extTelephonyDescription;
        protected String globalCallInNumbersURL;
        protected String tollFreeRestrictionsURL;
        protected GetSessionInfoResponse.Telephony.CallInNum callInNum;
        protected String participantAccessCode;
        protected String participantLimitedAccessCode;
        protected String subscriberAccessCode;
        protected GetSessionInfoResponse.Telephony.Labels labels;
        protected List<PhoneLabelNumType> mpAudio;
        protected String mpProfileNumber;
        protected Boolean isMPAudio;

        /**
         * Gets the value of the telephonySupport property.
         * 
         * @return
         *     possible object is
         *     {@link TelephonySupportType }
         *     
         */
        public TelephonySupportType getTelephonySupport() {
            return telephonySupport;
        }

        /**
         * Sets the value of the telephonySupport property.
         * 
         * @param value
         *     allowed object is
         *     {@link TelephonySupportType }
         *     
         */
        public void setTelephonySupport(TelephonySupportType value) {
            this.telephonySupport = value;
        }

        /**
         * Gets the value of the extTelephonyDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtTelephonyDescription() {
            return extTelephonyDescription;
        }

        /**
         * Sets the value of the extTelephonyDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtTelephonyDescription(String value) {
            this.extTelephonyDescription = value;
        }

        /**
         * Gets the value of the globalCallInNumbersURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlobalCallInNumbersURL() {
            return globalCallInNumbersURL;
        }

        /**
         * Sets the value of the globalCallInNumbersURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlobalCallInNumbersURL(String value) {
            this.globalCallInNumbersURL = value;
        }

        /**
         * Gets the value of the tollFreeRestrictionsURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTollFreeRestrictionsURL() {
            return tollFreeRestrictionsURL;
        }

        /**
         * Sets the value of the tollFreeRestrictionsURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTollFreeRestrictionsURL(String value) {
            this.tollFreeRestrictionsURL = value;
        }

        /**
         * Gets the value of the callInNum property.
         * 
         * @return
         *     possible object is
         *     {@link GetSessionInfoResponse.Telephony.CallInNum }
         *     
         */
        public GetSessionInfoResponse.Telephony.CallInNum getCallInNum() {
            return callInNum;
        }

        /**
         * Sets the value of the callInNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetSessionInfoResponse.Telephony.CallInNum }
         *     
         */
        public void setCallInNum(GetSessionInfoResponse.Telephony.CallInNum value) {
            this.callInNum = value;
        }

        /**
         * Gets the value of the participantAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParticipantAccessCode() {
            return participantAccessCode;
        }

        /**
         * Sets the value of the participantAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParticipantAccessCode(String value) {
            this.participantAccessCode = value;
        }

        /**
         * Gets the value of the participantLimitedAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParticipantLimitedAccessCode() {
            return participantLimitedAccessCode;
        }

        /**
         * Sets the value of the participantLimitedAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParticipantLimitedAccessCode(String value) {
            this.participantLimitedAccessCode = value;
        }

        /**
         * Gets the value of the subscriberAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriberAccessCode() {
            return subscriberAccessCode;
        }

        /**
         * Sets the value of the subscriberAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriberAccessCode(String value) {
            this.subscriberAccessCode = value;
        }

        /**
         * Gets the value of the labels property.
         * 
         * @return
         *     possible object is
         *     {@link GetSessionInfoResponse.Telephony.Labels }
         *     
         */
        public GetSessionInfoResponse.Telephony.Labels getLabels() {
            return labels;
        }

        /**
         * Sets the value of the labels property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetSessionInfoResponse.Telephony.Labels }
         *     
         */
        public void setLabels(GetSessionInfoResponse.Telephony.Labels value) {
            this.labels = value;
        }

        /**
         * Gets the value of the mpAudio property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mpAudio property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMpAudio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhoneLabelNumType }
         * 
         * 
         */
        public List<PhoneLabelNumType> getMpAudio() {
            if (mpAudio == null) {
                mpAudio = new ArrayList<PhoneLabelNumType>();
            }
            return this.mpAudio;
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
         * Gets the value of the isMPAudio property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsMPAudio() {
            return isMPAudio;
        }

        /**
         * Sets the value of the isMPAudio property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsMPAudio(Boolean value) {
            this.isMPAudio = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}callInNumType">
         *       &lt;sequence>
         *         &lt;element name="backupTollNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "backupTollNum"
        })
        public static class CallInNum
            extends CallInNumType
        {

            protected String backupTollNum;

            /**
             * Gets the value of the backupTollNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBackupTollNum() {
                return backupTollNum;
            }

            /**
             * Sets the value of the backupTollNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBackupTollNum(String value) {
                this.backupTollNum = value;
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
         *         &lt;element name="tollFreeCallInLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tollCallInLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="participantAccessLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="participantLimitedAccessLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subscriberAccessLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="globalCallInNumbersLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "tollFreeCallInLabel",
            "tollCallInLabel",
            "participantAccessLabel",
            "participantLimitedAccessLabel",
            "subscriberAccessLabel",
            "globalCallInNumbersLabel"
        })
        public static class Labels {

            @XmlElement(required = true)
            protected String tollFreeCallInLabel;
            @XmlElement(required = true)
            protected String tollCallInLabel;
            protected String participantAccessLabel;
            protected String participantLimitedAccessLabel;
            protected String subscriberAccessLabel;
            protected String globalCallInNumbersLabel;

            /**
             * Gets the value of the tollFreeCallInLabel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTollFreeCallInLabel() {
                return tollFreeCallInLabel;
            }

            /**
             * Sets the value of the tollFreeCallInLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTollFreeCallInLabel(String value) {
                this.tollFreeCallInLabel = value;
            }

            /**
             * Gets the value of the tollCallInLabel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTollCallInLabel() {
                return tollCallInLabel;
            }

            /**
             * Sets the value of the tollCallInLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTollCallInLabel(String value) {
                this.tollCallInLabel = value;
            }

            /**
             * Gets the value of the participantAccessLabel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParticipantAccessLabel() {
                return participantAccessLabel;
            }

            /**
             * Sets the value of the participantAccessLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParticipantAccessLabel(String value) {
                this.participantAccessLabel = value;
            }

            /**
             * Gets the value of the participantLimitedAccessLabel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParticipantLimitedAccessLabel() {
                return participantLimitedAccessLabel;
            }

            /**
             * Sets the value of the participantLimitedAccessLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParticipantLimitedAccessLabel(String value) {
                this.participantLimitedAccessLabel = value;
            }

            /**
             * Gets the value of the subscriberAccessLabel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubscriberAccessLabel() {
                return subscriberAccessLabel;
            }

            /**
             * Sets the value of the subscriberAccessLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubscriberAccessLabel(String value) {
                this.subscriberAccessLabel = value;
            }

            /**
             * Gets the value of the globalCallInNumbersLabel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGlobalCallInNumbersLabel() {
                return globalCallInNumbersLabel;
            }

            /**
             * Sets the value of the globalCallInNumbersLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGlobalCallInNumbersLabel(String value) {
                this.globalCallInNumbersLabel = value;
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
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="titleURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="delivery" type="{http://www.webex.com/schemas/2002/06/service/ep}testDeliveryType"/>
     *         &lt;element name="status" type="{http://www.webex.com/schemas/2002/06/service/ep}testStatusType"/>
     *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="actionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "title",
        "titleURL",
        "delivery",
        "status",
        "action",
        "actionURL"
    })
    public static class Test {

        @XmlElement(required = true)
        protected String title;
        @XmlElement(required = true)
        protected String titleURL;
        @XmlElement(required = true, defaultValue = "IN_SESSION")
        protected TestDeliveryType delivery;
        @XmlElement(required = true, defaultValue = "NOT_STARTED")
        protected TestStatusType status;
        protected String action;
        protected String actionURL;

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
         * Gets the value of the titleURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleURL() {
            return titleURL;
        }

        /**
         * Sets the value of the titleURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleURL(String value) {
            this.titleURL = value;
        }

        /**
         * Gets the value of the delivery property.
         * 
         * @return
         *     possible object is
         *     {@link TestDeliveryType }
         *     
         */
        public TestDeliveryType getDelivery() {
            return delivery;
        }

        /**
         * Sets the value of the delivery property.
         * 
         * @param value
         *     allowed object is
         *     {@link TestDeliveryType }
         *     
         */
        public void setDelivery(TestDeliveryType value) {
            this.delivery = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link TestStatusType }
         *     
         */
        public TestStatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link TestStatusType }
         *     
         */
        public void setStatus(TestStatusType value) {
            this.status = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

        /**
         * Gets the value of the actionURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionURL() {
            return actionURL;
        }

        /**
         * Sets the value of the actionURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionURL(String value) {
            this.actionURL = value;
        }

    }

}
