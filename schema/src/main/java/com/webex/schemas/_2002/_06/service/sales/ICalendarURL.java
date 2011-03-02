
package com.webex.schemas._2002._06.service.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.ICalendarURLType;


/**
 * <p>Java class for iCalendarURL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iCalendarURL">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}iCalendarURLType">
 *       &lt;sequence>
 *         &lt;element name="sme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iCalendarURL", propOrder = {
    "sme"
})
public class ICalendarURL
    extends ICalendarURLType
{

    @XmlElement(required = true)
    protected String sme;

    /**
     * Gets the value of the sme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSme() {
        return sme;
    }

    /**
     * Sets the value of the sme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSme(String value) {
        this.sme = value;
    }

}
