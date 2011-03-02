
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for viewTimeScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewTimeScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viewTimeStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="viewTimeEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewTimeScopeType", propOrder = {
    "viewTimeStart",
    "viewTimeEnd"
})
public class ViewTimeScopeType {

    @XmlElement(required = true)
    protected String viewTimeStart;
    @XmlElement(required = true)
    protected String viewTimeEnd;

    /**
     * Gets the value of the viewTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewTimeStart() {
        return viewTimeStart;
    }

    /**
     * Sets the value of the viewTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewTimeStart(String value) {
        this.viewTimeStart = value;
    }

    /**
     * Gets the value of the viewTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewTimeEnd() {
        return viewTimeEnd;
    }

    /**
     * Sets the value of the viewTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewTimeEnd(String value) {
        this.viewTimeEnd = value;
    }

}
