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
 * The Class TelephonyType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The telephony support. */
    @XmlElement(defaultValue = "NONE")
    protected TelephonySupportType telephonySupport;
    
    /** The num phone lines. */
    @XmlElement(type = String.class, defaultValue = "4")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numPhoneLines;
    
    /** The ext telephony url. */
    protected String extTelephonyURL;
    
    /** The ext telephony description. */
    protected String extTelephonyDescription;
    
    /** The enable tsp. */
    protected Boolean enableTSP;
    
    /** The tsp account index. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long tspAccountIndex;
    
    /** The personal account index. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long personalAccountIndex;
    
    /** The intl local call in. */
    protected Boolean intlLocalCallIn;
    
    /** The teleconf location. */
    protected String teleconfLocation;
    
    /** The call in num. */
    protected CallInNumType callInNum;
    
    /** The tsp conference. */
    protected TspAccountType tspConference;
    
    /** The tsp access code order. */
    protected TspAccessCodeOrderType tspAccessCodeOrder;
    
    /** The broadcast audio stream. */
    protected Boolean broadcastAudioStream;
    
    /** The toll free. */
    protected Boolean tollFree;
    
    /** The mute upon entry. */
    protected Boolean muteUponEntry;

    /**
     * Gets the telephony support.
     * 
     * @return the telephony support
     */
    public TelephonySupportType getTelephonySupport() {
        return telephonySupport;
    }

    /**
     * Sets the telephony support.
     * 
     * @param value the new telephony support
     */
    public void setTelephonySupport(TelephonySupportType value) {
        this.telephonySupport = value;
    }

    /**
     * Gets the num phone lines.
     * 
     * @return the num phone lines
     */
    public Long getNumPhoneLines() {
        return numPhoneLines;
    }

    /**
     * Sets the num phone lines.
     * 
     * @param value the new num phone lines
     */
    public void setNumPhoneLines(Long value) {
        this.numPhoneLines = value;
    }

    /**
     * Gets the ext telephony url.
     * 
     * @return the ext telephony url
     */
    public String getExtTelephonyURL() {
        return extTelephonyURL;
    }

    /**
     * Sets the ext telephony url.
     * 
     * @param value the new ext telephony url
     */
    public void setExtTelephonyURL(String value) {
        this.extTelephonyURL = value;
    }

    /**
     * Gets the ext telephony description.
     * 
     * @return the ext telephony description
     */
    public String getExtTelephonyDescription() {
        return extTelephonyDescription;
    }

    /**
     * Sets the ext telephony description.
     * 
     * @param value the new ext telephony description
     */
    public void setExtTelephonyDescription(String value) {
        this.extTelephonyDescription = value;
    }

    /**
     * Checks if is enable tsp.
     * 
     * @return the boolean
     */
    public Boolean isEnableTSP() {
        return enableTSP;
    }

    /**
     * Sets the enable tsp.
     * 
     * @param value the new enable tsp
     */
    public void setEnableTSP(Boolean value) {
        this.enableTSP = value;
    }

    /**
     * Gets the tsp account index.
     * 
     * @return the tsp account index
     */
    public Long getTspAccountIndex() {
        return tspAccountIndex;
    }

    /**
     * Sets the tsp account index.
     * 
     * @param value the new tsp account index
     */
    public void setTspAccountIndex(Long value) {
        this.tspAccountIndex = value;
    }

    /**
     * Gets the personal account index.
     * 
     * @return the personal account index
     */
    public Long getPersonalAccountIndex() {
        return personalAccountIndex;
    }

    /**
     * Sets the personal account index.
     * 
     * @param value the new personal account index
     */
    public void setPersonalAccountIndex(Long value) {
        this.personalAccountIndex = value;
    }

    /**
     * Checks if is intl local call in.
     * 
     * @return the boolean
     */
    public Boolean isIntlLocalCallIn() {
        return intlLocalCallIn;
    }

    /**
     * Sets the intl local call in.
     * 
     * @param value the new intl local call in
     */
    public void setIntlLocalCallIn(Boolean value) {
        this.intlLocalCallIn = value;
    }

    /**
     * Gets the teleconf location.
     * 
     * @return the teleconf location
     */
    public String getTeleconfLocation() {
        return teleconfLocation;
    }

    /**
     * Sets the teleconf location.
     * 
     * @param value the new teleconf location
     */
    public void setTeleconfLocation(String value) {
        this.teleconfLocation = value;
    }

    /**
     * Gets the call in num.
     * 
     * @return the call in num
     */
    public CallInNumType getCallInNum() {
        return callInNum;
    }

    /**
     * Sets the call in num.
     * 
     * @param value the new call in num
     */
    public void setCallInNum(CallInNumType value) {
        this.callInNum = value;
    }

    /**
     * Gets the tsp conference.
     * 
     * @return the tsp conference
     */
    public TspAccountType getTspConference() {
        return tspConference;
    }

    /**
     * Sets the tsp conference.
     * 
     * @param value the new tsp conference
     */
    public void setTspConference(TspAccountType value) {
        this.tspConference = value;
    }

    /**
     * Gets the tsp access code order.
     * 
     * @return the tsp access code order
     */
    public TspAccessCodeOrderType getTspAccessCodeOrder() {
        return tspAccessCodeOrder;
    }

    /**
     * Sets the tsp access code order.
     * 
     * @param value the new tsp access code order
     */
    public void setTspAccessCodeOrder(TspAccessCodeOrderType value) {
        this.tspAccessCodeOrder = value;
    }

    /**
     * Checks if is broadcast audio stream.
     * 
     * @return the boolean
     */
    public Boolean isBroadcastAudioStream() {
        return broadcastAudioStream;
    }

    /**
     * Sets the broadcast audio stream.
     * 
     * @param value the new broadcast audio stream
     */
    public void setBroadcastAudioStream(Boolean value) {
        this.broadcastAudioStream = value;
    }

    /**
     * Checks if is toll free.
     * 
     * @return the boolean
     */
    public Boolean isTollFree() {
        return tollFree;
    }

    /**
     * Sets the toll free.
     * 
     * @param value the new toll free
     */
    public void setTollFree(Boolean value) {
        this.tollFree = value;
    }

    /**
     * Checks if is mute upon entry.
     * 
     * @return the boolean
     */
    public Boolean isMuteUponEntry() {
        return muteUponEntry;
    }

    /**
     * Sets the mute upon entry.
     * 
     * @param value the new mute upon entry
     */
    public void setMuteUponEntry(Boolean value) {
        this.muteUponEntry = value;
    }

}
