
package com.webex.schemas._2002._06.service.ep;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for setupOneClickSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setupOneClickSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="metaData" type="{http://www.webex.com/schemas/2002/06/service/ep}ocMetaDataType"/>
 *         &lt;element name="tracking" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trackingCode" type="{http://www.webex.com/schemas/2002/06/service/ep}ocTrackingCodeType" maxOccurs="10" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="telephony" type="{http://www.webex.com/schemas/2002/06/service/ep}ocTelephonyType" minOccurs="0"/>
 *         &lt;element name="enableOptions" type="{http://www.webex.com/schemas/2002/06/service/ep}oneClickEnableOptionsType" minOccurs="0"/>
 *         &lt;element name="attendeeOptions" type="{http://www.webex.com/schemas/2002/06/service/ep}attendeeOptionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setupOneClickSettings", propOrder = {
    "metaData",
    "tracking",
    "telephony",
    "enableOptions",
    "attendeeOptions"
})
public class SetupOneClickSettings
    extends BodyContentType
{

    @XmlElement(required = true)
    protected OcMetaDataType metaData;
    protected SetupOneClickSettings.Tracking tracking;
    protected OcTelephonyType telephony;
    protected OneClickEnableOptionsType enableOptions;
    protected AttendeeOptionsType attendeeOptions;

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link OcMetaDataType }
     *     
     */
    public OcMetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OcMetaDataType }
     *     
     */
    public void setMetaData(OcMetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link SetupOneClickSettings.Tracking }
     *     
     */
    public SetupOneClickSettings.Tracking getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetupOneClickSettings.Tracking }
     *     
     */
    public void setTracking(SetupOneClickSettings.Tracking value) {
        this.tracking = value;
    }

    /**
     * Gets the value of the telephony property.
     * 
     * @return
     *     possible object is
     *     {@link OcTelephonyType }
     *     
     */
    public OcTelephonyType getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     * 
     * @param value
     *     allowed object is
     *     {@link OcTelephonyType }
     *     
     */
    public void setTelephony(OcTelephonyType value) {
        this.telephony = value;
    }

    /**
     * Gets the value of the enableOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OneClickEnableOptionsType }
     *     
     */
    public OneClickEnableOptionsType getEnableOptions() {
        return enableOptions;
    }

    /**
     * Sets the value of the enableOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneClickEnableOptionsType }
     *     
     */
    public void setEnableOptions(OneClickEnableOptionsType value) {
        this.enableOptions = value;
    }

    /**
     * Gets the value of the attendeeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeOptionsType }
     *     
     */
    public AttendeeOptionsType getAttendeeOptions() {
        return attendeeOptions;
    }

    /**
     * Sets the value of the attendeeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeOptionsType }
     *     
     */
    public void setAttendeeOptions(AttendeeOptionsType value) {
        this.attendeeOptions = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="trackingCode" type="{http://www.webex.com/schemas/2002/06/service/ep}ocTrackingCodeType" maxOccurs="10" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trackingCode"
    })
    public static class Tracking {

        protected List<OcTrackingCodeType> trackingCode;

        /**
         * Gets the value of the trackingCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trackingCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrackingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OcTrackingCodeType }
         * 
         * 
         */
        public List<OcTrackingCodeType> getTrackingCode() {
            if (trackingCode == null) {
                trackingCode = new ArrayList<OcTrackingCodeType>();
            }
            return this.trackingCode;
        }

    }

}
