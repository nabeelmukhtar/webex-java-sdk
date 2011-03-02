
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allServiceBarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allServiceBarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customLinks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/site}customLinkType">
 *                 &lt;sequence>
 *                   &lt;element name="groupLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="support" type="{http://www.webex.com/schemas/2002/06/service/site}linkType" minOccurs="0"/>
 *         &lt;element name="training" type="{http://www.webex.com/schemas/2002/06/service/site}linkType" minOccurs="0"/>
 *         &lt;element name="supportMenu" type="{http://www.webex.com/schemas/2002/06/service/site}menuType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allServiceBarType", propOrder = {
    "customLinks",
    "support",
    "training",
    "supportMenu"
})
public class AllServiceBarType {

    protected AllServiceBarType.CustomLinks customLinks;
    protected LinkType support;
    protected LinkType training;
    protected MenuType supportMenu;

    /**
     * Gets the value of the customLinks property.
     * 
     * @return
     *     possible object is
     *     {@link AllServiceBarType.CustomLinks }
     *     
     */
    public AllServiceBarType.CustomLinks getCustomLinks() {
        return customLinks;
    }

    /**
     * Sets the value of the customLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllServiceBarType.CustomLinks }
     *     
     */
    public void setCustomLinks(AllServiceBarType.CustomLinks value) {
        this.customLinks = value;
    }

    /**
     * Gets the value of the support property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType }
     *     
     */
    public LinkType getSupport() {
        return support;
    }

    /**
     * Sets the value of the support property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *     
     */
    public void setSupport(LinkType value) {
        this.support = value;
    }

    /**
     * Gets the value of the training property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType }
     *     
     */
    public LinkType getTraining() {
        return training;
    }

    /**
     * Sets the value of the training property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *     
     */
    public void setTraining(LinkType value) {
        this.training = value;
    }

    /**
     * Gets the value of the supportMenu property.
     * 
     * @return
     *     possible object is
     *     {@link MenuType }
     *     
     */
    public MenuType getSupportMenu() {
        return supportMenu;
    }

    /**
     * Sets the value of the supportMenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link MenuType }
     *     
     */
    public void setSupportMenu(MenuType value) {
        this.supportMenu = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/site}customLinkType">
     *       &lt;sequence>
     *         &lt;element name="groupLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "groupLabel"
    })
    public static class CustomLinks
        extends CustomLinkType
    {

        protected String groupLabel;

        /**
         * Gets the value of the groupLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupLabel() {
            return groupLabel;
        }

        /**
         * Sets the value of the groupLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupLabel(String value) {
            this.groupLabel = value;
        }

    }

}
