
package com.webex.schemas._2002._06.service.event;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.EntryExitToneType;


/**
 * <p>Java class for scheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="openTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryExitTone" type="{http://www.webex.com/schemas/2002/06/common}entryExitToneType" minOccurs="0"/>
 *         &lt;element name="extURL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="extNotifyTime" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="joinNotifyURL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="joinTeleconfBeforeHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleType", propOrder = {
    "startDate",
    "timeZoneID",
    "duration",
    "openTime",
    "hostWebExID",
    "entryExitTone",
    "extURL",
    "extNotifyTime",
    "joinNotifyURL",
    "joinTeleconfBeforeHost"
})
public class ScheduleType {

    protected String startDate;
    @XmlElement(defaultValue = "-1")
    protected BigInteger timeZoneID;
    protected BigInteger duration;
    protected BigInteger openTime;
    protected String hostWebExID;
    protected EntryExitToneType entryExitTone;
    protected String extURL;
    protected BigInteger extNotifyTime;
    protected String joinNotifyURL;
    protected Boolean joinTeleconfBeforeHost;

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
     * Gets the value of the openTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenTime() {
        return openTime;
    }

    /**
     * Sets the value of the openTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenTime(BigInteger value) {
        this.openTime = value;
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
     * Gets the value of the entryExitTone property.
     * 
     * @return
     *     possible object is
     *     {@link EntryExitToneType }
     *     
     */
    public EntryExitToneType getEntryExitTone() {
        return entryExitTone;
    }

    /**
     * Sets the value of the entryExitTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryExitToneType }
     *     
     */
    public void setEntryExitTone(EntryExitToneType value) {
        this.entryExitTone = value;
    }

    /**
     * Gets the value of the extURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtURL() {
        return extURL;
    }

    /**
     * Sets the value of the extURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtURL(String value) {
        this.extURL = value;
    }

    /**
     * Gets the value of the extNotifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtNotifyTime() {
        return extNotifyTime;
    }

    /**
     * Sets the value of the extNotifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtNotifyTime(BigInteger value) {
        this.extNotifyTime = value;
    }

    /**
     * Gets the value of the joinNotifyURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinNotifyURL() {
        return joinNotifyURL;
    }

    /**
     * Sets the value of the joinNotifyURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinNotifyURL(String value) {
        this.joinNotifyURL = value;
    }

    /**
     * Gets the value of the joinTeleconfBeforeHost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJoinTeleconfBeforeHost() {
        return joinTeleconfBeforeHost;
    }

    /**
     * Sets the value of the joinTeleconfBeforeHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJoinTeleconfBeforeHost(Boolean value) {
        this.joinTeleconfBeforeHost = value;
    }

}
