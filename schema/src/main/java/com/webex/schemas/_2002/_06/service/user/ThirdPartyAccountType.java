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
 * The Class ThirdPartyAccountType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thirdPartyAccountType", propOrder = {
    "name",
    "confBridgeNum",
    "pause",
    "accessCode",
    "accountIndex",
    "defaultFlag",
    "tollFreeNum",
    "moderatorCode",
    "phoneName1",
    "phoneName2"
})
public class ThirdPartyAccountType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The name. */
    protected String name;
    
    /** The conf bridge num. */
    protected String confBridgeNum;
    
    /** The pause. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long pause;
    
    /** The access code. */
    protected String accessCode;
    
    /** The account index. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long accountIndex;
    
    /** The default flag. */
    protected Boolean defaultFlag;
    
    /** The toll free num. */
    protected String tollFreeNum;
    
    /** The moderator code. */
    protected String moderatorCode;
    
    /** The phone name1. */
    protected String phoneName1;
    
    /** The phone name2. */
    protected String phoneName2;

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the conf bridge num.
     * 
     * @return the conf bridge num
     */
    public String getConfBridgeNum() {
        return confBridgeNum;
    }

    /**
     * Sets the conf bridge num.
     * 
     * @param value the new conf bridge num
     */
    public void setConfBridgeNum(String value) {
        this.confBridgeNum = value;
    }

    /**
     * Gets the pause.
     * 
     * @return the pause
     */
    public Long getPause() {
        return pause;
    }

    /**
     * Sets the pause.
     * 
     * @param value the new pause
     */
    public void setPause(Long value) {
        this.pause = value;
    }

    /**
     * Gets the access code.
     * 
     * @return the access code
     */
    public String getAccessCode() {
        return accessCode;
    }

    /**
     * Sets the access code.
     * 
     * @param value the new access code
     */
    public void setAccessCode(String value) {
        this.accessCode = value;
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
     * Gets the moderator code.
     * 
     * @return the moderator code
     */
    public String getModeratorCode() {
        return moderatorCode;
    }

    /**
     * Sets the moderator code.
     * 
     * @param value the new moderator code
     */
    public void setModeratorCode(String value) {
        this.moderatorCode = value;
    }

    /**
     * Gets the phone name1.
     * 
     * @return the phone name1
     */
    public String getPhoneName1() {
        return phoneName1;
    }

    /**
     * Sets the phone name1.
     * 
     * @param value the new phone name1
     */
    public void setPhoneName1(String value) {
        this.phoneName1 = value;
    }

    /**
     * Gets the phone name2.
     * 
     * @return the phone name2
     */
    public String getPhoneName2() {
        return phoneName2;
    }

    /**
     * Sets the phone name2.
     * 
     * @param value the new phone name2
     */
    public void setPhoneName2(String value) {
        this.phoneName2 = value;
    }

}
