//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.28 at 12:47:51 PM GMT+05:00 
//


package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ocMetaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ocMetaDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/ep}oneClickMetaDataType">
 *       &lt;sequence>
 *         &lt;element name="sessionTemplate" type="{http://www.webex.com/schemas/2002/06/service/ep}sessionTemplateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocMetaDataType", propOrder = {
    "sessionTemplate"
})
public class OcMetaDataType
    extends OneClickMetaDataType
{

    protected SessionTemplateType sessionTemplate;

    /**
     * Gets the value of the sessionTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link SessionTemplateType }
     *     
     */
    public SessionTemplateType getSessionTemplate() {
        return sessionTemplate;
    }

    /**
     * Sets the value of the sessionTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionTemplateType }
     *     
     */
    public void setSessionTemplate(SessionTemplateType value) {
        this.sessionTemplate = value;
    }

}
