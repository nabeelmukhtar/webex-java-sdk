
package com.webex.schemas._2002._06.service.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for setOpportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setOpportunity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="webExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opportunity" type="{http://www.webex.com/schemas/2002/06/service/sales}opptyInstanceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOpportunity", propOrder = {
    "webExID",
    "opportunity"
})
public class SetOpportunity
    extends BodyContentType
{

    protected String webExID;
    @XmlElement(required = true)
    protected OpptyInstanceType opportunity;

    /**
     * Gets the value of the webExID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebExID() {
        return webExID;
    }

    /**
     * Sets the value of the webExID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebExID(String value) {
        this.webExID = value;
    }

    /**
     * Gets the value of the opportunity property.
     * 
     * @return
     *     possible object is
     *     {@link OpptyInstanceType }
     *     
     */
    public OpptyInstanceType getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the value of the opportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpptyInstanceType }
     *     
     */
    public void setOpportunity(OpptyInstanceType value) {
        this.opportunity = value;
    }

}
