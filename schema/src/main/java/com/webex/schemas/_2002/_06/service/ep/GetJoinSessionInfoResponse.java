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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.meeting.TelephonyType;


/**
 * <p>Java class for getJoinSessionInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getJoinSessionInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="siteID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="confName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attendeeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mzmAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mccAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enableOptions" type="{http://www.webex.com/schemas/2002/06/service/ep}enableOptionsType" minOccurs="0"/>
 *         &lt;element name="telephony" type="{http://www.webex.com/schemas/2002/06/service/meeting}telephonyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJoinSessionInfoResponse", propOrder = {
    "siteID",
    "confID",
    "confName",
    "attendeeID",
    "mzmAddress",
    "mccAddress",
    "enableOptions",
    "telephony"
})
public class GetJoinSessionInfoResponse
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected long siteID;
    protected long confID;
    @XmlElement(required = true)
    protected String confName;
    protected long attendeeID;
    @XmlElement(required = true)
    protected String mzmAddress;
    @XmlElement(required = true)
    protected String mccAddress;
    protected EnableOptionsType enableOptions;
    protected TelephonyType telephony;

    /**
     * Gets the value of the siteID property.
     * 
     */
    public long getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     */
    public void setSiteID(long value) {
        this.siteID = value;
    }

    /**
     * Gets the value of the confID property.
     * 
     */
    public long getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     */
    public void setConfID(long value) {
        this.confID = value;
    }

    /**
     * Gets the value of the confName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfName() {
        return confName;
    }

    /**
     * Sets the value of the confName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfName(String value) {
        this.confName = value;
    }

    /**
     * Gets the value of the attendeeID property.
     * 
     */
    public long getAttendeeID() {
        return attendeeID;
    }

    /**
     * Sets the value of the attendeeID property.
     * 
     */
    public void setAttendeeID(long value) {
        this.attendeeID = value;
    }

    /**
     * Gets the value of the mzmAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMzmAddress() {
        return mzmAddress;
    }

    /**
     * Sets the value of the mzmAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMzmAddress(String value) {
        this.mzmAddress = value;
    }

    /**
     * Gets the value of the mccAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMccAddress() {
        return mccAddress;
    }

    /**
     * Sets the value of the mccAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMccAddress(String value) {
        this.mccAddress = value;
    }

    /**
     * Gets the value of the enableOptions property.
     * 
     * @return
     *     possible object is
     *     {@link EnableOptionsType }
     *     
     */
    public EnableOptionsType getEnableOptions() {
        return enableOptions;
    }

    /**
     * Sets the value of the enableOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableOptionsType }
     *     
     */
    public void setEnableOptions(EnableOptionsType value) {
        this.enableOptions = value;
    }

    /**
     * Gets the value of the telephony property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyType }
     *     
     */
    public TelephonyType getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyType }
     *     
     */
    public void setTelephony(TelephonyType value) {
        this.telephony = value;
    }

}
