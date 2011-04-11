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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.WebACDActionType;


/**
 * The Class AssignWebACDAgents.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignWebACDAgents", propOrder = {
    "manager",
    "webACDUser"
})
public class AssignWebACDAgents
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The manager. */
    @XmlElement(required = true)
    protected String manager;
    
    /** The web acd user. */
    @XmlElement(required = true)
    protected List<AssignWebACDAgents.WebACDUser> webACDUser;

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
     * Gets the web acd user.
     * 
     * @return the web acd user
     */
    public List<AssignWebACDAgents.WebACDUser> getWebACDUser() {
        if (webACDUser == null) {
            webACDUser = new ArrayList<AssignWebACDAgents.WebACDUser>();
        }
        return this.webACDUser;
    }


    /**
     * The Class WebACDUser.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "webExId",
        "action"
    })
    public static class WebACDUser
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The web ex id. */
        @XmlElement(required = true)
        protected String webExId;
        
        /** The action. */
        @XmlElement(required = true)
        protected WebACDActionType action;

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
         * Gets the action.
         * 
         * @return the action
         */
        public WebACDActionType getAction() {
            return action;
        }

        /**
         * Sets the action.
         * 
         * @param value the new action
         */
        public void setAction(WebACDActionType value) {
            this.action = value;
        }

    }

}
