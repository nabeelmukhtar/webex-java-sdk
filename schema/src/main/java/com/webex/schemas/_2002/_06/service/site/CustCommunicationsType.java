
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for custCommunicationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="custCommunicationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayType" type="{http://www.webex.com/schemas/2002/06/service/site}displayTypeType" minOccurs="0"/>
 *         &lt;element name="displayMethod" type="{http://www.webex.com/schemas/2002/06/service/site}displayMethodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custCommunicationsType", propOrder = {
    "displayType",
    "displayMethod"
})
public class CustCommunicationsType {

    protected DisplayTypeType displayType;
    protected DisplayMethodType displayMethod;

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayTypeType }
     *     
     */
    public DisplayTypeType getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayTypeType }
     *     
     */
    public void setDisplayType(DisplayTypeType value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the displayMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayMethodType }
     *     
     */
    public DisplayMethodType getDisplayMethod() {
        return displayMethod;
    }

    /**
     * Sets the value of the displayMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayMethodType }
     *     
     */
    public void setDisplayMethod(DisplayMethodType value) {
        this.displayMethod = value;
    }

}
