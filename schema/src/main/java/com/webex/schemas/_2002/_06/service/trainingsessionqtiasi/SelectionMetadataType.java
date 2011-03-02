
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for selection_metadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selection_metadataType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="mdname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mdoperator" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="EQ"/>
 *             &lt;enumeration value="NEQ"/>
 *             &lt;enumeration value="LT"/>
 *             &lt;enumeration value="LTE"/>
 *             &lt;enumeration value="GT"/>
 *             &lt;enumeration value="GTE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selection_metadataType", propOrder = {
    "value"
})
public class SelectionMetadataType {

    @XmlValue
    protected String value;
    @XmlAttribute(required = true)
    protected String mdname;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mdoperator;

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
     * Gets the value of the mdname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdname() {
        return mdname;
    }

    /**
     * Sets the value of the mdname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdname(String value) {
        this.mdname = value;
    }

    /**
     * Gets the value of the mdoperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdoperator() {
        return mdoperator;
    }

    /**
     * Sets the value of the mdoperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdoperator(String value) {
        this.mdoperator = value;
    }

}
