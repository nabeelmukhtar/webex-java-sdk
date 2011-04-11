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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class CustomFieldsInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customFieldsInstanceType", propOrder = {
    "textBox",
    "checkBoxGroup",
    "optionButtonGroup",
    "dropDownGroup"
})
public class CustomFieldsInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The text box. */
    protected List<TextboxInstanceType> textBox;
    
    /** The check box group. */
    protected List<CheckboxGroupInstanceType> checkBoxGroup;
    
    /** The option button group. */
    protected List<ChoiceGroupInstanceType> optionButtonGroup;
    
    /** The drop down group. */
    protected List<ChoiceGroupInstanceType> dropDownGroup;

    /**
     * Gets the text box.
     * 
     * @return the text box
     */
    public List<TextboxInstanceType> getTextBox() {
        if (textBox == null) {
            textBox = new ArrayList<TextboxInstanceType>();
        }
        return this.textBox;
    }

    /**
     * Gets the check box group.
     * 
     * @return the check box group
     */
    public List<CheckboxGroupInstanceType> getCheckBoxGroup() {
        if (checkBoxGroup == null) {
            checkBoxGroup = new ArrayList<CheckboxGroupInstanceType>();
        }
        return this.checkBoxGroup;
    }

    /**
     * Gets the option button group.
     * 
     * @return the option button group
     */
    public List<ChoiceGroupInstanceType> getOptionButtonGroup() {
        if (optionButtonGroup == null) {
            optionButtonGroup = new ArrayList<ChoiceGroupInstanceType>();
        }
        return this.optionButtonGroup;
    }

    /**
     * Gets the drop down group.
     * 
     * @return the drop down group
     */
    public List<ChoiceGroupInstanceType> getDropDownGroup() {
        if (dropDownGroup == null) {
            dropDownGroup = new ArrayList<ChoiceGroupInstanceType>();
        }
        return this.dropDownGroup;
    }

}
