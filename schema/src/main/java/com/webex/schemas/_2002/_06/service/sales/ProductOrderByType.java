
package com.webex.schemas._2002._06.service.sales;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productOrderByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="productOrderByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRODID"/>
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="DESCRIPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "productOrderByType")
@XmlEnum
public enum ProductOrderByType {

    PRODID,
    NAME,
    DESCRIPTION;

    public String value() {
        return name();
    }

    public static ProductOrderByType fromValue(String v) {
        return valueOf(v);
    }

}
