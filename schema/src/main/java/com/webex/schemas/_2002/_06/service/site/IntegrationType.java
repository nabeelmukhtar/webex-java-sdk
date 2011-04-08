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


/**
 * <p>Java class for integrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="integrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outlook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lotusNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="oneClick" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showSysTrayIcon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="office" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="powerPoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="word" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="firefox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="explorerRightClick" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="instantMessenger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="aolMessenger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="googleTalk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lotusSametime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="skype" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="windowsMessenger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="yahooMessenger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ciscoIPPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ciscoCUAEURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcNow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iGoogle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iPhoneDusting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CUMAURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "integrationType", propOrder = {
    "outlook",
    "lotusNotes",
    "oneClick",
    "showSysTrayIcon",
    "office",
    "excel",
    "powerPoint",
    "word",
    "ie",
    "firefox",
    "explorerRightClick",
    "instantMessenger",
    "aolMessenger",
    "googleTalk",
    "lotusSametime",
    "skype",
    "windowsMessenger",
    "yahooMessenger",
    "ciscoIPPhone",
    "ciscoCUAEURL",
    "pcNow",
    "iGoogle",
    "iPhoneDusting",
    "cumaurl"
})
public class IntegrationType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean outlook;
    protected Boolean lotusNotes;
    protected Boolean oneClick;
    protected Boolean showSysTrayIcon;
    protected Boolean office;
    protected Boolean excel;
    protected Boolean powerPoint;
    protected Boolean word;
    @XmlElement(name = "IE")
    protected Boolean ie;
    protected Boolean firefox;
    protected Boolean explorerRightClick;
    protected Boolean instantMessenger;
    protected Boolean aolMessenger;
    protected Boolean googleTalk;
    protected Boolean lotusSametime;
    protected Boolean skype;
    protected Boolean windowsMessenger;
    protected Boolean yahooMessenger;
    protected Boolean ciscoIPPhone;
    protected String ciscoCUAEURL;
    protected Boolean pcNow;
    protected Boolean iGoogle;
    protected Boolean iPhoneDusting;
    @XmlElement(name = "CUMAURL")
    protected String cumaurl;

    /**
     * Gets the value of the outlook property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutlook() {
        return outlook;
    }

    /**
     * Sets the value of the outlook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutlook(Boolean value) {
        this.outlook = value;
    }

    /**
     * Gets the value of the lotusNotes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLotusNotes() {
        return lotusNotes;
    }

    /**
     * Sets the value of the lotusNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLotusNotes(Boolean value) {
        this.lotusNotes = value;
    }

    /**
     * Gets the value of the oneClick property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneClick() {
        return oneClick;
    }

    /**
     * Sets the value of the oneClick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneClick(Boolean value) {
        this.oneClick = value;
    }

    /**
     * Gets the value of the showSysTrayIcon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSysTrayIcon() {
        return showSysTrayIcon;
    }

    /**
     * Sets the value of the showSysTrayIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSysTrayIcon(Boolean value) {
        this.showSysTrayIcon = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffice(Boolean value) {
        this.office = value;
    }

    /**
     * Gets the value of the excel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcel() {
        return excel;
    }

    /**
     * Sets the value of the excel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcel(Boolean value) {
        this.excel = value;
    }

    /**
     * Gets the value of the powerPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerPoint() {
        return powerPoint;
    }

    /**
     * Sets the value of the powerPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerPoint(Boolean value) {
        this.powerPoint = value;
    }

    /**
     * Gets the value of the word property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWord() {
        return word;
    }

    /**
     * Sets the value of the word property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWord(Boolean value) {
        this.word = value;
    }

    /**
     * Gets the value of the ie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIE() {
        return ie;
    }

    /**
     * Sets the value of the ie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIE(Boolean value) {
        this.ie = value;
    }

    /**
     * Gets the value of the firefox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirefox() {
        return firefox;
    }

    /**
     * Sets the value of the firefox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirefox(Boolean value) {
        this.firefox = value;
    }

    /**
     * Gets the value of the explorerRightClick property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExplorerRightClick() {
        return explorerRightClick;
    }

    /**
     * Sets the value of the explorerRightClick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExplorerRightClick(Boolean value) {
        this.explorerRightClick = value;
    }

    /**
     * Gets the value of the instantMessenger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstantMessenger() {
        return instantMessenger;
    }

    /**
     * Sets the value of the instantMessenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantMessenger(Boolean value) {
        this.instantMessenger = value;
    }

    /**
     * Gets the value of the aolMessenger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAolMessenger() {
        return aolMessenger;
    }

    /**
     * Sets the value of the aolMessenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAolMessenger(Boolean value) {
        this.aolMessenger = value;
    }

    /**
     * Gets the value of the googleTalk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoogleTalk() {
        return googleTalk;
    }

    /**
     * Sets the value of the googleTalk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoogleTalk(Boolean value) {
        this.googleTalk = value;
    }

    /**
     * Gets the value of the lotusSametime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLotusSametime() {
        return lotusSametime;
    }

    /**
     * Sets the value of the lotusSametime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLotusSametime(Boolean value) {
        this.lotusSametime = value;
    }

    /**
     * Gets the value of the skype property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkype() {
        return skype;
    }

    /**
     * Sets the value of the skype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkype(Boolean value) {
        this.skype = value;
    }

    /**
     * Gets the value of the windowsMessenger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWindowsMessenger() {
        return windowsMessenger;
    }

    /**
     * Sets the value of the windowsMessenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWindowsMessenger(Boolean value) {
        this.windowsMessenger = value;
    }

    /**
     * Gets the value of the yahooMessenger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYahooMessenger() {
        return yahooMessenger;
    }

    /**
     * Sets the value of the yahooMessenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYahooMessenger(Boolean value) {
        this.yahooMessenger = value;
    }

    /**
     * Gets the value of the ciscoIPPhone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCiscoIPPhone() {
        return ciscoIPPhone;
    }

    /**
     * Sets the value of the ciscoIPPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCiscoIPPhone(Boolean value) {
        this.ciscoIPPhone = value;
    }

    /**
     * Gets the value of the ciscoCUAEURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiscoCUAEURL() {
        return ciscoCUAEURL;
    }

    /**
     * Sets the value of the ciscoCUAEURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiscoCUAEURL(String value) {
        this.ciscoCUAEURL = value;
    }

    /**
     * Gets the value of the pcNow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPcNow() {
        return pcNow;
    }

    /**
     * Sets the value of the pcNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPcNow(Boolean value) {
        this.pcNow = value;
    }

    /**
     * Gets the value of the iGoogle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIGoogle() {
        return iGoogle;
    }

    /**
     * Sets the value of the iGoogle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIGoogle(Boolean value) {
        this.iGoogle = value;
    }

    /**
     * Gets the value of the iPhoneDusting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPhoneDusting() {
        return iPhoneDusting;
    }

    /**
     * Sets the value of the iPhoneDusting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIPhoneDusting(Boolean value) {
        this.iPhoneDusting = value;
    }

    /**
     * Gets the value of the cumaurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUMAURL() {
        return cumaurl;
    }

    /**
     * Sets the value of the cumaurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUMAURL(String value) {
        this.cumaurl = value;
    }

}
