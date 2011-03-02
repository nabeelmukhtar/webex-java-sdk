
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduleOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduleOnBehalf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="saveSessionTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleOptionsType", propOrder = {
    "scheduleOnBehalf",
    "saveSessionTemplate"
})
public class ScheduleOptionsType {

    protected Boolean scheduleOnBehalf;
    protected Boolean saveSessionTemplate;

    /**
     * Gets the value of the scheduleOnBehalf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduleOnBehalf() {
        return scheduleOnBehalf;
    }

    /**
     * Sets the value of the scheduleOnBehalf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleOnBehalf(Boolean value) {
        this.scheduleOnBehalf = value;
    }

    /**
     * Gets the value of the saveSessionTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveSessionTemplate() {
        return saveSessionTemplate;
    }

    /**
     * Sets the value of the saveSessionTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveSessionTemplate(Boolean value) {
        this.saveSessionTemplate = value;
    }

}
