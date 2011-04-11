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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class HandsOnLabType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handsOnLabType", propOrder = {
    "reserveHOL",
    "labName",
    "numComputers"
})
public class HandsOnLabType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The reserve hol. */
    protected Boolean reserveHOL;
    
    /** The lab name. */
    protected String labName;
    
    /** The num computers. */
    protected Integer numComputers;

    /**
     * Checks if is reserve hol.
     * 
     * @return the boolean
     */
    public Boolean isReserveHOL() {
        return reserveHOL;
    }

    /**
     * Sets the reserve hol.
     * 
     * @param value the new reserve hol
     */
    public void setReserveHOL(Boolean value) {
        this.reserveHOL = value;
    }

    /**
     * Gets the lab name.
     * 
     * @return the lab name
     */
    public String getLabName() {
        return labName;
    }

    /**
     * Sets the lab name.
     * 
     * @param value the new lab name
     */
    public void setLabName(String value) {
        this.labName = value;
    }

    /**
     * Gets the num computers.
     * 
     * @return the num computers
     */
    public Integer getNumComputers() {
        return numComputers;
    }

    /**
     * Sets the num computers.
     * 
     * @param value the new num computers
     */
    public void setNumComputers(Integer value) {
        this.numComputers = value;
    }

}
