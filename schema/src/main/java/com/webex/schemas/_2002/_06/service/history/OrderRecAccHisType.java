
package com.webex.schemas._2002._06.service.history;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.LstOrderADType;


/**
 * <p>Java class for orderRecAccHisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderRecAccHisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderBy" type="{http://www.webex.com/schemas/2002/06/service/history}orderRecAccHisByType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="orderAD" type="{http://www.webex.com/schemas/2002/06/service}lstOrderADType" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderRecAccHisType", propOrder = {
    "orderBy",
    "orderAD"
})
public class OrderRecAccHisType {

    protected List<OrderRecAccHisByType> orderBy;
    protected List<LstOrderADType> orderAD;

    /**
     * Gets the value of the orderBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderRecAccHisByType }
     * 
     * 
     */
    public List<OrderRecAccHisByType> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<OrderRecAccHisByType>();
        }
        return this.orderBy;
    }

    /**
     * Gets the value of the orderAD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderAD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderAD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LstOrderADType }
     * 
     * 
     */
    public List<LstOrderADType> getOrderAD() {
        if (orderAD == null) {
            orderAD = new ArrayList<LstOrderADType>();
        }
        return this.orderAD;
    }

}
