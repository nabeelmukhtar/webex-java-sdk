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
 * The Class AssignWebACDQueues.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignWebACDQueues", propOrder = {
    "webExId",
    "queue"
})
public class AssignWebACDQueues
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The web ex id. */
    @XmlElement(required = true)
    protected String webExId;
    
    /** The queue. */
    @XmlElement(required = true)
    protected List<AssignWebACDQueues.Queue> queue;

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
     * Gets the queue.
     * 
     * @return the queue
     */
    public List<AssignWebACDQueues.Queue> getQueue() {
        if (queue == null) {
            queue = new ArrayList<AssignWebACDQueues.Queue>();
        }
        return this.queue;
    }


    /**
     * The Class Queue.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "type",
        "action"
    })
    public static class Queue
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The name. */
        @XmlElement(required = true)
        protected String name;
        
        /** The type. */
        @XmlElement(defaultValue = "AGENT")
        protected WebACDRoleType type;
        
        /** The action. */
        @XmlElement(required = true)
        protected WebACDActionType action;

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
         * Gets the type.
         * 
         * @return the type
         */
        public WebACDRoleType getType() {
            return type;
        }

        /**
         * Sets the type.
         * 
         * @param value the new type
         */
        public void setType(WebACDRoleType value) {
            this.type = value;
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
