
package com.webex.schemas._2002._06.service.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accessControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accessControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listing" type="{http://www.webex.com/schemas/2002/06/service/sales}listingType" minOccurs="0"/>
 *         &lt;element name="meetingPassword" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="enforcePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessControlType", propOrder = {
    "listing",
    "meetingPassword",
    "enforcePassword"
})
public class AccessControlType {

    protected ListingType listing;
    protected String meetingPassword;
    @XmlElement(defaultValue = "true")
    protected Boolean enforcePassword;

    /**
     * Gets the value of the listing property.
     * 
     * @return
     *     possible object is
     *     {@link ListingType }
     *     
     */
    public ListingType getListing() {
        return listing;
    }

    /**
     * Sets the value of the listing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingType }
     *     
     */
    public void setListing(ListingType value) {
        this.listing = value;
    }

    /**
     * Gets the value of the meetingPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingPassword() {
        return meetingPassword;
    }

    /**
     * Sets the value of the meetingPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingPassword(String value) {
        this.meetingPassword = value;
    }

    /**
     * Gets the value of the enforcePassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforcePassword() {
        return enforcePassword;
    }

    /**
     * Sets the value of the enforcePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforcePassword(Boolean value) {
        this.enforcePassword = value;
    }

}
