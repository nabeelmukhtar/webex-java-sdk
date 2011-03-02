
package com.webex.schemas._2002._06.service.attendee;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.MatchingRecordsType;


/**
 * <p>Java class for enrollSessionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrollSessionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="attendee" type="{http://www.webex.com/schemas/2002/06/service/attendee}enrollAttendeeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="matchingRecords" type="{http://www.webex.com/schemas/2002/06/service}matchingRecordsType" minOccurs="0"/>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollSessionType", propOrder = {
    "confID",
    "attendee",
    "matchingRecords",
    "sessionKey"
})
public class EnrollSessionType {

    protected long confID;
    protected List<EnrollAttendeeType> attendee;
    protected MatchingRecordsType matchingRecords;
    protected long sessionKey;

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
     * {@link EnrollAttendeeType }
     * 
     * 
     */
    public List<EnrollAttendeeType> getAttendee() {
        if (attendee == null) {
            attendee = new ArrayList<EnrollAttendeeType>();
        }
        return this.attendee;
    }

    /**
     * Gets the value of the matchingRecords property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingRecordsType }
     *     
     */
    public MatchingRecordsType getMatchingRecords() {
        return matchingRecords;
    }

    /**
     * Sets the value of the matchingRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingRecordsType }
     *     
     */
    public void setMatchingRecords(MatchingRecordsType value) {
        this.matchingRecords = value;
    }

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

}
