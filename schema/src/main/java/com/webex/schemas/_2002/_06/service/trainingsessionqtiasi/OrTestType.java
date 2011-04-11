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
 * <p>Java class for or_testType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="or_testType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
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
@XmlType(name = "or_testType", propOrder = {
    "variableTestOrAndTestOrOrTest"
})
public class OrTestType implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElements({
        @XmlElement(name = "or_test", type = OrTestType.class),
        @XmlElement(name = "not_test", type = NotTestType.class),
        @XmlElement(name = "and_test", type = AndTestType.class),
        @XmlElement(name = "variable_test", type = VariableTestType.class)
    })
    protected List<Object> variableTestOrAndTestOrOrTest;

    /**
     * Gets the value of the variableTestOrAndTestOrOrTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableTestOrAndTestOrOrTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableTestOrAndTestOrOrTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrTestType }
     * {@link NotTestType }
     * {@link AndTestType }
     * {@link VariableTestType }
     * 
     * 
     */
    public List<Object> getVariableTestOrAndTestOrOrTest() {
        if (variableTestOrAndTestOrOrTest == null) {
            variableTestOrAndTestOrOrTest = new ArrayList<Object>();
        }
        return this.variableTestOrAndTestOrOrTest;
    }

}
