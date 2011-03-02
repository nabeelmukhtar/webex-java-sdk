
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for or_objectsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="or_objectsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="outcomes_metadata" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}outcomes_metadataType"/>
 *         &lt;element name="and_objects" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}and_objectsType"/>
 *         &lt;element name="or_objects" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}or_objectsType"/>
 *         &lt;element name="not_objects" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}not_objectsType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "or_objectsType", propOrder = {
    "outcomesMetadataOrAndObjectsOrOrObjects"
})
public class OrObjectsType {

    @XmlElements({
        @XmlElement(name = "and_objects", type = AndObjectsType.class),
        @XmlElement(name = "outcomes_metadata", type = OutcomesMetadataType.class),
        @XmlElement(name = "or_objects", type = OrObjectsType.class),
        @XmlElement(name = "not_objects", type = NotObjectsType.class)
    })
    protected List<Object> outcomesMetadataOrAndObjectsOrOrObjects;

    /**
     * Gets the value of the outcomesMetadataOrAndObjectsOrOrObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outcomesMetadataOrAndObjectsOrOrObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutcomesMetadataOrAndObjectsOrOrObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AndObjectsType }
     * {@link OutcomesMetadataType }
     * {@link OrObjectsType }
     * {@link NotObjectsType }
     * 
     * 
     */
    public List<Object> getOutcomesMetadataOrAndObjectsOrOrObjects() {
        if (outcomesMetadataOrAndObjectsOrOrObjects == null) {
            outcomesMetadataOrAndObjectsOrOrObjects = new ArrayList<Object>();
        }
        return this.outcomesMetadataOrAndObjectsOrOrObjects;
    }

}
