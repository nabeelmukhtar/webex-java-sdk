//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:48:01 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for itemrubricType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemrubricType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="material" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}materialType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="view" default="All">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="All"/>
 *             &lt;enumeration value="Administrator"/>
 *             &lt;enumeration value="AdminAuthority"/>
 *             &lt;enumeration value="Assessor"/>
 *             &lt;enumeration value="Author"/>
 *             &lt;enumeration value="Candidate"/>
 *             &lt;enumeration value="InvigilatorProctor"/>
 *             &lt;enumeration value="Psychometrician"/>
 *             &lt;enumeration value="Scorer"/>
 *             &lt;enumeration value="Tutor"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemrubricType", propOrder = {
    "material"
})
public class ItemrubricType {

    @XmlElement(required = true)
    protected MaterialType material;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String view;

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialType }
     *     
     */
    public MaterialType getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialType }
     *     
     */
    public void setMaterial(MaterialType value) {
        this.material = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getView() {
        if (view == null) {
            return "All";
        } else {
            return view;
        }
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setView(String value) {
        this.view = value;
    }

}
