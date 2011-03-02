
package com.webex.schemas._2002._06.service.sales;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for opptyInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="opptyInstanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/sales}opptyType">
 *       &lt;sequence>
 *         &lt;element name="intOpptyID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opptyInstanceType", propOrder = {
    "intOpptyID"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.sales.LstOpportunitiesResponse.Opportunity.class
})
public class OpptyInstanceType
    extends OpptyType
{

    @XmlElement(required = true)
    protected BigInteger intOpptyID;

    /**
     * Gets the value of the intOpptyID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntOpptyID() {
        return intOpptyID;
    }

    /**
     * Sets the value of the intOpptyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntOpptyID(BigInteger value) {
        this.intOpptyID = value;
    }

}
