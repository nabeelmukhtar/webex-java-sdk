
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startFrom" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maximumNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listControlType", propOrder = {
    "startFrom",
    "maximumNum"
})
public class ListControlType {

    protected long startFrom;
    protected Long maximumNum;

    /**
     * Gets the value of the startFrom property.
     * 
     */
    public long getStartFrom() {
        return startFrom;
    }

    /**
     * Sets the value of the startFrom property.
     * 
     */
    public void setStartFrom(long value) {
        this.startFrom = value;
    }

    /**
     * Gets the value of the maximumNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumNum() {
        return maximumNum;
    }

    /**
     * Sets the value of the maximumNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumNum(Long value) {
        this.maximumNum = value;
    }

}
