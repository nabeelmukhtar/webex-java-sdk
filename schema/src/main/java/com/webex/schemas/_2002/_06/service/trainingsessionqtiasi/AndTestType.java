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

package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AndTestType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "and_testType", propOrder = {
    "variableTestOrAndTestOrOrTest"
})
public class AndTestType implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The variable test or and test or or test. */
    @XmlElements({
        @XmlElement(name = "not_test", type = NotTestType.class),
        @XmlElement(name = "or_test", type = OrTestType.class),
        @XmlElement(name = "variable_test", type = VariableTestType.class),
        @XmlElement(name = "and_test", type = AndTestType.class)
    })
    protected List<Object> variableTestOrAndTestOrOrTest;

    /**
     * Gets the variable test or and test or or test.
     * 
     * @return the variable test or and test or or test
     */
    public List<Object> getVariableTestOrAndTestOrOrTest() {
        if (variableTestOrAndTestOrOrTest == null) {
            variableTestOrAndTestOrOrTest = new ArrayList<Object>();
        }
        return this.variableTestOrAndTestOrOrTest;
    }

}
