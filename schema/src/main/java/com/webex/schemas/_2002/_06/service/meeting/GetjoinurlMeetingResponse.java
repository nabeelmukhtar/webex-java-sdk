
package com.webex.schemas._2002._06.service.meeting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for getjoinurlMeetingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getjoinurlMeetingResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="joinMeetingURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inviteMeetingURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerMeetingURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getjoinurlMeetingResponse", propOrder = {
    "joinMeetingURL",
    "inviteMeetingURL",
    "registerMeetingURL"
})
public class GetjoinurlMeetingResponse
    extends BodyContentType
{

    protected String joinMeetingURL;
    protected String inviteMeetingURL;
    protected String registerMeetingURL;

    /**
     * Gets the value of the joinMeetingURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinMeetingURL() {
        return joinMeetingURL;
    }

    /**
     * Sets the value of the joinMeetingURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinMeetingURL(String value) {
        this.joinMeetingURL = value;
    }

    /**
     * Gets the value of the inviteMeetingURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteMeetingURL() {
        return inviteMeetingURL;
    }

    /**
     * Sets the value of the inviteMeetingURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteMeetingURL(String value) {
        this.inviteMeetingURL = value;
    }

    /**
     * Gets the value of the registerMeetingURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterMeetingURL() {
        return registerMeetingURL;
    }

    /**
     * Sets the value of the registerMeetingURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterMeetingURL(String value) {
        this.registerMeetingURL = value;
    }

}
