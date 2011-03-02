
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salesCenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salesCenterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roles" type="{http://www.webex.com/schemas/2002/06/service/user}salesRoleType" minOccurs="0"/>
 *         &lt;element name="manager" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="smeInfo" type="{http://www.webex.com/schemas/2002/06/service/user}salesSmeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesCenterType", propOrder = {
    "roles",
    "manager",
    "smeInfo"
})
public class SalesCenterType {

    protected SalesRoleType roles;
    protected String manager;
    protected SalesSmeType smeInfo;

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRoleType }
     *     
     */
    public SalesRoleType getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRoleType }
     *     
     */
    public void setRoles(SalesRoleType value) {
        this.roles = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the smeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SalesSmeType }
     *     
     */
    public SalesSmeType getSmeInfo() {
        return smeInfo;
    }

    /**
     * Sets the value of the smeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesSmeType }
     *     
     */
    public void setSmeInfo(SalesSmeType value) {
        this.smeInfo = value;
    }

}
