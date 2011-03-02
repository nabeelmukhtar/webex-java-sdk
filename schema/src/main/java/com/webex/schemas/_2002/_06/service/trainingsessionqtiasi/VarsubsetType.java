
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for varsubsetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="varsubsetType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="respident" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="setmatch" default="Exact">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Exact"/>
 *             &lt;enumeration value="Partial"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "varsubsetType", propOrder = {
    "value"
})
public class VarsubsetType {

    @XmlValue
    protected String value;
    @XmlAttribute(required = true)
    protected String respident;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String setmatch;
    @XmlAttribute
    protected String index;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the respident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespident() {
        return respident;
    }

    /**
     * Sets the value of the respident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespident(String value) {
        this.respident = value;
    }

    /**
     * Gets the value of the setmatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetmatch() {
        if (setmatch == null) {
            return "Exact";
        } else {
            return setmatch;
        }
    }

    /**
     * Sets the value of the setmatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetmatch(String value) {
        this.setmatch = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

}
