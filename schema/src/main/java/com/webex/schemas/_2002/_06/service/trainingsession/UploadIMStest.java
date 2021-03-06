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

package com.webex.schemas._2002._06.service.trainingsession;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.trainingsessionqtiasi.QuestestinteropType;


/**
 * <p>Java class for uploadIMStest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadIMStest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.webex.com/schemas/2002/06/service}bodyContentType">
 *       &lt;sequence>
 *         &lt;element name="display">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="allOnePage">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="true|TRUE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="onePerPage">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="true|TRUE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assignGrades" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="questestinterop" type="{http://www.webex.com/schemas/2002/06/service/trainingsessionqtiasi}questestinteropType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadIMStest", propOrder = {
    "display",
    "assignGrades",
    "questestinterop"
})
public class UploadIMStest
    extends BodyContentType
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected UploadIMStest.Display display;
    protected Boolean assignGrades;
    @XmlElement(required = true)
    protected QuestestinteropType questestinterop;

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link UploadIMStest.Display }
     *     
     */
    public UploadIMStest.Display getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadIMStest.Display }
     *     
     */
    public void setDisplay(UploadIMStest.Display value) {
        this.display = value;
    }

    /**
     * Gets the value of the assignGrades property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignGrades() {
        return assignGrades;
    }

    /**
     * Sets the value of the assignGrades property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignGrades(Boolean value) {
        this.assignGrades = value;
    }

    /**
     * Gets the value of the questestinterop property.
     * 
     * @return
     *     possible object is
     *     {@link QuestestinteropType }
     *     
     */
    public QuestestinteropType getQuestestinterop() {
        return questestinterop;
    }

    /**
     * Sets the value of the questestinterop property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestestinteropType }
     *     
     */
    public void setQuestestinterop(QuestestinteropType value) {
        this.questestinterop = value;
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
     *       &lt;choice>
     *         &lt;element name="allOnePage">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="true|TRUE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="onePerPage">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="true|TRUE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allOnePage",
        "onePerPage"
    })
    public static class Display
        implements Serializable
    {

        private final static long serialVersionUID = 2461660169443089969L;
        protected String allOnePage;
        protected String onePerPage;

        /**
         * Gets the value of the allOnePage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllOnePage() {
            return allOnePage;
        }

        /**
         * Sets the value of the allOnePage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllOnePage(String value) {
            this.allOnePage = value;
        }

        /**
         * Gets the value of the onePerPage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnePerPage() {
            return onePerPage;
        }

        /**
         * Sets the value of the onePerPage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnePerPage(String value) {
            this.onePerPage = value;
        }

    }

}
