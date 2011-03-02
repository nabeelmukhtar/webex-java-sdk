
package com.webex.schemas._2002._06.service.trainingsessionqti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generic_identifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generic_identifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type_label" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}type_labelType"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}identifier_string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generic_identifierType", propOrder = {
    "typeLabel",
    "identifierString"
})
public class GenericIdentifierType {

    @XmlElement(name = "type_label", required = true)
    protected TypeLabelType typeLabel;
    @XmlElement(name = "identifier_string", required = true)
    protected String identifierString;

    /**
     * Gets the value of the typeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLabelType }
     *     
     */
    public TypeLabelType getTypeLabel() {
        return typeLabel;
    }

    /**
     * Sets the value of the typeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLabelType }
     *     
     */
    public void setTypeLabel(TypeLabelType value) {
        this.typeLabel = value;
    }

    /**
     * Gets the value of the identifierString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierString() {
        return identifierString;
    }

    /**
     * Sets the value of the identifierString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierString(String value) {
        this.identifierString = value;
    }

}
