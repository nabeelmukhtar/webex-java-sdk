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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.service.BodyContentType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class LstAccounts.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstAccounts", propOrder = {
    "webExID",
    "intAccountID",
    "extAccountID",
    "extSystemID",
    "returnOppty"
})
public class LstAccounts
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The web ex id. */
    protected String webExID;
    
    /** The int account id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long intAccountID;
    
    /** The ext account id. */
    protected String extAccountID;
    
    /** The ext system id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long extSystemID;
    
    /** The return oppty. */
    @XmlElement(defaultValue = "false")
    protected Boolean returnOppty;

    /**
     * Gets the web ex id.
     * 
     * @return the web ex id
     */
    public String getWebExID() {
        return webExID;
    }

    /**
     * Sets the web ex id.
     * 
     * @param value the new web ex id
     */
    public void setWebExID(String value) {
        this.webExID = value;
    }

    /**
     * Gets the int account id.
     * 
     * @return the int account id
     */
    public Long getIntAccountID() {
        return intAccountID;
    }

    /**
     * Sets the int account id.
     * 
     * @param value the new int account id
     */
    public void setIntAccountID(Long value) {
        this.intAccountID = value;
    }

    /**
     * Gets the ext account id.
     * 
     * @return the ext account id
     */
    public String getExtAccountID() {
        return extAccountID;
    }

    /**
     * Sets the ext account id.
     * 
     * @param value the new ext account id
     */
    public void setExtAccountID(String value) {
        this.extAccountID = value;
    }

    /**
     * Gets the ext system id.
     * 
     * @return the ext system id
     */
    public Long getExtSystemID() {
        return extSystemID;
    }

    /**
     * Sets the ext system id.
     * 
     * @param value the new ext system id
     */
    public void setExtSystemID(Long value) {
        this.extSystemID = value;
    }

    /**
     * Checks if is return oppty.
     * 
     * @return the boolean
     */
    public Boolean isReturnOppty() {
        return returnOppty;
    }

    /**
     * Sets the return oppty.
     * 
     * @param value the new return oppty
     */
    public void setReturnOppty(Boolean value) {
        this.returnOppty = value;
    }

}
