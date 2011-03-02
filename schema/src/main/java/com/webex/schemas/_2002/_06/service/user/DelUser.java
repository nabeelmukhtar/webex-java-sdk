
package com.webex.schemas._2002._06.service.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for delUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="webExId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="50"/>
 *         &lt;element name="syncWebOffice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delUser", propOrder = {
    "webExId",
    "syncWebOffice"
})
public class DelUser
    extends BodyContentType
{

    @XmlElement(required = true)
    protected List<String> webExId;
    protected Boolean syncWebOffice;

    /**
     * Gets the value of the webExId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webExId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebExId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWebExId() {
        if (webExId == null) {
            webExId = new ArrayList<String>();
        }
        return this.webExId;
    }

    /**
     * Gets the value of the syncWebOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncWebOffice() {
        return syncWebOffice;
    }

    /**
     * Sets the value of the syncWebOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncWebOffice(Boolean value) {
        this.syncWebOffice = value;
    }

}
