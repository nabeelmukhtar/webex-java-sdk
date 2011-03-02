
package com.webex.schemas._2002._06.service.trainingsession;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkboxGroupInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkboxGroupInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/trainingsession}checkboxType">
 *       &lt;sequence>
 *         &lt;element name="fieldID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkboxGroupInstanceType", propOrder = {
    "fieldID"
})
public class CheckboxGroupInstanceType
    extends CheckboxType
{

    protected Long fieldID;

    /**
     * Gets the value of the fieldID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFieldID() {
        return fieldID;
    }

    /**
     * Sets the value of the fieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFieldID(Long value) {
        this.fieldID = value;
    }

}
