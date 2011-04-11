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

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ApprovalRuleType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approvalRuleType", propOrder = {
    "enrollFieldID",
    "condition",
    "queryField",
    "action",
    "matchCase"
})
@XmlSeeAlso({
    ApprovalRuleInstanceType.class
})
public class ApprovalRuleType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The enroll field id. */
    @XmlElement(defaultValue = "-13")
    protected long enrollFieldID;
    
    /** The condition. */
    @XmlElement(required = true, defaultValue = "CONTAINS")
    protected ApprovalConditionType condition;
    
    /** The query field. */
    @XmlElement(required = true)
    protected String queryField;
    
    /** The action. */
    @XmlElement(required = true, defaultValue = "REJECT")
    protected ApprovalActionType action;
    
    /** The match case. */
    protected Boolean matchCase;

    /**
     * Gets the enroll field id.
     * 
     * @return the enroll field id
     */
    public long getEnrollFieldID() {
        return enrollFieldID;
    }

    /**
     * Sets the enroll field id.
     * 
     * @param value the new enroll field id
     */
    public void setEnrollFieldID(long value) {
        this.enrollFieldID = value;
    }

    /**
     * Gets the condition.
     * 
     * @return the condition
     */
    public ApprovalConditionType getCondition() {
        return condition;
    }

    /**
     * Sets the condition.
     * 
     * @param value the new condition
     */
    public void setCondition(ApprovalConditionType value) {
        this.condition = value;
    }

    /**
     * Gets the query field.
     * 
     * @return the query field
     */
    public String getQueryField() {
        return queryField;
    }

    /**
     * Sets the query field.
     * 
     * @param value the new query field
     */
    public void setQueryField(String value) {
        this.queryField = value;
    }

    /**
     * Gets the action.
     * 
     * @return the action
     */
    public ApprovalActionType getAction() {
        return action;
    }

    /**
     * Sets the action.
     * 
     * @param value the new action
     */
    public void setAction(ApprovalActionType value) {
        this.action = value;
    }

    /**
     * Checks if is match case.
     * 
     * @return the boolean
     */
    public Boolean isMatchCase() {
        return matchCase;
    }

    /**
     * Sets the match case.
     * 
     * @param value the new match case
     */
    public void setMatchCase(Boolean value) {
        this.matchCase = value;
    }

}
