
package com.webex.schemas._2002._06.service.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for createSalesSessionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createSalesSessionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="meetingKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="iCalendarURL" type="{http://www.webex.com/schemas/2002/06/service/sales}iCalendarURL" minOccurs="0"/>
 *         &lt;element name="guestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSalesSessionResponse", propOrder = {
    "meetingKey",
    "iCalendarURL",
    "guestToken"
})
public class CreateSalesSessionResponse
    extends BodyContentType
{

    protected Long meetingKey;
    protected ICalendarURL iCalendarURL;
    protected String guestToken;

    /**
     * Gets the value of the meetingKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the value of the meetingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeetingKey(Long value) {
        this.meetingKey = value;
    }

    /**
     * Gets the value of the iCalendarURL property.
     * 
     * @return
     *     possible object is
     *     {@link ICalendarURL }
     *     
     */
    public ICalendarURL getICalendarURL() {
        return iCalendarURL;
    }

    /**
     * Sets the value of the iCalendarURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICalendarURL }
     *     
     */
    public void setICalendarURL(ICalendarURL value) {
        this.iCalendarURL = value;
    }

    /**
     * Gets the value of the guestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestToken() {
        return guestToken;
    }

    /**
     * Sets the value of the guestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestToken(String value) {
        this.guestToken = value;
    }

}
