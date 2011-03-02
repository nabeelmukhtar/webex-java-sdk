
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outcomesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outcomesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="decvar" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}decvarType"/>
 *         &lt;element name="interpretvar" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}interpretvarType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomesType", propOrder = {
    "decvar",
    "interpretvar"
})
public class OutcomesType {

    @XmlElement(required = true)
    protected DecvarType decvar;
    protected InterpretvarType interpretvar;

    /**
     * Gets the value of the decvar property.
     * 
     * @return
     *     possible object is
     *     {@link DecvarType }
     *     
     */
    public DecvarType getDecvar() {
        return decvar;
    }

    /**
     * Sets the value of the decvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecvarType }
     *     
     */
    public void setDecvar(DecvarType value) {
        this.decvar = value;
    }

    /**
     * Gets the value of the interpretvar property.
     * 
     * @return
     *     possible object is
     *     {@link InterpretvarType }
     *     
     */
    public InterpretvarType getInterpretvar() {
        return interpretvar;
    }

    /**
     * Sets the value of the interpretvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterpretvarType }
     *     
     */
    public void setInterpretvar(InterpretvarType value) {
        this.interpretvar = value;
    }

}
