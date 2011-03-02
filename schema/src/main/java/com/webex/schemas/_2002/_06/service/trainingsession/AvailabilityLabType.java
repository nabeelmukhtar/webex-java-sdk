
package com.webex.schemas._2002._06.service.trainingsession;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.LabStatusType;


/**
 * <p>Java class for availabilityLabType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="availabilityLabType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="labName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="sessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numComputers" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="status" type="{http://www.webex.com/schemas/2002/06/common}labStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availabilityLabType", propOrder = {
    "labName",
    "timeZoneID",
    "sessionStartTime",
    "sessionEndTime",
    "numComputers",
    "status"
})
public class AvailabilityLabType {

    @XmlElement(required = true)
    protected String labName;
    @XmlElement(required = true)
    protected BigInteger timeZoneID;
    @XmlElement(required = true)
    protected String sessionStartTime;
    @XmlElement(required = true)
    protected String sessionEndTime;
    @XmlElement(required = true)
    protected BigInteger numComputers;
    @XmlElement(required = true)
    protected LabStatusType status;

    /**
     * Gets the value of the labName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabName() {
        return labName;
    }

    /**
     * Sets the value of the labName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabName(String value) {
        this.labName = value;
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
     * Gets the value of the sessionStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionStartTime() {
        return sessionStartTime;
    }

    /**
     * Sets the value of the sessionStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionStartTime(String value) {
        this.sessionStartTime = value;
    }

    /**
     * Gets the value of the sessionEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionEndTime() {
        return sessionEndTime;
    }

    /**
     * Sets the value of the sessionEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionEndTime(String value) {
        this.sessionEndTime = value;
    }

    /**
     * Gets the value of the numComputers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumComputers() {
        return numComputers;
    }

    /**
     * Sets the value of the numComputers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumComputers(BigInteger value) {
        this.numComputers = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link LabStatusType }
     *     
     */
    public LabStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabStatusType }
     *     
     */
    public void setStatus(LabStatusType value) {
        this.status = value;
    }

}
