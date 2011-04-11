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
import com.webex.schemas._2002._06.service.BodyContentType;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class LstContact.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstContact", propOrder = {
    "distListID",
    "distListName",
    "addressType",
    "hostWebExID"
})
public class LstContact
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The dist list id. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long distListID;
    
    /** The dist list name. */
    protected String distListName;
    
    /** The address type. */
    protected AddressTypeType addressType;
    
    /** The host web ex id. */
    protected String hostWebExID;

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
     * Gets the dist list name.
     * 
     * @return the dist list name
     */
    public String getDistListName() {
        return distListName;
    }

    /**
     * Sets the dist list name.
     * 
     * @param value the new dist list name
     */
    public void setDistListName(String value) {
        this.distListName = value;
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

    /**
     * Gets the host web ex id.
     * 
     * @return the host web ex id
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the host web ex id.
     * 
     * @param value the new host web ex id
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

}
