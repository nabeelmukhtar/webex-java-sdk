
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.EntryExitToneType;


/**
 * <p>Java class for ocTelephonyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ocTelephonyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telephonySupport" type="{http://www.webex.com/schemas/2002/06/service/ep}telephonySupportType"/>
 *         &lt;element name="extTelephonyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tspAccountIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="personalAccountIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="intlLocalCallIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tollfree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="entryExitTone" type="{http://www.webex.com/schemas/2002/06/common}entryExitToneType" minOccurs="0"/>
 *         &lt;element name="isMPAudio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocTelephonyType", propOrder = {
    "telephonySupport",
    "extTelephonyDescription",
    "tspAccountIndex",
    "personalAccountIndex",
    "intlLocalCallIn",
    "tollfree",
    "entryExitTone",
    "isMPAudio"
})
public class OcTelephonyType {

    @XmlElement(required = true)
    protected TelephonySupportType telephonySupport;
    protected String extTelephonyDescription;
    protected Integer tspAccountIndex;
    protected Integer personalAccountIndex;
    protected Boolean intlLocalCallIn;
    protected Boolean tollfree;
    protected EntryExitToneType entryExitTone;
    protected Boolean isMPAudio;

    /**
     * Gets the value of the telephonySupport property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonySupportType }
     *     
     */
    public TelephonySupportType getTelephonySupport() {
        return telephonySupport;
    }

    /**
     * Sets the value of the telephonySupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonySupportType }
     *     
     */
    public void setTelephonySupport(TelephonySupportType value) {
        this.telephonySupport = value;
    }

    /**
     * Gets the value of the extTelephonyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTelephonyDescription() {
        return extTelephonyDescription;
    }

    /**
     * Sets the value of the extTelephonyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTelephonyDescription(String value) {
        this.extTelephonyDescription = value;
    }

    /**
     * Gets the value of the tspAccountIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTspAccountIndex() {
        return tspAccountIndex;
    }

    /**
     * Sets the value of the tspAccountIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTspAccountIndex(Integer value) {
        this.tspAccountIndex = value;
    }

    /**
     * Gets the value of the personalAccountIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonalAccountIndex() {
        return personalAccountIndex;
    }

    /**
     * Sets the value of the personalAccountIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonalAccountIndex(Integer value) {
        this.personalAccountIndex = value;
    }

    /**
     * Gets the value of the intlLocalCallIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntlLocalCallIn() {
        return intlLocalCallIn;
    }

    /**
     * Sets the value of the intlLocalCallIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntlLocalCallIn(Boolean value) {
        this.intlLocalCallIn = value;
    }

    /**
     * Gets the value of the tollfree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTollfree() {
        return tollfree;
    }

    /**
     * Sets the value of the tollfree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTollfree(Boolean value) {
        this.tollfree = value;
    }

    /**
     * Gets the value of the entryExitTone property.
     * 
     * @return
     *     possible object is
     *     {@link EntryExitToneType }
     *     
     */
    public EntryExitToneType getEntryExitTone() {
        return entryExitTone;
    }

    /**
     * Sets the value of the entryExitTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryExitToneType }
     *     
     */
    public void setEntryExitTone(EntryExitToneType value) {
        this.entryExitTone = value;
    }

    /**
     * Gets the value of the isMPAudio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMPAudio() {
        return isMPAudio;
    }

    /**
     * Sets the value of the isMPAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMPAudio(Boolean value) {
        this.isMPAudio = value;
    }

}
