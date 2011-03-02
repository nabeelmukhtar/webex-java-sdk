
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.ICalendarURLType;


/**
 * <p>Java class for delSessionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delSessionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="iCalendarURL" type="{http://www.webex.com/schemas/2002/06/service}iCalendarURLType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delSessionResponse", propOrder = {
    "iCalendarURL"
})
public class DelSessionResponse
    extends BodyContentType
{

    protected ICalendarURLType iCalendarURL;

    /**
     * Gets the value of the iCalendarURL property.
     * 
     * @return
     *     possible object is
     *     {@link ICalendarURLType }
     *     
     */
    public ICalendarURLType getICalendarURL() {
        return iCalendarURL;
    }

    /**
     * Sets the value of the iCalendarURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICalendarURLType }
     *     
     */
    public void setICalendarURL(ICalendarURLType value) {
        this.iCalendarURL = value;
    }

}
