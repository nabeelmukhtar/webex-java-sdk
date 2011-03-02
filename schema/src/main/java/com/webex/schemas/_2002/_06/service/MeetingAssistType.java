
package com.webex.schemas._2002._06.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meetingAssistType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meetingAssistType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assistRequest" type="{http://www.webex.com/schemas/2002/06/service}assistRequestType" minOccurs="0"/>
 *         &lt;element name="assistConfirm" type="{http://www.webex.com/schemas/2002/06/service}assistConfirmedType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingAssistType", propOrder = {
    "assistRequest",
    "assistConfirm"
})
public class MeetingAssistType {

    protected AssistRequestType assistRequest;
    protected AssistConfirmedType assistConfirm;

    /**
     * Gets the value of the assistRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AssistRequestType }
     *     
     */
    public AssistRequestType getAssistRequest() {
        return assistRequest;
    }

    /**
     * Sets the value of the assistRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistRequestType }
     *     
     */
    public void setAssistRequest(AssistRequestType value) {
        this.assistRequest = value;
    }

    /**
     * Gets the value of the assistConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link AssistConfirmedType }
     *     
     */
    public AssistConfirmedType getAssistConfirm() {
        return assistConfirm;
    }

    /**
     * Sets the value of the assistConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistConfirmedType }
     *     
     */
    public void setAssistConfirm(AssistConfirmedType value) {
        this.assistConfirm = value;
    }

}
