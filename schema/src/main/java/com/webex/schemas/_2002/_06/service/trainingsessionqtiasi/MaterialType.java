
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mattext" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}mattextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materialType", propOrder = {
    "mattext"
})
public class MaterialType {

    @XmlElement(required = true)
    protected MattextType mattext;

    /**
     * Gets the value of the mattext property.
     * 
     * @return
     *     possible object is
     *     {@link MattextType }
     *     
     */
    public MattextType getMattext() {
        return mattext;
    }

    /**
     * Sets the value of the mattext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MattextType }
     *     
     */
    public void setMattext(MattextType value) {
        this.mattext = value;
    }

}
