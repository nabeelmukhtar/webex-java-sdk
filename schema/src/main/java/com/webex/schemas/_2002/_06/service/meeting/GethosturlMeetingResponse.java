//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:47:51 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.meeting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for gethosturlMeetingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gethosturlMeetingResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="hostMeetingURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gethosturlMeetingResponse", propOrder = {
    "hostMeetingURL"
})
public class GethosturlMeetingResponse
    extends BodyContentType
{

    protected String hostMeetingURL;

    /**
     * Gets the value of the hostMeetingURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMeetingURL() {
        return hostMeetingURL;
    }

    /**
     * Sets the value of the hostMeetingURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMeetingURL(String value) {
        this.hostMeetingURL = value;
    }

}
