
package com.webex.schemas._2002._06.service.ep;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dateScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dateScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startDateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="returnSpecifiedTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateScopeType", propOrder = {
    "startDateStart",
    "startDateEnd",
    "endDateStart",
    "endDateEnd",
    "timeZoneID",
    "returnSpecifiedTimeZone"
})
public class DateScopeType {

    protected String startDateStart;
    protected String startDateEnd;
    protected String endDateStart;
    protected String endDateEnd;
    @XmlElement(defaultValue = "-1")
    protected BigInteger timeZoneID;
    protected Boolean returnSpecifiedTimeZone;

    /**
     * Gets the value of the startDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateStart() {
        return startDateStart;
    }

    /**
     * Sets the value of the startDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateStart(String value) {
        this.startDateStart = value;
    }

    /**
     * Gets the value of the startDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateEnd() {
        return startDateEnd;
    }

    /**
     * Sets the value of the startDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateEnd(String value) {
        this.startDateEnd = value;
    }

    /**
     * Gets the value of the endDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateStart() {
        return endDateStart;
    }

    /**
     * Sets the value of the endDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateStart(String value) {
        this.endDateStart = value;
    }

    /**
     * Gets the value of the endDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateEnd() {
        return endDateEnd;
    }

    /**
     * Sets the value of the endDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateEnd(String value) {
        this.endDateEnd = value;
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
     * Gets the value of the returnSpecifiedTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSpecifiedTimeZone() {
        return returnSpecifiedTimeZone;
    }

    /**
     * Sets the value of the returnSpecifiedTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSpecifiedTimeZone(Boolean value) {
        this.returnSpecifiedTimeZone = value;
    }

}
