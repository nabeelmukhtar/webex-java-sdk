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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class OutcomesType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomesType", propOrder = {
    "decvar",
    "interpretvar"
})
public class OutcomesType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The decvar. */
    @XmlElement(required = true)
    protected DecvarType decvar;
    
    /** The interpretvar. */
    protected InterpretvarType interpretvar;

    /**
     * Gets the decvar.
     * 
     * @return the decvar
     */
    public DecvarType getDecvar() {
        return decvar;
    }

    /**
     * Sets the decvar.
     * 
     * @param value the new decvar
     */
    public void setDecvar(DecvarType value) {
        this.decvar = value;
    }

    /**
     * Gets the interpretvar.
     * 
     * @return the interpretvar
     */
    public InterpretvarType getInterpretvar() {
        return interpretvar;
    }

    /**
     * Sets the interpretvar.
     * 
     * @param value the new interpretvar
     */
    public void setInterpretvar(InterpretvarType value) {
        this.interpretvar = value;
    }

}
