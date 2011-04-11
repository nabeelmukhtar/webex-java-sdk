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
    protected List<TextboxType> textBox;
    
    /** The check box group. */
    protected List<CheckboxGroupType> checkBoxGroup;
    
    /** The option button group. */
    protected List<ChoiceGroupType> optionButtonGroup;
    
    /** The drop down group. */
    protected List<ChoiceGroupType> dropDownGroup;

    /**
     * Gets the text box.
     * 
     * @return the text box
     */
    public List<TextboxType> getTextBox() {
        if (textBox == null) {
            textBox = new ArrayList<TextboxType>();
        }
        return this.textBox;
    }

    /**
     * Gets the check box group.
     * 
     * @return the check box group
     */
    public List<CheckboxGroupType> getCheckBoxGroup() {
        if (checkBoxGroup == null) {
            checkBoxGroup = new ArrayList<CheckboxGroupType>();
        }
        return this.checkBoxGroup;
    }

    /**
     * Gets the option button group.
     * 
     * @return the option button group
     */
    public List<ChoiceGroupType> getOptionButtonGroup() {
        if (optionButtonGroup == null) {
            optionButtonGroup = new ArrayList<ChoiceGroupType>();
        }
        return this.optionButtonGroup;
    }

    /**
     * Gets the drop down group.
     * 
     * @return the drop down group
     */
    public List<ChoiceGroupType> getDropDownGroup() {
        if (dropDownGroup == null) {
            dropDownGroup = new ArrayList<ChoiceGroupType>();
        }
        return this.dropDownGroup;
    }

}
