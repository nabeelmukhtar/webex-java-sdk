
package com.webex.schemas._2002._06.service.meeting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for getjoinurlMeeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getjoinurlMeeting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="meetingKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="attendeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attendeeEmail" type="{http://www.webex.com/schemas/2002/06/common}emailType" minOccurs="0"/>
 *         &lt;element name="meetingPW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getjoinurlMeeting", propOrder = {
    "meetingKey",
    "sessionKey",
    "attendeeName",
    "attendeeEmail",
    "meetingPW",
    "regID"
})
public class GetjoinurlMeeting
    extends BodyContentType
{

    protected Long meetingKey;
    protected Long sessionKey;
    protected String attendeeName;
    protected String attendeeEmail;
    protected String meetingPW;
    @XmlElement(name = "RegID")
    protected String regID;

    /**
     * Gets the value of the meetingKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the value of the meetingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeetingKey(Long value) {
        this.meetingKey = value;
    }

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
     * Gets the value of the attendeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendeeName() {
        return attendeeName;
    }

    /**
     * Sets the value of the attendeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendeeName(String value) {
        this.attendeeName = value;
    }

    /**
     * Gets the value of the attendeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    /**
     * Sets the value of the attendeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendeeEmail(String value) {
        this.attendeeEmail = value;
    }

    /**
     * Gets the value of the meetingPW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingPW() {
        return meetingPW;
    }

    /**
     * Sets the value of the meetingPW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingPW(String value) {
        this.meetingPW = value;
    }

    /**
     * Gets the value of the regID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegID() {
        return regID;
    }

    /**
     * Sets the value of the regID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegID(String value) {
        this.regID = value;
    }

}
