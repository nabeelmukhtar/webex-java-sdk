
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for matappletType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matappletType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="y0" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="x0" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="embedded" type="{http://www.w3.org/2001/XMLSchema}string" default="base64" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matappletType", propOrder = {
    "value"
})
public class MatappletType {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected String label;
    @XmlAttribute
    protected String uri;
    @XmlAttribute
    protected String y0;
    @XmlAttribute
    protected String height;
    @XmlAttribute
    protected String width;
    @XmlAttribute
    protected String x0;
    @XmlAttribute
    protected String embedded;

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
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the y0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY0() {
        return y0;
    }

    /**
     * Sets the value of the y0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY0(String value) {
        this.y0 = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the x0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX0() {
        return x0;
    }

    /**
     * Sets the value of the x0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX0(String value) {
        this.x0 = value;
    }

    /**
     * Gets the value of the embedded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbedded() {
        if (embedded == null) {
            return "base64";
        } else {
            return embedded;
        }
    }

    /**
     * Sets the value of the embedded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbedded(String value) {
        this.embedded = value;
    }

}
