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

package com.webex.schemas._2002._06.service.sales;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.webex.schemas._2002._06.service.BodyContentType;


/**
 * The Class LstOpportunitiesResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lstOpportunitiesResponse", propOrder = {
    "opportunity"
})
public class LstOpportunitiesResponse
    extends BodyContentType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The opportunity. */
    protected List<LstOpportunitiesResponse.Opportunity> opportunity;

    /**
     * Gets the opportunity.
     * 
     * @return the opportunity
     */
    public List<LstOpportunitiesResponse.Opportunity> getOpportunity() {
        if (opportunity == null) {
            opportunity = new ArrayList<LstOpportunitiesResponse.Opportunity>();
        }
        return this.opportunity;
    }


    /**
     * The Class Opportunity.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "extAccountID"
    })
    public static class Opportunity
        extends OpptyInstanceType
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The ext account id. */
        protected String extAccountID;

        /**
         * Gets the ext account id.
         * 
         * @return the ext account id
         */
        public String getExtAccountID() {
            return extAccountID;
        }

        /**
         * Sets the ext account id.
         * 
         * @param value the new ext account id
         */
        public void setExtAccountID(String value) {
            this.extAccountID = value;
        }

    }

}
