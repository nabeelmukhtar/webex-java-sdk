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
 * <p>Java class for myWebExBarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="myWebExBarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customLinks" type="{http://www.webex.com/schemas/2002/06/service/site}customLinkType" minOccurs="0"/>
 *         &lt;element name="partnerLinks" type="{http://www.webex.com/schemas/2002/06/service/site}partnerLinkType" minOccurs="0"/>
 *         &lt;element name="partnerIntegration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="support" type="{http://www.webex.com/schemas/2002/06/service/site}urlType" minOccurs="0"/>
 *         &lt;element name="training" type="{http://www.webex.com/schemas/2002/06/service/site}urlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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

    private final static long serialVersionUID = 2461660169443089969L;
    protected CustomLinkType customLinks;
    protected PartnerLinkType partnerLinks;
    protected Boolean partnerIntegration;
    protected UrlType support;
    protected UrlType training;

    /**
     * Gets the value of the customLinks property.
     * 
     * @return
     *     possible object is
     *     {@link CustomLinkType }
     *     
     */
    public CustomLinkType getCustomLinks() {
        return customLinks;
    }

    /**
     * Sets the value of the customLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLinkType }
     *     
     */
    public void setCustomLinks(CustomLinkType value) {
        this.customLinks = value;
    }

    /**
     * Gets the value of the partnerLinks property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerLinkType }
     *     
     */
    public PartnerLinkType getPartnerLinks() {
        return partnerLinks;
    }

    /**
     * Sets the value of the partnerLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerLinkType }
     *     
     */
    public void setPartnerLinks(PartnerLinkType value) {
        this.partnerLinks = value;
    }

    /**
     * Gets the value of the partnerIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartnerIntegration() {
        return partnerIntegration;
    }

    /**
     * Sets the value of the partnerIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartnerIntegration(Boolean value) {
        this.partnerIntegration = value;
    }

    /**
     * Gets the value of the support property.
     * 
     * @return
     *     possible object is
     *     {@link UrlType }
     *     
     */
    public UrlType getSupport() {
        return support;
    }

    /**
     * Sets the value of the support property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlType }
     *     
     */
    public void setSupport(UrlType value) {
        this.support = value;
    }

    /**
     * Gets the value of the training property.
     * 
     * @return
     *     possible object is
     *     {@link UrlType }
     *     
     */
    public UrlType getTraining() {
        return training;
    }

    /**
     * Sets the value of the training property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlType }
     *     
     */
    public void setTraining(UrlType value) {
        this.training = value;
    }

}
