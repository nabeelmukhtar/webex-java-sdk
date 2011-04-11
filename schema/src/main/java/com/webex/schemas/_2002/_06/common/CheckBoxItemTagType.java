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

package com.webex.schemas._2002._06.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class CheckBoxItemTagType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkBoxItemTagType", propOrder = {
    "itemName",
    "isSelected"
})
public class CheckBoxItemTagType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The item name. */
    @XmlElement(required = true)
    protected String itemName;
    
    /** The is selected. */
    protected boolean isSelected;

    /**
     * Gets the item name.
     * 
     * @return the item name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the item name.
     * 
     * @param value the new item name
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Checks if is checks if is selected.
     * 
     * @return true, if is checks if is selected
     */
    public boolean isIsSelected() {
        return isSelected;
    }

    /**
     * Sets the checks if is selected.
     * 
     * @param value the new checks if is selected
     */
    public void setIsSelected(boolean value) {
        this.isSelected = value;
    }

}
