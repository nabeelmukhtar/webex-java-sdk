
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displayTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prodSvcAnnounce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainingInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eNewsletters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="promotionsOffers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pressReleases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayTypeType", propOrder = {
    "prodSvcAnnounce",
    "trainingInfo",
    "eNewsletters",
    "promotionsOffers",
    "pressReleases"
})
public class DisplayTypeType {

    protected Boolean prodSvcAnnounce;
    protected Boolean trainingInfo;
    protected Boolean eNewsletters;
    protected Boolean promotionsOffers;
    protected Boolean pressReleases;

    /**
     * Gets the value of the prodSvcAnnounce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProdSvcAnnounce() {
        return prodSvcAnnounce;
    }

    /**
     * Sets the value of the prodSvcAnnounce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProdSvcAnnounce(Boolean value) {
        this.prodSvcAnnounce = value;
    }

    /**
     * Gets the value of the trainingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrainingInfo() {
        return trainingInfo;
    }

    /**
     * Sets the value of the trainingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrainingInfo(Boolean value) {
        this.trainingInfo = value;
    }

    /**
     * Gets the value of the eNewsletters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isENewsletters() {
        return eNewsletters;
    }

    /**
     * Sets the value of the eNewsletters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setENewsletters(Boolean value) {
        this.eNewsletters = value;
    }

    /**
     * Gets the value of the promotionsOffers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotionsOffers() {
        return promotionsOffers;
    }

    /**
     * Sets the value of the promotionsOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotionsOffers(Boolean value) {
        this.promotionsOffers = value;
    }

    /**
     * Gets the value of the pressReleases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPressReleases() {
        return pressReleases;
    }

    /**
     * Sets the value of the pressReleases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPressReleases(Boolean value) {
        this.pressReleases = value;
    }

}
