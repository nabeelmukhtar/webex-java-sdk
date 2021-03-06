/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for getOneClickSettingsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOneClickSettingsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="metaData" type="{http://www.webex.com/schemas/2002/06/service/ep}ocMetaDataType" minOccurs="0"/>
 *         &lt;element name="trackingCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trackingCode" type="{http://www.webex.com/schemas/2002/06/service/ep}oneClickTrackingCodeType" maxOccurs="10" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="telephony" type="{http://www.webex.com/schemas/2002/06/service/ep}oneClickTelephonyType" minOccurs="0"/>
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
@XmlType(name = "getOneClickSettingsResponse", propOrder = {
    "metaData",
    "trackingCodes",
    "telephony",
    "enableOptions",
    "attendeeOptions"
})
public class GetOneClickSettingsResponse
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected OcMetaDataType metaData;
    protected GetOneClickSettingsResponse.TrackingCodes trackingCodes;
    protected OneClickTelephonyType telephony;
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
     * Gets the value of the trackingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link GetOneClickSettingsResponse.TrackingCodes }
     *     
     */
    public GetOneClickSettingsResponse.TrackingCodes getTrackingCodes() {
        return trackingCodes;
    }

    /**
     * Sets the value of the trackingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOneClickSettingsResponse.TrackingCodes }
     *     
     */
    public void setTrackingCodes(GetOneClickSettingsResponse.TrackingCodes value) {
        this.trackingCodes = value;
    }

    /**
     * Gets the value of the telephony property.
     * 
     * @return
     *     possible object is
     *     {@link OneClickTelephonyType }
     *     
     */
    public OneClickTelephonyType getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneClickTelephonyType }
     *     
     */
    public void setTelephony(OneClickTelephonyType value) {
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
     *         &lt;element name="trackingCode" type="{http://www.webex.com/schemas/2002/06/service/ep}oneClickTrackingCodeType" maxOccurs="10" minOccurs="0"/>
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
    public static class TrackingCodes
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected List<OneClickTrackingCodeType> trackingCode;

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
         * {@link OneClickTrackingCodeType }
         * 
         * 
         */
        public List<OneClickTrackingCodeType> getTrackingCode() {
            if (trackingCode == null) {
                trackingCode = new ArrayList<OneClickTrackingCodeType>();
            }
            return this.trackingCode;
        }

    }

}
