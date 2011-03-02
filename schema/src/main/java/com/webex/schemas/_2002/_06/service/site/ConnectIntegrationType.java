
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectIntegrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectIntegrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectServerURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectNameSpaceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectIntegrationType", propOrder = {
    "connectServerURL",
    "connectOrganization",
    "connectNameSpaceID"
})
public class ConnectIntegrationType {

    protected String connectServerURL;
    protected String connectOrganization;
    protected String connectNameSpaceID;

    /**
     * Gets the value of the connectServerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectServerURL() {
        return connectServerURL;
    }

    /**
     * Sets the value of the connectServerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectServerURL(String value) {
        this.connectServerURL = value;
    }

    /**
     * Gets the value of the connectOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectOrganization() {
        return connectOrganization;
    }

    /**
     * Sets the value of the connectOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectOrganization(String value) {
        this.connectOrganization = value;
    }

    /**
     * Gets the value of the connectNameSpaceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectNameSpaceID() {
        return connectNameSpaceID;
    }

    /**
     * Sets the value of the connectNameSpaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectNameSpaceID(String value) {
        this.connectNameSpaceID = value;
    }

}
