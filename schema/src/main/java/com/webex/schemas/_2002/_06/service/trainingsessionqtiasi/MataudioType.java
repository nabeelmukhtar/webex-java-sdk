
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for mataudioType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mataudioType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="audiotype" type="{http://www.w3.org/2001/XMLSchema}string" default="audio/base" />
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="embedded" type="{http://www.w3.org/2001/XMLSchema}string" default="base64" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mataudioType", propOrder = {
    "value"
})
public class MataudioType {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected String audiotype;
    @XmlAttribute
    protected String label;
    @XmlAttribute
    protected String uri;
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
     * Gets the value of the audiotype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudiotype() {
        if (audiotype == null) {
            return "audio/base";
        } else {
            return audiotype;
        }
    }

    /**
     * Sets the value of the audiotype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudiotype(String value) {
        this.audiotype = value;
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
