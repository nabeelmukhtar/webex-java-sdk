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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class PersonalAccountType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalAccountType", propOrder = {
    "subscriberAccessCode",
    "participantFullAccessCode",
    "participantLimitedAccessCode",
    "accountIndex",
    "defaultFlag",
    "autoGenerate",
    "joinBeforeHost",
    "delete"
})
public class PersonalAccountType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The subscriber access code. */
    protected String subscriberAccessCode;
    
    /** The participant full access code. */
    protected String participantFullAccessCode;
    
    /** The participant limited access code. */
    protected String participantLimitedAccessCode;
    
    /** The account index. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long accountIndex;
    
    /** The default flag. */
    protected Boolean defaultFlag;
    
    /** The auto generate. */
    protected Boolean autoGenerate;
    
    /** The join before host. */
    protected Boolean joinBeforeHost;
    
    /** The delete. */
    protected Boolean delete;

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
     * Checks if is auto generate.
     * 
     * @return the boolean
     */
    public Boolean isAutoGenerate() {
        return autoGenerate;
    }

    /**
     * Sets the auto generate.
     * 
     * @param value the new auto generate
     */
    public void setAutoGenerate(Boolean value) {
        this.autoGenerate = value;
    }

    /**
     * Checks if is join before host.
     * 
     * @return the boolean
     */
    public Boolean isJoinBeforeHost() {
        return joinBeforeHost;
    }

    /**
     * Sets the join before host.
     * 
     * @param value the new join before host
     */
    public void setJoinBeforeHost(Boolean value) {
        this.joinBeforeHost = value;
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
