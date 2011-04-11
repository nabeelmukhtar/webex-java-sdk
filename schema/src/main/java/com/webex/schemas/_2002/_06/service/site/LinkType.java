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
import javax.xml.bind.annotation.XmlType;


/**
 * The Class LinkType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkType", propOrder = {
    "name",
    "url",
    "target",
    "iconURL"
})
public class LinkType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The name. */
    protected String name;
    
    /** The url. */
    protected String url;
    
    /** The target. */
    protected WindowTargetType target;
    
    /** The icon url. */
    protected String iconURL;

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
     * Gets the url.
     * 
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url.
     * 
     * @param value the new url
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the target.
     * 
     * @return the target
     */
    public WindowTargetType getTarget() {
        return target;
    }

    /**
     * Sets the target.
     * 
     * @param value the new target
     */
    public void setTarget(WindowTargetType value) {
        this.target = value;
    }

    /**
     * Gets the icon url.
     * 
     * @return the icon url
     */
    public String getIconURL() {
        return iconURL;
    }

    /**
     * Sets the icon url.
     * 
     * @param value the new icon url
     */
    public void setIconURL(String value) {
        this.iconURL = value;
    }

}
