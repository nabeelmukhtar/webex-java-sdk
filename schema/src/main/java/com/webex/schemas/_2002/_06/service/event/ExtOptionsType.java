
package com.webex.schemas._2002._06.service.event;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.AttendeeListViewType;


/**
 * <p>Java class for extOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enrollmentNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="destinationURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowInviteFriend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="viewAttendeeList" type="{http://www.webex.com/schemas/2002/06/common}attendeeListViewType" minOccurs="0"/>
 *         &lt;element name="participantLimit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="displayQuickStartHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="voip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailInvitations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extOptionsType", propOrder = {
    "enrollmentNumber",
    "destinationURL",
    "allowInviteFriend",
    "viewAttendeeList",
    "participantLimit",
    "displayQuickStartHost",
    "voip",
    "emailInvitations",
    "registration"
})
public class ExtOptionsType {

    protected BigInteger enrollmentNumber;
    protected String destinationURL;
    protected Boolean allowInviteFriend;
    protected AttendeeListViewType viewAttendeeList;
    protected BigInteger participantLimit;
    protected Boolean displayQuickStartHost;
    protected Boolean voip;
    protected Boolean emailInvitations;
    protected Boolean registration;

    /**
     * Gets the value of the enrollmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnrollmentNumber() {
        return enrollmentNumber;
    }

    /**
     * Sets the value of the enrollmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnrollmentNumber(BigInteger value) {
        this.enrollmentNumber = value;
    }

    /**
     * Gets the value of the destinationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationURL() {
        return destinationURL;
    }

    /**
     * Sets the value of the destinationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationURL(String value) {
        this.destinationURL = value;
    }

    /**
     * Gets the value of the allowInviteFriend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowInviteFriend() {
        return allowInviteFriend;
    }

    /**
     * Sets the value of the allowInviteFriend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowInviteFriend(Boolean value) {
        this.allowInviteFriend = value;
    }

    /**
     * Gets the value of the viewAttendeeList property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeListViewType }
     *     
     */
    public AttendeeListViewType getViewAttendeeList() {
        return viewAttendeeList;
    }

    /**
     * Sets the value of the viewAttendeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeListViewType }
     *     
     */
    public void setViewAttendeeList(AttendeeListViewType value) {
        this.viewAttendeeList = value;
    }

    /**
     * Gets the value of the participantLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParticipantLimit() {
        return participantLimit;
    }

    /**
     * Sets the value of the participantLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParticipantLimit(BigInteger value) {
        this.participantLimit = value;
    }

    /**
     * Gets the value of the displayQuickStartHost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayQuickStartHost() {
        return displayQuickStartHost;
    }

    /**
     * Sets the value of the displayQuickStartHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayQuickStartHost(Boolean value) {
        this.displayQuickStartHost = value;
    }

    /**
     * Gets the value of the voip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoip() {
        return voip;
    }

    /**
     * Sets the value of the voip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoip(Boolean value) {
        this.voip = value;
    }

    /**
     * Gets the value of the emailInvitations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailInvitations() {
        return emailInvitations;
    }

    /**
     * Sets the value of the emailInvitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailInvitations(Boolean value) {
        this.emailInvitations = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistration(Boolean value) {
        this.registration = value;
    }

}
