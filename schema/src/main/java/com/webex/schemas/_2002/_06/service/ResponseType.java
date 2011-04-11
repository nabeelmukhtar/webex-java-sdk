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

package com.webex.schemas._2002._06.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.webex.com/schemas/2002/06/service}resultTypeType"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gsbStatus" type="{http://www.webex.com/schemas/2002/06/service}gsbStatusType" minOccurs="0"/>
 *         &lt;element name="exceptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subErrors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subError" type="{http://www.webex.com/schemas/2002/06/service}subErrorType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseType", propOrder = {
    "result",
    "reason",
    "gsbStatus",
    "exceptionID",
    "subErrors",
    "value"
})
public class ResponseType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected ResultTypeType result;
    protected String reason;
    protected GsbStatusType gsbStatus;
    protected String exceptionID;
    protected ResponseType.SubErrors subErrors;
    protected String value;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultTypeType }
     *     
     */
    public ResultTypeType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultTypeType }
     *     
     */
    public void setResult(ResultTypeType value) {
        this.result = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the gsbStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GsbStatusType }
     *     
     */
    public GsbStatusType getGsbStatus() {
        return gsbStatus;
    }

    /**
     * Sets the value of the gsbStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GsbStatusType }
     *     
     */
    public void setGsbStatus(GsbStatusType value) {
        this.gsbStatus = value;
    }

    /**
     * Gets the value of the exceptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionID() {
        return exceptionID;
    }

    /**
     * Sets the value of the exceptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionID(String value) {
        this.exceptionID = value;
    }

    /**
     * Gets the value of the subErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType.SubErrors }
     *     
     */
    public ResponseType.SubErrors getSubErrors() {
        return subErrors;
    }

    /**
     * Sets the value of the subErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType.SubErrors }
     *     
     */
    public void setSubErrors(ResponseType.SubErrors value) {
        this.subErrors = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
     *         &lt;element name="subError" type="{http://www.webex.com/schemas/2002/06/service}subErrorType" maxOccurs="unbounded"/>
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
        "subError"
    })
    public static class SubErrors
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        @XmlElement(required = true)
        protected List<SubErrorType> subError;

        /**
         * Gets the value of the subError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubErrorType }
         * 
         * 
         */
        public List<SubErrorType> getSubError() {
            if (subError == null) {
                subError = new ArrayList<SubErrorType>();
            }
            return this.subError;
        }

    }

}
