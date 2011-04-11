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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.service.CallInNumType;
import com.webex.schemas._2002._06.service.TspAccessCodeOrderType;
import com.webex.schemas._2002._06.service.TspAccountType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for telephonyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telephonyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telephonySupport" type="{http://www.webex.com/schemas/2002/06/service/event}telephonySupportType" minOccurs="0"/>
 *         &lt;element name="numPhoneLines" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="extTelephonyURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extTelephonyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableTSP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tspAccountIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="personalAccountIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="intlLocalCallIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teleconfLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callInNum" type="{http://www.webex.com/schemas/2002/06/service}callInNumType" minOccurs="0"/>
 *         &lt;element name="tspConference" type="{http://www.webex.com/schemas/2002/06/service}tspAccountType" minOccurs="0"/>
 *         &lt;element name="tspAccessCodeOrder" type="{http://www.webex.com/schemas/2002/06/service}tspAccessCodeOrderType" minOccurs="0"/>
 *         &lt;element name="broadcastAudioStream" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tollFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="muteUponEntry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telephonyType", propOrder = {
    "telephonySupport",
    "numPhoneLines",
    "extTelephonyURL",
    "extTelephonyDescription",
    "enableTSP",
    "tspAccountIndex",
    "personalAccountIndex",
    "intlLocalCallIn",
    "teleconfLocation",
    "callInNum",
    "tspConference",
    "tspAccessCodeOrder",
    "broadcastAudioStream",
    "tollFree",
    "muteUponEntry"
})
public class TelephonyType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(defaultValue = "NONE")
    protected TelephonySupportType telephonySupport;
    @XmlElement(type = String.class, defaultValue = "4")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numPhoneLines;
    protected String extTelephonyURL;
    protected String extTelephonyDescription;
    protected Boolean enableTSP;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long tspAccountIndex;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long personalAccountIndex;
    protected Boolean intlLocalCallIn;
    protected String teleconfLocation;
    protected CallInNumType callInNum;
    protected TspAccountType tspConference;
    protected TspAccessCodeOrderType tspAccessCodeOrder;
    protected Boolean broadcastAudioStream;
    protected Boolean tollFree;
    protected Boolean muteUponEntry;

    /**
     * Gets the value of the telephonySupport property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonySupportType }
     *     
     */
    public TelephonySupportType getTelephonySupport() {
        return telephonySupport;
    }

    /**
     * Sets the value of the telephonySupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonySupportType }
     *     
     */
    public void setTelephonySupport(TelephonySupportType value) {
        this.telephonySupport = value;
    }

    /**
     * Gets the value of the numPhoneLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumPhoneLines() {
        return numPhoneLines;
    }

    /**
     * Sets the value of the numPhoneLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPhoneLines(Long value) {
        this.numPhoneLines = value;
    }

    /**
     * Gets the value of the extTelephonyURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTelephonyURL() {
        return extTelephonyURL;
    }

    /**
     * Sets the value of the extTelephonyURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTelephonyURL(String value) {
        this.extTelephonyURL = value;
    }

    /**
     * Gets the value of the extTelephonyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTelephonyDescription() {
        return extTelephonyDescription;
    }

    /**
     * Sets the value of the extTelephonyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTelephonyDescription(String value) {
        this.extTelephonyDescription = value;
    }

    /**
     * Gets the value of the enableTSP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableTSP() {
        return enableTSP;
    }

    /**
     * Sets the value of the enableTSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableTSP(Boolean value) {
        this.enableTSP = value;
    }

    /**
     * Gets the value of the tspAccountIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTspAccountIndex() {
        return tspAccountIndex;
    }

    /**
     * Sets the value of the tspAccountIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTspAccountIndex(Long value) {
        this.tspAccountIndex = value;
    }

    /**
     * Gets the value of the personalAccountIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPersonalAccountIndex() {
        return personalAccountIndex;
    }

    /**
     * Sets the value of the personalAccountIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAccountIndex(Long value) {
        this.personalAccountIndex = value;
    }

    /**
     * Gets the value of the intlLocalCallIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntlLocalCallIn() {
        return intlLocalCallIn;
    }

    /**
     * Sets the value of the intlLocalCallIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntlLocalCallIn(Boolean value) {
        this.intlLocalCallIn = value;
    }

    /**
     * Gets the value of the teleconfLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeleconfLocation() {
        return teleconfLocation;
    }

    /**
     * Sets the value of the teleconfLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeleconfLocation(String value) {
        this.teleconfLocation = value;
    }

    /**
     * Gets the value of the callInNum property.
     * 
     * @return
     *     possible object is
     *     {@link CallInNumType }
     *     
     */
    public CallInNumType getCallInNum() {
        return callInNum;
    }

    /**
     * Sets the value of the callInNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallInNumType }
     *     
     */
    public void setCallInNum(CallInNumType value) {
        this.callInNum = value;
    }

    /**
     * Gets the value of the tspConference property.
     * 
     * @return
     *     possible object is
     *     {@link TspAccountType }
     *     
     */
    public TspAccountType getTspConference() {
        return tspConference;
    }

    /**
     * Sets the value of the tspConference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TspAccountType }
     *     
     */
    public void setTspConference(TspAccountType value) {
        this.tspConference = value;
    }

    /**
     * Gets the value of the tspAccessCodeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TspAccessCodeOrderType }
     *     
     */
    public TspAccessCodeOrderType getTspAccessCodeOrder() {
        return tspAccessCodeOrder;
    }

    /**
     * Sets the value of the tspAccessCodeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TspAccessCodeOrderType }
     *     
     */
    public void setTspAccessCodeOrder(TspAccessCodeOrderType value) {
        this.tspAccessCodeOrder = value;
    }

    /**
     * Gets the value of the broadcastAudioStream property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBroadcastAudioStream() {
        return broadcastAudioStream;
    }

    /**
     * Sets the value of the broadcastAudioStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBroadcastAudioStream(Boolean value) {
        this.broadcastAudioStream = value;
    }

    /**
     * Gets the value of the tollFree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTollFree() {
        return tollFree;
    }

    /**
     * Sets the value of the tollFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTollFree(Boolean value) {
        this.tollFree = value;
    }

    /**
     * Gets the value of the muteUponEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMuteUponEntry() {
        return muteUponEntry;
    }

    /**
     * Sets the value of the muteUponEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMuteUponEntry(Boolean value) {
        this.muteUponEntry = value;
    }

}
