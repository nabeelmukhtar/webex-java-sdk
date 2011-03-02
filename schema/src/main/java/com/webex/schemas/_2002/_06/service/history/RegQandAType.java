
package com.webex.schemas._2002._06.service.history;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regQandAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regQandAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regQ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regQandAType", propOrder = {
    "regQ",
    "regA"
})
public class RegQandAType {

    @XmlElement(required = true)
    protected String regQ;
    @XmlElement(required = true)
    protected String regA;

    /**
     * Gets the value of the regQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegQ() {
        return regQ;
    }

    /**
     * Sets the value of the regQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegQ(String value) {
        this.regQ = value;
    }

    /**
     * Gets the value of the regA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegA() {
        return regA;
    }

    /**
     * Sets the value of the regA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegA(String value) {
        this.regA = value;
    }

}
