
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}sourcebank_ref" minOccurs="0"/>
 *         &lt;element ref="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}selection_number" minOccurs="0"/>
 *         &lt;element name="selection_metadata" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}selection_metadataType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="and_selection" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}and_selectionType"/>
 *           &lt;element name="or_selection" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}or_selectionType"/>
 *           &lt;element name="not_selection" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}not_selectionType"/>
 *           &lt;element name="selection_extension" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}sectionproc_extensionType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectionType", propOrder = {
    "sourcebankRef",
    "selectionNumber",
    "selectionMetadata",
    "andSelection",
    "orSelection",
    "notSelection",
    "selectionExtension"
})
public class SelectionType {

    @XmlElement(name = "sourcebank_ref")
    protected String sourcebankRef;
    @XmlElement(name = "selection_number")
    protected String selectionNumber;
    @XmlElement(name = "selection_metadata")
    protected SelectionMetadataType selectionMetadata;
    @XmlElement(name = "and_selection")
    protected AndSelectionType andSelection;
    @XmlElement(name = "or_selection")
    protected OrSelectionType orSelection;
    @XmlElement(name = "not_selection")
    protected NotSelectionType notSelection;
    @XmlElement(name = "selection_extension")
    protected SectionprocExtensionType selectionExtension;

    /**
     * Gets the value of the sourcebankRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcebankRef() {
        return sourcebankRef;
    }

    /**
     * Sets the value of the sourcebankRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcebankRef(String value) {
        this.sourcebankRef = value;
    }

    /**
     * Gets the value of the selectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionNumber() {
        return selectionNumber;
    }

    /**
     * Sets the value of the selectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionNumber(String value) {
        this.selectionNumber = value;
    }

    /**
     * Gets the value of the selectionMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionMetadataType }
     *     
     */
    public SelectionMetadataType getSelectionMetadata() {
        return selectionMetadata;
    }

    /**
     * Sets the value of the selectionMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionMetadataType }
     *     
     */
    public void setSelectionMetadata(SelectionMetadataType value) {
        this.selectionMetadata = value;
    }

    /**
     * Gets the value of the andSelection property.
     * 
     * @return
     *     possible object is
     *     {@link AndSelectionType }
     *     
     */
    public AndSelectionType getAndSelection() {
        return andSelection;
    }

    /**
     * Sets the value of the andSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndSelectionType }
     *     
     */
    public void setAndSelection(AndSelectionType value) {
        this.andSelection = value;
    }

    /**
     * Gets the value of the orSelection property.
     * 
     * @return
     *     possible object is
     *     {@link OrSelectionType }
     *     
     */
    public OrSelectionType getOrSelection() {
        return orSelection;
    }

    /**
     * Sets the value of the orSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrSelectionType }
     *     
     */
    public void setOrSelection(OrSelectionType value) {
        this.orSelection = value;
    }

    /**
     * Gets the value of the notSelection property.
     * 
     * @return
     *     possible object is
     *     {@link NotSelectionType }
     *     
     */
    public NotSelectionType getNotSelection() {
        return notSelection;
    }

    /**
     * Sets the value of the notSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotSelectionType }
     *     
     */
    public void setNotSelection(NotSelectionType value) {
        this.notSelection = value;
    }

    /**
     * Gets the value of the selectionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link SectionprocExtensionType }
     *     
     */
    public SectionprocExtensionType getSelectionExtension() {
        return selectionExtension;
    }

    /**
     * Sets the value of the selectionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionprocExtensionType }
     *     
     */
    public void setSelectionExtension(SectionprocExtensionType value) {
        this.selectionExtension = value;
    }

}
