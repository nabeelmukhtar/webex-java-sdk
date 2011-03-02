
package com.webex.schemas._2002._06.service.trainingsessionqti;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for score_item_result_outcomesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="score_item_result_outcomesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="score_value" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="score_interpretation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2048"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="score_min" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="score_max" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="varname" type="{http://www.w3.org/2001/XMLSchema}string" default="SCORE" />
 *       &lt;attribute name="vartype" default="Integer">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Integer"/>
 *             &lt;enumeration value="Decimal"/>
 *             &lt;enumeration value="String"/>
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
@XmlType(name = "score_item_result_outcomesType", propOrder = {
    "scoreValue",
    "scoreInterpretation",
    "scoreMin",
    "scoreMax"
})
public class ScoreItemResultOutcomesType {

    @XmlElement(name = "score_value", required = true, defaultValue = "0")
    protected BigInteger scoreValue;
    @XmlElement(name = "score_interpretation", required = true)
    protected String scoreInterpretation;
    @XmlElement(name = "score_min", required = true, defaultValue = "0")
    protected BigInteger scoreMin;
    @XmlElement(name = "score_max", required = true, defaultValue = "0")
    protected BigInteger scoreMax;
    @XmlAttribute
    protected String varname;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vartype;

    /**
     * Gets the value of the scoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScoreValue() {
        return scoreValue;
    }

    /**
     * Sets the value of the scoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScoreValue(BigInteger value) {
        this.scoreValue = value;
    }

    /**
     * Gets the value of the scoreInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreInterpretation() {
        return scoreInterpretation;
    }

    /**
     * Sets the value of the scoreInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreInterpretation(String value) {
        this.scoreInterpretation = value;
    }

    /**
     * Gets the value of the scoreMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScoreMin() {
        return scoreMin;
    }

    /**
     * Sets the value of the scoreMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScoreMin(BigInteger value) {
        this.scoreMin = value;
    }

    /**
     * Gets the value of the scoreMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScoreMax() {
        return scoreMax;
    }

    /**
     * Sets the value of the scoreMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScoreMax(BigInteger value) {
        this.scoreMax = value;
    }

    /**
     * Gets the value of the varname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarname() {
        if (varname == null) {
            return "SCORE";
        } else {
            return varname;
        }
    }

    /**
     * Sets the value of the varname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarname(String value) {
        this.varname = value;
    }

    /**
     * Gets the value of the vartype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartype() {
        if (vartype == null) {
            return "Integer";
        } else {
            return vartype;
        }
    }

    /**
     * Sets the value of the vartype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartype(String value) {
        this.vartype = value;
    }

}
