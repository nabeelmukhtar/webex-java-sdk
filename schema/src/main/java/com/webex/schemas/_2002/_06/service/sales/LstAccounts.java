
package com.webex.schemas._2002._06.service.sales;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for lstAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstAccounts">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="webExID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intAccountID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="extAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extSystemID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="returnOppty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstAccounts", propOrder = {
    "webExID",
    "intAccountID",
    "extAccountID",
    "extSystemID",
    "returnOppty"
})
public class LstAccounts
    extends BodyContentType
{

    protected String webExID;
    protected BigInteger intAccountID;
    protected String extAccountID;
    protected BigInteger extSystemID;
    @XmlElement(defaultValue = "false")
    protected Boolean returnOppty;

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

    /**
     * Gets the value of the extAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtAccountID() {
        return extAccountID;
    }

    /**
     * Sets the value of the extAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtAccountID(String value) {
        this.extAccountID = value;
    }

    /**
     * Gets the value of the extSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtSystemID() {
        return extSystemID;
    }

    /**
     * Sets the value of the extSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtSystemID(BigInteger value) {
        this.extSystemID = value;
    }

    /**
     * Gets the value of the returnOppty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnOppty() {
        return returnOppty;
    }

    /**
     * Sets the value of the returnOppty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOppty(Boolean value) {
        this.returnOppty = value;
    }

}
