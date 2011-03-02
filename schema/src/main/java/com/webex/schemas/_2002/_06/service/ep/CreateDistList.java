
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for createDistList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createDistList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="distList" type="{http://www.webex.com/schemas/2002/06/service/ep}distListWithContactType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDistList", propOrder = {
    "distList"
})
public class CreateDistList
    extends BodyContentType
{

    @XmlElement(required = true)
    protected DistListWithContactType distList;

    /**
     * Gets the value of the distList property.
     * 
     * @return
     *     possible object is
     *     {@link DistListWithContactType }
     *     
     */
    public DistListWithContactType getDistList() {
        return distList;
    }

    /**
     * Sets the value of the distList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistListWithContactType }
     *     
     */
    public void setDistList(DistListWithContactType value) {
        this.distList = value;
    }

}
