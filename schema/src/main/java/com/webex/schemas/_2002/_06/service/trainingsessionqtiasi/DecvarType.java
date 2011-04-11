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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class DecvarType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decvarType", propOrder = {
    "value"
})
public class DecvarType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The value. */
    @XmlValue
    protected String value;
    
    /** The vartype. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vartype;
    
    /** The minvalue. */
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long minvalue;
    
    /** The maxvalue. */
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long maxvalue;

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
     * Gets the vartype.
     * 
     * @return the vartype
     */
    public String getVartype() {
        if (vartype == null) {
            return "Integer";
        } else {
            return vartype;
        }
    }

    /**
     * Sets the vartype.
     * 
     * @param value the new vartype
     */
    public void setVartype(String value) {
        this.vartype = value;
    }

    /**
     * Gets the minvalue.
     * 
     * @return the minvalue
     */
    public Long getMinvalue() {
        return minvalue;
    }

    /**
     * Sets the minvalue.
     * 
     * @param value the new minvalue
     */
    public void setMinvalue(Long value) {
        this.minvalue = value;
    }

    /**
     * Gets the maxvalue.
     * 
     * @return the maxvalue
     */
    public Long getMaxvalue() {
        return maxvalue;
    }

    /**
     * Sets the maxvalue.
     * 
     * @param value the new maxvalue
     */
    public void setMaxvalue(Long value) {
        this.maxvalue = value;
    }

}
