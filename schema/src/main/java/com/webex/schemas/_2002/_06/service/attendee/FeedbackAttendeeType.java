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

package com.webex.schemas._2002._06.service.attendee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class FeedbackAttendeeType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feedbackAttendeeType", propOrder = {
    "attendeeID",
    "feedbackFields"
})
public class FeedbackAttendeeType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The attendee id. */
    protected long attendeeID;
    
    /** The feedback fields. */
    protected FeedbackAttendeeType.FeedbackFields feedbackFields;

    /**
     * Gets the attendee id.
     * 
     * @return the attendee id
     */
    public long getAttendeeID() {
        return attendeeID;
    }

    /**
     * Sets the attendee id.
     * 
     * @param value the new attendee id
     */
    public void setAttendeeID(long value) {
        this.attendeeID = value;
    }

    /**
     * Gets the feedback fields.
     * 
     * @return the feedback fields
     */
    public FeedbackAttendeeType.FeedbackFields getFeedbackFields() {
        return feedbackFields;
    }

    /**
     * Sets the feedback fields.
     * 
     * @param value the new feedback fields
     */
    public void setFeedbackFields(FeedbackAttendeeType.FeedbackFields value) {
        this.feedbackFields = value;
    }


    /**
     * The Class FeedbackFields.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defaultFields",
        "customFields"
    })
    public static class FeedbackFields
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The default fields. */
        protected FeedbackDefaultFieldsType defaultFields;
        
        /** The custom fields. */
        protected FeedbackAttendeeType.FeedbackFields.CustomFields customFields;

        /**
         * Gets the default fields.
         * 
         * @return the default fields
         */
        public FeedbackDefaultFieldsType getDefaultFields() {
            return defaultFields;
        }

        /**
         * Sets the default fields.
         * 
         * @param value the new default fields
         */
        public void setDefaultFields(FeedbackDefaultFieldsType value) {
            this.defaultFields = value;
        }

        /**
         * Gets the custom fields.
         * 
         * @return the custom fields
         */
        public FeedbackAttendeeType.FeedbackFields.CustomFields getCustomFields() {
            return customFields;
        }

        /**
         * Sets the custom fields.
         * 
         * @param value the new custom fields
         */
        public void setCustomFields(FeedbackAttendeeType.FeedbackFields.CustomFields value) {
            this.customFields = value;
        }


        /**
         * The Class CustomFields.
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "field"
        })
        public static class CustomFields
            implements Serializable
        {

            /** The Constant serialVersionUID. */
            private final static long serialVersionUID = 2461660169443089969L;
            
            /** The field. */
            protected List<FieldType> field;

            /**
             * Gets the field.
             * 
             * @return the field
             */
            public List<FieldType> getField() {
                if (field == null) {
                    field = new ArrayList<FieldType>();
                }
                return this.field;
            }

        }

    }

}
