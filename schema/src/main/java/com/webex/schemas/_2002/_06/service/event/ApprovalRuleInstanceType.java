
package com.webex.schemas._2002._06.service.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approvalRuleInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approvalRuleInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/event}approvalRuleType">
 *       &lt;sequence>
 *         &lt;element name="enrollField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approvalRuleInstanceType", propOrder = {
    "enrollField"
})
public class ApprovalRuleInstanceType
    extends ApprovalRuleType
{

    @XmlElement(required = true)
    protected String enrollField;

    /**
     * Gets the value of the enrollField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollField() {
        return enrollField;
    }

    /**
     * Sets the value of the enrollField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollField(String value) {
        this.enrollField = value;
    }

}
