
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for privilegeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="privilegeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teleConfCallOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teleConfCallOutInternational" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teleConfCallIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teleConfTollFreeCallIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="siteAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="voiceOverIp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="roSiteAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="labAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="otherTelephony" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teleConfCallInInternational" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendeeOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recordingEditor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="meetingAssist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "privilegeType", propOrder = {
    "host",
    "teleConfCallOut",
    "teleConfCallOutInternational",
    "teleConfCallIn",
    "teleConfTollFreeCallIn",
    "siteAdmin",
    "voiceOverIp",
    "roSiteAdmin",
    "labAdmin",
    "otherTelephony",
    "teleConfCallInInternational",
    "attendeeOnly",
    "recordingEditor",
    "meetingAssist"
})
public class PrivilegeType {

    protected Boolean host;
    protected Boolean teleConfCallOut;
    protected Boolean teleConfCallOutInternational;
    protected Boolean teleConfCallIn;
    protected Boolean teleConfTollFreeCallIn;
    protected Boolean siteAdmin;
    protected Boolean voiceOverIp;
    protected Boolean roSiteAdmin;
    protected Boolean labAdmin;
    @XmlElement(defaultValue = "true")
    protected Boolean otherTelephony;
    protected Boolean teleConfCallInInternational;
    protected Boolean attendeeOnly;
    protected Boolean recordingEditor;
    protected Boolean meetingAssist;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHost(Boolean value) {
        this.host = value;
    }

    /**
     * Gets the value of the teleConfCallOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeleConfCallOut() {
        return teleConfCallOut;
    }

    /**
     * Sets the value of the teleConfCallOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeleConfCallOut(Boolean value) {
        this.teleConfCallOut = value;
    }

    /**
     * Gets the value of the teleConfCallOutInternational property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeleConfCallOutInternational() {
        return teleConfCallOutInternational;
    }

    /**
     * Sets the value of the teleConfCallOutInternational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeleConfCallOutInternational(Boolean value) {
        this.teleConfCallOutInternational = value;
    }

    /**
     * Gets the value of the teleConfCallIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeleConfCallIn() {
        return teleConfCallIn;
    }

    /**
     * Sets the value of the teleConfCallIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeleConfCallIn(Boolean value) {
        this.teleConfCallIn = value;
    }

    /**
     * Gets the value of the teleConfTollFreeCallIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeleConfTollFreeCallIn() {
        return teleConfTollFreeCallIn;
    }

    /**
     * Sets the value of the teleConfTollFreeCallIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeleConfTollFreeCallIn(Boolean value) {
        this.teleConfTollFreeCallIn = value;
    }

    /**
     * Gets the value of the siteAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSiteAdmin() {
        return siteAdmin;
    }

    /**
     * Sets the value of the siteAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSiteAdmin(Boolean value) {
        this.siteAdmin = value;
    }

    /**
     * Gets the value of the voiceOverIp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoiceOverIp() {
        return voiceOverIp;
    }

    /**
     * Sets the value of the voiceOverIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoiceOverIp(Boolean value) {
        this.voiceOverIp = value;
    }

    /**
     * Gets the value of the roSiteAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoSiteAdmin() {
        return roSiteAdmin;
    }

    /**
     * Sets the value of the roSiteAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoSiteAdmin(Boolean value) {
        this.roSiteAdmin = value;
    }

    /**
     * Gets the value of the labAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLabAdmin() {
        return labAdmin;
    }

    /**
     * Sets the value of the labAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLabAdmin(Boolean value) {
        this.labAdmin = value;
    }

    /**
     * Gets the value of the otherTelephony property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherTelephony() {
        return otherTelephony;
    }

    /**
     * Sets the value of the otherTelephony property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherTelephony(Boolean value) {
        this.otherTelephony = value;
    }

    /**
     * Gets the value of the teleConfCallInInternational property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeleConfCallInInternational() {
        return teleConfCallInInternational;
    }

    /**
     * Sets the value of the teleConfCallInInternational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeleConfCallInInternational(Boolean value) {
        this.teleConfCallInInternational = value;
    }

    /**
     * Gets the value of the attendeeOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttendeeOnly() {
        return attendeeOnly;
    }

    /**
     * Sets the value of the attendeeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttendeeOnly(Boolean value) {
        this.attendeeOnly = value;
    }

    /**
     * Gets the value of the recordingEditor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordingEditor() {
        return recordingEditor;
    }

    /**
     * Sets the value of the recordingEditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordingEditor(Boolean value) {
        this.recordingEditor = value;
    }

    /**
     * Gets the value of the meetingAssist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeetingAssist() {
        return meetingAssist;
    }

    /**
     * Sets the value of the meetingAssist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeetingAssist(Boolean value) {
        this.meetingAssist = value;
    }

}
