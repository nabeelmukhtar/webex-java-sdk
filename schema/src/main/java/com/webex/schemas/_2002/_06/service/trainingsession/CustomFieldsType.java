
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customFieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customFieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textBox" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}textboxType" minOccurs="0"/>
 *         &lt;element name="checkBoxGroup" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}checkboxGroupType" minOccurs="0"/>
 *         &lt;element name="optionButtonGroup" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}choiceGroupType" minOccurs="0"/>
 *         &lt;element name="dropDownGroup" type="{http://www.webex.com/schemas/2002/06/service/trainingsession}choiceGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customFieldsType", propOrder = {
    "textBox",
    "checkBoxGroup",
    "optionButtonGroup",
    "dropDownGroup"
})
public class CustomFieldsType {

    protected TextboxType textBox;
    protected CheckboxGroupType checkBoxGroup;
    protected ChoiceGroupType optionButtonGroup;
    protected ChoiceGroupType dropDownGroup;

    /**
     * Gets the value of the textBox property.
     * 
     * @return
     *     possible object is
     *     {@link TextboxType }
     *     
     */
    public TextboxType getTextBox() {
        return textBox;
    }

    /**
     * Sets the value of the textBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextboxType }
     *     
     */
    public void setTextBox(TextboxType value) {
        this.textBox = value;
    }

    /**
     * Gets the value of the checkBoxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CheckboxGroupType }
     *     
     */
    public CheckboxGroupType getCheckBoxGroup() {
        return checkBoxGroup;
    }

    /**
     * Sets the value of the checkBoxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckboxGroupType }
     *     
     */
    public void setCheckBoxGroup(CheckboxGroupType value) {
        this.checkBoxGroup = value;
    }

    /**
     * Gets the value of the optionButtonGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceGroupType }
     *     
     */
    public ChoiceGroupType getOptionButtonGroup() {
        return optionButtonGroup;
    }

    /**
     * Sets the value of the optionButtonGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceGroupType }
     *     
     */
    public void setOptionButtonGroup(ChoiceGroupType value) {
        this.optionButtonGroup = value;
    }

    /**
     * Gets the value of the dropDownGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceGroupType }
     *     
     */
    public ChoiceGroupType getDropDownGroup() {
        return dropDownGroup;
    }

    /**
     * Sets the value of the dropDownGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceGroupType }
     *     
     */
    public void setDropDownGroup(ChoiceGroupType value) {
        this.dropDownGroup = value;
    }

}
