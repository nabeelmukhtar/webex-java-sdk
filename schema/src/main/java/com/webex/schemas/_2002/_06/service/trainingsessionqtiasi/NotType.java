
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="varequal" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}varequalType"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}and"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notType", propOrder = {
    "varequal",
    "and"
})
public class NotType {

    protected VarequalType varequal;
    protected AndType and;

    /**
     * Gets the value of the varequal property.
     * 
     * @return
     *     possible object is
     *     {@link VarequalType }
     *     
     */
    public VarequalType getVarequal() {
        return varequal;
    }

    /**
     * Sets the value of the varequal property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarequalType }
     *     
     */
    public void setVarequal(VarequalType value) {
        this.varequal = value;
    }

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link AndType }
     *     
     */
    public AndType getAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndType }
     *     
     */
    public void setAnd(AndType value) {
        this.and = value;
    }

}
