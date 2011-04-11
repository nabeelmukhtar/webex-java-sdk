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
 * The Class CreateUser.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUser", propOrder = {
    "salesCenter",
    "syncWebOffice",
    "sendWelcome",
    "validateFormat"
})
public class CreateUser
    extends UserType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The sales center. */
    protected SalesCenterType salesCenter;
    
    /** The sync web office. */
    protected Boolean syncWebOffice;
    
    /** The send welcome. */
    protected Boolean sendWelcome;
    
    /** The validate format. */
    protected Boolean validateFormat;

    /**
     * Gets the sales center.
     * 
     * @return the sales center
     */
    public SalesCenterType getSalesCenter() {
        return salesCenter;
    }

    /**
     * Sets the sales center.
     * 
     * @param value the new sales center
     */
    public void setSalesCenter(SalesCenterType value) {
        this.salesCenter = value;
    }

    /**
     * Checks if is sync web office.
     * 
     * @return the boolean
     */
    public Boolean isSyncWebOffice() {
        return syncWebOffice;
    }

    /**
     * Sets the sync web office.
     * 
     * @param value the new sync web office
     */
    public void setSyncWebOffice(Boolean value) {
        this.syncWebOffice = value;
    }

    /**
     * Checks if is send welcome.
     * 
     * @return the boolean
     */
    public Boolean isSendWelcome() {
        return sendWelcome;
    }

    /**
     * Sets the send welcome.
     * 
     * @param value the new send welcome
     */
    public void setSendWelcome(Boolean value) {
        this.sendWelcome = value;
    }

    /**
     * Checks if is validate format.
     * 
     * @return the boolean
     */
    public Boolean isValidateFormat() {
        return validateFormat;
    }

    /**
     * Sets the validate format.
     * 
     * @param value the new validate format
     */
    public void setValidateFormat(Boolean value) {
        this.validateFormat = value;
    }

}
