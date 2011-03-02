
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conditionvarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conditionvarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="not" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}notType"/>
 *         &lt;element name="varequal" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}varequalType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conditionvarType", propOrder = {
    "notOrVarequal"
})
public class ConditionvarType {

    @XmlElements({
        @XmlElement(name = "not", type = NotType.class),
        @XmlElement(name = "varequal", type = VarequalType.class)
    })
    protected List<Object> notOrVarequal;

    /**
     * Gets the value of the notOrVarequal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notOrVarequal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotOrVarequal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotType }
     * {@link VarequalType }
     * 
     * 
     */
    public List<Object> getNotOrVarequal() {
        if (notOrVarequal == null) {
            notOrVarequal = new ArrayList<Object>();
        }
        return this.notOrVarequal;
    }

}
