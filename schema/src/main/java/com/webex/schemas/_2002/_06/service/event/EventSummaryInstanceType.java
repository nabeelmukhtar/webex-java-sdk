
package com.webex.schemas._2002._06.service.event;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventSummaryInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventSummaryInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sessionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="panelists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listStatus" type="{http://www.webex.com/schemas/2002/06/service/event}listingType" minOccurs="0"/>
 *         &lt;element name="attendeeCount" type="{http://www.webex.com/schemas/2002/06/service/event}attendeeCountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventSummaryInstanceType", propOrder = {
    "sessionKey",
    "sessionName",
    "sessionType",
    "hostWebExID",
    "startDate",
    "endDate",
    "timeZoneID",
    "duration",
    "description",
    "status",
    "panelists",
    "listStatus",
    "attendeeCount"
})
public class EventSummaryInstanceType {

    protected long sessionKey;
    @XmlElement(required = true)
    protected String sessionName;
    @XmlElement(required = true)
    protected BigInteger sessionType;
    @XmlElement(required = true)
    protected String hostWebExID;
    protected String startDate;
    protected String endDate;
    protected BigInteger timeZoneID;
    @XmlElement(required = true)
    protected BigInteger duration;
    protected String description;
    protected String status;
    protected String panelists;
    protected ListingType listStatus;
    protected AttendeeCountType attendeeCount;

    /**
     * Gets the value of the sessionKey property.
     * 
     */
    public long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the value of the sessionKey property.
     * 
     */
    public void setSessionKey(long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the value of the sessionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Sets the value of the sessionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionName(String value) {
        this.sessionName = value;
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
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeZoneID(BigInteger value) {
        this.timeZoneID = value;
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
     * Gets the value of the panelists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanelists() {
        return panelists;
    }

    /**
     * Sets the value of the panelists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanelists(String value) {
        this.panelists = value;
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
     * Gets the value of the attendeeCount property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeCountType }
     *     
     */
    public AttendeeCountType getAttendeeCount() {
        return attendeeCount;
    }

    /**
     * Sets the value of the attendeeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeCountType }
     *     
     */
    public void setAttendeeCount(AttendeeCountType value) {
        this.attendeeCount = value;
    }

}
