
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.MeetingAssistType;


/**
 * <p>Java class for eventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="accessControl" type="{http://www.webex.com/schemas/2002/06/service/event}accessControlType" minOccurs="0"/>
 *         &lt;element name="metaData" type="{http://www.webex.com/schemas/2002/06/service/event}metaDataType" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://www.webex.com/schemas/2002/06/service/event}scheduleType" minOccurs="0"/>
 *         &lt;element name="telephony" type="{http://www.webex.com/schemas/2002/06/service/event}telephonyType" minOccurs="0"/>
 *         &lt;element name="tracking" type="{http://www.webex.com/schemas/2002/06/common}trackingType" minOccurs="0"/>
 *         &lt;element name="remind" type="{http://www.webex.com/schemas/2002/06/service/event}remindType" minOccurs="0"/>
 *         &lt;element name="panelists" type="{http://www.webex.com/schemas/2002/06/service/event}panelistsType" minOccurs="0"/>
 *         &lt;element name="attendees" type="{http://www.webex.com/schemas/2002/06/service/event}attendeesType" minOccurs="0"/>
 *         &lt;element name="extOptions" type="{http://www.webex.com/schemas/2002/06/service/event}extOptionsType" minOccurs="0"/>
 *         &lt;element name="emailTemplates" type="{http://www.webex.com/schemas/2002/06/service/event}emailTemplatesType" minOccurs="0"/>
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
@XmlType(name = "eventType", propOrder = {
    "accessControl",
    "metaData",
    "schedule",
    "telephony",
    "tracking",
    "remind",
    "panelists",
    "attendees",
    "extOptions",
    "emailTemplates",
    "assistService"
})
@XmlSeeAlso({
    CreateEvent.class,
    EventInstanceType.class
})
public class EventType
    extends BodyContentType
{

    protected AccessControlType accessControl;
    protected MetaDataType metaData;
    protected ScheduleType schedule;
    protected TelephonyType telephony;
    protected TrackingType tracking;
    protected RemindType remind;
    protected PanelistsType panelists;
    protected AttendeesType attendees;
    protected ExtOptionsType extOptions;
    protected EmailTemplatesType emailTemplates;
    protected MeetingAssistType assistService;

    /**
     * Gets the value of the accessControl property.
     * 
     * @return
     *     possible object is
     *     {@link AccessControlType }
     *     
     */
    public AccessControlType getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessControlType }
     *     
     */
    public void setAccessControl(AccessControlType value) {
        this.accessControl = value;
    }

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
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setSchedule(ScheduleType value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the telephony property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyType }
     *     
     */
    public TelephonyType getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyType }
     *     
     */
    public void setTelephony(TelephonyType value) {
        this.telephony = value;
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
     * Gets the value of the remind property.
     * 
     * @return
     *     possible object is
     *     {@link RemindType }
     *     
     */
    public RemindType getRemind() {
        return remind;
    }

    /**
     * Sets the value of the remind property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemindType }
     *     
     */
    public void setRemind(RemindType value) {
        this.remind = value;
    }

    /**
     * Gets the value of the panelists property.
     * 
     * @return
     *     possible object is
     *     {@link PanelistsType }
     *     
     */
    public PanelistsType getPanelists() {
        return panelists;
    }

    /**
     * Sets the value of the panelists property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelistsType }
     *     
     */
    public void setPanelists(PanelistsType value) {
        this.panelists = value;
    }

    /**
     * Gets the value of the attendees property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeesType }
     *     
     */
    public AttendeesType getAttendees() {
        return attendees;
    }

    /**
     * Sets the value of the attendees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeesType }
     *     
     */
    public void setAttendees(AttendeesType value) {
        this.attendees = value;
    }

    /**
     * Gets the value of the extOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtOptionsType }
     *     
     */
    public ExtOptionsType getExtOptions() {
        return extOptions;
    }

    /**
     * Sets the value of the extOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtOptionsType }
     *     
     */
    public void setExtOptions(ExtOptionsType value) {
        this.extOptions = value;
    }

    /**
     * Gets the value of the emailTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link EmailTemplatesType }
     *     
     */
    public EmailTemplatesType getEmailTemplates() {
        return emailTemplates;
    }

    /**
     * Sets the value of the emailTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailTemplatesType }
     *     
     */
    public void setEmailTemplates(EmailTemplatesType value) {
        this.emailTemplates = value;
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
