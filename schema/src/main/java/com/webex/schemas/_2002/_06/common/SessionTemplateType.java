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
 * The Class SessionTemplateType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionTemplateType", propOrder = {
    "use",
    "_default"
})
public class SessionTemplateType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The use. */
    protected String use;
    
    /** The _default. */
    @XmlElement(name = "default")
    protected Boolean _default;

    /**
     * Gets the use.
     * 
     * @return the use
     */
    public String getUse() {
        return use;
    }

    /**
     * Sets the use.
     * 
     * @param value the new use
     */
    public void setUse(String value) {
        this.use = value;
    }

    /**
     * Checks if is default.
     * 
     * @return the boolean
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the default.
     * 
     * @param value the new default
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

}
