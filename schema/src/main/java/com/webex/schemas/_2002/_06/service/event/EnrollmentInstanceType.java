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
 * <p>Java class for enrollmentInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrollmentInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="passwordReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approvalRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rule" type="{http://www.webex.com/schemas/2002/06/service/event}approvalRuleInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="endURLAfterEnroll" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollmentInstanceType", propOrder = {
    "idReq",
    "passwordReq",
    "password",
    "approvalReq",
    "approvalRules",
    "endURLAfterEnroll"
})
public class EnrollmentInstanceType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean idReq;
    protected Boolean passwordReq;
    protected String password;
    @XmlElement(defaultValue = "true")
    protected Boolean approvalReq;
    protected EnrollmentInstanceType.ApprovalRules approvalRules;
    protected String endURLAfterEnroll;

    /**
     * Gets the value of the idReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdReq() {
        return idReq;
    }

    /**
     * Sets the value of the idReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdReq(Boolean value) {
        this.idReq = value;
    }

    /**
     * Gets the value of the passwordReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordReq() {
        return passwordReq;
    }

    /**
     * Sets the value of the passwordReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordReq(Boolean value) {
        this.passwordReq = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the approvalReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApprovalReq() {
        return approvalReq;
    }

    /**
     * Sets the value of the approvalReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApprovalReq(Boolean value) {
        this.approvalReq = value;
    }

    /**
     * Gets the value of the approvalRules property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentInstanceType.ApprovalRules }
     *     
     */
    public EnrollmentInstanceType.ApprovalRules getApprovalRules() {
        return approvalRules;
    }

    /**
     * Sets the value of the approvalRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentInstanceType.ApprovalRules }
     *     
     */
    public void setApprovalRules(EnrollmentInstanceType.ApprovalRules value) {
        this.approvalRules = value;
    }

    /**
     * Gets the value of the endURLAfterEnroll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndURLAfterEnroll() {
        return endURLAfterEnroll;
    }

    /**
     * Sets the value of the endURLAfterEnroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndURLAfterEnroll(String value) {
        this.endURLAfterEnroll = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="rule" type="{http://www.webex.com/schemas/2002/06/service/event}approvalRuleInstanceType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rule"
    })
    public static class ApprovalRules
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected List<ApprovalRuleInstanceType> rule;

        /**
         * Gets the value of the rule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ApprovalRuleInstanceType }
         * 
         * 
         */
        public List<ApprovalRuleInstanceType> getRule() {
            if (rule == null) {
                rule = new ArrayList<ApprovalRuleInstanceType>();
            }
            return this.rule;
        }

    }

}
