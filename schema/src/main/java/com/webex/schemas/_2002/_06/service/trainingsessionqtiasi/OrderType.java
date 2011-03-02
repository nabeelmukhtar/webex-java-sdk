
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="order_extension" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}order_extensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderType", propOrder = {
    "orderExtension"
})
public class OrderType {

    @XmlElement(name = "order_extension")
    protected OrderExtensionType orderExtension;
    @XmlAttribute(name = "order_type", required = true)
    protected String orderType;

    /**
     * Gets the value of the orderExtension property.
     * 
     * @return
     *     possible object is
     *     {@link OrderExtensionType }
     *     
     */
    public OrderExtensionType getOrderExtension() {
        return orderExtension;
    }

    /**
     * Sets the value of the orderExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderExtensionType }
     *     
     */
    public void setOrderExtension(OrderExtensionType value) {
        this.orderExtension = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

}
