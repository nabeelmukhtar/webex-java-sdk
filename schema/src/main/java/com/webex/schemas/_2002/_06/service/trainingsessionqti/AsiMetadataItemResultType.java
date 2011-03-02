
package com.webex.schemas._2002._06.service.trainingsessionqti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for asi_metadata_item_resultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="asi_metadata_item_resultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asi_metadatafield" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}asi_metadatafield_item_resultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asi_metadata_item_resultType", propOrder = {
    "asiMetadatafield"
})
public class AsiMetadataItemResultType {

    @XmlElement(name = "asi_metadatafield", required = true)
    protected AsiMetadatafieldItemResultType asiMetadatafield;

    /**
     * Gets the value of the asiMetadatafield property.
     * 
     * @return
     *     possible object is
     *     {@link AsiMetadatafieldItemResultType }
     *     
     */
    public AsiMetadatafieldItemResultType getAsiMetadatafield() {
        return asiMetadatafield;
    }

    /**
     * Sets the value of the asiMetadatafield property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsiMetadatafieldItemResultType }
     *     
     */
    public void setAsiMetadatafield(AsiMetadatafieldItemResultType value) {
        this.asiMetadatafield = value;
    }

}
