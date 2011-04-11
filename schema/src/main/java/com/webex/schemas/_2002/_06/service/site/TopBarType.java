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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class TopBarType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "topBarType", propOrder = {
    "button",
    "displayDisabledService"
})
public class TopBarType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The button. */
    protected List<NavigationBarType> button;
    
    /** The display disabled service. */
    protected Boolean displayDisabledService;

    /**
     * Gets the button.
     * 
     * @return the button
     */
    public List<NavigationBarType> getButton() {
        if (button == null) {
            button = new ArrayList<NavigationBarType>();
        }
        return this.button;
    }

    /**
     * Checks if is display disabled service.
     * 
     * @return the boolean
     */
    public Boolean isDisplayDisabledService() {
        return displayDisabledService;
    }

    /**
     * Sets the display disabled service.
     * 
     * @param value the new display disabled service
     */
    public void setDisplayDisabledService(Boolean value) {
        this.displayDisabledService = value;
    }

}
