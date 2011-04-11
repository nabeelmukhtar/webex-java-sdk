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

package com.webex.schemas._2002._06.service.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class SalesProductsInstanceType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesProductsInstanceType", propOrder = {
    "product"
})
public class SalesProductsInstanceType
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The product. */
    @XmlElement(required = true)
    protected List<SalesProductsInstanceType.Product> product;

    /**
     * Gets the product.
     * 
     * @return the product
     */
    public List<SalesProductsInstanceType.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<SalesProductsInstanceType.Product>();
        }
        return this.product;
    }


    /**
     * The Class Product.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prodID",
        "name"
    })
    public static class Product
        implements Serializable
    {

        /** The Constant serialVersionUID. */
        private final static long serialVersionUID = 2461660169443089969L;
        
        /** The prod id. */
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "integer")
        protected Long prodID;
        
        /** The name. */
        @XmlElement(required = true)
        protected String name;

        /**
         * Gets the prod id.
         * 
         * @return the prod id
         */
        public Long getProdID() {
            return prodID;
        }

        /**
         * Sets the prod id.
         * 
         * @param value the new prod id
         */
        public void setProdID(Long value) {
            this.prodID = value;
        }

        /**
         * Gets the name.
         * 
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the name.
         * 
         * @param value the new name
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
