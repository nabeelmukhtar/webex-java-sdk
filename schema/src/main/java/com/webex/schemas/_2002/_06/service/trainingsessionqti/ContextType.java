//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:48:00 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.trainingsessionqti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="generic_identifier" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}generic_identifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contextType", propOrder = {
    "name",
    "genericIdentifier"
})
public class ContextType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "generic_identifier", required = true)
    protected GenericIdentifierType genericIdentifier;

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
     * Gets the value of the genericIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentifierType }
     *     
     */
    public GenericIdentifierType getGenericIdentifier() {
        return genericIdentifier;
    }

    /**
     * Sets the value of the genericIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentifierType }
     *     
     */
    public void setGenericIdentifier(GenericIdentifierType value) {
        this.genericIdentifier = value;
    }

}
