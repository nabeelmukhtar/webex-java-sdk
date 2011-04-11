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


/**
 * The Class RegQandAType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regQandAType", propOrder = {
    "regQ",
    "regA"
})
public class RegQandAType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The reg q. */
    @XmlElement(required = true)
    protected String regQ;
    
    /** The reg a. */
    @XmlElement(required = true)
    protected String regA;

    /**
     * Gets the reg q.
     * 
     * @return the reg q
     */
    public String getRegQ() {
        return regQ;
    }

    /**
     * Sets the reg q.
     * 
     * @param value the new reg q
     */
    public void setRegQ(String value) {
        this.regQ = value;
    }

    /**
     * Gets the reg a.
     * 
     * @return the reg a
     */
    public String getRegA() {
        return regA;
    }

    /**
     * Sets the reg a.
     * 
     * @param value the new reg a
     */
    public void setRegA(String value) {
        this.regA = value;
    }

}
