
package com.webex.schemas._2002._06.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderBy" type="{http://www.webex.com/schemas/2002/06/service}orderByType" minOccurs="0"/>
 *         &lt;element name="orderAD" type="{http://www.webex.com/schemas/2002/06/service}lstOrderADType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderType", propOrder = {
    "orderBy",
    "orderAD"
})
public class OrderType {

    protected OrderByType orderBy;
    protected LstOrderADType orderAD;

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByType }
     *     
     */
    public OrderByType getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByType }
     *     
     */
    public void setOrderBy(OrderByType value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the orderAD property.
     * 
     * @return
     *     possible object is
     *     {@link LstOrderADType }
     *     
     */
    public LstOrderADType getOrderAD() {
        return orderAD;
    }

    /**
     * Sets the value of the orderAD property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstOrderADType }
     *     
     */
    public void setOrderAD(LstOrderADType value) {
        this.orderAD = value;
    }

}
