
package com.webex.schemas._2002._06.service.meeting.auo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.TrackingType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for audioOnlyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioOnlyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="accessControl" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}accessControlType" minOccurs="0"/>
 *         &lt;element name="metaData" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}metaDataType" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}scheduleType" minOccurs="0"/>
 *         &lt;element name="teleconference" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}teleconfType" minOccurs="0"/>
 *         &lt;element name="tracking" type="{http://www.webex.com/schemas/2002/06/common}trackingType" minOccurs="0"/>
 *         &lt;element name="repeat" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}repeatType" minOccurs="0"/>
 *         &lt;element name="remind" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}remindType" minOccurs="0"/>
 *         &lt;element name="fullAccessAttendees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attendee" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}attendeeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="limitedAccessAttendees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attendee" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}attendeeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attendeeOptions" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}attendeeOptionsType" minOccurs="0"/>
 *         &lt;element name="validateFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioOnlyType", propOrder = {
    "accessControl",
    "metaData",
    "schedule",
    "teleconference",
    "tracking",
    "repeat",
    "remind",
    "fullAccessAttendees",
    "limitedAccessAttendees",
    "attendeeOptions",
    "validateFormat"
})
@XmlSeeAlso({
    CreateTeleconferenceSession.class,
    SetTeleconferenceSession.class
})
public class AudioOnlyType
    extends BodyContentType
{

    protected AccessControlType accessControl;
    protected MetaDataType metaData;
    protected ScheduleType schedule;
    protected TeleconfType teleconference;
    protected TrackingType tracking;
    protected RepeatType repeat;
    protected RemindType remind;
    protected AudioOnlyType.FullAccessAttendees fullAccessAttendees;
    protected AudioOnlyType.LimitedAccessAttendees limitedAccessAttendees;
    protected AttendeeOptionsType attendeeOptions;
    protected Boolean validateFormat;

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
     * Gets the value of the teleconference property.
     * 
     * @return
     *     possible object is
     *     {@link TeleconfType }
     *     
     */
    public TeleconfType getTeleconference() {
        return teleconference;
    }

    /**
     * Sets the value of the teleconference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeleconfType }
     *     
     */
    public void setTeleconference(TeleconfType value) {
        this.teleconference = value;
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
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link RepeatType }
     *     
     */
    public RepeatType getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatType }
     *     
     */
    public void setRepeat(RepeatType value) {
        this.repeat = value;
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
     * Gets the value of the fullAccessAttendees property.
     * 
     * @return
     *     possible object is
     *     {@link AudioOnlyType.FullAccessAttendees }
     *     
     */
    public AudioOnlyType.FullAccessAttendees getFullAccessAttendees() {
        return fullAccessAttendees;
    }

    /**
     * Sets the value of the fullAccessAttendees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioOnlyType.FullAccessAttendees }
     *     
     */
    public void setFullAccessAttendees(AudioOnlyType.FullAccessAttendees value) {
        this.fullAccessAttendees = value;
    }

    /**
     * Gets the value of the limitedAccessAttendees property.
     * 
     * @return
     *     possible object is
     *     {@link AudioOnlyType.LimitedAccessAttendees }
     *     
     */
    public AudioOnlyType.LimitedAccessAttendees getLimitedAccessAttendees() {
        return limitedAccessAttendees;
    }

    /**
     * Sets the value of the limitedAccessAttendees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioOnlyType.LimitedAccessAttendees }
     *     
     */
    public void setLimitedAccessAttendees(AudioOnlyType.LimitedAccessAttendees value) {
        this.limitedAccessAttendees = value;
    }

    /**
     * Gets the value of the attendeeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeOptionsType }
     *     
     */
    public AttendeeOptionsType getAttendeeOptions() {
        return attendeeOptions;
    }

    /**
     * Sets the value of the attendeeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeOptionsType }
     *     
     */
    public void setAttendeeOptions(AttendeeOptionsType value) {
        this.attendeeOptions = value;
    }

    /**
     * Gets the value of the validateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateFormat() {
        return validateFormat;
    }

    /**
     * Sets the value of the validateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateFormat(Boolean value) {
        this.validateFormat = value;
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
     *         &lt;element name="attendee" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}attendeeType" maxOccurs="unbounded" minOccurs="0"/>
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
        "attendee"
    })
    public static class FullAccessAttendees {

        protected List<AttendeeType> attendee;

        /**
         * Gets the value of the attendee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attendee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttendee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttendeeType }
         * 
         * 
         */
        public List<AttendeeType> getAttendee() {
            if (attendee == null) {
                attendee = new ArrayList<AttendeeType>();
            }
            return this.attendee;
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
     *         &lt;element name="attendee" type="{http://www.webex.com/schemas/2002/06/service/meeting/auo}attendeeType" maxOccurs="unbounded" minOccurs="0"/>
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
        "attendee"
    })
    public static class LimitedAccessAttendees {

        protected List<AttendeeType> attendee;

        /**
         * Gets the value of the attendee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attendee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttendee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttendeeType }
         * 
         * 
         */
        public List<AttendeeType> getAttendee() {
            if (attendee == null) {
                attendee = new ArrayList<AttendeeType>();
            }
            return this.attendee;
        }

    }

}
