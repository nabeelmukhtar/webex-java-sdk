
package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * <p>Java class for setDistList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setDistList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="distList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.webex.com/schemas/2002/06/service/ep}distListWithContactInstanceType">
 *                 &lt;sequence>
 *                   &lt;element name="contactOperation" type="{http://www.webex.com/schemas/2002/06/service/ep}contactOperationType" minOccurs="0"/>
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
@XmlType(name = "setDistList", propOrder = {
    "distList"
})
public class SetDistList
    extends BodyContentType
{

    @XmlElement(required = true)
    protected SetDistList.DistList distList;

    /**
     * Gets the value of the distList property.
     * 
     * @return
     *     possible object is
     *     {@link SetDistList.DistList }
     *     
     */
    public SetDistList.DistList getDistList() {
        return distList;
    }

    /**
     * Sets the value of the distList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetDistList.DistList }
     *     
     */
    public void setDistList(SetDistList.DistList value) {
        this.distList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service/ep}distListWithContactInstanceType">
     *       &lt;sequence>
     *         &lt;element name="contactOperation" type="{http://www.webex.com/schemas/2002/06/service/ep}contactOperationType" minOccurs="0"/>
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
        "contactOperation"
    })
    public static class DistList
        extends DistListWithContactInstanceType
    {

        protected ContactOperationType contactOperation;

        /**
         * Gets the value of the contactOperation property.
         * 
         * @return
         *     possible object is
         *     {@link ContactOperationType }
         *     
         */
        public ContactOperationType getContactOperation() {
            return contactOperation;
        }

        /**
         * Sets the value of the contactOperation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactOperationType }
         *     
         */
        public void setContactOperation(ContactOperationType value) {
            this.contactOperation = value;
        }

    }

}
