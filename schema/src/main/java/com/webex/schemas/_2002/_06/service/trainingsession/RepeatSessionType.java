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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class RepeatSessionType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repeatSessionType", propOrder = {
    "action",
    "index",
    "startDate"
})
public class RepeatSessionType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The action. */
    protected ActionType action;
    
    /** The index. */
    protected int index;
    
    /** The start date. */
    protected String startDate;

    /**
     * Gets the action.
     * 
     * @return the action
     */
    public ActionType getAction() {
        return action;
    }

    /**
     * Sets the action.
     * 
     * @param value the new action
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

    /**
     * Gets the index.
     * 
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the index.
     * 
     * @param value the new index
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the start date.
     * 
     * @return the start date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date.
     * 
     * @param value the new start date
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

}
