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
 * The Class MyWebExBarType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "myWebExBarType", propOrder = {
    "customLinks",
    "partnerLinks",
    "partnerIntegration",
    "support",
    "training"
})
public class MyWebExBarType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The custom links. */
    protected CustomLinkType customLinks;
    
    /** The partner links. */
    protected PartnerLinkType partnerLinks;
    
    /** The partner integration. */
    protected Boolean partnerIntegration;
    
    /** The support. */
    protected UrlType support;
    
    /** The training. */
    protected UrlType training;

    /**
     * Gets the custom links.
     * 
     * @return the custom links
     */
    public CustomLinkType getCustomLinks() {
        return customLinks;
    }

    /**
     * Sets the custom links.
     * 
     * @param value the new custom links
     */
    public void setCustomLinks(CustomLinkType value) {
        this.customLinks = value;
    }

    /**
     * Gets the partner links.
     * 
     * @return the partner links
     */
    public PartnerLinkType getPartnerLinks() {
        return partnerLinks;
    }

    /**
     * Sets the partner links.
     * 
     * @param value the new partner links
     */
    public void setPartnerLinks(PartnerLinkType value) {
        this.partnerLinks = value;
    }

    /**
     * Checks if is partner integration.
     * 
     * @return the boolean
     */
    public Boolean isPartnerIntegration() {
        return partnerIntegration;
    }

    /**
     * Sets the partner integration.
     * 
     * @param value the new partner integration
     */
    public void setPartnerIntegration(Boolean value) {
        this.partnerIntegration = value;
    }

    /**
     * Gets the support.
     * 
     * @return the support
     */
    public UrlType getSupport() {
        return support;
    }

    /**
     * Sets the support.
     * 
     * @param value the new support
     */
    public void setSupport(UrlType value) {
        this.support = value;
    }

    /**
     * Gets the training.
     * 
     * @return the training
     */
    public UrlType getTraining() {
        return training;
    }

    /**
     * Sets the training.
     * 
     * @param value the new training
     */
    public void setTraining(UrlType value) {
        this.training = value;
    }

}
