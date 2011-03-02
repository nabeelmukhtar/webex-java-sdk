
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for inactivateUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inactivateUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;choice>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="webexID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inactivateUser", propOrder = {
    "userID",
    "webexID"
})
public class InactivateUser
    extends BodyContentType
{

    protected Long userID;
    protected String webexID;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserID(Long value) {
        this.userID = value;
    }

    /**
     * Gets the value of the webexID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebexID() {
        return webexID;
    }

    /**
     * Sets the value of the webexID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebexID(String value) {
        this.webexID = value;
    }

}
