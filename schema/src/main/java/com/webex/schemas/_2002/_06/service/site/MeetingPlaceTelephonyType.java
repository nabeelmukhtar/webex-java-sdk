
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meetingPlaceTelephonyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meetingPlaceTelephonyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="persistentTSP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mpAudioConferencing" type="{http://www.webex.com/schemas/2002/06/service/site}directoryServiceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meetingPlaceTelephonyType", propOrder = {
    "persistentTSP",
    "mpAudioConferencing"
})
public class MeetingPlaceTelephonyType {

    protected boolean persistentTSP;
    @XmlElement(required = true)
    protected DirectoryServiceType mpAudioConferencing;

    /**
     * Gets the value of the persistentTSP property.
     * 
     */
    public boolean isPersistentTSP() {
        return persistentTSP;
    }

    /**
     * Sets the value of the persistentTSP property.
     * 
     */
    public void setPersistentTSP(boolean value) {
        this.persistentTSP = value;
    }

    /**
     * Gets the value of the mpAudioConferencing property.
     * 
     * @return
     *     possible object is
     *     {@link DirectoryServiceType }
     *     
     */
    public DirectoryServiceType getMpAudioConferencing() {
        return mpAudioConferencing;
    }

    /**
     * Sets the value of the mpAudioConferencing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectoryServiceType }
     *     
     */
    public void setMpAudioConferencing(DirectoryServiceType value) {
        this.mpAudioConferencing = value;
    }

}
