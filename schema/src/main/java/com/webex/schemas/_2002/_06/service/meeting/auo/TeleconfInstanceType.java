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

package com.webex.schemas._2002._06.service.meeting.auo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.service.GlobalCallInNumType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class TeleconfInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teleconfInstanceType", propOrder = {
    "personalConferenceNumber",
    "accountIndex",
    "tollFreeCallInNumber",
    "tollCallInNumber",
    "intlLocalCallInNumber",
    "subscriberAccessCode",
    "participantFullAccessCode",
    "participantLimitedAccessCode",
    "scheduleConfID",
    "extTelephonyDescription",
    "intlLocalCallIn",
    "teleconfLocation",
    "globalNum"
})
public class TeleconfInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The personal conference number. */
    protected boolean personalConferenceNumber;
    
    /** The account index. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long accountIndex;
    
    /** The toll free call in number. */
    @XmlElement(required = true)
    protected String tollFreeCallInNumber;
    
    /** The toll call in number. */
    @XmlElement(required = true)
    protected String tollCallInNumber;
    
    /** The intl local call in number. */
    @XmlElement(required = true)
    protected String intlLocalCallInNumber;
    
    /** The subscriber access code. */
    @XmlElement(required = true)
    protected String subscriberAccessCode;
    
    /** The participant full access code. */
    @XmlElement(required = true)
    protected String participantFullAccessCode;
    
    /** The participant limited access code. */
    @XmlElement(required = true)
    protected String participantLimitedAccessCode;
    
    /** The schedule conf id. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long scheduleConfID;
    
    /** The ext telephony description. */
    protected String extTelephonyDescription;
    
    /** The intl local call in. */
    protected Boolean intlLocalCallIn;
    
    /** The teleconf location. */
    protected String teleconfLocation;
    
    /** The global num. */
    protected List<GlobalCallInNumType> globalNum;

    /**
     * Checks if is personal conference number.
     * 
     * @return true, if is personal conference number
     */
    public boolean isPersonalConferenceNumber() {
        return personalConferenceNumber;
    }

    /**
     * Sets the personal conference number.
     * 
     * @param value the new personal conference number
     */
    public void setPersonalConferenceNumber(boolean value) {
        this.personalConferenceNumber = value;
    }

    /**
     * Gets the account index.
     * 
     * @return the account index
     */
    public Long getAccountIndex() {
        return accountIndex;
    }

    /**
     * Sets the account index.
     * 
     * @param value the new account index
     */
    public void setAccountIndex(Long value) {
        this.accountIndex = value;
    }

    /**
     * Gets the toll free call in number.
     * 
     * @return the toll free call in number
     */
    public String getTollFreeCallInNumber() {
        return tollFreeCallInNumber;
    }

    /**
     * Sets the toll free call in number.
     * 
     * @param value the new toll free call in number
     */
    public void setTollFreeCallInNumber(String value) {
        this.tollFreeCallInNumber = value;
    }

    /**
     * Gets the toll call in number.
     * 
     * @return the toll call in number
     */
    public String getTollCallInNumber() {
        return tollCallInNumber;
    }

    /**
     * Sets the toll call in number.
     * 
     * @param value the new toll call in number
     */
    public void setTollCallInNumber(String value) {
        this.tollCallInNumber = value;
    }

    /**
     * Gets the intl local call in number.
     * 
     * @return the intl local call in number
     */
    public String getIntlLocalCallInNumber() {
        return intlLocalCallInNumber;
    }

    /**
     * Sets the intl local call in number.
     * 
     * @param value the new intl local call in number
     */
    public void setIntlLocalCallInNumber(String value) {
        this.intlLocalCallInNumber = value;
    }

    /**
     * Gets the subscriber access code.
     * 
     * @return the subscriber access code
     */
    public String getSubscriberAccessCode() {
        return subscriberAccessCode;
    }

    /**
     * Sets the subscriber access code.
     * 
     * @param value the new subscriber access code
     */
    public void setSubscriberAccessCode(String value) {
        this.subscriberAccessCode = value;
    }

    /**
     * Gets the participant full access code.
     * 
     * @return the participant full access code
     */
    public String getParticipantFullAccessCode() {
        return participantFullAccessCode;
    }

    /**
     * Sets the participant full access code.
     * 
     * @param value the new participant full access code
     */
    public void setParticipantFullAccessCode(String value) {
        this.participantFullAccessCode = value;
    }

    /**
     * Gets the participant limited access code.
     * 
     * @return the participant limited access code
     */
    public String getParticipantLimitedAccessCode() {
        return participantLimitedAccessCode;
    }

    /**
     * Sets the participant limited access code.
     * 
     * @param value the new participant limited access code
     */
    public void setParticipantLimitedAccessCode(String value) {
        this.participantLimitedAccessCode = value;
    }

    /**
     * Gets the schedule conf id.
     * 
     * @return the schedule conf id
     */
    public Long getScheduleConfID() {
        return scheduleConfID;
    }

    /**
     * Sets the schedule conf id.
     * 
     * @param value the new schedule conf id
     */
    public void setScheduleConfID(Long value) {
        this.scheduleConfID = value;
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
     * Gets the global num.
     * 
     * @return the global num
     */
    public List<GlobalCallInNumType> getGlobalNum() {
        if (globalNum == null) {
            globalNum = new ArrayList<GlobalCallInNumType>();
        }
        return this.globalNum;
    }

}
