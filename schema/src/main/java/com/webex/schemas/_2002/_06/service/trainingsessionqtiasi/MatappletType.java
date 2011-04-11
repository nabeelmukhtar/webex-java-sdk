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
 * The Class MatappletType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matappletType", propOrder = {
    "value"
})
public class MatappletType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The value. */
    @XmlValue
    protected String value;
    
    /** The label. */
    @XmlAttribute
    protected String label;
    
    /** The uri. */
    @XmlAttribute
    protected String uri;
    
    /** The y0. */
    @XmlAttribute
    protected String y0;
    
    /** The height. */
    @XmlAttribute
    protected String height;
    
    /** The width. */
    @XmlAttribute
    protected String width;
    
    /** The x0. */
    @XmlAttribute
    protected String x0;
    
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
     * Gets the y0.
     * 
     * @return the y0
     */
    public String getY0() {
        return y0;
    }

    /**
     * Sets the y0.
     * 
     * @param value the new y0
     */
    public void setY0(String value) {
        this.y0 = value;
    }

    /**
     * Gets the height.
     * 
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the height.
     * 
     * @param value the new height
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the width.
     * 
     * @return the width
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the width.
     * 
     * @param value the new width
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the x0.
     * 
     * @return the x0
     */
    public String getX0() {
        return x0;
    }

    /**
     * Sets the x0.
     * 
     * @param value the new x0
     */
    public void setX0(String value) {
        this.x0 = value;
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
