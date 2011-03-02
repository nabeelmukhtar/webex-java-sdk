
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
 * <p>Java class for render_sliderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="render_sliderType">
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
 *       &lt;attribute name="orientation" default="Horizontal">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Horizontal"/>
 *             &lt;enumeration value="Vertical"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="lowerbound" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="upperbound" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="step" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startval" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="steplabel" default="No">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxnumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minnumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "render_sliderType", propOrder = {
    "materialOrMaterialRefOrResponseLabel",
    "responseNa"
})
public class RenderSliderType {

    @XmlElements({
        @XmlElement(name = "material", type = MaterialType.class),
        @XmlElement(name = "flow_label", type = FlowLabelType.class),
        @XmlElement(name = "response_label", type = ResponseLabelType.class),
        @XmlElement(name = "material_ref", type = MaterialRefType.class)
    })
    protected List<Object> materialOrMaterialRefOrResponseLabel;
    @XmlElement(name = "response_na")
    protected ResponseNaType responseNa;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(required = true)
    protected String lowerbound;
    @XmlAttribute(required = true)
    protected String upperbound;
    @XmlAttribute
    protected String step;
    @XmlAttribute
    protected String startval;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String steplabel;
    @XmlAttribute
    protected String maxnumber;
    @XmlAttribute
    protected String minnumber;

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
     * {@link MaterialType }
     * {@link FlowLabelType }
     * {@link ResponseLabelType }
     * {@link MaterialRefType }
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
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "Horizontal";
        } else {
            return orientation;
        }
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the lowerbound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerbound() {
        return lowerbound;
    }

    /**
     * Sets the value of the lowerbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerbound(String value) {
        this.lowerbound = value;
    }

    /**
     * Gets the value of the upperbound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperbound() {
        return upperbound;
    }

    /**
     * Sets the value of the upperbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperbound(String value) {
        this.upperbound = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStep(String value) {
        this.step = value;
    }

    /**
     * Gets the value of the startval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartval() {
        return startval;
    }

    /**
     * Sets the value of the startval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartval(String value) {
        this.startval = value;
    }

    /**
     * Gets the value of the steplabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSteplabel() {
        if (steplabel == null) {
            return "No";
        } else {
            return steplabel;
        }
    }

    /**
     * Sets the value of the steplabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSteplabel(String value) {
        this.steplabel = value;
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

}
