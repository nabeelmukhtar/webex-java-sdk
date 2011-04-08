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
 * <p>Java class for messageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="securityContext" type="{http://www.webex.com/schemas/2002/06/service}securityContextType" minOccurs="0"/>
 *                   &lt;element name="response" type="{http://www.webex.com/schemas/2002/06/service}responseType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bodyContent" type="{http://www.webex.com/schemas/2002/06/service}bodyContentType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "messageType", propOrder = {
    "header",
    "body"
})
public class MessageType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected MessageType.Header header;
    @XmlElement(required = true)
    protected MessageType.Body body;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType.Header }
     *     
     */
    public MessageType.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType.Header }
     *     
     */
    public void setHeader(MessageType.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType.Body }
     *     
     */
    public MessageType.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType.Body }
     *     
     */
    public void setBody(MessageType.Body value) {
        this.body = value;
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
     *         &lt;element name="bodyContent" type="{http://www.webex.com/schemas/2002/06/service}bodyContentType" maxOccurs="unbounded"/>
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
        "bodyContent"
    })
    public static class Body
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        @XmlElement(required = true)
        protected List<BodyContentType> bodyContent;

        /**
         * Gets the value of the bodyContent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bodyContent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBodyContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BodyContentType }
         * 
         * 
         */
        public List<BodyContentType> getBodyContent() {
            if (bodyContent == null) {
                bodyContent = new ArrayList<BodyContentType>();
            }
            return this.bodyContent;
        }

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
     *         &lt;element name="securityContext" type="{http://www.webex.com/schemas/2002/06/service}securityContextType" minOccurs="0"/>
     *         &lt;element name="response" type="{http://www.webex.com/schemas/2002/06/service}responseType" maxOccurs="unbounded" minOccurs="0"/>
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
        "securityContext",
        "response"
    })
    public static class Header
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected SecurityContextType securityContext;
        protected List<ResponseType> response;

        /**
         * Gets the value of the securityContext property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityContextType }
         *     
         */
        public SecurityContextType getSecurityContext() {
            return securityContext;
        }

        /**
         * Sets the value of the securityContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityContextType }
         *     
         */
        public void setSecurityContext(SecurityContextType value) {
            this.securityContext = value;
        }

        /**
         * Gets the value of the response property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the response property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponseType }
         * 
         * 
         */
        public List<ResponseType> getResponse() {
            if (response == null) {
                response = new ArrayList<ResponseType>();
            }
            return this.response;
        }

    }

}
