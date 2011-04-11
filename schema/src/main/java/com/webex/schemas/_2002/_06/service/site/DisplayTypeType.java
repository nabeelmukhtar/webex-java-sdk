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
 * <p>Java class for displayTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prodSvcAnnounce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainingInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eNewsletters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="promotionsOffers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pressReleases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayTypeType", propOrder = {
    "prodSvcAnnounce",
    "trainingInfo",
    "eNewsletters",
    "promotionsOffers",
    "pressReleases"
})
public class DisplayTypeType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean prodSvcAnnounce;
    protected Boolean trainingInfo;
    protected Boolean eNewsletters;
    protected Boolean promotionsOffers;
    protected Boolean pressReleases;

    /**
     * Gets the value of the prodSvcAnnounce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProdSvcAnnounce() {
        return prodSvcAnnounce;
    }

    /**
     * Sets the value of the prodSvcAnnounce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProdSvcAnnounce(Boolean value) {
        this.prodSvcAnnounce = value;
    }

    /**
     * Gets the value of the trainingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrainingInfo() {
        return trainingInfo;
    }

    /**
     * Sets the value of the trainingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrainingInfo(Boolean value) {
        this.trainingInfo = value;
    }

    /**
     * Gets the value of the eNewsletters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isENewsletters() {
        return eNewsletters;
    }

    /**
     * Sets the value of the eNewsletters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setENewsletters(Boolean value) {
        this.eNewsletters = value;
    }

    /**
     * Gets the value of the promotionsOffers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotionsOffers() {
        return promotionsOffers;
    }

    /**
     * Sets the value of the promotionsOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotionsOffers(Boolean value) {
        this.promotionsOffers = value;
    }

    /**
     * Gets the value of the pressReleases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPressReleases() {
        return pressReleases;
    }

    /**
     * Sets the value of the pressReleases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPressReleases(Boolean value) {
        this.pressReleases = value;
    }

}
