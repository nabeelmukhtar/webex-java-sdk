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
 * The Class IntegrationType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The outlook. */
    protected Boolean outlook;
    
    /** The lotus notes. */
    protected Boolean lotusNotes;
    
    /** The one click. */
    protected Boolean oneClick;
    
    /** The show sys tray icon. */
    protected Boolean showSysTrayIcon;
    
    /** The office. */
    protected Boolean office;
    
    /** The excel. */
    protected Boolean excel;
    
    /** The power point. */
    protected Boolean powerPoint;
    
    /** The word. */
    protected Boolean word;
    
    /** The ie. */
    @XmlElement(name = "IE")
    protected Boolean ie;
    
    /** The firefox. */
    protected Boolean firefox;
    
    /** The explorer right click. */
    protected Boolean explorerRightClick;
    
    /** The instant messenger. */
    protected Boolean instantMessenger;
    
    /** The aol messenger. */
    protected Boolean aolMessenger;
    
    /** The google talk. */
    protected Boolean googleTalk;
    
    /** The lotus sametime. */
    protected Boolean lotusSametime;
    
    /** The skype. */
    protected Boolean skype;
    
    /** The windows messenger. */
    protected Boolean windowsMessenger;
    
    /** The yahoo messenger. */
    protected Boolean yahooMessenger;
    
    /** The cisco ip phone. */
    protected Boolean ciscoIPPhone;
    
    /** The cisco cuaeurl. */
    protected String ciscoCUAEURL;
    
    /** The pc now. */
    protected Boolean pcNow;
    
    /** The i google. */
    protected Boolean iGoogle;
    
    /** The i phone dusting. */
    protected Boolean iPhoneDusting;
    
    /** The cumaurl. */
    @XmlElement(name = "CUMAURL")
    protected String cumaurl;

    /**
     * Checks if is outlook.
     * 
     * @return the boolean
     */
    public Boolean isOutlook() {
        return outlook;
    }

    /**
     * Sets the outlook.
     * 
     * @param value the new outlook
     */
    public void setOutlook(Boolean value) {
        this.outlook = value;
    }

    /**
     * Checks if is lotus notes.
     * 
     * @return the boolean
     */
    public Boolean isLotusNotes() {
        return lotusNotes;
    }

    /**
     * Sets the lotus notes.
     * 
     * @param value the new lotus notes
     */
    public void setLotusNotes(Boolean value) {
        this.lotusNotes = value;
    }

    /**
     * Checks if is one click.
     * 
     * @return the boolean
     */
    public Boolean isOneClick() {
        return oneClick;
    }

    /**
     * Sets the one click.
     * 
     * @param value the new one click
     */
    public void setOneClick(Boolean value) {
        this.oneClick = value;
    }

    /**
     * Checks if is show sys tray icon.
     * 
     * @return the boolean
     */
    public Boolean isShowSysTrayIcon() {
        return showSysTrayIcon;
    }

    /**
     * Sets the show sys tray icon.
     * 
     * @param value the new show sys tray icon
     */
    public void setShowSysTrayIcon(Boolean value) {
        this.showSysTrayIcon = value;
    }

    /**
     * Checks if is office.
     * 
     * @return the boolean
     */
    public Boolean isOffice() {
        return office;
    }

    /**
     * Sets the office.
     * 
     * @param value the new office
     */
    public void setOffice(Boolean value) {
        this.office = value;
    }

    /**
     * Checks if is excel.
     * 
     * @return the boolean
     */
    public Boolean isExcel() {
        return excel;
    }

    /**
     * Sets the excel.
     * 
     * @param value the new excel
     */
    public void setExcel(Boolean value) {
        this.excel = value;
    }

    /**
     * Checks if is power point.
     * 
     * @return the boolean
     */
    public Boolean isPowerPoint() {
        return powerPoint;
    }

    /**
     * Sets the power point.
     * 
     * @param value the new power point
     */
    public void setPowerPoint(Boolean value) {
        this.powerPoint = value;
    }

    /**
     * Checks if is word.
     * 
     * @return the boolean
     */
    public Boolean isWord() {
        return word;
    }

    /**
     * Sets the word.
     * 
     * @param value the new word
     */
    public void setWord(Boolean value) {
        this.word = value;
    }

    /**
     * Checks if is ie.
     * 
     * @return the boolean
     */
    public Boolean isIE() {
        return ie;
    }

    /**
     * Sets the iE.
     * 
     * @param value the new iE
     */
    public void setIE(Boolean value) {
        this.ie = value;
    }

    /**
     * Checks if is firefox.
     * 
     * @return the boolean
     */
    public Boolean isFirefox() {
        return firefox;
    }

    /**
     * Sets the firefox.
     * 
     * @param value the new firefox
     */
    public void setFirefox(Boolean value) {
        this.firefox = value;
    }

    /**
     * Checks if is explorer right click.
     * 
     * @return the boolean
     */
    public Boolean isExplorerRightClick() {
        return explorerRightClick;
    }

    /**
     * Sets the explorer right click.
     * 
     * @param value the new explorer right click
     */
    public void setExplorerRightClick(Boolean value) {
        this.explorerRightClick = value;
    }

    /**
     * Checks if is instant messenger.
     * 
     * @return the boolean
     */
    public Boolean isInstantMessenger() {
        return instantMessenger;
    }

    /**
     * Sets the instant messenger.
     * 
     * @param value the new instant messenger
     */
    public void setInstantMessenger(Boolean value) {
        this.instantMessenger = value;
    }

    /**
     * Checks if is aol messenger.
     * 
     * @return the boolean
     */
    public Boolean isAolMessenger() {
        return aolMessenger;
    }

    /**
     * Sets the aol messenger.
     * 
     * @param value the new aol messenger
     */
    public void setAolMessenger(Boolean value) {
        this.aolMessenger = value;
    }

    /**
     * Checks if is google talk.
     * 
     * @return the boolean
     */
    public Boolean isGoogleTalk() {
        return googleTalk;
    }

    /**
     * Sets the google talk.
     * 
     * @param value the new google talk
     */
    public void setGoogleTalk(Boolean value) {
        this.googleTalk = value;
    }

    /**
     * Checks if is lotus sametime.
     * 
     * @return the boolean
     */
    public Boolean isLotusSametime() {
        return lotusSametime;
    }

    /**
     * Sets the lotus sametime.
     * 
     * @param value the new lotus sametime
     */
    public void setLotusSametime(Boolean value) {
        this.lotusSametime = value;
    }

    /**
     * Checks if is skype.
     * 
     * @return the boolean
     */
    public Boolean isSkype() {
        return skype;
    }

    /**
     * Sets the skype.
     * 
     * @param value the new skype
     */
    public void setSkype(Boolean value) {
        this.skype = value;
    }

    /**
     * Checks if is windows messenger.
     * 
     * @return the boolean
     */
    public Boolean isWindowsMessenger() {
        return windowsMessenger;
    }

    /**
     * Sets the windows messenger.
     * 
     * @param value the new windows messenger
     */
    public void setWindowsMessenger(Boolean value) {
        this.windowsMessenger = value;
    }

    /**
     * Checks if is yahoo messenger.
     * 
     * @return the boolean
     */
    public Boolean isYahooMessenger() {
        return yahooMessenger;
    }

    /**
     * Sets the yahoo messenger.
     * 
     * @param value the new yahoo messenger
     */
    public void setYahooMessenger(Boolean value) {
        this.yahooMessenger = value;
    }

    /**
     * Checks if is cisco ip phone.
     * 
     * @return the boolean
     */
    public Boolean isCiscoIPPhone() {
        return ciscoIPPhone;
    }

    /**
     * Sets the cisco ip phone.
     * 
     * @param value the new cisco ip phone
     */
    public void setCiscoIPPhone(Boolean value) {
        this.ciscoIPPhone = value;
    }

    /**
     * Gets the cisco cuaeurl.
     * 
     * @return the cisco cuaeurl
     */
    public String getCiscoCUAEURL() {
        return ciscoCUAEURL;
    }

    /**
     * Sets the cisco cuaeurl.
     * 
     * @param value the new cisco cuaeurl
     */
    public void setCiscoCUAEURL(String value) {
        this.ciscoCUAEURL = value;
    }

    /**
     * Checks if is pc now.
     * 
     * @return the boolean
     */
    public Boolean isPcNow() {
        return pcNow;
    }

    /**
     * Sets the pc now.
     * 
     * @param value the new pc now
     */
    public void setPcNow(Boolean value) {
        this.pcNow = value;
    }

    /**
     * Checks if is i google.
     * 
     * @return the boolean
     */
    public Boolean isIGoogle() {
        return iGoogle;
    }

    /**
     * Sets the i google.
     * 
     * @param value the new i google
     */
    public void setIGoogle(Boolean value) {
        this.iGoogle = value;
    }

    /**
     * Checks if is i phone dusting.
     * 
     * @return the boolean
     */
    public Boolean isIPhoneDusting() {
        return iPhoneDusting;
    }

    /**
     * Sets the i phone dusting.
     * 
     * @param value the new i phone dusting
     */
    public void setIPhoneDusting(Boolean value) {
        this.iPhoneDusting = value;
    }

    /**
     * Gets the cUMAURL.
     * 
     * @return the cUMAURL
     */
    public String getCUMAURL() {
        return cumaurl;
    }

    /**
     * Sets the cUMAURL.
     * 
     * @param value the new cUMAURL
     */
    public void setCUMAURL(String value) {
        this.cumaurl = value;
    }

}
