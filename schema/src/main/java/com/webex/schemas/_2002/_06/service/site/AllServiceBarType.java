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
 * The Class AllServiceBarType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allServiceBarType", propOrder = {
    "customLinks",
    "support",
    "training",
    "supportMenu"
})
public class AllServiceBarType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The custom links. */
    protected AllServiceBarType.CustomLinks customLinks;
    
    /** The support. */
    protected LinkType support;
    
    /** The training. */
    protected LinkType training;
    
    /** The support menu. */
    protected MenuType supportMenu;

    /**
     * Gets the custom links.
     * 
     * @return the custom links
     */
    public AllServiceBarType.CustomLinks getCustomLinks() {
        return customLinks;
    }

    /**
     * Sets the custom links.
     * 
     * @param value the new custom links
     */
    public void setCustomLinks(AllServiceBarType.CustomLinks value) {
        this.customLinks = value;
    }

    /**
     * Gets the support.
     * 
     * @return the support
     */
    public LinkType getSupport() {
        return support;
    }

    /**
     * Sets the support.
     * 
     * @param value the new support
     */
    public void setSupport(LinkType value) {
        this.support = value;
    }

    /**
     * Gets the training.
     * 
     * @return the training
     */
    public LinkType getTraining() {
        return training;
    }

    /**
     * Sets the training.
     * 
     * @param value the new training
     */
    public void setTraining(LinkType value) {
        this.training = value;
    }

    /**
     * Gets the support menu.
     * 
     * @return the support menu
     */
    public MenuType getSupportMenu() {
        return supportMenu;
    }

    /**
     * Sets the support menu.
     * 
     * @param value the new support menu
     */
    public void setSupportMenu(MenuType value) {
        this.supportMenu = value;
    }


    /**
     * The Class CustomLinks.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "groupLabel"
    })
    public static class CustomLinks
        extends CustomLinkType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The group label. */
        protected String groupLabel;

        /**
         * Gets the group label.
         * 
         * @return the group label
         */
        public String getGroupLabel() {
            return groupLabel;
        }

        /**
         * Sets the group label.
         * 
         * @param value the new group label
         */
        public void setGroupLabel(String value) {
            this.groupLabel = value;
        }

    }

}
