
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for optionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="optionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstNameVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastNameVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="addressVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workPhoneVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cellPhoneVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pagerVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="faxVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="officeUrlVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pictureVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyOnNewMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyOnMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="followMeEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="listInCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="titleVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="folderRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="folderWrite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="messageVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iconSelect1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iconSelect2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="acceptLinkRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="holdOnLinkRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyOnLinkRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportVideo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportApp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportFileShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportDesktopShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportMeetingRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportAppshareRemote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportWebTourRemote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportDesktopShareRemote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subscriptionOffice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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
public class OptionsType {

    @XmlElement(defaultValue = "false")
    protected Boolean firstNameVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean lastNameVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean addressVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean workPhoneVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean cellPhoneVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean pagerVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean faxVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean officeUrlVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean pictureVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean notifyOnNewMessage;
    @XmlElement(defaultValue = "false")
    protected Boolean notifyOnMeeting;
    @XmlElement(defaultValue = "false")
    protected Boolean followMeEnable;
    @XmlElement(defaultValue = "false")
    protected Boolean emailVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean listInCategory;
    @XmlElement(defaultValue = "false")
    protected Boolean titleVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean folderRead;
    @XmlElement(defaultValue = "false")
    protected Boolean folderWrite;
    @XmlElement(defaultValue = "false")
    protected Boolean messageVisible;
    @XmlElement(defaultValue = "false")
    protected Boolean iconSelect1;
    @XmlElement(defaultValue = "false")
    protected Boolean iconSelect2;
    @XmlElement(defaultValue = "false")
    protected Boolean acceptLinkRequest;
    @XmlElement(defaultValue = "false")
    protected Boolean holdOnLinkRequest;
    @XmlElement(defaultValue = "false")
    protected Boolean notifyOnLinkRequest;
    @XmlElement(defaultValue = "false")
    protected Boolean supportVideo;
    @XmlElement(defaultValue = "false")
    protected Boolean supportApp;
    @XmlElement(defaultValue = "false")
    protected Boolean supportFileShare;
    @XmlElement(defaultValue = "false")
    protected Boolean supportDesktopShare;
    @XmlElement(defaultValue = "false")
    protected Boolean supportMeetingRecord;
    @XmlElement(defaultValue = "false")
    protected Boolean supportAppshareRemote;
    @XmlElement(defaultValue = "false")
    protected Boolean supportWebTourRemote;
    @XmlElement(defaultValue = "false")
    protected Boolean supportDesktopShareRemote;
    @XmlElement(defaultValue = "false")
    protected Boolean subscriptionOffice;

