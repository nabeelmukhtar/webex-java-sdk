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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;


/**
 * <p>Java class for lstrecordaccessHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstrecordaccessHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="creationTimeScope" type="{http://www.webex.com/schemas/2002/06/service/history}creationTimeScopeType" minOccurs="0"/>
 *         &lt;element name="viewTimeScope" type="{http://www.webex.com/schemas/2002/06/service/history}viewTimeScopeType" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.webex.com/schemas/2002/06/service/history}orderRecAccHisType" minOccurs="0"/>
 *         &lt;element name="listControl" type="{http://www.webex.com/schemas/2002/06/service}lstControlType" minOccurs="0"/>
 *         &lt;element name="timeZoneID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstrecordaccessHistory", propOrder = {
    "creationTimeScope",
    "viewTimeScope",
    "order",
    "listControl",
    "timeZoneID",
    "recordName",
    "hostWebExID"
})
public class LstrecordaccessHistory
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected CreationTimeScopeType creationTimeScope;
    protected ViewTimeScopeType viewTimeScope;
    protected OrderRecAccHisType order;
    protected LstControlType listControl;
    @XmlElement(defaultValue = "-1")
    protected Integer timeZoneID;
    protected String recordName;
    protected String hostWebExID;

    /**
     * Gets the value of the creationTimeScope property.
     * 
     * @return
     *     possible object is
     *     {@link CreationTimeScopeType }
     *     
     */
    public CreationTimeScopeType getCreationTimeScope() {
        return creationTimeScope;
    }

    /**
     * Sets the value of the creationTimeScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreationTimeScopeType }
     *     
     */
    public void setCreationTimeScope(CreationTimeScopeType value) {
        this.creationTimeScope = value;
    }

    /**
     * Gets the value of the viewTimeScope property.
     * 
     * @return
     *     possible object is
     *     {@link ViewTimeScopeType }
     *     
     */
    public ViewTimeScopeType getViewTimeScope() {
        return viewTimeScope;
    }

    /**
     * Sets the value of the viewTimeScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewTimeScopeType }
     *     
     */
    public void setViewTimeScope(ViewTimeScopeType value) {
        this.viewTimeScope = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderRecAccHisType }
     *     
     */
    public OrderRecAccHisType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRecAccHisType }
     *     
     */
    public void setOrder(OrderRecAccHisType value) {
        this.order = value;
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
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeZoneID(Integer value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the recordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the value of the recordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the value of the hostWebExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the value of the hostWebExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

}
