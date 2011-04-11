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


/**
 * The Class MatapplicationType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matapplicationType", propOrder = {
    "value"
})
public class MatapplicationType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The value. */
    @XmlValue
    protected String value;
    
    /** The apptype. */
    @XmlAttribute
    protected String apptype;
    
    /** The label. */
    @XmlAttribute
    protected String label;
    
    /** The uri. */
    @XmlAttribute
    protected String uri;
    
    /** The embedded. */
    @XmlAttribute
    protected String embedded;

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
     * Gets the apptype.
     * 
     * @return the apptype
     */
    public String getApptype() {
        return apptype;
    }

    /**
     * Sets the apptype.
     * 
     * @param value the new apptype
     */
    public void setApptype(String value) {
        this.apptype = value;
    }

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label.
     * 
     * @param value the new label
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the uri.
     * 
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the uri.
     * 
     * @param value the new uri
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the embedded.
     * 
     * @return the embedded
     */
    public String getEmbedded() {
        if (embedded == null) {
            return "base64";
        } else {
            return embedded;
        }
    }

    /**
     * Sets the embedded.
     * 
     * @param value the new embedded
     */
    public void setEmbedded(String value) {
        this.embedded = value;
    }

}
