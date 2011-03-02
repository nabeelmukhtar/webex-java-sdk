
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
 * <p>Java class for AssignWebACDQueues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignWebACDQueues">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="webExId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queue" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="type" type="{http://www.webex.com/schemas/2002/06/service/user}webACDRoleType" minOccurs="0"/>
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
@XmlType(name = "AssignWebACDQueues", propOrder = {
    "webExId",
    "queue"
})
public class AssignWebACDQueues
    extends BodyContentType
{

    @XmlElement(required = true)
    protected String webExId;
    @XmlElement(required = true)
    protected List<AssignWebACDQueues.Queue> queue;

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
     * Gets the value of the queue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignWebACDQueues.Queue }
     * 
     * 
     */
    public List<AssignWebACDQueues.Queue> getQueue() {
        if (queue == null) {
            queue = new ArrayList<AssignWebACDQueues.Queue>();
        }
        return this.queue;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="type" type="{http://www.webex.com/schemas/2002/06/service/user}webACDRoleType" minOccurs="0"/>
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
        "name",
        "type",
        "action"
    })
    public static class Queue {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(defaultValue = "AGENT")
        protected WebACDRoleType type;
        @XmlElement(required = true)
        protected WebACDActionType action;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link WebACDRoleType }
         *     
         */
        public WebACDRoleType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link WebACDRoleType }
         *     
         */
        public void setType(WebACDRoleType value) {
            this.type = value;
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
