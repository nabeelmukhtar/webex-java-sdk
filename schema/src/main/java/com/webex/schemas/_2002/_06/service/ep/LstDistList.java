
package com.webex.schemas._2002._06.service.ep;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.AddressTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for lstDistList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstDistList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="distListID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressType" type="{http://www.webex.com/schemas/2002/06/common}addressTypeType" minOccurs="0"/>
 *         &lt;element name="hostWebExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstDistList", propOrder = {
    "distListID",
    "name",
    "addressType",
    "hostWebExID"
})
public class LstDistList
    extends BodyContentType
{

    protected BigInteger distListID;
    protected String name;
    protected AddressTypeType addressType;
    protected String hostWebExID;

    /**
     * Gets the value of the distListID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistListID() {
        return distListID;
    }

    /**
     * Sets the value of the distListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistListID(BigInteger value) {
        this.distListID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypeType }
     *     
     */
    public AddressTypeType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypeType }
     *     
     */
    public void setAddressType(AddressTypeType value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the hostWebExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostWebExID() {
        return hostWebExID;
    }

    /**
     * Sets the value of the hostWebExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostWebExID(String value) {
        this.hostWebExID = value;
    }

}
