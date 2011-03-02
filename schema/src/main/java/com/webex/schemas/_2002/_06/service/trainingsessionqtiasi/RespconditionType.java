
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respconditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respconditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditionvar" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}conditionvarType"/>
 *         &lt;element name="setvar" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}setvarType"/>
 *         &lt;element name="displayfeedback" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}displayfeedbackType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respconditionType", propOrder = {
    "conditionvar",
    "setvar",
    "displayfeedback"
})
public class RespconditionType {

    @XmlElement(required = true)
    protected ConditionvarType conditionvar;
    @XmlElement(required = true)
    protected SetvarType setvar;
    protected DisplayfeedbackType displayfeedback;

    /**
     * Gets the value of the conditionvar property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionvarType }
     *     
     */
    public ConditionvarType getConditionvar() {
        return conditionvar;
    }

    /**
     * Sets the value of the conditionvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionvarType }
     *     
     */
    public void setConditionvar(ConditionvarType value) {
        this.conditionvar = value;
    }

    /**
     * Gets the value of the setvar property.
     * 
     * @return
     *     possible object is
     *     {@link SetvarType }
     *     
     */
    public SetvarType getSetvar() {
        return setvar;
    }

    /**
     * Sets the value of the setvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetvarType }
     *     
     */
    public void setSetvar(SetvarType value) {
        this.setvar = value;
    }

    /**
     * Gets the value of the displayfeedback property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayfeedbackType }
     *     
     */
    public DisplayfeedbackType getDisplayfeedback() {
        return displayfeedback;
    }

    /**
     * Sets the value of the displayfeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayfeedbackType }
     *     
     */
    public void setDisplayfeedback(DisplayfeedbackType value) {
        this.displayfeedback = value;
    }

}
