
package com.webex.schemas._2002._06.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personalTeleServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personalTeleServerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}callInNumType">
 *       &lt;sequence>
 *         &lt;element name="enableServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tollLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tollFreeLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalTeleServerType", propOrder = {
    "enableServer",
    "tollLabel",
    "tollFreeLabel"
})
public class PersonalTeleServerType
    extends CallInNumType
{

    protected Boolean enableServer;
    protected String tollLabel;
    protected String tollFreeLabel;

    /**
     * Gets the value of the enableServer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableServer() {
        return enableServer;
    }

    /**
     * Sets the value of the enableServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableServer(Boolean value) {
        this.enableServer = value;
    }

    /**
     * Gets the value of the tollLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollLabel() {
        return tollLabel;
    }

    /**
     * Sets the value of the tollLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollLabel(String value) {
        this.tollLabel = value;
    }

    /**
     * Gets the value of the tollFreeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeLabel() {
        return tollFreeLabel;
    }

    /**
     * Sets the value of the tollFreeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeLabel(String value) {
        this.tollFreeLabel = value;
    }

}
