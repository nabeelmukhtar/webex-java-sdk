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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class LstsalesSessionHistory.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstsalesSessionHistory", propOrder = {
    "account",
    "opportunity"
})
public class LstsalesSessionHistory
    extends LstmeetingusageHistory
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The account. */
    protected String account;
    
    /** The opportunity. */
    protected String opportunity;

    /**
     * Gets the account.
     * 
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the account.
     * 
     * @param value the new account
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the opportunity.
     * 
     * @return the opportunity
     */
    public String getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the opportunity.
     * 
     * @param value the new opportunity
     */
    public void setOpportunity(String value) {
        this.opportunity = value;
    }

}
