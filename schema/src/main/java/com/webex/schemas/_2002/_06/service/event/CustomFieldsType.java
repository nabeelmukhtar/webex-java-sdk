/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.webex.schemas._2002._06.service.event;

import java.io.Serializable;
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
public class CustomFieldsType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
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
