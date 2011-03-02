
package com.webex.schemas._2002._06.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkBoxTagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkBoxTagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDisplay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="items" type="{http://www.webex.com/schemas/2002/06/common}checkBoxItemTagType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkBoxTagType", propOrder = {
    "fieldID",
    "lable",
    "isRequired",
    "isDisplay",
    "items"
})
public class CheckBoxTagType {

    protected Long fieldID;
    protected String lable;
    protected boolean isRequired;
    protected boolean isDisplay;
    @XmlElement(required = true)
    protected List<CheckBoxItemTagType> items;

    /**
     * Gets the value of the fieldID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFieldID() {
        return fieldID;
    }

    /**
     * Sets the value of the fieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFieldID(Long value) {
        this.fieldID = value;
    }

    /**
     * Gets the value of the lable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLable() {
        return lable;
    }

    /**
     * Sets the value of the lable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLable(String value) {
        this.lable = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     */
    public void setIsRequired(boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the isDisplay property.
     * 
     */
    public boolean isIsDisplay() {
        return isDisplay;
    }

    /**
     * Sets the value of the isDisplay property.
     * 
     */
    public void setIsDisplay(boolean value) {
        this.isDisplay = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckBoxItemTagType }
     * 
     * 
     */
    public List<CheckBoxItemTagType> getItems() {
        if (items == null) {
            items = new ArrayList<CheckBoxItemTagType>();
        }
        return this.items;
    }

}
