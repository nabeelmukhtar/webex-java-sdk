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
 * The Class SecurityType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityType", propOrder = {
    "forceChangePassword",
    "resetPassword",
    "lockAccount"
})
public class SecurityType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The force change password. */
    protected Boolean forceChangePassword;
    
    /** The reset password. */
    protected Boolean resetPassword;
    
    /** The lock account. */
    protected Boolean lockAccount;

    /**
     * Checks if is force change password.
     * 
     * @return the boolean
     */
    public Boolean isForceChangePassword() {
        return forceChangePassword;
    }

    /**
     * Sets the force change password.
     * 
     * @param value the new force change password
     */
    public void setForceChangePassword(Boolean value) {
        this.forceChangePassword = value;
    }

    /**
     * Checks if is reset password.
     * 
     * @return the boolean
     */
    public Boolean isResetPassword() {
        return resetPassword;
    }

    /**
     * Sets the reset password.
     * 
     * @param value the new reset password
     */
    public void setResetPassword(Boolean value) {
        this.resetPassword = value;
    }

    /**
     * Checks if is lock account.
     * 
     * @return the boolean
     */
    public Boolean isLockAccount() {
        return lockAccount;
    }

    /**
     * Sets the lock account.
     * 
     * @param value the new lock account
     */
    public void setLockAccount(Boolean value) {
        this.lockAccount = value;
    }

}
