
package com.webex.schemas._2002._06.service.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for delSalesSessionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delSalesSessionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="iCalendarURL" type="{http://www.webex.com/schemas/2002/06/service/sales}iCalendarURL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delSalesSessionResponse", propOrder = {
    "iCalendarURL"
})
public class DelSalesSessionResponse
    extends BodyContentType
{

    protected ICalendarURL iCalendarURL;

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

}
