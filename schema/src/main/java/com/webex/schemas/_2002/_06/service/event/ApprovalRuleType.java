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
 * <p>Java class for approvalRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approvalRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enrollFieldID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="condition" type="{http://www.webex.com/schemas/2002/06/service/event}approvalConditionType"/>
 *         &lt;element name="queryField">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="action" type="{http://www.webex.com/schemas/2002/06/service/event}approvalActionType"/>
 *         &lt;element name="matchCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(defaultValue = "-13")
    protected long enrollFieldID;
    @XmlElement(required = true, defaultValue = "CONTAINS")
    protected ApprovalConditionType condition;
    @XmlElement(required = true)
    protected String queryField;
    @XmlElement(required = true, defaultValue = "REJECT")
    protected ApprovalActionType action;
    protected Boolean matchCase;

    /**
     * Gets the value of the enrollFieldID property.
     * 
     */
    public long getEnrollFieldID() {
        return enrollFieldID;
    }

    /**
     * Sets the value of the enrollFieldID property.
     * 
     */
    public void setEnrollFieldID(long value) {
        this.enrollFieldID = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalConditionType }
     *     
     */
    public ApprovalConditionType getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalConditionType }
     *     
     */
    public void setCondition(ApprovalConditionType value) {
        this.condition = value;
    }

    /**
     * Gets the value of the queryField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryField() {
        return queryField;
    }

    /**
     * Sets the value of the queryField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryField(String value) {
        this.queryField = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalActionType }
     *     
     */
    public ApprovalActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalActionType }
     *     
     */
    public void setAction(ApprovalActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the matchCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchCase() {
        return matchCase;
    }

    /**
     * Sets the value of the matchCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchCase(Boolean value) {
        this.matchCase = value;
    }

}
