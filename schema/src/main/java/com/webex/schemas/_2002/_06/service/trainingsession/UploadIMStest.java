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
 * The Class UploadIMStest.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The display. */
    @XmlElement(required = true)
    protected UploadIMStest.Display display;
    
    /** The assign grades. */
    protected Boolean assignGrades;
    
    /** The questestinterop. */
    @XmlElement(required = true)
    protected QuestestinteropType questestinterop;

    /**
     * Gets the display.
     * 
     * @return the display
     */
    public UploadIMStest.Display getDisplay() {
        return display;
    }

    /**
     * Sets the display.
     * 
     * @param value the new display
     */
    public void setDisplay(UploadIMStest.Display value) {
        this.display = value;
    }

    /**
     * Checks if is assign grades.
     * 
     * @return the boolean
     */
    public Boolean isAssignGrades() {
        return assignGrades;
    }

    /**
     * Sets the assign grades.
     * 
     * @param value the new assign grades
     */
    public void setAssignGrades(Boolean value) {
        this.assignGrades = value;
    }

    /**
     * Gets the questestinterop.
     * 
     * @return the questestinterop
     */
    public QuestestinteropType getQuestestinterop() {
        return questestinterop;
    }

    /**
     * Sets the questestinterop.
     * 
     * @param value the new questestinterop
     */
    public void setQuestestinterop(QuestestinteropType value) {
        this.questestinterop = value;
    }


    /**
     * The Class Display.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allOnePage",
        "onePerPage"
    })
    public static class Display
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The all one page. */
        protected String allOnePage;
        
        /** The one per page. */
        protected String onePerPage;

        /**
         * Gets the all one page.
         * 
         * @return the all one page
         */
        public String getAllOnePage() {
            return allOnePage;
        }

        /**
         * Sets the all one page.
         * 
         * @param value the new all one page
         */
        public void setAllOnePage(String value) {
            this.allOnePage = value;
        }

        /**
         * Gets the one per page.
         * 
         * @return the one per page
         */
        public String getOnePerPage() {
            return onePerPage;
        }

        /**
         * Sets the one per page.
         * 
         * @param value the new one per page
         */
        public void setOnePerPage(String value) {
            this.onePerPage = value;
        }

    }

}
