
package com.webex.schemas._2002._06.service.meeting.auo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.GlobalCallInNumType;


/**
 * <p>Java class for teleconfInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="teleconfInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personalConferenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accountIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="tollFreeCallInNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tollCallInNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="intlLocalCallInNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscriberAccessCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="participantFullAccessCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="participantLimitedAccessCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheduleConfID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="extTelephonyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intlLocalCallIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teleconfLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalNum" type="{http://www.webex.com/schemas/2002/06/service}globalCallInNumType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teleconfInstanceType", propOrder = {
    "personalConferenceNumber",
    "accountIndex",
    "tollFreeCallInNumber",
    "tollCallInNumber",
    "intlLocalCallInNumber",
    "subscriberAccessCode",
    "participantFullAccessCode",
    "participantLimitedAccessCode",
    "scheduleConfID",
    "extTelephonyDescription",
    "intlLocalCallIn",
    "teleconfLocation",
    "globalNum"
})
public class TeleconfInstanceType {

    protected boolean personalConferenceNumber;
    protected BigInteger accountIndex;
    @XmlElement(required = true)
    protected String tollFreeCallInNumber;
    @XmlElement(required = true)
    protected String tollCallInNumber;
    @XmlElement(required = true)
    protected String intlLocalCallInNumber;
    @XmlElement(required = true)
    protected String subscriberAccessCode;
    @XmlElement(required = true)
    protected String participantFullAccessCode;
    @XmlElement(required = true)
    protected String participantLimitedAccessCode;
    @XmlElement(required = true)
    protected BigInteger scheduleConfID;
    protected String extTelephonyDescription;
    protected Boolean intlLocalCallIn;
    protected String teleconfLocation;
    protected List<GlobalCallInNumType> globalNum;

    /**
     * Gets the value of the personalConferenceNumber property.
     * 
     */
    public boolean isPersonalConferenceNumber() {
        return personalConferenceNumber;
    }

    /**
     * Sets the value of the personalConferenceNumber property.
     * 
     */
    public void setPersonalConferenceNumber(boolean value) {
        this.personalConferenceNumber = value;
    }

    /**
     * Gets the value of the accountIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountIndex() {
        return accountIndex;
    }

    /**
     * Sets the value of the accountIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountIndex(BigInteger value) {
        this.accountIndex = value;
    }

    /**
     * Gets the value of the tollFreeCallInNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeCallInNumber() {
        return tollFreeCallInNumber;
    }

    /**
     * Sets the value of the tollFreeCallInNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeCallInNumber(String value) {
        this.tollFreeCallInNumber = value;
    }

    /**
     * Gets the value of the tollCallInNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollCallInNumber() {
        return tollCallInNumber;
    }

    /**
     * Sets the value of the tollCallInNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollCallInNumber(String value) {
        this.tollCallInNumber = value;
    }

    /**
     * Gets the value of the intlLocalCallInNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlLocalCallInNumber() {
        return intlLocalCallInNumber;
    }

    /**
     * Sets the value of the intlLocalCallInNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlLocalCallInNumber(String value) {
        this.intlLocalCallInNumber = value;
    }

    /**
     * Gets the value of the subscriberAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAccessCode() {
        return subscriberAccessCode;
    }

    /**
     * Sets the value of the subscriberAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAccessCode(String value) {
        this.subscriberAccessCode = value;
    }

    /**
     * Gets the value of the participantFullAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantFullAccessCode() {
        return participantFullAccessCode;
    }

    /**
     * Sets the value of the participantFullAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantFullAccessCode(String value) {
        this.participantFullAccessCode = value;
    }

    /**
     * Gets the value of the participantLimitedAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantLimitedAccessCode() {
        return participantLimitedAccessCode;
    }

    /**
     * Sets the value of the participantLimitedAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantLimitedAccessCode(String value) {
        this.participantLimitedAccessCode = value;
    }

    /**
     * Gets the value of the scheduleConfID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScheduleConfID() {
        return scheduleConfID;
    }

    /**
     * Sets the value of the scheduleConfID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScheduleConfID(BigInteger value) {
        this.scheduleConfID = value;
    }

    /**
     * Gets the value of the extTelephonyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTelephonyDescription() {
        return extTelephonyDescription;
    }

    /**
     * Sets the value of the extTelephonyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTelephonyDescription(String value) {
        this.extTelephonyDescription = value;
    }

    /**
     * Gets the value of the intlLocalCallIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntlLocalCallIn() {
        return intlLocalCallIn;
    }

    /**
     * Sets the value of the intlLocalCallIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntlLocalCallIn(Boolean value) {
        this.intlLocalCallIn = value;
    }

    /**
     * Gets the value of the teleconfLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeleconfLocation() {
        return teleconfLocation;
    }

    /**
     * Sets the value of the teleconfLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeleconfLocation(String value) {
        this.teleconfLocation = value;
    }

    /**
     * Gets the value of the globalNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalCallInNumType }
     * 
     * 
     */
    public List<GlobalCallInNumType> getGlobalNum() {
        if (globalNum == null) {
            globalNum = new ArrayList<GlobalCallInNumType>();
        }
        return this.globalNum;
    }

}
