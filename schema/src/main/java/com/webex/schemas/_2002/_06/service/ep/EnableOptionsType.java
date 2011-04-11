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

package com.webex.schemas._2002._06.service.ep;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enableOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enableOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="poll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendeeList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fileShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="presentation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="applicationShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="desktopShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="webTour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="importDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="saveDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="printDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pointer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="switchPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fullScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="thumbnail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zoom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="copyPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="faxIntoMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="multiVideo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="voip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableOptionsType", propOrder = {
    "chat",
    "poll",
    "attendeeList",
    "fileShare",
    "presentation",
    "applicationShare",
    "desktopShare",
    "webTour",
    "annotation",
    "importDocument",
    "saveDocument",
    "printDocument",
    "pointer",
    "switchPage",
    "fullScreen",
    "thumbnail",
    "zoom",
    "copyPage",
    "faxIntoMeeting",
    "multiVideo",
    "voip"
})
public class EnableOptionsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean chat;
    protected Boolean poll;
    protected Boolean attendeeList;
    protected Boolean fileShare;
    protected Boolean presentation;
    protected Boolean applicationShare;
    protected Boolean desktopShare;
    protected Boolean webTour;
    protected Boolean annotation;
    protected Boolean importDocument;
    protected Boolean saveDocument;
    protected Boolean printDocument;
    protected Boolean pointer;
    protected Boolean switchPage;
    protected Boolean fullScreen;
    protected Boolean thumbnail;
    protected Boolean zoom;
    protected Boolean copyPage;
    protected Boolean faxIntoMeeting;
    protected Boolean multiVideo;
    protected Boolean voip;

    /**
     * Gets the value of the chat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChat() {
        return chat;
    }

    /**
     * Sets the value of the chat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChat(Boolean value) {
        this.chat = value;
    }

    /**
     * Gets the value of the poll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPoll() {
        return poll;
    }

    /**
     * Sets the value of the poll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoll(Boolean value) {
        this.poll = value;
    }

    /**
     * Gets the value of the attendeeList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttendeeList() {
        return attendeeList;
    }

    /**
     * Sets the value of the attendeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttendeeList(Boolean value) {
        this.attendeeList = value;
    }

    /**
     * Gets the value of the fileShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileShare() {
        return fileShare;
    }

    /**
     * Sets the value of the fileShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileShare(Boolean value) {
        this.fileShare = value;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPresentation(Boolean value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the applicationShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicationShare() {
        return applicationShare;
    }

    /**
     * Sets the value of the applicationShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicationShare(Boolean value) {
        this.applicationShare = value;
    }

    /**
     * Gets the value of the desktopShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDesktopShare() {
        return desktopShare;
    }

    /**
     * Sets the value of the desktopShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDesktopShare(Boolean value) {
        this.desktopShare = value;
    }

    /**
     * Gets the value of the webTour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWebTour() {
        return webTour;
    }

    /**
     * Sets the value of the webTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebTour(Boolean value) {
        this.webTour = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnotation(Boolean value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the importDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportDocument() {
        return importDocument;
    }

    /**
     * Sets the value of the importDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportDocument(Boolean value) {
        this.importDocument = value;
    }

    /**
     * Gets the value of the saveDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveDocument() {
        return saveDocument;
    }

    /**
     * Sets the value of the saveDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveDocument(Boolean value) {
        this.saveDocument = value;
    }

    /**
     * Gets the value of the printDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintDocument() {
        return printDocument;
    }

    /**
     * Sets the value of the printDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintDocument(Boolean value) {
        this.printDocument = value;
    }

    /**
     * Gets the value of the pointer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPointer() {
        return pointer;
    }

    /**
     * Sets the value of the pointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPointer(Boolean value) {
        this.pointer = value;
    }

    /**
     * Gets the value of the switchPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSwitchPage() {
        return switchPage;
    }

    /**
     * Sets the value of the switchPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSwitchPage(Boolean value) {
        this.switchPage = value;
    }

    /**
     * Gets the value of the fullScreen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullScreen() {
        return fullScreen;
    }

    /**
     * Sets the value of the fullScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullScreen(Boolean value) {
        this.fullScreen = value;
    }

    /**
     * Gets the value of the thumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThumbnail(Boolean value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the zoom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZoom() {
        return zoom;
    }

    /**
     * Sets the value of the zoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZoom(Boolean value) {
        this.zoom = value;
    }

    /**
     * Gets the value of the copyPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyPage() {
        return copyPage;
    }

    /**
     * Sets the value of the copyPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyPage(Boolean value) {
        this.copyPage = value;
    }

    /**
     * Gets the value of the faxIntoMeeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaxIntoMeeting() {
        return faxIntoMeeting;
    }

    /**
     * Sets the value of the faxIntoMeeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaxIntoMeeting(Boolean value) {
        this.faxIntoMeeting = value;
    }

    /**
     * Gets the value of the multiVideo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiVideo() {
        return multiVideo;
    }

    /**
     * Sets the value of the multiVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiVideo(Boolean value) {
        this.multiVideo = value;
    }

    /**
     * Gets the value of the voip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoip() {
        return voip;
    }

    /**
     * Sets the value of the voip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoip(Boolean value) {
        this.voip = value;
    }

}
