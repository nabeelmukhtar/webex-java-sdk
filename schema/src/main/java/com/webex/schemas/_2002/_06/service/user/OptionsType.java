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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class OptionsType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optionsType", propOrder = {
    "firstNameVisible",
    "lastNameVisible",
    "addressVisible",
    "workPhoneVisible",
    "cellPhoneVisible",
    "pagerVisible",
    "faxVisible",
    "officeUrlVisible",
    "pictureVisible",
    "notifyOnNewMessage",
    "notifyOnMeeting",
    "followMeEnable",
    "emailVisible",
    "listInCategory",
    "titleVisible",
    "folderRead",
    "folderWrite",
    "messageVisible",
    "iconSelect1",
    "iconSelect2",
    "acceptLinkRequest",
    "holdOnLinkRequest",
    "notifyOnLinkRequest",
    "supportVideo",
    "supportApp",
    "supportFileShare",
    "supportDesktopShare",
    "supportMeetingRecord",
    "supportAppshareRemote",
    "supportWebTourRemote",
    "supportDesktopShareRemote",
    "subscriptionOffice"
})
public class OptionsType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The first name visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean firstNameVisible;
    
    /** The last name visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean lastNameVisible;
    
    /** The address visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean addressVisible;
    
    /** The work phone visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean workPhoneVisible;
    
    /** The cell phone visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean cellPhoneVisible;
    
    /** The pager visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean pagerVisible;
    
    /** The fax visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean faxVisible;
    
    /** The office url visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean officeUrlVisible;
    
    /** The picture visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean pictureVisible;
    
    /** The notify on new message. */
    @XmlElement(defaultValue = "false")
    protected Boolean notifyOnNewMessage;
    
    /** The notify on meeting. */
    @XmlElement(defaultValue = "false")
    protected Boolean notifyOnMeeting;
    
    /** The follow me enable. */
    @XmlElement(defaultValue = "false")
    protected Boolean followMeEnable;
    
    /** The email visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean emailVisible;
    
    /** The list in category. */
    @XmlElement(defaultValue = "false")
    protected Boolean listInCategory;
    
    /** The title visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean titleVisible;
    
    /** The folder read. */
    @XmlElement(defaultValue = "false")
    protected Boolean folderRead;
    
    /** The folder write. */
    @XmlElement(defaultValue = "false")
    protected Boolean folderWrite;
    
    /** The message visible. */
    @XmlElement(defaultValue = "false")
    protected Boolean messageVisible;
    
    /** The icon select1. */
    @XmlElement(defaultValue = "false")
    protected Boolean iconSelect1;
    
    /** The icon select2. */
    @XmlElement(defaultValue = "false")
    protected Boolean iconSelect2;
    
    /** The accept link request. */
    @XmlElement(defaultValue = "false")
    protected Boolean acceptLinkRequest;
    
    /** The hold on link request. */
    @XmlElement(defaultValue = "false")
    protected Boolean holdOnLinkRequest;
    
    /** The notify on link request. */
    @XmlElement(defaultValue = "false")
    protected Boolean notifyOnLinkRequest;
    
    /** The support video. */
    @XmlElement(defaultValue = "false")
    protected Boolean supportVideo;
    
    /** The support app. */
    @XmlElement(defaultValue = "false")
    protected Boolean supportApp;
    
    /** The support file share. */
    @XmlElement(defaultValue = "false")
    protected Boolean supportFileShare;
    
    /** The support desktop share. */
    @XmlElement(defaultValue = "false")
    protected Boolean supportDesktopShare;
    
    /** The support meeting record. */
    @XmlElement(defaultValue = "false")
    protected Boolean supportMeetingRecord;
    
    /** The support appshare remote. */
    @XmlElement(defaultValue = "false")
    protected Boolean supportAppshareRemote;
    
    /** The support web tour remote. */
    @XmlElement(defaultValue = "false")
    protected Boolean supportWebTourRemote;
    
    /** The support desktop share remote. */
    @XmlElement(defaultValue = "false")
    protected Boolean supportDesktopShareRemote;
    
    /** The subscription office. */
    @XmlElement(defaultValue = "false")
    protected Boolean subscriptionOffice;

    /**
     * Checks if is first name visible.
     * 
     * @return the boolean
     */
    public Boolean isFirstNameVisible() {
        return firstNameVisible;
    }

    /**
     * Sets the first name visible.
     * 
     * @param value the new first name visible
     */
    public void setFirstNameVisible(Boolean value) {
        this.firstNameVisible = value;
    }

    /**
     * Checks if is last name visible.
     * 
     * @return the boolean
     */
    public Boolean isLastNameVisible() {
        return lastNameVisible;
    }

    /**
     * Sets the last name visible.
     * 
     * @param value the new last name visible
     */
    public void setLastNameVisible(Boolean value) {
        this.lastNameVisible = value;
    }

    /**
     * Checks if is address visible.
     * 
     * @return the boolean
     */
    public Boolean isAddressVisible() {
        return addressVisible;
    }

    /**
     * Sets the address visible.
     * 
     * @param value the new address visible
     */
    public void setAddressVisible(Boolean value) {
        this.addressVisible = value;
    }

    /**
     * Checks if is work phone visible.
     * 
     * @return the boolean
     */
    public Boolean isWorkPhoneVisible() {
        return workPhoneVisible;
    }

    /**
     * Sets the work phone visible.
     * 
     * @param value the new work phone visible
     */
    public void setWorkPhoneVisible(Boolean value) {
        this.workPhoneVisible = value;
    }

    /**
     * Checks if is cell phone visible.
     * 
     * @return the boolean
     */
    public Boolean isCellPhoneVisible() {
        return cellPhoneVisible;
    }

    /**
     * Sets the cell phone visible.
     * 
     * @param value the new cell phone visible
     */
    public void setCellPhoneVisible(Boolean value) {
        this.cellPhoneVisible = value;
    }

    /**
     * Checks if is pager visible.
     * 
     * @return the boolean
     */
    public Boolean isPagerVisible() {
        return pagerVisible;
    }

    /**
     * Sets the pager visible.
     * 
     * @param value the new pager visible
     */
    public void setPagerVisible(Boolean value) {
        this.pagerVisible = value;
    }

    /**
     * Checks if is fax visible.
     * 
     * @return the boolean
     */
    public Boolean isFaxVisible() {
        return faxVisible;
    }

    /**
     * Sets the fax visible.
     * 
     * @param value the new fax visible
     */
    public void setFaxVisible(Boolean value) {
        this.faxVisible = value;
    }

    /**
     * Checks if is office url visible.
     * 
     * @return the boolean
     */
    public Boolean isOfficeUrlVisible() {
        return officeUrlVisible;
    }

    /**
     * Sets the office url visible.
     * 
     * @param value the new office url visible
     */
    public void setOfficeUrlVisible(Boolean value) {
        this.officeUrlVisible = value;
    }

    /**
     * Checks if is picture visible.
     * 
     * @return the boolean
     */
    public Boolean isPictureVisible() {
        return pictureVisible;
    }

    /**
     * Sets the picture visible.
     * 
     * @param value the new picture visible
     */
    public void setPictureVisible(Boolean value) {
        this.pictureVisible = value;
    }

    /**
     * Checks if is notify on new message.
     * 
     * @return the boolean
     */
    public Boolean isNotifyOnNewMessage() {
        return notifyOnNewMessage;
    }

    /**
     * Sets the notify on new message.
     * 
     * @param value the new notify on new message
     */
    public void setNotifyOnNewMessage(Boolean value) {
        this.notifyOnNewMessage = value;
    }

    /**
     * Checks if is notify on meeting.
     * 
     * @return the boolean
     */
    public Boolean isNotifyOnMeeting() {
        return notifyOnMeeting;
    }

    /**
     * Sets the notify on meeting.
     * 
     * @param value the new notify on meeting
     */
    public void setNotifyOnMeeting(Boolean value) {
        this.notifyOnMeeting = value;
    }

    /**
     * Checks if is follow me enable.
     * 
     * @return the boolean
     */
    public Boolean isFollowMeEnable() {
        return followMeEnable;
    }

    /**
     * Sets the follow me enable.
     * 
     * @param value the new follow me enable
     */
    public void setFollowMeEnable(Boolean value) {
        this.followMeEnable = value;
    }

    /**
     * Checks if is email visible.
     * 
     * @return the boolean
     */
    public Boolean isEmailVisible() {
        return emailVisible;
    }

    /**
     * Sets the email visible.
     * 
     * @param value the new email visible
     */
    public void setEmailVisible(Boolean value) {
        this.emailVisible = value;
    }

    /**
     * Checks if is list in category.
     * 
     * @return the boolean
     */
    public Boolean isListInCategory() {
        return listInCategory;
    }

    /**
     * Sets the list in category.
     * 
     * @param value the new list in category
     */
    public void setListInCategory(Boolean value) {
        this.listInCategory = value;
    }

    /**
     * Checks if is title visible.
     * 
     * @return the boolean
     */
    public Boolean isTitleVisible() {
        return titleVisible;
    }

    /**
     * Sets the title visible.
     * 
     * @param value the new title visible
     */
    public void setTitleVisible(Boolean value) {
        this.titleVisible = value;
    }

    /**
     * Checks if is folder read.
     * 
     * @return the boolean
     */
    public Boolean isFolderRead() {
        return folderRead;
    }

    /**
     * Sets the folder read.
     * 
     * @param value the new folder read
     */
    public void setFolderRead(Boolean value) {
        this.folderRead = value;
    }

    /**
     * Checks if is folder write.
     * 
     * @return the boolean
     */
    public Boolean isFolderWrite() {
        return folderWrite;
    }

    /**
     * Sets the folder write.
     * 
     * @param value the new folder write
     */
    public void setFolderWrite(Boolean value) {
        this.folderWrite = value;
    }

    /**
     * Checks if is message visible.
     * 
     * @return the boolean
     */
    public Boolean isMessageVisible() {
        return messageVisible;
    }

    /**
     * Sets the message visible.
     * 
     * @param value the new message visible
     */
    public void setMessageVisible(Boolean value) {
        this.messageVisible = value;
    }

    /**
     * Checks if is icon select1.
     * 
     * @return the boolean
     */
    public Boolean isIconSelect1() {
        return iconSelect1;
    }

    /**
     * Sets the icon select1.
     * 
     * @param value the new icon select1
     */
    public void setIconSelect1(Boolean value) {
        this.iconSelect1 = value;
    }

    /**
     * Checks if is icon select2.
     * 
     * @return the boolean
     */
    public Boolean isIconSelect2() {
        return iconSelect2;
    }

    /**
     * Sets the icon select2.
     * 
     * @param value the new icon select2
     */
    public void setIconSelect2(Boolean value) {
        this.iconSelect2 = value;
    }

    /**
     * Checks if is accept link request.
     * 
     * @return the boolean
     */
    public Boolean isAcceptLinkRequest() {
        return acceptLinkRequest;
    }

    /**
     * Sets the accept link request.
     * 
     * @param value the new accept link request
     */
    public void setAcceptLinkRequest(Boolean value) {
        this.acceptLinkRequest = value;
    }

    /**
     * Checks if is hold on link request.
     * 
     * @return the boolean
     */
    public Boolean isHoldOnLinkRequest() {
        return holdOnLinkRequest;
    }

    /**
     * Sets the hold on link request.
     * 
     * @param value the new hold on link request
     */
    public void setHoldOnLinkRequest(Boolean value) {
        this.holdOnLinkRequest = value;
    }

    /**
     * Checks if is notify on link request.
     * 
     * @return the boolean
     */
    public Boolean isNotifyOnLinkRequest() {
        return notifyOnLinkRequest;
    }

    /**
     * Sets the notify on link request.
     * 
     * @param value the new notify on link request
     */
    public void setNotifyOnLinkRequest(Boolean value) {
        this.notifyOnLinkRequest = value;
    }

    /**
     * Checks if is support video.
     * 
     * @return the boolean
     */
    public Boolean isSupportVideo() {
        return supportVideo;
    }

    /**
     * Sets the support video.
     * 
     * @param value the new support video
     */
    public void setSupportVideo(Boolean value) {
        this.supportVideo = value;
    }

    /**
     * Checks if is support app.
     * 
     * @return the boolean
     */
    public Boolean isSupportApp() {
        return supportApp;
    }

    /**
     * Sets the support app.
     * 
     * @param value the new support app
     */
    public void setSupportApp(Boolean value) {
        this.supportApp = value;
    }

    /**
     * Checks if is support file share.
     * 
     * @return the boolean
     */
    public Boolean isSupportFileShare() {
        return supportFileShare;
    }

    /**
     * Sets the support file share.
     * 
     * @param value the new support file share
     */
    public void setSupportFileShare(Boolean value) {
        this.supportFileShare = value;
    }

    /**
     * Checks if is support desktop share.
     * 
     * @return the boolean
     */
    public Boolean isSupportDesktopShare() {
        return supportDesktopShare;
    }

    /**
     * Sets the support desktop share.
     * 
     * @param value the new support desktop share
     */
    public void setSupportDesktopShare(Boolean value) {
        this.supportDesktopShare = value;
    }

    /**
     * Checks if is support meeting record.
     * 
     * @return the boolean
     */
    public Boolean isSupportMeetingRecord() {
        return supportMeetingRecord;
    }

    /**
     * Sets the support meeting record.
     * 
     * @param value the new support meeting record
     */
    public void setSupportMeetingRecord(Boolean value) {
        this.supportMeetingRecord = value;
    }

    /**
     * Checks if is support appshare remote.
     * 
     * @return the boolean
     */
    public Boolean isSupportAppshareRemote() {
        return supportAppshareRemote;
    }

    /**
     * Sets the support appshare remote.
     * 
     * @param value the new support appshare remote
     */
    public void setSupportAppshareRemote(Boolean value) {
        this.supportAppshareRemote = value;
    }

    /**
     * Checks if is support web tour remote.
     * 
     * @return the boolean
     */
    public Boolean isSupportWebTourRemote() {
        return supportWebTourRemote;
    }

    /**
     * Sets the support web tour remote.
     * 
     * @param value the new support web tour remote
     */
    public void setSupportWebTourRemote(Boolean value) {
        this.supportWebTourRemote = value;
    }

    /**
     * Checks if is support desktop share remote.
     * 
     * @return the boolean
     */
    public Boolean isSupportDesktopShareRemote() {
        return supportDesktopShareRemote;
    }

    /**
     * Sets the support desktop share remote.
     * 
     * @param value the new support desktop share remote
     */
    public void setSupportDesktopShareRemote(Boolean value) {
        this.supportDesktopShareRemote = value;
    }

    /**
     * Checks if is subscription office.
     * 
     * @return the boolean
     */
    public Boolean isSubscriptionOffice() {
        return subscriptionOffice;
    }

    /**
     * Sets the subscription office.
     * 
     * @param value the new subscription office
     */
    public void setSubscriptionOffice(Boolean value) {
        this.subscriptionOffice = value;
    }

}
