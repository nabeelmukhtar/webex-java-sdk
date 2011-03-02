
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for authenticateUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authenticateUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="samlResponse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticateUser", propOrder = {
    "samlResponse"
})
public class AuthenticateUser
    extends BodyContentType
{

    @XmlElement(required = true)
    protected String samlResponse;

    /**
     * Gets the value of the samlResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamlResponse() {
        return samlResponse;
    }

    /**
     * Sets the value of the samlResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamlResponse(String value) {
        this.samlResponse = value;
    }

}
