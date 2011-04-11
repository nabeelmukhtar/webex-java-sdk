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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class AccountType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountType", propOrder = {
    "name",
    "extAccountID",
    "extSystemID",
    "parentIntID"
})
@XmlSeeAlso({
    AccountInstanceType.class,
    com.webex.schemas._2002._06.service.sales.SetAccount.Account.class
})
public class AccountType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The name. */
    protected String name;
    
    /** The ext account id. */
    protected String extAccountID;
    
    /** The ext system id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long extSystemID;
    
    /** The parent int id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long parentIntID;

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the parent int id.
     * 
     * @return the parent int id
     */
    public Long getParentIntID() {
        return parentIntID;
    }

    /**
     * Sets the parent int id.
     * 
     * @param value the new parent int id
     */
    public void setParentIntID(Long value) {
        this.parentIntID = value;
    }

}
