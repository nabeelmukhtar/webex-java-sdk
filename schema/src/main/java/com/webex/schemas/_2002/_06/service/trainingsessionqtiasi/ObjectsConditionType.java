
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for objects_conditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objects_conditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qticomment" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qticommentType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="outcomes_metadata" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}outcomes_metadataType"/>
 *           &lt;element name="and_objects" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}and_objectsType"/>
 *           &lt;element name="or_objects" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}or_objectsType"/>
 *           &lt;element name="not_objects" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}not_objectsType"/>
 *         &lt;/choice>
 *         &lt;element name="objects_parameter" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}objects_parameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="map_input" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}map_inputType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}objectscond_extension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objects_conditionType", propOrder = {
    "qticomment",
    "outcomesMetadata",
    "andObjects",
    "orObjects",
    "notObjects",
    "objectsParameter",
    "mapInput",
    "objectscondExtension"
})
public class ObjectsConditionType {

    protected QticommentType qticomment;
    @XmlElement(name = "outcomes_metadata")
    protected OutcomesMetadataType outcomesMetadata;
    @XmlElement(name = "and_objects")
    protected AndObjectsType andObjects;
    @XmlElement(name = "or_objects")
    protected OrObjectsType orObjects;
    @XmlElement(name = "not_objects")
    protected NotObjectsType notObjects;
    @XmlElement(name = "objects_parameter")
    protected List<ObjectsParameterType> objectsParameter;
    @XmlElement(name = "map_input")
    protected List<MapInputType> mapInput;
    @XmlElement(name = "objectscond_extension")
    protected String objectscondExtension;

    /**
     * Gets the value of the qticomment property.
     * 
     * @return
     *     possible object is
     *     {@link QticommentType }
     *     
     */
    public QticommentType getQticomment() {
        return qticomment;
    }

    /**
     * Sets the value of the qticomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QticommentType }
     *     
     */
    public void setQticomment(QticommentType value) {
        this.qticomment = value;
    }

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

    /**
     * Gets the value of the objectsParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectsParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectsParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectsParameterType }
     * 
     * 
     */
    public List<ObjectsParameterType> getObjectsParameter() {
        if (objectsParameter == null) {
            objectsParameter = new ArrayList<ObjectsParameterType>();
        }
        return this.objectsParameter;
    }

    /**
     * Gets the value of the mapInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapInputType }
     * 
     * 
     */
    public List<MapInputType> getMapInput() {
        if (mapInput == null) {
            mapInput = new ArrayList<MapInputType>();
        }
        return this.mapInput;
    }

    /**
     * Gets the value of the objectscondExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectscondExtension() {
        return objectscondExtension;
    }

    /**
     * Sets the value of the objectscondExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectscondExtension(String value) {
        this.objectscondExtension = value;
    }

}
