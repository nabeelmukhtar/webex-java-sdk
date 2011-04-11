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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.ServiceTypeType;


/**
 * The Class SessionTemplateSummaryType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionTemplateSummaryType", propOrder = {
    "name",
    "value",
    "serviceType"
})
public class SessionTemplateSummaryType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The name. */
    @XmlElement(required = true)
    protected String name;
    
    /** The value. */
    @XmlElement(required = true)
    protected String value;
    
    /** The service type. */
    @XmlElement(required = true)
    protected ServiceTypeType serviceType;

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
     * Gets the service type.
     * 
     * @return the service type
     */
    public ServiceTypeType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the service type.
     * 
     * @param value the new service type
     */
    public void setServiceType(ServiceTypeType value) {
        this.serviceType = value;
    }

}
