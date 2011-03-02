
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supportedServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supportedServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meetingCenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainingCenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportCenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eventCenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="salesCenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportedServicesType", propOrder = {
    "meetingCenter",
    "trainingCenter",
    "supportCenter",
    "eventCenter",
    "salesCenter"
})
public class SupportedServicesType {

    protected Boolean meetingCenter;
    protected Boolean trainingCenter;
    protected Boolean supportCenter;
    protected Boolean eventCenter;
    protected Boolean salesCenter;

    /**
     * Gets the value of the meetingCenter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeetingCenter() {
        return meetingCenter;
    }

    /**
     * Sets the value of the meetingCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeetingCenter(Boolean value) {
        this.meetingCenter = value;
    }

    /**
     * Gets the value of the trainingCenter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrainingCenter() {
        return trainingCenter;
    }

    /**
     * Sets the value of the trainingCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrainingCenter(Boolean value) {
        this.trainingCenter = value;
    }

    /**
     * Gets the value of the supportCenter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportCenter() {
        return supportCenter;
    }

    /**
     * Sets the value of the supportCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportCenter(Boolean value) {
        this.supportCenter = value;
    }

    /**
     * Gets the value of the eventCenter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventCenter() {
        return eventCenter;
    }

    /**
     * Sets the value of the eventCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventCenter(Boolean value) {
        this.eventCenter = value;
    }

    /**
     * Gets the value of the salesCenter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesCenter() {
        return salesCenter;
    }

    /**
     * Sets the value of the salesCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesCenter(Boolean value) {
        this.salesCenter = value;
    }

}
