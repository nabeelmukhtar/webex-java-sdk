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
 * The Class ProductivityToolType.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The enable. */
    protected Boolean enable;
    
    /** The install opts. */
    protected InstallationOptionType installOpts;
    
    /** The integrations. */
    protected IntegrationType integrations;
    
    /** The one click. */
    protected OneClickType oneClick;
    
    /** The templates. */
    protected TemplateType templates;
    
    /** The lock down pt. */
    protected LockDownPTType lockDownPT;
    
    /** The im settings. */
    protected ImSettingsType imSettings;

    /**
     * Checks if is enable.
     * 
     * @return the boolean
     */
    public Boolean isEnable() {
        return enable;
    }

    /**
     * Sets the enable.
     * 
     * @param value the new enable
     */
    public void setEnable(Boolean value) {
        this.enable = value;
    }

    /**
     * Gets the install opts.
     * 
     * @return the install opts
     */
    public InstallationOptionType getInstallOpts() {
        return installOpts;
    }

    /**
     * Sets the install opts.
     * 
     * @param value the new install opts
     */
    public void setInstallOpts(InstallationOptionType value) {
        this.installOpts = value;
    }

    /**
     * Gets the integrations.
     * 
     * @return the integrations
     */
    public IntegrationType getIntegrations() {
        return integrations;
    }

    /**
     * Sets the integrations.
     * 
     * @param value the new integrations
     */
    public void setIntegrations(IntegrationType value) {
        this.integrations = value;
    }

    /**
     * Gets the one click.
     * 
     * @return the one click
     */
    public OneClickType getOneClick() {
        return oneClick;
    }

    /**
     * Sets the one click.
     * 
     * @param value the new one click
     */
    public void setOneClick(OneClickType value) {
        this.oneClick = value;
    }

    /**
     * Gets the templates.
     * 
     * @return the templates
     */
    public TemplateType getTemplates() {
        return templates;
    }

    /**
     * Sets the templates.
     * 
     * @param value the new templates
     */
    public void setTemplates(TemplateType value) {
        this.templates = value;
    }

    /**
     * Gets the lock down pt.
     * 
     * @return the lock down pt
     */
    public LockDownPTType getLockDownPT() {
        return lockDownPT;
    }

    /**
     * Sets the lock down pt.
     * 
     * @param value the new lock down pt
     */
    public void setLockDownPT(LockDownPTType value) {
        this.lockDownPT = value;
    }

    /**
     * Gets the im settings.
     * 
     * @return the im settings
     */
    public ImSettingsType getImSettings() {
        return imSettings;
    }

    /**
     * Sets the im settings.
     * 
     * @param value the new im settings
     */
    public void setImSettings(ImSettingsType value) {
        this.imSettings = value;
    }

}
