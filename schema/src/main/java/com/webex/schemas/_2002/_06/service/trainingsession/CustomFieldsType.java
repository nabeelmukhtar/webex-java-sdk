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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class CustomFieldsType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The text box. */
    protected TextboxType textBox;
    
    /** The check box group. */
    protected CheckboxGroupType checkBoxGroup;
    
    /** The option button group. */
    protected ChoiceGroupType optionButtonGroup;
    
    /** The drop down group. */
    protected ChoiceGroupType dropDownGroup;

    /**
     * Gets the text box.
     * 
     * @return the text box
     */
    public TextboxType getTextBox() {
        return textBox;
    }

    /**
     * Sets the text box.
     * 
     * @param value the new text box
     */
    public void setTextBox(TextboxType value) {
        this.textBox = value;
    }

    /**
     * Gets the check box group.
     * 
     * @return the check box group
     */
    public CheckboxGroupType getCheckBoxGroup() {
        return checkBoxGroup;
    }

    /**
     * Sets the check box group.
     * 
     * @param value the new check box group
     */
    public void setCheckBoxGroup(CheckboxGroupType value) {
        this.checkBoxGroup = value;
    }

    /**
     * Gets the option button group.
     * 
     * @return the option button group
     */
    public ChoiceGroupType getOptionButtonGroup() {
        return optionButtonGroup;
    }

    /**
     * Sets the option button group.
     * 
     * @param value the new option button group
     */
    public void setOptionButtonGroup(ChoiceGroupType value) {
        this.optionButtonGroup = value;
    }

    /**
     * Gets the drop down group.
     * 
     * @return the drop down group
     */
    public ChoiceGroupType getDropDownGroup() {
        return dropDownGroup;
    }

    /**
     * Sets the drop down group.
     * 
     * @param value the new drop down group
     */
    public void setDropDownGroup(ChoiceGroupType value) {
        this.dropDownGroup = value;
    }

}
