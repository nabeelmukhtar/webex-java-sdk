
package com.webex.schemas._2002._06.service.ep;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for lstDistListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lstDistListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="distList" type="{http://www.webex.com/schemas/2002/06/service/ep}distListInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstDistListResponse", propOrder = {
    "distList"
})
public class LstDistListResponse
    extends BodyContentType
{

    protected List<DistListInstanceType> distList;

    /**
     * Gets the value of the distList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistListInstanceType }
     * 
     * 
     */
    public List<DistListInstanceType> getDistList() {
        if (distList == null) {
            distList = new ArrayList<DistListInstanceType>();
        }
        return this.distList;
    }

}
