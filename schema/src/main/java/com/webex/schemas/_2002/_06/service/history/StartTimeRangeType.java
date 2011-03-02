
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for startTimeRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="startTimeRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTimeStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startTimeEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startTimeRangeType", propOrder = {
    "startTimeStart",
    "startTimeEnd"
})
public class StartTimeRangeType {

    @XmlElement(required = true)
    protected String startTimeStart;
    @XmlElement(required = true)
    protected String startTimeEnd;

    /**
     * Gets the value of the startTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimeStart() {
        return startTimeStart;
    }

    /**
     * Sets the value of the startTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeStart(String value) {
        this.startTimeStart = value;
    }

    /**
     * Gets the value of the startTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimeEnd() {
        return startTimeEnd;
    }

    /**
     * Sets the value of the startTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeEnd(String value) {
        this.startTimeEnd = value;
    }

}
