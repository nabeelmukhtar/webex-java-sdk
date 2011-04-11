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
 * The Class SalesCenterType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesCenterType", propOrder = {
    "roles",
    "manager",
    "smeInfo"
})
public class SalesCenterType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The roles. */
    protected SalesRoleType roles;
    
    /** The manager. */
    protected String manager;
    
    /** The sme info. */
    protected SalesSmeType smeInfo;

    /**
     * Gets the roles.
     * 
     * @return the roles
     */
    public SalesRoleType getRoles() {
        return roles;
    }

    /**
     * Sets the roles.
     * 
     * @param value the new roles
     */
    public void setRoles(SalesRoleType value) {
        this.roles = value;
    }

    /**
     * Gets the manager.
     * 
     * @return the manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the manager.
     * 
     * @param value the new manager
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the sme info.
     * 
     * @return the sme info
     */
    public SalesSmeType getSmeInfo() {
        return smeInfo;
    }

    /**
     * Sets the sme info.
     * 
     * @param value the new sme info
     */
    public void setSmeInfo(SalesSmeType value) {
        this.smeInfo = value;
    }

}
