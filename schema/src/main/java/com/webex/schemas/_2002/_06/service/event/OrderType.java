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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.LstOrderADType;


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
    protected List<OrderByType> orderBy;
    
    /** The order ad. */
    protected List<LstOrderADType> orderAD;

    /**
     * Gets the order by.
     * 
     * @return the order by
     */
    public List<OrderByType> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<OrderByType>();
        }
        return this.orderBy;
    }

    /**
     * Gets the order ad.
     * 
     * @return the order ad
     */
    public List<LstOrderADType> getOrderAD() {
        if (orderAD == null) {
            orderAD = new ArrayList<LstOrderADType>();
        }
        return this.orderAD;
    }

}
