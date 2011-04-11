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

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class NavigationBarType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "navigationBarType", propOrder = {
    "order",
    "enabled",
    "serviceName",
    "customizedName"
})
public class NavigationBarType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The order. */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long order;
    
    /** The enabled. */
    protected Boolean enabled;
    
    /** The service name. */
    @XmlElement(required = true)
    protected String serviceName;
    
    /** The customized name. */
    protected String customizedName;

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public Long getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param value the new order
     */
    public void setOrder(Long value) {
        this.order = value;
    }

    /**
     * Checks if is enabled.
     * 
     * @return the boolean
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the enabled.
     * 
     * @param value the new enabled
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the service name.
     * 
     * @return the service name
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the service name.
     * 
     * @param value the new service name
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the customized name.
     * 
     * @return the customized name
     */
    public String getCustomizedName() {
        return customizedName;
    }

    /**
     * Sets the customized name.
     * 
     * @param value the new customized name
     */
    public void setCustomizedName(String value) {
        this.customizedName = value;
    }

}
