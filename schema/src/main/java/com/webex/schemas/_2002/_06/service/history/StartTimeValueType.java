
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for startTimeValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="startTimeValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionStartTimeStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionStartTimeEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startTimeValueType", propOrder = {
    "sessionStartTimeStart",
    "sessionStartTimeEnd"
})
public class StartTimeValueType {

    @XmlElement(required = true)
    protected String sessionStartTimeStart;
    @XmlElement(required = true)
    protected String sessionStartTimeEnd;

    /**
     * Gets the value of the sessionStartTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionStartTimeStart() {
        return sessionStartTimeStart;
    }

    /**
     * Sets the value of the sessionStartTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionStartTimeStart(String value) {
        this.sessionStartTimeStart = value;
    }

    /**
     * Gets the value of the sessionStartTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionStartTimeEnd() {
        return sessionStartTimeEnd;
    }

    /**
     * Sets the value of the sessionStartTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionStartTimeEnd(String value) {
        this.sessionStartTimeEnd = value;
    }

}
