
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for not_testType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="not_testType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="variable_test" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}variable_testType"/>
 *         &lt;element name="and_test" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}and_testType"/>
 *         &lt;element name="or_test" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}or_testType"/>
 *         &lt;element name="not_test" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}not_testType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "not_testType", propOrder = {
    "variableTest",
    "andTest",
    "orTest",
    "notTest"
})
public class NotTestType {

    @XmlElement(name = "variable_test")
    protected VariableTestType variableTest;
    @XmlElement(name = "and_test")
    protected AndTestType andTest;
    @XmlElement(name = "or_test")
    protected OrTestType orTest;
    @XmlElement(name = "not_test")
    protected NotTestType notTest;

    /**
     * Gets the value of the variableTest property.
     * 
     * @return
     *     possible object is
     *     {@link VariableTestType }
     *     
     */
    public VariableTestType getVariableTest() {
        return variableTest;
    }

    /**
     * Sets the value of the variableTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableTestType }
     *     
     */
    public void setVariableTest(VariableTestType value) {
        this.variableTest = value;
    }

    /**
     * Gets the value of the andTest property.
     * 
     * @return
     *     possible object is
     *     {@link AndTestType }
     *     
     */
    public AndTestType getAndTest() {
        return andTest;
    }

    /**
     * Sets the value of the andTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndTestType }
     *     
     */
    public void setAndTest(AndTestType value) {
        this.andTest = value;
    }

    /**
     * Gets the value of the orTest property.
     * 
     * @return
     *     possible object is
     *     {@link OrTestType }
     *     
     */
    public OrTestType getOrTest() {
        return orTest;
    }

    /**
     * Sets the value of the orTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrTestType }
     *     
     */
    public void setOrTest(OrTestType value) {
        this.orTest = value;
    }

    /**
     * Gets the value of the notTest property.
     * 
     * @return
     *     possible object is
     *     {@link NotTestType }
     *     
     */
    public NotTestType getNotTest() {
        return notTest;
    }

    /**
     * Sets the value of the notTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotTestType }
     *     
     */
    public void setNotTest(NotTestType value) {
        this.notTest = value;
    }

}
