//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:48:01 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for render_hotspotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="render_hotspotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="material" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}materialType"/>
 *           &lt;element name="material_ref" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}material_refType"/>
 *           &lt;element name="response_label" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}response_labelType"/>
 *           &lt;element name="flow_label" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}flow_labelType"/>
 *         &lt;/choice>
 *         &lt;element name="response_na" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}response_naType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="maxnumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minnumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="showdraw" default="No">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
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
@XmlType(name = "render_hotspotType", propOrder = {
    "materialOrMaterialRefOrResponseLabel",
    "responseNa"
})
public class RenderHotspotType {

    @XmlElements({
        @XmlElement(name = "flow_label", type = FlowLabelType.class),
        @XmlElement(name = "material", type = MaterialType.class),
        @XmlElement(name = "material_ref", type = MaterialRefType.class),
        @XmlElement(name = "response_label", type = ResponseLabelType.class)
    })
    protected List<Object> materialOrMaterialRefOrResponseLabel;
    @XmlElement(name = "response_na")
    protected ResponseNaType responseNa;
    @XmlAttribute
    protected String maxnumber;
    @XmlAttribute
    protected String minnumber;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String showdraw;

    /**
     * Gets the value of the materialOrMaterialRefOrResponseLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialOrMaterialRefOrResponseLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialOrMaterialRefOrResponseLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowLabelType }
     * {@link MaterialType }
     * {@link MaterialRefType }
     * {@link ResponseLabelType }
     * 
     * 
     */
    public List<Object> getMaterialOrMaterialRefOrResponseLabel() {
        if (materialOrMaterialRefOrResponseLabel == null) {
            materialOrMaterialRefOrResponseLabel = new ArrayList<Object>();
        }
        return this.materialOrMaterialRefOrResponseLabel;
    }

    /**
     * Gets the value of the responseNa property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseNaType }
     *     
     */
    public ResponseNaType getResponseNa() {
        return responseNa;
    }

    /**
     * Sets the value of the responseNa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseNaType }
     *     
     */
    public void setResponseNa(ResponseNaType value) {
        this.responseNa = value;
    }

    /**
     * Gets the value of the maxnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxnumber() {
        return maxnumber;
    }

    /**
     * Sets the value of the maxnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxnumber(String value) {
        this.maxnumber = value;
    }

    /**
     * Gets the value of the minnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinnumber() {
        return minnumber;
    }

    /**
     * Sets the value of the minnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinnumber(String value) {
        this.minnumber = value;
    }

    /**
     * Gets the value of the showdraw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowdraw() {
        if (showdraw == null) {
            return "No";
        } else {
            return showdraw;
        }
    }

    /**
     * Sets the value of the showdraw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowdraw(String value) {
        this.showdraw = value;
    }

}
