
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meetingPlaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meetingPlaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mpProfileURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpLogoutURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpInternalMeetingLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbrProfileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbrProfilePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingPlaceType", propOrder = {
    "mpProfileURL",
    "mpLogoutURL",
    "mpInternalMeetingLink",
    "nbrProfileNumber",
    "nbrProfilePassword"
})
public class MeetingPlaceType {

    protected String mpProfileURL;
    protected String mpLogoutURL;
    protected String mpInternalMeetingLink;
    protected String nbrProfileNumber;
    protected String nbrProfilePassword;

    /**
     * Gets the value of the mpProfileURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpProfileURL() {
        return mpProfileURL;
    }

    /**
     * Sets the value of the mpProfileURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpProfileURL(String value) {
        this.mpProfileURL = value;
    }

    /**
     * Gets the value of the mpLogoutURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpLogoutURL() {
        return mpLogoutURL;
    }

    /**
     * Sets the value of the mpLogoutURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpLogoutURL(String value) {
        this.mpLogoutURL = value;
    }

    /**
     * Gets the value of the mpInternalMeetingLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpInternalMeetingLink() {
        return mpInternalMeetingLink;
    }

    /**
     * Sets the value of the mpInternalMeetingLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpInternalMeetingLink(String value) {
        this.mpInternalMeetingLink = value;
    }

    /**
     * Gets the value of the nbrProfileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbrProfileNumber() {
        return nbrProfileNumber;
    }

    /**
     * Sets the value of the nbrProfileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbrProfileNumber(String value) {
        this.nbrProfileNumber = value;
    }

    /**
     * Gets the value of the nbrProfilePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbrProfilePassword() {
        return nbrProfilePassword;
    }

    /**
     * Sets the value of the nbrProfilePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbrProfilePassword(String value) {
        this.nbrProfilePassword = value;
    }

}
