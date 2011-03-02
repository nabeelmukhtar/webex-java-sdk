
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webSiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="webSiteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAttendee" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}emailAttendeeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webSiteType", propOrder = {
    "startDate",
    "dueDate",
    "emailAttendee"
})
public class WebSiteType {

    @XmlElement(required = true)
    protected String startDate;
    @XmlElement(required = true)
    protected String dueDate;
    protected EmailAttendeeType emailAttendee;

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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the emailAttendee property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAttendeeType }
     *     
     */
    public EmailAttendeeType getEmailAttendee() {
        return emailAttendee;
    }

    /**
     * Sets the value of the emailAttendee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAttendeeType }
     *     
     */
    public void setEmailAttendee(EmailAttendeeType value) {
        this.emailAttendee = value;
    }

}
