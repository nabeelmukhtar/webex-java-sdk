
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for getlogouturlUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getlogouturlUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="webExID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="backURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getlogouturlUser", propOrder = {
    "webExID",
    "backURL"
})
public class GetlogouturlUser
    extends BodyContentType
{

    @XmlElement(required = true)
    protected String webExID;
    protected String backURL;

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
     * Gets the value of the backURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackURL() {
        return backURL;
    }

    /**
     * Sets the value of the backURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackURL(String value) {
        this.backURL = value;
    }

}
