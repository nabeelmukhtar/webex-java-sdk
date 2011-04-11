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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class OrderType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderType", propOrder = {
    "orderBy",
    "orderAD"
})
public class OrderType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The order by. */
    protected OrderByType orderBy;
    
    /** The order ad. */
    protected LstOrderADType orderAD;

    /**
     * Gets the order by.
     * 
     * @return the order by
     */
    public OrderByType getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the order by.
     * 
     * @param value the new order by
     */
    public void setOrderBy(OrderByType value) {
        this.orderBy = value;
    }

    /**
     * Gets the order ad.
     * 
     * @return the order ad
     */
    public LstOrderADType getOrderAD() {
        return orderAD;
    }

    /**
     * Sets the order ad.
     * 
     * @param value the new order ad
     */
    public void setOrderAD(LstOrderADType value) {
        this.orderAD = value;
    }

}
