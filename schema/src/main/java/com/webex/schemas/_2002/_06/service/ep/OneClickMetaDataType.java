
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oneClickMetaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oneClickMetaDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/ep}oneClickMetaData">
 *       &lt;sequence>
 *         &lt;element name="confName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listing" type="{http://www.webex.com/schemas/2002/06/service/ep}listingType" minOccurs="0"/>
 *         &lt;element name="CUVCMeetingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isInternal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneClickMetaDataType", propOrder = {
    "confName",
    "sessionPassword",
    "listing",
    "cuvcMeetingID",
    "isInternal"
})
@XmlSeeAlso({
    OcMetaDataType.class
})
public class OneClickMetaDataType
    extends OneClickMetaData
{

    @XmlElement(required = true)
    protected String confName;
    protected String sessionPassword;
    protected ListingType listing;
    @XmlElement(name = "CUVCMeetingID")
    protected String cuvcMeetingID;
    protected Boolean isInternal;

    /**
     * Gets the value of the confName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the value of the confName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Gets the value of the sessionPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionPassword() {
        return sessionPassword;
    }

    /**
     * Sets the value of the sessionPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionPassword(String value) {
        this.sessionPassword = value;
    }

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
     * Gets the value of the cuvcMeetingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUVCMeetingID() {
        return cuvcMeetingID;
    }

    /**
     * Sets the value of the cuvcMeetingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUVCMeetingID(String value) {
        this.cuvcMeetingID = value;
    }

    /**
     * Gets the value of the isInternal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInternal() {
        return isInternal;
    }

    /**
     * Sets the value of the isInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInternal(Boolean value) {
        this.isInternal = value;
    }

}
