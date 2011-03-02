
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for and_testType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="and_testType">
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
@XmlType(name = "and_testType", propOrder = {
    "variableTestOrAndTestOrOrTest"
})
public class AndTestType {

    @XmlElements({
        @XmlElement(name = "or_test", type = OrTestType.class),
        @XmlElement(name = "variable_test", type = VariableTestType.class),
        @XmlElement(name = "and_test", type = AndTestType.class),
        @XmlElement(name = "not_test", type = NotTestType.class)
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
     * {@link VariableTestType }
     * {@link AndTestType }
     * {@link NotTestType }
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
