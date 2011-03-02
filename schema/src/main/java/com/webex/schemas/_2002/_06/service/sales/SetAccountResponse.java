
package com.webex.schemas._2002._06.service.sales;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for setAccountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setAccountResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="intAccountID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setAccountResponse", propOrder = {
    "intAccountID"
})
public class SetAccountResponse
    extends BodyContentType
{

    @XmlElement(required = true)
    protected BigInteger intAccountID;

    /**
     * Gets the value of the intAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntAccountID() {
        return intAccountID;
    }

    /**
     * Sets the value of the intAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntAccountID(BigInteger value) {
        this.intAccountID = value;
    }

}
