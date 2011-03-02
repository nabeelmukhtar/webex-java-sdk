
package com.webex.schemas._2002._06.service.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.WebACDActionType;


/**
 * <p>Java class for AssignWebACDAgents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignWebACDAgents">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webACDUser" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="webExId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="action" type="{http://www.webex.com/schemas/2002/06/service}webACDActionType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "AssignWebACDAgents", propOrder = {
    "manager",
    "webACDUser"
})
public class AssignWebACDAgents
    extends BodyContentType
{

    @XmlElement(required = true)
    protected String manager;
    @XmlElement(required = true)
    protected List<AssignWebACDAgents.WebACDUser> webACDUser;

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the webACDUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webACDUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebACDUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignWebACDAgents.WebACDUser }
     * 
     * 
     */
    public List<AssignWebACDAgents.WebACDUser> getWebACDUser() {
        if (webACDUser == null) {
            webACDUser = new ArrayList<AssignWebACDAgents.WebACDUser>();
        }
        return this.webACDUser;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="webExId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="action" type="{http://www.webex.com/schemas/2002/06/service}webACDActionType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "webExId",
        "action"
    })
    public static class WebACDUser {

        @XmlElement(required = true)
        protected String webExId;
        @XmlElement(required = true)
        protected WebACDActionType action;

        /**
         * Gets the value of the webExId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebExId() {
            return webExId;
        }

        /**
         * Sets the value of the webExId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebExId(String value) {
            this.webExId = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link WebACDActionType }
         *     
         */
        public WebACDActionType getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link WebACDActionType }
         *     
         */
        public void setAction(WebACDActionType value) {
            this.action = value;
        }

    }

}
