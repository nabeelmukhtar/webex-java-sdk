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
import com.webex.schemas._2002._06.common.PhonesType;


/**
 * The Class UserPhonesType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userPhonesType", propOrder = {
    "phone2",
    "mobilePhone2",
    "pager"
})
public class UserPhonesType
    extends PhonesType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The phone2. */
    protected String phone2;
    
    /** The mobile phone2. */
    protected String mobilePhone2;
    
    /** The pager. */
    protected String pager;

    /**
     * Gets the phone2.
     * 
     * @return the phone2
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Sets the phone2.
     * 
     * @param value the new phone2
     */
    public void setPhone2(String value) {
        this.phone2 = value;
    }

    /**
     * Gets the mobile phone2.
     * 
     * @return the mobile phone2
     */
    public String getMobilePhone2() {
        return mobilePhone2;
    }

    /**
     * Sets the mobile phone2.
     * 
     * @param value the new mobile phone2
     */
    public void setMobilePhone2(String value) {
        this.mobilePhone2 = value;
    }

    /**
     * Gets the pager.
     * 
     * @return the pager
     */
    public String getPager() {
        return pager;
    }

    /**
     * Sets the pager.
     * 
     * @param value the new pager
     */
    public void setPager(String value) {
        this.pager = value;
    }

}
