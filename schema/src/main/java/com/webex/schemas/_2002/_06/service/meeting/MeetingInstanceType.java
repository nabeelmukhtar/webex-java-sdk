
package com.webex.schemas._2002._06.service.meeting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meetingInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meetingInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/meeting}meetingType">
 *       &lt;sequence>
 *         &lt;element name="meetingkey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostJoined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="participantsJoined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingInstanceType", propOrder = {
    "meetingkey",
    "status",
    "hostJoined",
    "participantsJoined"
})
@XmlSeeAlso({
    SetMeeting.class,
    GetMeetingResponse.class
})
public class MeetingInstanceType
    extends MeetingType
{

    protected long meetingkey;
    protected String status;
    protected Boolean hostJoined;
    protected Boolean participantsJoined;

    /**
     * Gets the value of the meetingkey property.
     * 
     */
    public long getMeetingkey() {
        return meetingkey;
    }

    /**
     * Sets the value of the meetingkey property.
     * 
     */
    public void setMeetingkey(long value) {
        this.meetingkey = value;
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
     * Gets the value of the hostJoined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostJoined() {
        return hostJoined;
    }

    /**
     * Sets the value of the hostJoined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostJoined(Boolean value) {
        this.hostJoined = value;
    }

    /**
     * Gets the value of the participantsJoined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParticipantsJoined() {
        return participantsJoined;
    }

    /**
     * Sets the value of the participantsJoined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticipantsJoined(Boolean value) {
        this.participantsJoined = value;
    }

}
