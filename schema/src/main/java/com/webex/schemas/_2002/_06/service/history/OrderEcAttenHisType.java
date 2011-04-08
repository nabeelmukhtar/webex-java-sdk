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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.LstOrderADType;


/**
 * <p>Java class for orderEcAttenHisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderEcAttenHisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderBy" type="{http://www.webex.com/schemas/2002/06/service/history}orderEcAttenHisByType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="orderAD" type="{http://www.webex.com/schemas/2002/06/service}lstOrderADType" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderEcAttenHisType", propOrder = {
    "orderBy",
    "orderAD"
})
public class OrderEcAttenHisType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<OrderEcAttenHisByType> orderBy;
    protected List<LstOrderADType> orderAD;

    /**
     * Gets the value of the orderBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderEcAttenHisByType }
     * 
     * 
     */
    public List<OrderEcAttenHisByType> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<OrderEcAttenHisByType>();
        }
        return this.orderBy;
    }

    /**
     * Gets the value of the orderAD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderAD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderAD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LstOrderADType }
     * 
     * 
     */
    public List<LstOrderADType> getOrderAD() {
        if (orderAD == null) {
            orderAD = new ArrayList<LstOrderADType>();
        }
        return this.orderAD;
    }

}
