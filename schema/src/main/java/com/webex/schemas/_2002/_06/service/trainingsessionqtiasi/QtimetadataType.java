
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qtimetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qtimetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vocabulary" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}vocabularyType" minOccurs="0"/>
 *         &lt;element name="qtimetadatafield" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}qtimetadatafieldType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qtimetadataType", propOrder = {
    "vocabulary",
    "qtimetadatafield"
})
public class QtimetadataType {

    protected VocabularyType vocabulary;
    @XmlElement(required = true)
    protected List<QtimetadatafieldType> qtimetadatafield;

    /**
     * Gets the value of the vocabulary property.
     * 
     * @return
     *     possible object is
     *     {@link VocabularyType }
     *     
     */
    public VocabularyType getVocabulary() {
        return vocabulary;
    }

    /**
     * Sets the value of the vocabulary property.
     * 
     * @param value
     *     allowed object is
     *     {@link VocabularyType }
     *     
     */
    public void setVocabulary(VocabularyType value) {
        this.vocabulary = value;
    }

    /**
     * Gets the value of the qtimetadatafield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtimetadatafield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtimetadatafield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QtimetadatafieldType }
     * 
     * 
     */
    public List<QtimetadatafieldType> getQtimetadatafield() {
        if (qtimetadatafield == null) {
            qtimetadatafield = new ArrayList<QtimetadatafieldType>();
        }
        return this.qtimetadatafield;
    }

}
