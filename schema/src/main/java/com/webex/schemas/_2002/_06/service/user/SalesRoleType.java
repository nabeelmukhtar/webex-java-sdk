
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salesRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salesRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mgr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="asst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sme" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesRoleType", propOrder = {
    "rep",
    "mgr",
    "asst",
    "sme"
})
public class SalesRoleType {

    @XmlElement(defaultValue = "true")
    protected Boolean rep;
    @XmlElement(defaultValue = "false")
    protected Boolean mgr;
    @XmlElement(defaultValue = "false")
    protected Boolean asst;
    @XmlElement(defaultValue = "false")
    protected Boolean sme;

    /**
     * Gets the value of the rep property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRep() {
        return rep;
    }

    /**
     * Sets the value of the rep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRep(Boolean value) {
        this.rep = value;
    }

    /**
     * Gets the value of the mgr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMgr() {
        return mgr;
    }

    /**
     * Sets the value of the mgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMgr(Boolean value) {
        this.mgr = value;
    }

    /**
     * Gets the value of the asst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsst() {
        return asst;
    }

    /**
     * Sets the value of the asst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsst(Boolean value) {
        this.asst = value;
    }

    /**
     * Gets the value of the sme property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSme() {
        return sme;
    }

    /**
     * Sets the value of the sme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSme(Boolean value) {
        this.sme = value;
    }

}
