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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class TSRouting.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSRouting", propOrder = {
    "tsPrimaryName",
    "tsPrimaryCountryCode",
    "tsPrimaryNumber",
    "tsDelay",
    "tsSecondName",
    "tsSecondCountryCode",
    "tsSecondNumber"
})
public class TSRouting
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The ts primary name. */
    @XmlElement(name = "TSPrimaryName")
    protected String tsPrimaryName;
    
    /** The ts primary country code. */
    @XmlElement(name = "TSPrimaryCountryCode")
    protected String tsPrimaryCountryCode;
    
    /** The ts primary number. */
    @XmlElement(name = "TSPrimaryNumber")
    protected String tsPrimaryNumber;
    
    /** The ts delay. */
    @XmlElement(name = "TSDelay")
    protected Integer tsDelay;
    
    /** The ts second name. */
    @XmlElement(name = "TSSecondName")
    protected String tsSecondName;
    
    /** The ts second country code. */
    @XmlElement(name = "TSSecondCountryCode")
    protected String tsSecondCountryCode;
    
    /** The ts second number. */
    @XmlElement(name = "TSSecondNumber")
    protected String tsSecondNumber;

    /**
     * Gets the tS primary name.
     * 
     * @return the tS primary name
     */
    public String getTSPrimaryName() {
        return tsPrimaryName;
    }

    /**
     * Sets the tS primary name.
     * 
     * @param value the new tS primary name
     */
    public void setTSPrimaryName(String value) {
        this.tsPrimaryName = value;
    }

    /**
     * Gets the tS primary country code.
     * 
     * @return the tS primary country code
     */
    public String getTSPrimaryCountryCode() {
        return tsPrimaryCountryCode;
    }

    /**
     * Sets the tS primary country code.
     * 
     * @param value the new tS primary country code
     */
    public void setTSPrimaryCountryCode(String value) {
        this.tsPrimaryCountryCode = value;
    }

    /**
     * Gets the tS primary number.
     * 
     * @return the tS primary number
     */
    public String getTSPrimaryNumber() {
        return tsPrimaryNumber;
    }

    /**
     * Sets the tS primary number.
     * 
     * @param value the new tS primary number
     */
    public void setTSPrimaryNumber(String value) {
        this.tsPrimaryNumber = value;
    }

    /**
     * Gets the tS delay.
     * 
     * @return the tS delay
     */
    public Integer getTSDelay() {
        return tsDelay;
    }

    /**
     * Sets the tS delay.
     * 
     * @param value the new tS delay
     */
    public void setTSDelay(Integer value) {
        this.tsDelay = value;
    }

    /**
     * Gets the tS second name.
     * 
     * @return the tS second name
     */
    public String getTSSecondName() {
        return tsSecondName;
    }

    /**
     * Sets the tS second name.
     * 
     * @param value the new tS second name
     */
    public void setTSSecondName(String value) {
        this.tsSecondName = value;
    }

    /**
     * Gets the tS second country code.
     * 
     * @return the tS second country code
     */
    public String getTSSecondCountryCode() {
        return tsSecondCountryCode;
    }

    /**
     * Sets the tS second country code.
     * 
     * @param value the new tS second country code
     */
    public void setTSSecondCountryCode(String value) {
        this.tsSecondCountryCode = value;
    }

    /**
     * Gets the tS second number.
     * 
     * @return the tS second number
     */
    public String getTSSecondNumber() {
        return tsSecondNumber;
    }

    /**
     * Sets the tS second number.
     * 
     * @param value the new tS second number
     */
    public void setTSSecondNumber(String value) {
        this.tsSecondNumber = value;
    }

}
