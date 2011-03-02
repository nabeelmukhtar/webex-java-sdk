
package com.webex.schemas._2002._06.service.history;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.TimeZoneType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;


/**
 * <p>Java class for meetingUsageHistoryInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meetingUsageHistoryInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="confName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meetingStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meetingEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="timezone" type="{http://www.webex.com/schemas/2002/06/common}timeZoneType" minOccurs="0"/>
 *         &lt;element name="trackingCode" type="{http://www.webex.com/schemas/2002/06/common}trackingType" minOccurs="0"/>
 *         &lt;element name="meetingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCallInMinutes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalPeopleMinutes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalCallInTollfreeMinutes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalCallOutDomestic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalCallOutInternational" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalVoipMinutes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totalParticipants" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totalParticipantsVoip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalParticipantsCallIn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totalParticipantsCallOut" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="peakAttendee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assistService" type="{http://www.webex.com/schemas/2002/06/service}meetingAssistType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingUsageHistoryInstanceType", propOrder = {
    "sessionKey",
    "confName",
    "meetingStartTime",
    "meetingEndTime",
    "duration",
    "timezone",
    "trackingCode",
    "meetingType",
    "hostWebExID",
    "hostName",
    "hostEmail",
    "totalCallInMinutes",
    "totalPeopleMinutes",
    "totalCallInTollfreeMinutes",
    "totalCallOutDomestic",
    "totalCallOutInternational",
    "totalVoipMinutes",
    "userID",
    "totalParticipants",
    "totalParticipantsVoip",
    "totalParticipantsCallIn",
    "totalParticipantsCallOut",
    "confID",
    "peakAttendee",
    "assistService"
})
@XmlSeeAlso({
    SalesSessionHistoryInstanceType.class
})
public class MeetingUsageHistoryInstanceType
    extends BodyContentType
{

    protected Long sessionKey;
    protected String confName;
    protected String meetingStartTime;
    protected String meetingEndTime;
    protected Long duration;
    protected TimeZoneType timezone;
    protected TrackingType trackingCode;
    protected String meetingType;
    protected String hostWebExID;
    protected String hostName;
    protected String hostEmail;
    protected Long totalCallInMinutes;
    protected Long totalPeopleMinutes;
    protected Long totalCallInTollfreeMinutes;
    protected Long totalCallOutDomestic;
    protected Long totalCallOutInternational;
    protected Long totalVoipMinutes;
    protected BigInteger userID;
    protected BigInteger totalParticipants;
    protected Integer totalParticipantsVoip;
    protected BigInteger totalParticipantsCallIn;
    protected BigInteger totalParticipantsCallOut;
    protected Long confID;
    protected Long peakAttendee;
    protected MeetingAssistType assistService;

    /**
     * Gets the value of the sessionKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the value of the sessionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionKey(Long value) {
        this.sessionKey = value;
    }

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
     * Gets the value of the meetingStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingStartTime() {
        return meetingStartTime;
    }

    /**
     * Sets the value of the meetingStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingStartTime(String value) {
        this.meetingStartTime = value;
    }

    /**
     * Gets the value of the meetingEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingEndTime() {
        return meetingEndTime;
    }

    /**
     * Sets the value of the meetingEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingEndTime(String value) {
        this.meetingEndTime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneType }
     *     
     */
    public TimeZoneType getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneType }
     *     
     */
    public void setTimezone(TimeZoneType value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the trackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingType }
     *     
     */
    public TrackingType getTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the value of the trackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingType }
     *     
     */
    public void setTrackingCode(TrackingType value) {
        this.trackingCode = value;
    }

    /**
     * Gets the value of the meetingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingType() {
        return meetingType;
    }

    /**
     * Sets the value of the meetingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingType(String value) {
        this.meetingType = value;
    }

    /**
     * Gets the value of the hostWebExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the value of the hostWebExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the hostEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostEmail() {
        return hostEmail;
    }

    /**
     * Sets the value of the hostEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostEmail(String value) {
        this.hostEmail = value;
    }

    /**
     * Gets the value of the totalCallInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCallInMinutes() {
        return totalCallInMinutes;
    }

    /**
     * Sets the value of the totalCallInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCallInMinutes(Long value) {
        this.totalCallInMinutes = value;
    }

    /**
     * Gets the value of the totalPeopleMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPeopleMinutes() {
        return totalPeopleMinutes;
    }

    /**
     * Sets the value of the totalPeopleMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPeopleMinutes(Long value) {
        this.totalPeopleMinutes = value;
    }

    /**
     * Gets the value of the totalCallInTollfreeMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCallInTollfreeMinutes() {
        return totalCallInTollfreeMinutes;
    }

    /**
     * Sets the value of the totalCallInTollfreeMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCallInTollfreeMinutes(Long value) {
        this.totalCallInTollfreeMinutes = value;
    }

    /**
     * Gets the value of the totalCallOutDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCallOutDomestic() {
        return totalCallOutDomestic;
    }

    /**
     * Sets the value of the totalCallOutDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCallOutDomestic(Long value) {
        this.totalCallOutDomestic = value;
    }

    /**
     * Gets the value of the totalCallOutInternational property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCallOutInternational() {
        return totalCallOutInternational;
    }

    /**
     * Sets the value of the totalCallOutInternational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCallOutInternational(Long value) {
        this.totalCallOutInternational = value;
    }

    /**
     * Gets the value of the totalVoipMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalVoipMinutes() {
        return totalVoipMinutes;
    }

    /**
     * Sets the value of the totalVoipMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalVoipMinutes(Long value) {
        this.totalVoipMinutes = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserID(BigInteger value) {
        this.userID = value;
    }

    /**
     * Gets the value of the totalParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalParticipants() {
        return totalParticipants;
    }

    /**
     * Sets the value of the totalParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalParticipants(BigInteger value) {
        this.totalParticipants = value;
    }

    /**
     * Gets the value of the totalParticipantsVoip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalParticipantsVoip() {
        return totalParticipantsVoip;
    }

    /**
     * Sets the value of the totalParticipantsVoip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalParticipantsVoip(Integer value) {
        this.totalParticipantsVoip = value;
    }

    /**
     * Gets the value of the totalParticipantsCallIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalParticipantsCallIn() {
        return totalParticipantsCallIn;
    }

    /**
     * Sets the value of the totalParticipantsCallIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalParticipantsCallIn(BigInteger value) {
        this.totalParticipantsCallIn = value;
    }

    /**
     * Gets the value of the totalParticipantsCallOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalParticipantsCallOut() {
        return totalParticipantsCallOut;
    }

    /**
     * Sets the value of the totalParticipantsCallOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalParticipantsCallOut(BigInteger value) {
        this.totalParticipantsCallOut = value;
    }

    /**
     * Gets the value of the confID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

    /**
     * Gets the value of the peakAttendee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeakAttendee() {
        return peakAttendee;
    }

    /**
     * Sets the value of the peakAttendee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeakAttendee(Long value) {
        this.peakAttendee = value;
    }

    /**
     * Gets the value of the assistService property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingAssistType }
     *     
     */
    public MeetingAssistType getAssistService() {
        return assistService;
    }

    /**
     * Sets the value of the assistService property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingAssistType }
     *     
     */
    public void setAssistService(MeetingAssistType value) {
        this.assistService = value;
    }

}
