
package com.webex.schemas._2002._06.service.event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customFieldsInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customFieldsInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textBox" type="{http://www.webex.com/schemas/2002/06/service/event}textboxInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="checkBoxGroup" type="{http://www.webex.com/schemas/2002/06/service/event}checkboxGroupInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="optionButtonGroup" type="{http://www.webex.com/schemas/2002/06/service/event}choiceGroupInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dropDownGroup" type="{http://www.webex.com/schemas/2002/06/service/event}choiceGroupInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customFieldsInstanceType", propOrder = {
    "textBox",
    "checkBoxGroup",
    "optionButtonGroup",
    "dropDownGroup"
})
public class CustomFieldsInstanceType {

    protected List<TextboxInstanceType> textBox;
    protected List<CheckboxGroupInstanceType> checkBoxGroup;
    protected List<ChoiceGroupInstanceType> optionButtonGroup;
    protected List<ChoiceGroupInstanceType> dropDownGroup;

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
     * {@link TextboxInstanceType }
     * 
     * 
     */
    public List<TextboxInstanceType> getTextBox() {
        if (textBox == null) {
            textBox = new ArrayList<TextboxInstanceType>();
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
     * {@link CheckboxGroupInstanceType }
     * 
     * 
     */
    public List<CheckboxGroupInstanceType> getCheckBoxGroup() {
        if (checkBoxGroup == null) {
            checkBoxGroup = new ArrayList<CheckboxGroupInstanceType>();
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
     * {@link ChoiceGroupInstanceType }
     * 
     * 
     */
    public List<ChoiceGroupInstanceType> getOptionButtonGroup() {
        if (optionButtonGroup == null) {
            optionButtonGroup = new ArrayList<ChoiceGroupInstanceType>();
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
     * {@link ChoiceGroupInstanceType }
     * 
     * 
     */
    public List<ChoiceGroupInstanceType> getDropDownGroup() {
        if (dropDownGroup == null) {
            dropDownGroup = new ArrayList<ChoiceGroupInstanceType>();
        }
        return this.dropDownGroup;
    }

}
