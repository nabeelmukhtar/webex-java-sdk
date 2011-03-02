
package com.webex.schemas._2002._06.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webACDUserRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="webACDUserRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isAgent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isMgr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webACDUserRoleType", propOrder = {
    "isAgent",
    "isMgr"
})
@XmlSeeAlso({
    com.webex.schemas._2002._06.service.user.LstsummaryUser.WebACD.class,
    com.webex.schemas._2002._06.service.user.UserType.WebACDPrefs.class
})
public class WebACDUserRoleType {

    protected Boolean isAgent;
    protected Boolean isMgr;

    /**
     * Gets the value of the isAgent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAgent() {
        return isAgent;
    }

    /**
     * Sets the value of the isAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAgent(Boolean value) {
        this.isAgent = value;
    }

    /**
     * Gets the value of the isMgr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMgr() {
        return isMgr;
    }

    /**
     * Sets the value of the isMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMgr(Boolean value) {
        this.isMgr = value;
    }

}
