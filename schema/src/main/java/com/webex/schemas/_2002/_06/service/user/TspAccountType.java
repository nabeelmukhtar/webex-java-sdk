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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class TspAccountType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tspAccountType", propOrder = {
    "tollFreeCallInNumber",
    "accountIndex",
    "tollCallInNumber",
    "subscriberAccessCode",
    "participantAccessCode",
    "createOnBridge",
    "defaultFlag",
    "custom1",
    "custom2",
    "custom3",
    "tollFreeCallInData",
    "tollCallInData",
    "nbrDialOut",
    "delete"
})
public class TspAccountType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The toll free call in number. */
    protected String tollFreeCallInNumber;
    
    /** The account index. */
    protected Integer accountIndex;
    
    /** The toll call in number. */
    protected String tollCallInNumber;
    
    /** The subscriber access code. */
    protected String subscriberAccessCode;
    
    /** The participant access code. */
    protected String participantAccessCode;
    
    /** The create on bridge. */
    protected Boolean createOnBridge;
    
    /** The default flag. */
    protected Boolean defaultFlag;
    
    /** The custom1. */
    protected String custom1;
    
    /** The custom2. */
    protected String custom2;
    
    /** The custom3. */
    protected String custom3;
    
    /** The toll free call in data. */
    protected String tollFreeCallInData;
    
    /** The toll call in data. */
    protected String tollCallInData;
    
    /** The nbr dial out. */
    protected NbrDialOutType nbrDialOut;
    
    /** The delete. */
    protected Boolean delete;

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
     * Gets the account index.
     * 
     * @return the account index
     */
    public Integer getAccountIndex() {
        return accountIndex;
    }

    /**
     * Sets the account index.
     * 
     * @param value the new account index
     */
    public void setAccountIndex(Integer value) {
        this.accountIndex = value;
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
     * Gets the participant access code.
     * 
     * @return the participant access code
     */
    public String getParticipantAccessCode() {
        return participantAccessCode;
    }

    /**
     * Sets the participant access code.
     * 
     * @param value the new participant access code
     */
    public void setParticipantAccessCode(String value) {
        this.participantAccessCode = value;
    }

    /**
     * Checks if is create on bridge.
     * 
     * @return the boolean
     */
    public Boolean isCreateOnBridge() {
        return createOnBridge;
    }

    /**
     * Sets the creates the on bridge.
     * 
     * @param value the new creates the on bridge
     */
    public void setCreateOnBridge(Boolean value) {
        this.createOnBridge = value;
    }

    /**
     * Checks if is default flag.
     * 
     * @return the boolean
     */
    public Boolean isDefaultFlag() {
        return defaultFlag;
    }

    /**
     * Sets the default flag.
     * 
     * @param value the new default flag
     */
    public void setDefaultFlag(Boolean value) {
        this.defaultFlag = value;
    }

    /**
     * Gets the custom1.
     * 
     * @return the custom1
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * Sets the custom1.
     * 
     * @param value the new custom1
     */
    public void setCustom1(String value) {
        this.custom1 = value;
    }

    /**
     * Gets the custom2.
     * 
     * @return the custom2
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * Sets the custom2.
     * 
     * @param value the new custom2
     */
    public void setCustom2(String value) {
        this.custom2 = value;
    }

    /**
     * Gets the custom3.
     * 
     * @return the custom3
     */
    public String getCustom3() {
        return custom3;
    }

    /**
     * Sets the custom3.
     * 
     * @param value the new custom3
     */
    public void setCustom3(String value) {
        this.custom3 = value;
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
     * Gets the nbr dial out.
     * 
     * @return the nbr dial out
     */
    public NbrDialOutType getNbrDialOut() {
        return nbrDialOut;
    }

    /**
     * Sets the nbr dial out.
     * 
     * @param value the new nbr dial out
     */
    public void setNbrDialOut(NbrDialOutType value) {
        this.nbrDialOut = value;
    }

    /**
     * Checks if is delete.
     * 
     * @return the boolean
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the delete.
     * 
     * @param value the new delete
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
