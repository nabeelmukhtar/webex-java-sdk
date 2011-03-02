
package com.webex.schemas._2002._06.service.trainingsessionqti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response_form" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}response_formType"/>
 *         &lt;element name="response_value" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqti}response_valueType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ident_ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseType", propOrder = {
    "responseForm",
    "responseValue"
})
public class ResponseType {

    @XmlElement(name = "response_form", required = true)
    protected ResponseFormType responseForm;
    @XmlElement(name = "response_value", required = true)
    protected List<ResponseValueType> responseValue;
    @XmlAttribute(name = "ident_ref")
    protected String identRef;

    /**
     * Gets the value of the responseForm property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseFormType }
     *     
     */
    public ResponseFormType getResponseForm() {
        return responseForm;
    }

    /**
     * Sets the value of the responseForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseFormType }
     *     
     */
    public void setResponseForm(ResponseFormType value) {
        this.responseForm = value;
    }

    /**
     * Gets the value of the responseValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseValueType }
     * 
     * 
     */
    public List<ResponseValueType> getResponseValue() {
        if (responseValue == null) {
            responseValue = new ArrayList<ResponseValueType>();
        }
        return this.responseValue;
    }

    /**
     * Gets the value of the identRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentRef() {
        return identRef;
    }

    /**
     * Sets the value of the identRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentRef(String value) {
        this.identRef = value;
    }

}
