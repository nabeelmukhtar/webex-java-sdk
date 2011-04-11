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
 * The Class DisplayTypeType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The prod svc announce. */
    protected Boolean prodSvcAnnounce;
    
    /** The training info. */
    protected Boolean trainingInfo;
    
    /** The e newsletters. */
    protected Boolean eNewsletters;
    
    /** The promotions offers. */
    protected Boolean promotionsOffers;
    
    /** The press releases. */
    protected Boolean pressReleases;

    /**
     * Checks if is prod svc announce.
     * 
     * @return the boolean
     */
    public Boolean isProdSvcAnnounce() {
        return prodSvcAnnounce;
    }

    /**
     * Sets the prod svc announce.
     * 
     * @param value the new prod svc announce
     */
    public void setProdSvcAnnounce(Boolean value) {
        this.prodSvcAnnounce = value;
    }

    /**
     * Checks if is training info.
     * 
     * @return the boolean
     */
    public Boolean isTrainingInfo() {
        return trainingInfo;
    }

    /**
     * Sets the training info.
     * 
     * @param value the new training info
     */
    public void setTrainingInfo(Boolean value) {
        this.trainingInfo = value;
    }

    /**
     * Checks if is e newsletters.
     * 
     * @return the boolean
     */
    public Boolean isENewsletters() {
        return eNewsletters;
    }

    /**
     * Sets the e newsletters.
     * 
     * @param value the new e newsletters
     */
    public void setENewsletters(Boolean value) {
        this.eNewsletters = value;
    }

    /**
     * Checks if is promotions offers.
     * 
     * @return the boolean
     */
    public Boolean isPromotionsOffers() {
        return promotionsOffers;
    }

    /**
     * Sets the promotions offers.
     * 
     * @param value the new promotions offers
     */
    public void setPromotionsOffers(Boolean value) {
        this.promotionsOffers = value;
    }

    /**
     * Checks if is press releases.
     * 
     * @return the boolean
     */
    public Boolean isPressReleases() {
        return pressReleases;
    }

    /**
     * Sets the press releases.
     * 
     * @param value the new press releases
     */
    public void setPressReleases(Boolean value) {
        this.pressReleases = value;
    }

}
