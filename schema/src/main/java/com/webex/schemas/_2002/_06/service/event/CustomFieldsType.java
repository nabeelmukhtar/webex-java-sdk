//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:47:51 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.event;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="textBox" type="{http://www.webex.com/schemas/2002/06/service/event}textboxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="checkBoxGroup" type="{http://www.webex.com/schemas/2002/06/service/event}checkboxGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="optionButtonGroup" type="{http://www.webex.com/schemas/2002/06/service/event}choiceGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dropDownGroup" type="{http://www.webex.com/schemas/2002/06/service/event}choiceGroupType" maxOccurs="unbounded" minOccurs="0"/>
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

    protected List<TextboxType> textBox;
    protected List<CheckboxGroupType> checkBoxGroup;
    protected List<ChoiceGroupType> optionButtonGroup;
    protected List<ChoiceGroupType> dropDownGroup;

    /**
     * Gets the value of the textBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextboxType }
     * 
     * 
     */
    public List<TextboxType> getTextBox() {
        if (textBox == null) {
            textBox = new ArrayList<TextboxType>();
        }
        return this.textBox;
    }

    /**
     * Gets the value of the checkBoxGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkBoxGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckBoxGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckboxGroupType }
     * 
     * 
     */
    public List<CheckboxGroupType> getCheckBoxGroup() {
        if (checkBoxGroup == null) {
            checkBoxGroup = new ArrayList<CheckboxGroupType>();
        }
        return this.checkBoxGroup;
    }

    /**
     * Gets the value of the optionButtonGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionButtonGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionButtonGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChoiceGroupType }
     * 
     * 
     */
    public List<ChoiceGroupType> getOptionButtonGroup() {
        if (optionButtonGroup == null) {
            optionButtonGroup = new ArrayList<ChoiceGroupType>();
        }
        return this.optionButtonGroup;
    }

    /**
     * Gets the value of the dropDownGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dropDownGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDropDownGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChoiceGroupType }
     * 
     * 
     */
    public List<ChoiceGroupType> getDropDownGroup() {
        if (dropDownGroup == null) {
            dropDownGroup = new ArrayList<ChoiceGroupType>();
        }
        return this.dropDownGroup;
    }

}
