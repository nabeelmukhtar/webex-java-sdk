
package com.webex.schemas._2002._06.service.sales;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for lstOpportunitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstOpportunitiesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="opportunity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/sales}opptyInstanceType">
 *                 &lt;sequence>
 *                   &lt;element name="extAccountID" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="512"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstOpportunitiesResponse", propOrder = {
    "opportunity"
})
public class LstOpportunitiesResponse
    extends BodyContentType
{

    protected List<LstOpportunitiesResponse.Opportunity> opportunity;

    /**
     * Gets the value of the opportunity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LstOpportunitiesResponse.Opportunity }
     * 
     * 
     */
    public List<LstOpportunitiesResponse.Opportunity> getOpportunity() {
        if (opportunity == null) {
            opportunity = new ArrayList<LstOpportunitiesResponse.Opportunity>();
        }
        return this.opportunity;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/sales}opptyInstanceType">
     *       &lt;sequence>
     *         &lt;element name="extAccountID" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="512"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "extAccountID"
    })
    public static class Opportunity
        extends OpptyInstanceType
    {

        protected String extAccountID;

        /**
         * Gets the value of the extAccountID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtAccountID() {
            return extAccountID;
        }

        /**
         * Sets the value of the extAccountID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtAccountID(String value) {
            this.extAccountID = value;
        }

    }

}
