
package com.webex.schemas._2002._06.service.ep;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.common.ServiceTypeType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for lstOpenSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstOpenSession">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="serviceType" type="{http://www.webex.com/schemas/2002/06/common}serviceTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstOpenSession", propOrder = {
    "serviceType"
})
public class LstOpenSession
    extends BodyContentType
{

    protected List<ServiceTypeType> serviceType;

    /**
     * Gets the value of the serviceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTypeType }
     * 
     * 
     */
    public List<ServiceTypeType> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<ServiceTypeType>();
        }
        return this.serviceType;
    }

}
