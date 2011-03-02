
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for endTimeScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endTimeScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionEndTimeStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionEndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endTimeScopeType", propOrder = {
    "sessionEndTimeStart",
    "sessionEndTimeEnd"
})
public class EndTimeScopeType {

    @XmlElement(required = true)
    protected String sessionEndTimeStart;
    @XmlElement(required = true)
    protected String sessionEndTimeEnd;

    /**
     * Gets the value of the sessionEndTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionEndTimeStart() {
        return sessionEndTimeStart;
    }

    /**
     * Sets the value of the sessionEndTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionEndTimeStart(String value) {
        this.sessionEndTimeStart = value;
    }

    /**
     * Gets the value of the sessionEndTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionEndTimeEnd() {
        return sessionEndTimeEnd;
    }

    /**
     * Sets the value of the sessionEndTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionEndTimeEnd(String value) {
        this.sessionEndTimeEnd = value;
    }

}
