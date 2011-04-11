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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class VarsubstringType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "varsubstringType", propOrder = {
    "value"
})
public class VarsubstringType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The value. */
    @XmlValue
    protected String value;
    
    /** The index. */
    @XmlAttribute
    protected String index;
    
    /** The respident. */
    @XmlAttribute(required = true)
    protected String respident;
    
    /** The _case. */
    @XmlAttribute(name = "case")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String _case;

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the index.
     * 
     * @return the index
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the index.
     * 
     * @param value the new index
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the respident.
     * 
     * @return the respident
     */
    public String getRespident() {
        return respident;
    }

    /**
     * Sets the respident.
     * 
     * @param value the new respident
     */
    public void setRespident(String value) {
        this.respident = value;
    }

    /**
     * Gets the case.
     * 
     * @return the case
     */
    public String getCase() {
        if (_case == null) {
            return "No";
        } else {
            return _case;
        }
    }

    /**
     * Sets the case.
     * 
     * @param value the new case
     */
    public void setCase(String value) {
        this._case = value;
    }

}
