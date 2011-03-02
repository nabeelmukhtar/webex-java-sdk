
package com.webex.schemas._2002._06.service.user;

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
 *     &lt;enumeration value="UID"/>
 *     &lt;enumeration value="WEBEXID"/>
 *     &lt;enumeration value="FIRSTNAME"/>
 *     &lt;enumeration value="LASTNAME"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="REGDATE"/>
 *     &lt;enumeration value="REGEXPDATE"/>
 *     &lt;enumeration value="PRIVILEGE"/>
 *     &lt;enumeration value="PERSONALURL"/>
 *     &lt;enumeration value="ADDRESS1"/>
 *     &lt;enumeration value="ADDRESS2"/>
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="ZIPCODE"/>
 *     &lt;enumeration value="COUNTRY"/>
 *     &lt;enumeration value="PHONE1"/>
 *     &lt;enumeration value="PHONE2"/>
 *     &lt;enumeration value="MOBILE1"/>
 *     &lt;enumeration value="MOBILE2"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="PAGER"/>
 *     &lt;enumeration value="EMAIL2"/>
 *     &lt;enumeration value="DIVISION"/>
 *     &lt;enumeration value="DEPARTMENT"/>
 *     &lt;enumeration value="PROJECT"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="TIMEZONE"/>
 *     &lt;enumeration value="OFFICENAME"/>
 *     &lt;enumeration value="OFFICETITLE"/>
 *     &lt;enumeration value="OFFICEURL"/>
 *     &lt;enumeration value="CATEGORYID"/>
 *     &lt;enumeration value="VISITCOUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderByType")
@XmlEnum
public enum OrderByType {

    UID("UID"),
    WEBEXID("WEBEXID"),
    FIRSTNAME("FIRSTNAME"),
    LASTNAME("LASTNAME"),
    EMAIL("EMAIL"),
    ACTIVE("ACTIVE"),
    REGDATE("REGDATE"),
    REGEXPDATE("REGEXPDATE"),
    PRIVILEGE("PRIVILEGE"),
    PERSONALURL("PERSONALURL"),
    @XmlEnumValue("ADDRESS1")
    ADDRESS_1("ADDRESS1"),
    @XmlEnumValue("ADDRESS2")
    ADDRESS_2("ADDRESS2"),
    CITY("CITY"),
    STATE("STATE"),
    ZIPCODE("ZIPCODE"),
    COUNTRY("COUNTRY"),
    @XmlEnumValue("PHONE1")
    PHONE_1("PHONE1"),
    @XmlEnumValue("PHONE2")
    PHONE_2("PHONE2"),
    @XmlEnumValue("MOBILE1")
    MOBILE_1("MOBILE1"),
    @XmlEnumValue("MOBILE2")
    MOBILE_2("MOBILE2"),
    FAX("FAX"),
    PAGER("PAGER"),
    @XmlEnumValue("EMAIL2")
    EMAIL_2("EMAIL2"),
    DIVISION("DIVISION"),
    DEPARTMENT("DEPARTMENT"),
    PROJECT("PROJECT"),
    OTHER("OTHER"),
    TIMEZONE("TIMEZONE"),
    OFFICENAME("OFFICENAME"),
    OFFICETITLE("OFFICETITLE"),
    OFFICEURL("OFFICEURL"),
    CATEGORYID("CATEGORYID"),
    VISITCOUNT("VISITCOUNT");
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
