
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for not_objectsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="not_objectsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
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
@XmlType(name = "not_objectsType", propOrder = {
    "outcomesMetadata",
    "andObjects",
    "orObjects",
    "notObjects"
})
public class NotObjectsType {

    @XmlElement(name = "outcomes_metadata")
    protected OutcomesMetadataType outcomesMetadata;
    @XmlElement(name = "and_objects")
    protected AndObjectsType andObjects;
    @XmlElement(name = "or_objects")
    protected OrObjectsType orObjects;
    @XmlElement(name = "not_objects")
    protected NotObjectsType notObjects;

    /**
     * Gets the value of the outcomesMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomesMetadataType }
     *     
     */
    public OutcomesMetadataType getOutcomesMetadata() {
        return outcomesMetadata;
    }

    /**
     * Sets the value of the outcomesMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomesMetadataType }
     *     
     */
    public void setOutcomesMetadata(OutcomesMetadataType value) {
        this.outcomesMetadata = value;
    }

    /**
     * Gets the value of the andObjects property.
     * 
     * @return
     *     possible object is
     *     {@link AndObjectsType }
     *     
     */
    public AndObjectsType getAndObjects() {
        return andObjects;
    }

    /**
     * Sets the value of the andObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndObjectsType }
     *     
     */
    public void setAndObjects(AndObjectsType value) {
        this.andObjects = value;
    }

    /**
     * Gets the value of the orObjects property.
     * 
     * @return
     *     possible object is
     *     {@link OrObjectsType }
     *     
     */
    public OrObjectsType getOrObjects() {
        return orObjects;
    }

    /**
     * Sets the value of the orObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrObjectsType }
     *     
     */
    public void setOrObjects(OrObjectsType value) {
        this.orObjects = value;
    }

    /**
     * Gets the value of the notObjects property.
     * 
     * @return
     *     possible object is
     *     {@link NotObjectsType }
     *     
     */
    public NotObjectsType getNotObjects() {
        return notObjects;
    }

    /**
     * Sets the value of the notObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotObjectsType }
     *     
     */
    public void setNotObjects(NotObjectsType value) {
        this.notObjects = value;
    }

}
