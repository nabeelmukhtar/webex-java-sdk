
package com.webex.schemas._2002._06.service;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lstControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startFrom" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="maximumNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="listMethod" type="{http://www.webex.com/schemas/2002/06/service}lstMethodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstControlType", propOrder = {
    "startFrom",
    "maximumNum",
    "listMethod"
})
public class LstControlType {

    protected BigInteger startFrom;
    protected BigInteger maximumNum;
    protected LstMethodType listMethod;

    /**
     * Gets the value of the startFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartFrom() {
        return startFrom;
    }

    /**
     * Sets the value of the startFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartFrom(BigInteger value) {
        this.startFrom = value;
    }

    /**
     * Gets the value of the maximumNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNum() {
        return maximumNum;
    }

    /**
     * Sets the value of the maximumNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNum(BigInteger value) {
        this.maximumNum = value;
    }

    /**
     * Gets the value of the listMethod property.
     * 
     * @return
     *     possible object is
     *     {@link LstMethodType }
     *     
     */
    public LstMethodType getListMethod() {
        return listMethod;
    }

    /**
     * Sets the value of the listMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstMethodType }
     *     
     */
    public void setListMethod(LstMethodType value) {
        this.listMethod = value;
    }

}
