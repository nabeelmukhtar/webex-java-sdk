
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leadSourceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="avgLeadScore" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceType", propOrder = {
    "leadSourceID",
    "count",
    "avgLeadScore"
})
public class SourceType {

    @XmlElement(required = true)
    protected String leadSourceID;
    protected long count;
    protected float avgLeadScore;

    /**
     * Gets the value of the leadSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadSourceID() {
        return leadSourceID;
    }

    /**
     * Sets the value of the leadSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadSourceID(String value) {
        this.leadSourceID = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the avgLeadScore property.
     * 
     */
    public float getAvgLeadScore() {
        return avgLeadScore;
    }

    /**
     * Sets the value of the avgLeadScore property.
     * 
     */
    public void setAvgLeadScore(float value) {
        this.avgLeadScore = value;
    }

}
