
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSRouting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSRouting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TSPrimaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSPrimaryCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSPrimaryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TSSecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSSecondCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSSecondNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSRouting", propOrder = {
    "tsPrimaryName",
    "tsPrimaryCountryCode",
    "tsPrimaryNumber",
    "tsDelay",
    "tsSecondName",
    "tsSecondCountryCode",
    "tsSecondNumber"
})
public class TSRouting {

    @XmlElement(name = "TSPrimaryName")
    protected String tsPrimaryName;
    @XmlElement(name = "TSPrimaryCountryCode")
    protected String tsPrimaryCountryCode;
    @XmlElement(name = "TSPrimaryNumber")
    protected String tsPrimaryNumber;
    @XmlElement(name = "TSDelay")
    protected Integer tsDelay;
    @XmlElement(name = "TSSecondName")
    protected String tsSecondName;
    @XmlElement(name = "TSSecondCountryCode")
    protected String tsSecondCountryCode;
    @XmlElement(name = "TSSecondNumber")
    protected String tsSecondNumber;

    /**
     * Gets the value of the tsPrimaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPrimaryName() {
        return tsPrimaryName;
    }

    /**
     * Sets the value of the tsPrimaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPrimaryName(String value) {
        this.tsPrimaryName = value;
    }

    /**
     * Gets the value of the tsPrimaryCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPrimaryCountryCode() {
        return tsPrimaryCountryCode;
    }

    /**
     * Sets the value of the tsPrimaryCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPrimaryCountryCode(String value) {
        this.tsPrimaryCountryCode = value;
    }

    /**
     * Gets the value of the tsPrimaryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPrimaryNumber() {
        return tsPrimaryNumber;
    }

    /**
     * Sets the value of the tsPrimaryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPrimaryNumber(String value) {
        this.tsPrimaryNumber = value;
    }

    /**
     * Gets the value of the tsDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSDelay() {
        return tsDelay;
    }

    /**
     * Sets the value of the tsDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSDelay(Integer value) {
        this.tsDelay = value;
    }

    /**
     * Gets the value of the tsSecondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSecondName() {
        return tsSecondName;
    }

    /**
     * Sets the value of the tsSecondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSecondName(String value) {
        this.tsSecondName = value;
    }

    /**
     * Gets the value of the tsSecondCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSecondCountryCode() {
        return tsSecondCountryCode;
    }

    /**
     * Sets the value of the tsSecondCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSecondCountryCode(String value) {
        this.tsSecondCountryCode = value;
    }

    /**
     * Gets the value of the tsSecondNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSecondNumber() {
        return tsSecondNumber;
    }

    /**
     * Sets the value of the tsSecondNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSecondNumber(String value) {
        this.tsSecondNumber = value;
    }

}
