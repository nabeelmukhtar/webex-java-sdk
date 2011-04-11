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
 * The Class MessageType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageType", propOrder = {
    "header",
    "body"
})
public class MessageType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The header. */
    @XmlElement(required = true)
    protected MessageType.Header header;
    
    /** The body. */
    @XmlElement(required = true)
    protected MessageType.Body body;

    /**
     * Gets the header.
     * 
     * @return the header
     */
    public MessageType.Header getHeader() {
        return header;
    }

    /**
     * Sets the header.
     * 
     * @param value the new header
     */
    public void setHeader(MessageType.Header value) {
        this.header = value;
    }

    /**
     * Gets the body.
     * 
     * @return the body
     */
    public MessageType.Body getBody() {
        return body;
    }

    /**
     * Sets the body.
     * 
     * @param value the new body
     */
    public void setBody(MessageType.Body value) {
        this.body = value;
    }


    /**
     * The Class Body.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bodyContent"
    })
    public static class Body
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The body content. */
        @XmlElement(required = true)
        protected List<BodyContentType> bodyContent;

        /**
         * Gets the body content.
         * 
         * @return the body content
         */
        public List<BodyContentType> getBodyContent() {
            if (bodyContent == null) {
                bodyContent = new ArrayList<BodyContentType>();
            }
            return this.bodyContent;
        }

    }


    /**
     * The Class Header.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "securityContext",
        "response"
    })
    public static class Header
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The security context. */
        protected SecurityContextType securityContext;
        
        /** The response. */
        protected List<ResponseType> response;

        /**
         * Gets the security context.
         * 
         * @return the security context
         */
        public SecurityContextType getSecurityContext() {
            return securityContext;
        }

        /**
         * Sets the security context.
         * 
         * @param value the new security context
         */
        public void setSecurityContext(SecurityContextType value) {
            this.securityContext = value;
        }

        /**
         * Gets the response.
         * 
         * @return the response
         */
        public List<ResponseType> getResponse() {
            if (response == null) {
                response = new ArrayList<ResponseType>();
            }
            return this.response;
        }

    }

}
