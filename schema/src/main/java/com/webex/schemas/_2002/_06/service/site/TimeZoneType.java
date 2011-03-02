
package com.webex.schemas._2002._06.service.site;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeZoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="gmtOffset" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hideTimeZoneName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fallInDST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="standardLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daylightLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeZoneType", propOrder = {
    "timeZoneID",
    "gmtOffset",
    "description",
    "shortName",
    "hideTimeZoneName",
    "fallInDST",
    "standardLabel",
    "daylightLabel"
})
public class TimeZoneType {

    @XmlElement(required = true)
    protected BigInteger timeZoneID;
    @XmlElement(required = true)
    protected BigInteger gmtOffset;
    @XmlElement(required = true)
    protected String description;
    protected String shortName;
    protected Boolean hideTimeZoneName;
    protected Boolean fallInDST;
    protected String standardLabel;
    protected String daylightLabel;

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
     * Gets the value of the gmtOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGmtOffset() {
        return gmtOffset;
    }

    /**
     * Sets the value of the gmtOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGmtOffset(BigInteger value) {
        this.gmtOffset = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the hideTimeZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideTimeZoneName() {
        return hideTimeZoneName;
    }

    /**
     * Sets the value of the hideTimeZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideTimeZoneName(Boolean value) {
        this.hideTimeZoneName = value;
    }

    /**
     * Gets the value of the fallInDST property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFallInDST() {
        return fallInDST;
    }

    /**
     * Sets the value of the fallInDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFallInDST(Boolean value) {
        this.fallInDST = value;
    }

    /**
     * Gets the value of the standardLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardLabel() {
        return standardLabel;
    }

    /**
     * Sets the value of the standardLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardLabel(String value) {
        this.standardLabel = value;
    }

    /**
     * Gets the value of the daylightLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaylightLabel() {
        return daylightLabel;
    }

    /**
     * Sets the value of the daylightLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaylightLabel(String value) {
        this.daylightLabel = value;
    }

}
