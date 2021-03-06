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
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * <p>Java class for lstMeeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstMeeting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="listControl" type="{http://www.webex.com/schemas/2002/06/service}lstControlType" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.webex.com/schemas/2002/06/service/meeting}orderType" minOccurs="0"/>
 *         &lt;element name="dateScope" type="{http://www.webex.com/schemas/2002/06/service/meeting}dateScopeType" minOccurs="0"/>
 *         &lt;element name="meetingKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstMeeting", propOrder = {
    "listControl",
    "order",
    "dateScope",
    "meetingKey"
})
public class LstMeeting
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected LstControlType listControl;
    protected OrderType order;
    protected DateScopeType dateScope;
    protected Long meetingKey;

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
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the dateScope property.
     * 
     * @return
     *     possible object is
     *     {@link DateScopeType }
     *     
     */
    public DateScopeType getDateScope() {
        return dateScope;
    }

    /**
     * Sets the value of the dateScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateScopeType }
     *     
     */
    public void setDateScope(DateScopeType value) {
        this.dateScope = value;
    }

    /**
     * Gets the value of the meetingKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the value of the meetingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeetingKey(Long value) {
        this.meetingKey = value;
    }

}