    /**
     * Gets the value of the firstNameVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstNameVisible() {
        return firstNameVisible;
    }

    /**
     * Sets the value of the firstNameVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstNameVisible(Boolean value) {
        this.firstNameVisible = value;
    }

    /**
     * Gets the value of the lastNameVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastNameVisible() {
        return lastNameVisible;
    }

    /**
     * Sets the value of the lastNameVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastNameVisible(Boolean value) {
        this.lastNameVisible = value;
    }

    /**
     * Gets the value of the addressVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressVisible() {
        return addressVisible;
    }

    /**
     * Sets the value of the addressVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressVisible(Boolean value) {
        this.addressVisible = value;
    }

    /**
     * Gets the value of the workPhoneVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkPhoneVisible() {
        return workPhoneVisible;
    }

    /**
     * Sets the value of the workPhoneVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkPhoneVisible(Boolean value) {
        this.workPhoneVisible = value;
    }

    /**
     * Gets the value of the cellPhoneVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCellPhoneVisible() {
        return cellPhoneVisible;
    }

    /**
     * Sets the value of the cellPhoneVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCellPhoneVisible(Boolean value) {
        this.cellPhoneVisible = value;
    }

    /**
     * Gets the value of the pagerVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPagerVisible() {
        return pagerVisible;
    }

    /**
     * Sets the value of the pagerVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPagerVisible(Boolean value) {
        this.pagerVisible = value;
    }

    /**
     * Gets the value of the faxVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaxVisible() {
        return faxVisible;
    }

    /**
     * Sets the value of the faxVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaxVisible(Boolean value) {
        this.faxVisible = value;
    }

    /**
     * Gets the value of the officeUrlVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficeUrlVisible() {
        return officeUrlVisible;
    }

    /**
     * Sets the value of the officeUrlVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficeUrlVisible(Boolean value) {
        this.officeUrlVisible = value;
    }

    /**
     * Gets the value of the pictureVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictureVisible() {
        return pictureVisible;
    }

    /**
     * Sets the value of the pictureVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictureVisible(Boolean value) {
        this.pictureVisible = value;
    }

    /**
     * Gets the value of the notifyOnNewMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyOnNewMessage() {
        return notifyOnNewMessage;
    }

    /**
     * Sets the value of the notifyOnNewMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyOnNewMessage(Boolean value) {
        this.notifyOnNewMessage = value;
    }

    /**
     * Gets the value of the notifyOnMeeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyOnMeeting() {
        return notifyOnMeeting;
    }

    /**
     * Sets the value of the notifyOnMeeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyOnMeeting(Boolean value) {
        this.notifyOnMeeting = value;
    }

    /**
     * Gets the value of the followMeEnable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFollowMeEnable() {
        return followMeEnable;
    }

    /**
     * Sets the value of the followMeEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFollowMeEnable(Boolean value) {
        this.followMeEnable = value;
    }

    /**
     * Gets the value of the emailVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailVisible() {
        return emailVisible;
    }

    /**
     * Sets the value of the emailVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailVisible(Boolean value) {
        this.emailVisible = value;
    }

    /**
     * Gets the value of the listInCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListInCategory() {
        return listInCategory;
    }

    /**
     * Sets the value of the listInCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListInCategory(Boolean value) {
        this.listInCategory = value;
    }

    /**
     * Gets the value of the titleVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTitleVisible() {
        return titleVisible;
    }

    /**
     * Sets the value of the titleVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTitleVisible(Boolean value) {
        this.titleVisible = value;
    }

    /**
     * Gets the value of the folderRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFolderRead() {
        return folderRead;
    }

    /**
     * Sets the value of the folderRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFolderRead(Boolean value) {
        this.folderRead = value;
    }

    /**
     * Gets the value of the folderWrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFolderWrite() {
        return folderWrite;
    }

    /**
     * Sets the value of the folderWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFolderWrite(Boolean value) {
        this.folderWrite = value;
    }

    /**
     * Gets the value of the messageVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessageVisible() {
        return messageVisible;
    }

    /**
     * Sets the value of the messageVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessageVisible(Boolean value) {
        this.messageVisible = value;
    }

    /**
     * Gets the value of the iconSelect1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIconSelect1() {
        return iconSelect1;
    }

    /**
     * Sets the value of the iconSelect1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIconSelect1(Boolean value) {
        this.iconSelect1 = value;
    }

    /**
     * Gets the value of the iconSelect2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIconSelect2() {
        return iconSelect2;
    }

    /**
     * Sets the value of the iconSelect2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIconSelect2(Boolean value) {
        this.iconSelect2 = value;
    }

    /**
     * Gets the value of the acceptLinkRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptLinkRequest() {
        return acceptLinkRequest;
    }

    /**
     * Sets the value of the acceptLinkRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptLinkRequest(Boolean value) {
        this.acceptLinkRequest = value;
    }

    /**
     * Gets the value of the holdOnLinkRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoldOnLinkRequest() {
        return holdOnLinkRequest;
    }

    /**
     * Sets the value of the holdOnLinkRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoldOnLinkRequest(Boolean value) {
        this.holdOnLinkRequest = value;
    }

    /**
     * Gets the value of the notifyOnLinkRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyOnLinkRequest() {
        return notifyOnLinkRequest;
    }

    /**
     * Sets the value of the notifyOnLinkRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyOnLinkRequest(Boolean value) {
        this.notifyOnLinkRequest = value;
    }

    /**
     * Gets the value of the supportVideo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportVideo() {
        return supportVideo;
    }

    /**
     * Sets the value of the supportVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportVideo(Boolean value) {
        this.supportVideo = value;
    }

    /**
     * Gets the value of the supportApp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportApp() {
        return supportApp;
    }

    /**
     * Sets the value of the supportApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportApp(Boolean value) {
        this.supportApp = value;
    }

    /**
     * Gets the value of the supportFileShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportFileShare() {
        return supportFileShare;
    }

    /**
     * Sets the value of the supportFileShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportFileShare(Boolean value) {
        this.supportFileShare = value;
    }

    /**
     * Gets the value of the supportDesktopShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportDesktopShare() {
        return supportDesktopShare;
    }

    /**
     * Sets the value of the supportDesktopShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportDesktopShare(Boolean value) {
        this.supportDesktopShare = value;
    }

    /**
     * Gets the value of the supportMeetingRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportMeetingRecord() {
        return supportMeetingRecord;
    }

    /**
     * Sets the value of the supportMeetingRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportMeetingRecord(Boolean value) {
        this.supportMeetingRecord = value;
    }

    /**
     * Gets the value of the supportAppshareRemote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportAppshareRemote() {
        return supportAppshareRemote;
    }

    /**
     * Sets the value of the supportAppshareRemote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportAppshareRemote(Boolean value) {
        this.supportAppshareRemote = value;
    }

    /**
     * Gets the value of the supportWebTourRemote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportWebTourRemote() {
        return supportWebTourRemote;
    }

    /**
     * Sets the value of the supportWebTourRemote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportWebTourRemote(Boolean value) {
        this.supportWebTourRemote = value;
    }

    /**
     * Gets the value of the supportDesktopShareRemote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportDesktopShareRemote() {
        return supportDesktopShareRemote;
    }

    /**
     * Sets the value of the supportDesktopShareRemote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportDesktopShareRemote(Boolean value) {
        this.supportDesktopShareRemote = value;
    }

    /**
     * Gets the value of the subscriptionOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscriptionOffice() {
        return subscriptionOffice;
    }

    /**
     * Sets the value of the subscriptionOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscriptionOffice(Boolean value) {
        this.subscriptionOffice = value;
    }

}
