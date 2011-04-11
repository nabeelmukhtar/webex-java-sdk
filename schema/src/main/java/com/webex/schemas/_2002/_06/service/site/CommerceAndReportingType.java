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
 * The Class CommerceAndReportingType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commerceAndReportingType", propOrder = {
    "trackingCode",
    "siteAdminReport",
    "subScriptionService",
    "isECommmerce",
    "conferencePrice",
    "callInPrice",
    "callInTollFreePrice",
    "callOutPrice",
    "voIPPrice",
    "creditCardAuthorRetries",
    "customereCommerce",
    "isLocalTax",
    "localTaxName",
    "localTaxtRate",
    "holReport"
})
public class CommerceAndReportingType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The tracking code. */
    protected Boolean trackingCode;
    
    /** The site admin report. */
    protected Boolean siteAdminReport;
    
    /** The sub scription service. */
    protected Boolean subScriptionService;
    
    /** The is e commmerce. */
    protected Boolean isECommmerce;
    
    /** The conference price. */
    protected Float conferencePrice;
    
    /** The call in price. */
    protected Float callInPrice;
    
    /** The call in toll free price. */
    protected Float callInTollFreePrice;
    
    /** The call out price. */
    protected Float callOutPrice;
    
    /** The vo ip price. */
    protected Float voIPPrice;
    
    /** The credit card author retries. */
    protected Long creditCardAuthorRetries;
    
    /** The customere commerce. */
    protected Boolean customereCommerce;
    
    /** The is local tax. */
    protected Boolean isLocalTax;
    
    /** The local tax name. */
    protected String localTaxName;
    
    /** The local taxt rate. */
    protected Float localTaxtRate;
    
    /** The hol report. */
    protected Long holReport;

    /**
     * Checks if is tracking code.
     * 
     * @return the boolean
     */
    public Boolean isTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the tracking code.
     * 
     * @param value the new tracking code
     */
    public void setTrackingCode(Boolean value) {
        this.trackingCode = value;
    }

    /**
     * Checks if is site admin report.
     * 
     * @return the boolean
     */
    public Boolean isSiteAdminReport() {
        return siteAdminReport;
    }

    /**
     * Sets the site admin report.
     * 
     * @param value the new site admin report
     */
    public void setSiteAdminReport(Boolean value) {
        this.siteAdminReport = value;
    }

    /**
     * Checks if is sub scription service.
     * 
     * @return the boolean
     */
    public Boolean isSubScriptionService() {
        return subScriptionService;
    }

    /**
     * Sets the sub scription service.
     * 
     * @param value the new sub scription service
     */
    public void setSubScriptionService(Boolean value) {
        this.subScriptionService = value;
    }

    /**
     * Checks if is is e commmerce.
     * 
     * @return the boolean
     */
    public Boolean isIsECommmerce() {
        return isECommmerce;
    }

    /**
     * Sets the checks if is e commmerce.
     * 
     * @param value the new checks if is e commmerce
     */
    public void setIsECommmerce(Boolean value) {
        this.isECommmerce = value;
    }

    /**
     * Gets the conference price.
     * 
     * @return the conference price
     */
    public Float getConferencePrice() {
        return conferencePrice;
    }

    /**
     * Sets the conference price.
     * 
     * @param value the new conference price
     */
    public void setConferencePrice(Float value) {
        this.conferencePrice = value;
    }

    /**
     * Gets the call in price.
     * 
     * @return the call in price
     */
    public Float getCallInPrice() {
        return callInPrice;
    }

    /**
     * Sets the call in price.
     * 
     * @param value the new call in price
     */
    public void setCallInPrice(Float value) {
        this.callInPrice = value;
    }

    /**
     * Gets the call in toll free price.
     * 
     * @return the call in toll free price
     */
    public Float getCallInTollFreePrice() {
        return callInTollFreePrice;
    }

    /**
     * Sets the call in toll free price.
     * 
     * @param value the new call in toll free price
     */
    public void setCallInTollFreePrice(Float value) {
        this.callInTollFreePrice = value;
    }

    /**
     * Gets the call out price.
     * 
     * @return the call out price
     */
    public Float getCallOutPrice() {
        return callOutPrice;
    }

    /**
     * Sets the call out price.
     * 
     * @param value the new call out price
     */
    public void setCallOutPrice(Float value) {
        this.callOutPrice = value;
    }

    /**
     * Gets the vo ip price.
     * 
     * @return the vo ip price
     */
    public Float getVoIPPrice() {
        return voIPPrice;
    }

    /**
     * Sets the vo ip price.
     * 
     * @param value the new vo ip price
     */
    public void setVoIPPrice(Float value) {
        this.voIPPrice = value;
    }

    /**
     * Gets the credit card author retries.
     * 
     * @return the credit card author retries
     */
    public Long getCreditCardAuthorRetries() {
        return creditCardAuthorRetries;
    }

    /**
     * Sets the credit card author retries.
     * 
     * @param value the new credit card author retries
     */
    public void setCreditCardAuthorRetries(Long value) {
        this.creditCardAuthorRetries = value;
    }

    /**
     * Checks if is customere commerce.
     * 
     * @return the boolean
     */
    public Boolean isCustomereCommerce() {
        return customereCommerce;
    }

    /**
     * Sets the customere commerce.
     * 
     * @param value the new customere commerce
     */
    public void setCustomereCommerce(Boolean value) {
        this.customereCommerce = value;
    }

    /**
     * Checks if is is local tax.
     * 
     * @return the boolean
     */
    public Boolean isIsLocalTax() {
        return isLocalTax;
    }

    /**
     * Sets the checks if is local tax.
     * 
     * @param value the new checks if is local tax
     */
    public void setIsLocalTax(Boolean value) {
        this.isLocalTax = value;
    }

    /**
     * Gets the local tax name.
     * 
     * @return the local tax name
     */
    public String getLocalTaxName() {
        return localTaxName;
    }

    /**
     * Sets the local tax name.
     * 
     * @param value the new local tax name
     */
    public void setLocalTaxName(String value) {
        this.localTaxName = value;
    }

    /**
     * Gets the local taxt rate.
     * 
     * @return the local taxt rate
     */
    public Float getLocalTaxtRate() {
        return localTaxtRate;
    }

    /**
     * Sets the local taxt rate.
     * 
     * @param value the new local taxt rate
     */
    public void setLocalTaxtRate(Float value) {
        this.localTaxtRate = value;
    }

    /**
     * Gets the hol report.
     * 
     * @return the hol report
     */
    public Long getHolReport() {
        return holReport;
    }

    /**
     * Sets the hol report.
     * 
     * @param value the new hol report
     */
    public void setHolReport(Long value) {
        this.holReport = value;
    }

}
