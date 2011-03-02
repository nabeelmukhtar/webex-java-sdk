
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resourceRestrictionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceRestrictionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isLicenseManager" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="concurrentLicense" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fileFolderCapacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxConcurrentEvents" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="archiveStorageLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceRestrictionsType", propOrder = {
    "isLicenseManager",
    "concurrentLicense",
    "fileFolderCapacity",
    "maxConcurrentEvents",
    "archiveStorageLimit"
})
public class ResourceRestrictionsType {

    protected boolean isLicenseManager;
    protected Long concurrentLicense;
    protected Long fileFolderCapacity;
    protected Long maxConcurrentEvents;
    protected Long archiveStorageLimit;

    /**
     * Gets the value of the isLicenseManager property.
     * 
     */
    public boolean isIsLicenseManager() {
        return isLicenseManager;
    }

    /**
     * Sets the value of the isLicenseManager property.
     * 
     */
    public void setIsLicenseManager(boolean value) {
        this.isLicenseManager = value;
    }

    /**
     * Gets the value of the concurrentLicense property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConcurrentLicense() {
        return concurrentLicense;
    }

    /**
     * Sets the value of the concurrentLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConcurrentLicense(Long value) {
        this.concurrentLicense = value;
    }

    /**
     * Gets the value of the fileFolderCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileFolderCapacity() {
        return fileFolderCapacity;
    }

    /**
     * Sets the value of the fileFolderCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileFolderCapacity(Long value) {
        this.fileFolderCapacity = value;
    }

    /**
     * Gets the value of the maxConcurrentEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxConcurrentEvents() {
        return maxConcurrentEvents;
    }

    /**
     * Sets the value of the maxConcurrentEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxConcurrentEvents(Long value) {
        this.maxConcurrentEvents = value;
    }

    /**
     * Gets the value of the archiveStorageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArchiveStorageLimit() {
        return archiveStorageLimit;
    }

    /**
     * Sets the value of the archiveStorageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArchiveStorageLimit(Long value) {
        this.archiveStorageLimit = value;
    }

}
