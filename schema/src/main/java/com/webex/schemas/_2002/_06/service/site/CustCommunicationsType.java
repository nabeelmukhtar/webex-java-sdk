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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class CustCommunicationsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custCommunicationsType", propOrder = {
    "displayType",
    "displayMethod"
})
public class CustCommunicationsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The display type. */
    protected DisplayTypeType displayType;
    
    /** The display method. */
    protected DisplayMethodType displayMethod;

    /**
     * Gets the display type.
     * 
     * @return the display type
     */
    public DisplayTypeType getDisplayType() {
        return displayType;
    }

    /**
     * Sets the display type.
     * 
     * @param value the new display type
     */
    public void setDisplayType(DisplayTypeType value) {
        this.displayType = value;
    }

    /**
     * Gets the display method.
     * 
     * @return the display method
     */
    public DisplayMethodType getDisplayMethod() {
        return displayMethod;
    }

    /**
     * Sets the display method.
     * 
     * @param value the new display method
     */
    public void setDisplayMethod(DisplayMethodType value) {
        this.displayMethod = value;
    }

}
