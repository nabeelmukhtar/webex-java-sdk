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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}eventType">
 *       &lt;sequence>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventInstanceType", propOrder = {
    "sessionKey"
})
@XmlSeeAlso({
    GetEventResponse.class,
    SetEvent.class
})
public class EventInstanceType
    extends EventType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected long sessionKey;

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

}
