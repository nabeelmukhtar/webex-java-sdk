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

package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class OrderType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderType", propOrder = {
    "orderExtension"
})
public class OrderType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The order extension. */
    @XmlElement(name = "order_extension")
    protected OrderExtensionType orderExtension;
    
    /** The order type. */
    @XmlAttribute(name = "order_type", required = true)
    protected String orderType;

    /**
     * Gets the order extension.
     * 
     * @return the order extension
     */
    public OrderExtensionType getOrderExtension() {
        return orderExtension;
    }

    /**
     * Sets the order extension.
     * 
     * @param value the new order extension
     */
    public void setOrderExtension(OrderExtensionType value) {
        this.orderExtension = value;
    }

    /**
     * Gets the order type.
     * 
     * @return the order type
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the order type.
     * 
     * @param value the new order type
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

}
