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

package com.webex.schemas._2002._06.service.meeting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.ICalendarURLType;


/**
 * <p>Java class for createMeetingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createMeetingResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="meetingkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="iCalendarURL" type="{http://www.webex.com/schemas/2002/06/service}iCalendarURLType" minOccurs="0"/>
 *         &lt;element name="guestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMeetingResponse", propOrder = {
    "meetingkey",
    "iCalendarURL",
    "guestToken"
})
public class CreateMeetingResponse
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long meetingkey;
    protected ICalendarURLType iCalendarURL;
    protected String guestToken;

    /**
     * Gets the value of the meetingkey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeetingkey() {
        return meetingkey;
    }

    /**
     * Sets the value of the meetingkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeetingkey(Long value) {
        this.meetingkey = value;
    }

    /**
     * Gets the value of the iCalendarURL property.
     * 
     * @return
     *     possible object is
     *     {@link ICalendarURLType }
     *     
     */
    public ICalendarURLType getICalendarURL() {
        return iCalendarURL;
    }

    /**
     * Sets the value of the iCalendarURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICalendarURLType }
     *     
     */
    public void setICalendarURL(ICalendarURLType value) {
        this.iCalendarURL = value;
    }

    /**
     * Gets the value of the guestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestToken() {
        return guestToken;
    }

    /**
     * Sets the value of the guestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestToken(String value) {
        this.guestToken = value;
    }

}
