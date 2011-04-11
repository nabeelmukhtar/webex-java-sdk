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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.webex.schemas._2002._06.common.AddressTypeType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class DistListInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distListInstanceType", propOrder = {
    "distListID",
    "name",
    "desc",
    "addressType"
})
public class DistListInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The dist list id. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long distListID;
    
    /** The name. */
    @XmlElement(required = true)
    protected String name;
    
    /** The desc. */
    protected String desc;
    
    /** The address type. */
    protected AddressTypeType addressType;

    /**
     * Gets the dist list id.
     * 
     * @return the dist list id
     */
    public Long getDistListID() {
        return distListID;
    }

    /**
     * Sets the dist list id.
     * 
     * @param value the new dist list id
     */
    public void setDistListID(Long value) {
        this.distListID = value;
    }

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
     * Gets the desc.
     * 
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the desc.
     * 
     * @param value the new desc
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the address type.
     * 
     * @return the address type
     */
    public AddressTypeType getAddressType() {
        return addressType;
    }

    /**
     * Sets the address type.
     * 
     * @param value the new address type
     */
    public void setAddressType(AddressTypeType value) {
        this.addressType = value;
    }

}
