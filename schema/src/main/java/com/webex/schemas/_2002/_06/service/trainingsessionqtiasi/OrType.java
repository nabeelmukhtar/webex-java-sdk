
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="not" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}notType"/>
 *         &lt;element name="and" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}andType"/>
 *         &lt;element name="or" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}orType"/>
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
@XmlType(name = "orType", propOrder = {
    "notOrAndOrOr"
})
public class OrType {

    @XmlElements({
        @XmlElement(name = "and", type = AndType.class),
        @XmlElement(name = "varequal", type = VarequalType.class),
        @XmlElement(name = "or", type = OrType.class),
        @XmlElement(name = "not", type = NotType.class)
    })
    protected List<Object> notOrAndOrOr;

    /**
     * Gets the value of the notOrAndOrOr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notOrAndOrOr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotOrAndOrOr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AndType }
     * {@link VarequalType }
     * {@link OrType }
     * {@link NotType }
     * 
     * 
     */
    public List<Object> getNotOrAndOrOr() {
        if (notOrAndOrOr == null) {
            notOrAndOrOr = new ArrayList<Object>();
        }
        return this.notOrAndOrOr;
    }

}
