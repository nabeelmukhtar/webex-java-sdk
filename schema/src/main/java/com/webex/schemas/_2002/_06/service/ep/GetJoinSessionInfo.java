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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for getJoinSessionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getJoinSessionInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sessionPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attendeeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attendeeEmail" type="{http://www.webex.com/schemas/2002/06/common}emailType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJoinSessionInfo", propOrder = {
    "sessionKey",
    "sessionPassword",
    "attendeeName",
    "attendeeEmail"
})
public class GetJoinSessionInfo
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected long sessionKey;
    @XmlElement(required = true)
    protected String sessionPassword;
    @XmlElement(required = true)
    protected String attendeeName;
    @XmlElement(required = true)
    protected String attendeeEmail;

    /**
     * Gets the value of the sessionKey property.
     * 
     */
    public long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the value of the sessionKey property.
     * 
     */
    public void setSessionKey(long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the value of the sessionPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionPassword() {
        return sessionPassword;
    }

    /**
     * Sets the value of the sessionPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionPassword(String value) {
        this.sessionPassword = value;
    }

    /**
     * Gets the value of the attendeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendeeName() {
        return attendeeName;
    }

    /**
     * Sets the value of the attendeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendeeName(String value) {
        this.attendeeName = value;
    }

    /**
     * Gets the value of the attendeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    /**
     * Sets the value of the attendeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendeeEmail(String value) {
        this.attendeeEmail = value;
    }

}
