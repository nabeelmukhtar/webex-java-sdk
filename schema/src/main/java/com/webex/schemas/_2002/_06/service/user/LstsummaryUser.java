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
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * The Class LstsummaryUser.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstsummaryUser", propOrder = {
    "firstName",
    "lastName",
    "email",
    "active",
    "webExId",
    "listControl",
    "order",
    "dataScope",
    "webACD"
})
public class LstsummaryUser
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The first name. */
    protected String firstName;
    
    /** The last name. */
    protected String lastName;
    
    /** The email. */
    protected String email;
    
    /** The active. */
    protected ActiveType active;
    
    /** The web ex id. */
    protected String webExId;
    
    /** The list control. */
    protected LstControlType listControl;
    
    /** The order. */
    protected OrderType order;
    
    /** The data scope. */
    protected DataScopeType dataScope;
    
    /** The web acd. */
    protected LstsummaryUser.WebACD webACD;

    /**
     * Gets the first name.
     * 
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     * 
     * @param value the new first name
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the last name.
     * 
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     * 
     * @param value the new last name
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param value the new email
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the active.
     * 
     * @return the active
     */
    public ActiveType getActive() {
        return active;
    }

    /**
     * Sets the active.
     * 
     * @param value the new active
     */
    public void setActive(ActiveType value) {
        this.active = value;
    }

    /**
     * Gets the web ex id.
     * 
     * @return the web ex id
     */
    public String getWebExId() {
        return webExId;
    }

    /**
     * Sets the web ex id.
     * 
     * @param value the new web ex id
     */
    public void setWebExId(String value) {
        this.webExId = value;
    }

    /**
     * Gets the list control.
     * 
     * @return the list control
     */
    public LstControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the list control.
     * 
     * @param value the new list control
     */
    public void setListControl(LstControlType value) {
        this.listControl = value;
    }

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param value the new order
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the data scope.
     * 
     * @return the data scope
     */
    public DataScopeType getDataScope() {
        return dataScope;
    }

    /**
     * Sets the data scope.
     * 
     * @param value the new data scope
     */
    public void setDataScope(DataScopeType value) {
        this.dataScope = value;
    }

    /**
     * Gets the web acd.
     * 
     * @return the web acd
     */
    public LstsummaryUser.WebACD getWebACD() {
        return webACD;
    }

    /**
     * Sets the web acd.
     * 
     * @param value the new web acd
     */
    public void setWebACD(LstsummaryUser.WebACD value) {
        this.webACD = value;
    }


    /**
     * The Class WebACD.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "manager",
        "returnPrefs"
    })
    public static class WebACD
        extends WebACDUserRoleType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The manager. */
        protected String manager;
        
        /** The return prefs. */
        @XmlElement(defaultValue = "true")
        protected Boolean returnPrefs;

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
         * Checks if is return prefs.
         * 
         * @return the boolean
         */
        public Boolean isReturnPrefs() {
            return returnPrefs;
        }

        /**
         * Sets the return prefs.
         * 
         * @param value the new return prefs
         */
        public void setReturnPrefs(Boolean value) {
            this.returnPrefs = value;
        }

    }

}
