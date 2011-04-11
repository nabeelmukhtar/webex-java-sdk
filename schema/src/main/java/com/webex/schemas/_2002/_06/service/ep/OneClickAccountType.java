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
import com.webex.schemas._2002._06.service.GlobalCallInNumType;
import com.webex.schemas._2002._06.service.TspAccountType;


/**
 * The Class OneClickAccountType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneClickAccountType", propOrder = {
    "participantLimitedAccessCode",
    "intlLocalCallInNumber",
    "tollFreeCallInData",
    "tollCallInData",
    "globalNum"
})
public class OneClickAccountType
    extends TspAccountType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The participant limited access code. */
    protected String participantLimitedAccessCode;
    
    /** The intl local call in number. */
    protected String intlLocalCallInNumber;
    
    /** The toll free call in data. */
    protected String tollFreeCallInData;
    
    /** The toll call in data. */
    protected String tollCallInData;
    
    /** The global num. */
    protected List<GlobalCallInNumType> globalNum;

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
     * Gets the toll free call in data.
     * 
     * @return the toll free call in data
     */
    public String getTollFreeCallInData() {
        return tollFreeCallInData;
    }

    /**
     * Sets the toll free call in data.
     * 
     * @param value the new toll free call in data
     */
    public void setTollFreeCallInData(String value) {
        this.tollFreeCallInData = value;
    }

    /**
     * Gets the toll call in data.
     * 
     * @return the toll call in data
     */
    public String getTollCallInData() {
        return tollCallInData;
    }

    /**
     * Sets the toll call in data.
     * 
     * @param value the new toll call in data
     */
    public void setTollCallInData(String value) {
        this.tollCallInData = value;
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
