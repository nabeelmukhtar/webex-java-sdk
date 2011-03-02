
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.EntryExitToneType;


/**
 * <p>Java class for defaultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defaultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailReminders" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entryExitTone" type="{http://www.webex.com/schemas/2002/06/common}entryExitToneType"/>
 *         &lt;element name="voip" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="teleconference" type="{http://www.webex.com/schemas/2002/06/service/site}teleconferenceType"/>
 *         &lt;element name="joinTeleconfNotPress1" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="updateTSPAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaultsType", propOrder = {
    "emailReminders",
    "entryExitTone",
    "voip",
    "teleconference",
    "joinTeleconfNotPress1",
    "updateTSPAccount"
})
public class DefaultsType {

    protected boolean emailReminders;
    @XmlElement(required = true)
    protected EntryExitToneType entryExitTone;
    protected boolean voip;
    @XmlElement(required = true)
    protected TeleconferenceType teleconference;
    protected boolean joinTeleconfNotPress1;
    protected Boolean updateTSPAccount;

    /**
     * Gets the value of the emailReminders property.
     * 
     */
    public boolean isEmailReminders() {
        return emailReminders;
    }

    /**
     * Sets the value of the emailReminders property.
     * 
     */
    public void setEmailReminders(boolean value) {
        this.emailReminders = value;
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
     * Gets the value of the voip property.
     * 
     */
    public boolean isVoip() {
        return voip;
    }

    /**
     * Sets the value of the voip property.
     * 
     */
    public void setVoip(boolean value) {
        this.voip = value;
    }

    /**
     * Gets the value of the teleconference property.
     * 
     * @return
     *     possible object is
     *     {@link TeleconferenceType }
     *     
     */
    public TeleconferenceType getTeleconference() {
        return teleconference;
    }

    /**
     * Sets the value of the teleconference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeleconferenceType }
     *     
     */
    public void setTeleconference(TeleconferenceType value) {
        this.teleconference = value;
    }

    /**
     * Gets the value of the joinTeleconfNotPress1 property.
     * 
     */
    public boolean isJoinTeleconfNotPress1() {
        return joinTeleconfNotPress1;
    }

    /**
     * Sets the value of the joinTeleconfNotPress1 property.
     * 
     */
    public void setJoinTeleconfNotPress1(boolean value) {
        this.joinTeleconfNotPress1 = value;
    }

    /**
     * Gets the value of the updateTSPAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateTSPAccount() {
        return updateTSPAccount;
    }

    /**
     * Sets the value of the updateTSPAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateTSPAccount(Boolean value) {
        this.updateTSPAccount = value;
    }

}
