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

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class CallInNumType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callInNumType", propOrder = {
    "tollNum",
    "tollFreeNum",
    "intlLocalNum",
    "globalNum"
})
@XmlSeeAlso({
    PersonalTeleServerType.class,
    com.webex.schemas._2002._06.service.ep.GetSessionInfoResponse.Telephony.CallInNum.class
})
public class CallInNumType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The toll num. */
    @XmlElement(required = true)
    protected String tollNum;
    
    /** The toll free num. */
    protected String tollFreeNum;
    
    /** The intl local num. */
    protected String intlLocalNum;
    
    /** The global num. */
    protected List<GlobalCallInNumType> globalNum;

    /**
     * Gets the toll num.
     * 
     * @return the toll num
     */
    public String getTollNum() {
        return tollNum;
    }

    /**
     * Sets the toll num.
     * 
     * @param value the new toll num
     */
    public void setTollNum(String value) {
        this.tollNum = value;
    }

    /**
     * Gets the toll free num.
     * 
     * @return the toll free num
     */
    public String getTollFreeNum() {
        return tollFreeNum;
    }

    /**
     * Sets the toll free num.
     * 
     * @param value the new toll free num
     */
    public void setTollFreeNum(String value) {
        this.tollFreeNum = value;
    }

    /**
     * Gets the intl local num.
     * 
     * @return the intl local num
     */
    public String getIntlLocalNum() {
        return intlLocalNum;
    }

    /**
     * Sets the intl local num.
     * 
     * @param value the new intl local num
     */
    public void setIntlLocalNum(String value) {
        this.intlLocalNum = value;
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
