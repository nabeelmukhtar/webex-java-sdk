
package com.webex.schemas._2002._06.service.trainingsessionqtiasi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="material" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}materialType" maxOccurs="unbounded"/>
 *         &lt;element name="response_lid" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}response_lidType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="response_str" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}response_strType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flowType", propOrder = {
    "material",
    "responseLid",
    "responseStr"
})
public class FlowType {

    @XmlElement(required = true)
    protected List<MaterialType> material;
    @XmlElement(name = "response_lid")
    protected List<ResponseLidType> responseLid;
    @XmlElement(name = "response_str")
    protected List<ResponseStrType> responseStr;

    /**
     * Gets the value of the material property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the material property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialType }
     * 
     * 
     */
    public List<MaterialType> getMaterial() {
        if (material == null) {
            material = new ArrayList<MaterialType>();
        }
        return this.material;
    }

    /**
     * Gets the value of the responseLid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseLid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseLid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseLidType }
     * 
     * 
     */
    public List<ResponseLidType> getResponseLid() {
        if (responseLid == null) {
            responseLid = new ArrayList<ResponseLidType>();
        }
        return this.responseLid;
    }

    /**
     * Gets the value of the responseStr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseStr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseStr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseStrType }
     * 
     * 
     */
    public List<ResponseStrType> getResponseStr() {
        if (responseStr == null) {
            responseStr = new ArrayList<ResponseStrType>();
        }
        return this.responseStr;
    }

}
