
package com.webex.schemas._2002._06.service.session;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.CallInNumType;
import com.webex.schemas._2002._06.service.TspAccessCodeOrderType;
import com.webex.schemas._2002._06.service.TspAccountType;


/**
 * <p>Java class for telephonyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telephonyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telephonySupport" type="{http://www.webex.com/schemas/2002/06/service/session}telephonySupportType" minOccurs="0"/>
 *         &lt;element name="numPhoneLines" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="extTelephonyURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extTelephonyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableTSP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tspAccountIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="personalAccountIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="intlLocalCallIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teleconfLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callInNum" type="{http://www.webex.com/schemas/2002/06/service}callInNumType" minOccurs="0"/>
 *         &lt;element name="tspConference" type="{http://www.webex.com/schemas/2002/06/service}tspAccountType" minOccurs="0"/>
 *         &lt;element name="tspAccessCodeOrder" type="{http://www.webex.com/schemas/2002/06/service}tspAccessCodeOrderType" minOccurs="0"/>
 *         &lt;element name="tollFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telephonyType", propOrder = {
    "telephonySupport",
    "numPhoneLines",
    "extTelephonyURL",
    "extTelephonyDescription",
    "enableTSP",
    "tspAccountIndex",
    "personalAccountIndex",
    "intlLocalCallIn",
    "teleconfLocation",
    "callInNum",
    "tspConference",
    "tspAccessCodeOrder",
    "tollFree"
})
public class TelephonyType {

    @XmlElement(defaultValue = "NONE")
    protected TelephonySupportType telephonySupport;
    @XmlElement(defaultValue = "4")
    protected BigInteger numPhoneLines;
    protected String extTelephonyURL;
    protected String extTelephonyDescription;
    protected Boolean enableTSP;
    protected BigInteger tspAccountIndex;
    protected BigInteger personalAccountIndex;
    protected Boolean intlLocalCallIn;
    protected String teleconfLocation;
    protected CallInNumType callInNum;
    protected TspAccountType tspConference;
    protected TspAccessCodeOrderType tspAccessCodeOrder;
    protected Boolean tollFree;

    /**
     * Gets the value of the telephonySupport property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonySupportType }
     *     
     */
    public TelephonySupportType getTelephonySupport() {
        return telephonySupport;
    }

    /**
     * Sets the value of the telephonySupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonySupportType }
     *     
     */
    public void setTelephonySupport(TelephonySupportType value) {
        this.telephonySupport = value;
    }

    /**
     * Gets the value of the numPhoneLines property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumPhoneLines() {
        return numPhoneLines;
    }

    /**
     * Sets the value of the numPhoneLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumPhoneLines(BigInteger value) {
        this.numPhoneLines = value;
    }

    /**
     * Gets the value of the extTelephonyURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTelephonyURL() {
        return extTelephonyURL;
    }

    /**
     * Sets the value of the extTelephonyURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTelephonyURL(String value) {
        this.extTelephonyURL = value;
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
     * Gets the value of the enableTSP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableTSP() {
        return enableTSP;
    }

    /**
     * Sets the value of the enableTSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableTSP(Boolean value) {
        this.enableTSP = value;
    }

    /**
     * Gets the value of the tspAccountIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTspAccountIndex() {
        return tspAccountIndex;
    }

    /**
     * Sets the value of the tspAccountIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTspAccountIndex(BigInteger value) {
        this.tspAccountIndex = value;
    }

    /**
     * Gets the value of the personalAccountIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonalAccountIndex() {
        return personalAccountIndex;
    }

    /**
     * Sets the value of the personalAccountIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonalAccountIndex(BigInteger value) {
        this.personalAccountIndex = value;
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
     * Gets the value of the callInNum property.
     * 
     * @return
     *     possible object is
     *     {@link CallInNumType }
     *     
     */
    public CallInNumType getCallInNum() {
        return callInNum;
    }

    /**
     * Sets the value of the callInNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallInNumType }
     *     
     */
    public void setCallInNum(CallInNumType value) {
        this.callInNum = value;
    }

    /**
     * Gets the value of the tspConference property.
     * 
     * @return
     *     possible object is
     *     {@link TspAccountType }
     *     
     */
    public TspAccountType getTspConference() {
        return tspConference;
    }

    /**
     * Sets the value of the tspConference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TspAccountType }
     *     
     */
    public void setTspConference(TspAccountType value) {
        this.tspConference = value;
    }

    /**
     * Gets the value of the tspAccessCodeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TspAccessCodeOrderType }
     *     
     */
    public TspAccessCodeOrderType getTspAccessCodeOrder() {
        return tspAccessCodeOrder;
    }

    /**
     * Sets the value of the tspAccessCodeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TspAccessCodeOrderType }
     *     
     */
    public void setTspAccessCodeOrder(TspAccessCodeOrderType value) {
        this.tspAccessCodeOrder = value;
    }

    /**
     * Gets the value of the tollFree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTollFree() {
        return tollFree;
    }

    /**
     * Sets the value of the tollFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTollFree(Boolean value) {
        this.tollFree = value;
    }

}
