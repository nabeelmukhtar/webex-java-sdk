
package com.webex.schemas._2002._06.service.trainingsessionqti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for controlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="controlType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="hint_switch" default="No">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="solution_switch" default="No">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="feedback_switch" default="No">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlType", propOrder = {
    "value"
})
public class ControlType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "hint_switch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hintSwitch;
    @XmlAttribute(name = "solution_switch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String solutionSwitch;
    @XmlAttribute(name = "feedback_switch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feedbackSwitch;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the hintSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHintSwitch() {
        if (hintSwitch == null) {
            return "No";
        } else {
            return hintSwitch;
        }
    }

    /**
     * Sets the value of the hintSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHintSwitch(String value) {
        this.hintSwitch = value;
    }

    /**
     * Gets the value of the solutionSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionSwitch() {
        if (solutionSwitch == null) {
            return "No";
        } else {
            return solutionSwitch;
        }
    }

    /**
     * Sets the value of the solutionSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionSwitch(String value) {
        this.solutionSwitch = value;
    }

    /**
     * Gets the value of the feedbackSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackSwitch() {
        if (feedbackSwitch == null) {
            return "No";
        } else {
            return feedbackSwitch;
        }
    }

    /**
     * Sets the value of the feedbackSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackSwitch(String value) {
        this.feedbackSwitch = value;
    }

}
