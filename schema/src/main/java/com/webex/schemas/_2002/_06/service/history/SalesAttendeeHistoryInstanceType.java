
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salesAttendeeHistoryInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salesAttendeeHistoryInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/history}meetingAttendeeHistoryInstanceType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opportunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attendeeType" type="{http://www.webex.com/schemas/2002/06/service/history}attendeeTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesAttendeeHistoryInstanceType", propOrder = {
    "account",
    "opportunity",
    "attendeeType"
})
public class SalesAttendeeHistoryInstanceType
    extends MeetingAttendeeHistoryInstanceType
{

    protected String account;
    protected String opportunity;
    protected AttendeeTypeType attendeeType;

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
     * Gets the value of the attendeeType property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeTypeType }
     *     
     */
    public AttendeeTypeType getAttendeeType() {
        return attendeeType;
    }

    /**
     * Sets the value of the attendeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeTypeType }
     *     
     */
    public void setAttendeeType(AttendeeTypeType value) {
        this.attendeeType = value;
    }

}
