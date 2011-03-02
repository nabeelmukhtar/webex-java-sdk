
package com.webex.schemas._2002._06.service.site;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for topBarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="topBarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="button" type="{http://www.webex.com/schemas/2002/06/service/site}navigationBarType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="displayDisabledService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "topBarType", propOrder = {
    "button",
    "displayDisabledService"
})
public class TopBarType {

    protected List<NavigationBarType> button;
    protected Boolean displayDisabledService;

    /**
     * Gets the value of the button property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the button property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButton().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavigationBarType }
     * 
     * 
     */
    public List<NavigationBarType> getButton() {
        if (button == null) {
            button = new ArrayList<NavigationBarType>();
        }
        return this.button;
    }

    /**
     * Gets the value of the displayDisabledService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayDisabledService() {
        return displayDisabledService;
    }

    /**
     * Sets the value of the displayDisabledService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayDisabledService(Boolean value) {
        this.displayDisabledService = value;
    }

}
