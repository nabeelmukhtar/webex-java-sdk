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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class EnrollmentType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollmentType", propOrder = {
    "idReq",
    "passwordReq",
    "password",
    "approvalReq",
    "approvalRules",
    "endURLAfterEnroll"
})
public class EnrollmentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The id req. */
    protected Boolean idReq;
    
    /** The password req. */
    protected Boolean passwordReq;
    
    /** The password. */
    protected String password;
    
    /** The approval req. */
    @XmlElement(defaultValue = "true")
    protected Boolean approvalReq;
    
    /** The approval rules. */
    protected EnrollmentType.ApprovalRules approvalRules;
    
    /** The end url after enroll. */
    protected String endURLAfterEnroll;

    /**
     * Checks if is id req.
     * 
     * @return the boolean
     */
    public Boolean isIdReq() {
        return idReq;
    }

    /**
     * Sets the id req.
     * 
     * @param value the new id req
     */
    public void setIdReq(Boolean value) {
        this.idReq = value;
    }

    /**
     * Checks if is password req.
     * 
     * @return the boolean
     */
    public Boolean isPasswordReq() {
        return passwordReq;
    }

    /**
     * Sets the password req.
     * 
     * @param value the new password req
     */
    public void setPasswordReq(Boolean value) {
        this.passwordReq = value;
    }

    /**
     * Gets the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * 
     * @param value the new password
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Checks if is approval req.
     * 
     * @return the boolean
     */
    public Boolean isApprovalReq() {
        return approvalReq;
    }

    /**
     * Sets the approval req.
     * 
     * @param value the new approval req
     */
    public void setApprovalReq(Boolean value) {
        this.approvalReq = value;
    }

    /**
     * Gets the approval rules.
     * 
     * @return the approval rules
     */
    public EnrollmentType.ApprovalRules getApprovalRules() {
        return approvalRules;
    }

    /**
     * Sets the approval rules.
     * 
     * @param value the new approval rules
     */
    public void setApprovalRules(EnrollmentType.ApprovalRules value) {
        this.approvalRules = value;
    }

    /**
     * Gets the end url after enroll.
     * 
     * @return the end url after enroll
     */
    public String getEndURLAfterEnroll() {
        return endURLAfterEnroll;
    }

    /**
     * Sets the end url after enroll.
     * 
     * @param value the new end url after enroll
     */
    public void setEndURLAfterEnroll(String value) {
        this.endURLAfterEnroll = value;
    }


    /**
     * The Class ApprovalRules.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rule"
    })
    public static class ApprovalRules
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The rule. */
        protected List<ApprovalRuleType> rule;

        /**
         * Gets the rule.
         * 
         * @return the rule
         */
        public List<ApprovalRuleType> getRule() {
            if (rule == null) {
                rule = new ArrayList<ApprovalRuleType>();
            }
            return this.rule;
        }

    }

}
