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
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class GetSiteResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSiteResponse", propOrder = {
    "siteInstance"
})
public class GetSiteResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The site instance. */
    @XmlElement(required = true)
    protected SiteType siteInstance;

    /**
     * Gets the site instance.
     * 
     * @return the site instance
     */
    public SiteType getSiteInstance() {
        return siteInstance;
    }

    /**
     * Sets the site instance.
     * 
     * @param value the new site instance
     */
    public void setSiteInstance(SiteType value) {
        this.siteInstance = value;
    }

}
