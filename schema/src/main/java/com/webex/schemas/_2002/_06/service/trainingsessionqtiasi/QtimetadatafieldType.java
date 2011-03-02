
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qtimetadatafieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qtimetadatafieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}fieldlabel"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}fieldentry"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qtimetadatafieldType", propOrder = {
    "fieldlabel",
    "fieldentry"
})
public class QtimetadatafieldType {

    @XmlElement(required = true)
    protected String fieldlabel;
    @XmlElement(required = true)
    protected String fieldentry;

    /**
     * Gets the value of the fieldlabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldlabel() {
        return fieldlabel;
    }

    /**
     * Sets the value of the fieldlabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldlabel(String value) {
        this.fieldlabel = value;
    }

    /**
     * Gets the value of the fieldentry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldentry() {
        return fieldentry;
    }

    /**
     * Sets the value of the fieldentry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldentry(String value) {
        this.fieldentry = value;
    }

}
