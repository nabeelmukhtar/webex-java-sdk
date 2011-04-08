/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.webex.schemas._2002._06.service.site;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productivityToolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productivityToolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="installOpts" type="{http://www.webex.com/schemas/2002/06/service/site}installationOptionType" minOccurs="0"/>
 *         &lt;element name="integrations" type="{http://www.webex.com/schemas/2002/06/service/site}integrationType" minOccurs="0"/>
 *         &lt;element name="oneClick" type="{http://www.webex.com/schemas/2002/06/service/site}oneClickType" minOccurs="0"/>
 *         &lt;element name="templates" type="{http://www.webex.com/schemas/2002/06/service/site}templateType" minOccurs="0"/>
 *         &lt;element name="lockDownPT" type="{http://www.webex.com/schemas/2002/06/service/site}lockDownPTType" minOccurs="0"/>
 *         &lt;element name="imSettings" type="{http://www.webex.com/schemas/2002/06/service/site}imSettingsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productivityToolType", propOrder = {
    "enable",
    "installOpts",
    "integrations",
    "oneClick",
    "templates",
    "lockDownPT",
    "imSettings"
})
public class ProductivityToolType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean enable;
    protected InstallationOptionType installOpts;
    protected IntegrationType integrations;
    protected OneClickType oneClick;
    protected TemplateType templates;
    protected LockDownPTType lockDownPT;
    protected ImSettingsType imSettings;

    /**
     * Gets the value of the enable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnable(Boolean value) {
        this.enable = value;
    }

    /**
     * Gets the value of the installOpts property.
     * 
     * @return
     *     possible object is
     *     {@link InstallationOptionType }
     *     
     */
    public InstallationOptionType getInstallOpts() {
        return installOpts;
    }

    /**
     * Sets the value of the installOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallationOptionType }
     *     
     */
    public void setInstallOpts(InstallationOptionType value) {
        this.installOpts = value;
    }

    /**
     * Gets the value of the integrations property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationType }
     *     
     */
    public IntegrationType getIntegrations() {
        return integrations;
    }

    /**
     * Sets the value of the integrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationType }
     *     
     */
    public void setIntegrations(IntegrationType value) {
        this.integrations = value;
    }

    /**
     * Gets the value of the oneClick property.
     * 
     * @return
     *     possible object is
     *     {@link OneClickType }
     *     
     */
    public OneClickType getOneClick() {
        return oneClick;
    }

    /**
     * Sets the value of the oneClick property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneClickType }
     *     
     */
    public void setOneClick(OneClickType value) {
        this.oneClick = value;
    }

    /**
     * Gets the value of the templates property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateType }
     *     
     */
    public TemplateType getTemplates() {
        return templates;
    }

    /**
     * Sets the value of the templates property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateType }
     *     
     */
    public void setTemplates(TemplateType value) {
        this.templates = value;
    }

    /**
     * Gets the value of the lockDownPT property.
     * 
     * @return
     *     possible object is
     *     {@link LockDownPTType }
     *     
     */
    public LockDownPTType getLockDownPT() {
        return lockDownPT;
    }

    /**
     * Sets the value of the lockDownPT property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockDownPTType }
     *     
     */
    public void setLockDownPT(LockDownPTType value) {
        this.lockDownPT = value;
    }

    /**
     * Gets the value of the imSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ImSettingsType }
     *     
     */
    public ImSettingsType getImSettings() {
        return imSettings;
    }

    /**
     * Sets the value of the imSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImSettingsType }
     *     
     */
    public void setImSettings(ImSettingsType value) {
        this.imSettings = value;
    }

}
