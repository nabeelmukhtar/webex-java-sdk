
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for getlogouturlUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getlogouturlUserResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="userLogoutURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getlogouturlUserResponse", propOrder = {
    "userLogoutURL"
})
public class GetlogouturlUserResponse
    extends BodyContentType
{

    protected String userLogoutURL;

    /**
     * Gets the value of the userLogoutURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLogoutURL() {
        return userLogoutURL;
    }

    /**
     * Sets the value of the userLogoutURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLogoutURL(String value) {
        this.userLogoutURL = value;
    }

}
