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

package com.webex.schemas._2002._06.service.ep;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOSTWEBEXID"/>
 *     &lt;enumeration value="CONFNAME"/>
 *     &lt;enumeration value="STARTTIME"/>
 *     &lt;enumeration value="TRACKINGCODE1"/>
 *     &lt;enumeration value="TRACKINGCODE2"/>
 *     &lt;enumeration value="TRACKINGCODE3"/>
 *     &lt;enumeration value="TRACKINGCODE4"/>
 *     &lt;enumeration value="TRACKINGCODE5"/>
 *     &lt;enumeration value="TRACKINGCODE6"/>
 *     &lt;enumeration value="TRACKINGCODE7"/>
 *     &lt;enumeration value="TRACKINGCODE8"/>
 *     &lt;enumeration value="TRACKINGCODE9"/>
 *     &lt;enumeration value="TRACKINGCODE10"/>
 *     &lt;enumeration value="ASSISTREQUEST"/>
 *     &lt;enumeration value="ASSISTCONFIRM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderByType")
@XmlEnum
public enum OrderByType {

    HOSTWEBEXID("HOSTWEBEXID"),
    CONFNAME("CONFNAME"),
    STARTTIME("STARTTIME"),
    @XmlEnumValue("TRACKINGCODE1")
    TRACKINGCODE_1("TRACKINGCODE1"),
    @XmlEnumValue("TRACKINGCODE2")
    TRACKINGCODE_2("TRACKINGCODE2"),
    @XmlEnumValue("TRACKINGCODE3")
    TRACKINGCODE_3("TRACKINGCODE3"),
    @XmlEnumValue("TRACKINGCODE4")
    TRACKINGCODE_4("TRACKINGCODE4"),
    @XmlEnumValue("TRACKINGCODE5")
    TRACKINGCODE_5("TRACKINGCODE5"),
    @XmlEnumValue("TRACKINGCODE6")
    TRACKINGCODE_6("TRACKINGCODE6"),
    @XmlEnumValue("TRACKINGCODE7")
    TRACKINGCODE_7("TRACKINGCODE7"),
    @XmlEnumValue("TRACKINGCODE8")
    TRACKINGCODE_8("TRACKINGCODE8"),
    @XmlEnumValue("TRACKINGCODE9")
    TRACKINGCODE_9("TRACKINGCODE9"),
    @XmlEnumValue("TRACKINGCODE10")
    TRACKINGCODE_10("TRACKINGCODE10"),
    ASSISTREQUEST("ASSISTREQUEST"),
    ASSISTCONFIRM("ASSISTCONFIRM");
    private final String value;

    OrderByType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderByType fromValue(String v) {
        for (OrderByType c: OrderByType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
