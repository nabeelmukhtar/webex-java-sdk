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

package com.webex.schemas._2002._06.service.history;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * <p>Java class for lstsupportattendeeHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstsupportattendeeHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="sessionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="listControl" type="{http://www.webex.com/schemas/2002/06/service}lstControlType" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.webex.com/schemas/2002/06/service/history}orderScAttenHisType" minOccurs="0"/>
 *         &lt;element name="startTimeScope" type="{http://www.webex.com/schemas/2002/06/service/history}startTimeScopeType" minOccurs="0"/>
 *         &lt;element name="endTimeScope" type="{http://www.webex.com/schemas/2002/06/service/history}endTimeScopeType" minOccurs="0"/>
 *         &lt;element name="confID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstsupportattendeeHistory", propOrder = {
    "sessionKey",
    "listControl",
    "order",
    "startTimeScope",
    "endTimeScope",
    "confID"
})
public class LstsupportattendeeHistory
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long sessionKey;
    protected LstControlType listControl;
    protected OrderScAttenHisType order;
    protected StartTimeScopeType startTimeScope;
    protected EndTimeScopeType endTimeScope;
    protected Long confID;

    /**
     * Gets the value of the sessionKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionKey() {
        return sessionKey;
    }

    /**
     * Sets the value of the sessionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionKey(Long value) {
        this.sessionKey = value;
    }

    /**
     * Gets the value of the listControl property.
     * 
     * @return
     *     possible object is
     *     {@link LstControlType }
     *     
     */
    public LstControlType getListControl() {
        return listControl;
    }

    /**
     * Sets the value of the listControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstControlType }
     *     
     */
    public void setListControl(LstControlType value) {
        this.listControl = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderScAttenHisType }
     *     
     */
    public OrderScAttenHisType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderScAttenHisType }
     *     
     */
    public void setOrder(OrderScAttenHisType value) {
        this.order = value;
    }

    /**
     * Gets the value of the startTimeScope property.
     * 
     * @return
     *     possible object is
     *     {@link StartTimeScopeType }
     *     
     */
    public StartTimeScopeType getStartTimeScope() {
        return startTimeScope;
    }

    /**
     * Sets the value of the startTimeScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTimeScopeType }
     *     
     */
    public void setStartTimeScope(StartTimeScopeType value) {
        this.startTimeScope = value;
    }

    /**
     * Gets the value of the endTimeScope property.
     * 
     * @return
     *     possible object is
     *     {@link EndTimeScopeType }
     *     
     */
    public EndTimeScopeType getEndTimeScope() {
        return endTimeScope;
    }

    /**
     * Sets the value of the endTimeScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTimeScopeType }
     *     
     */
    public void setEndTimeScope(EndTimeScopeType value) {
        this.endTimeScope = value;
    }

    /**
     * Gets the value of the confID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfID() {
        return confID;
    }

    /**
     * Sets the value of the confID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfID(Long value) {
        this.confID = value;
    }

}
