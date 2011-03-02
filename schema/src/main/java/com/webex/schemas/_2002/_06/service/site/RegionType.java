
package com.webex.schemas._2002._06.service.site;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="U.S."/>
 *     &lt;enumeration value="Australia"/>
 *     &lt;enumeration value="Canada"/>
 *     &lt;enumeration value="French Canada"/>
 *     &lt;enumeration value="China"/>
 *     &lt;enumeration value="Germany"/>
 *     &lt;enumeration value="Hong Kong"/>
 *     &lt;enumeration value="Italy"/>
 *     &lt;enumeration value="Japan"/>
 *     &lt;enumeration value="Korea"/>
 *     &lt;enumeration value="New Zealand"/>
 *     &lt;enumeration value="Spain"/>
 *     &lt;enumeration value="Sweden"/>
 *     &lt;enumeration value="Switzerland"/>
 *     &lt;enumeration value="Taiwan"/>
 *     &lt;enumeration value="U.K."/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regionType")
@XmlEnum
public enum RegionType {

    @XmlEnumValue("U.S.")
    U_S("U.S."),
    @XmlEnumValue("Australia")
    AUSTRALIA("Australia"),
    @XmlEnumValue("Canada")
    CANADA("Canada"),
    @XmlEnumValue("French Canada")
    FRENCH_CANADA("French Canada"),
    @XmlEnumValue("China")
    CHINA("China"),
    @XmlEnumValue("Germany")
    GERMANY("Germany"),
    @XmlEnumValue("Hong Kong")
    HONG_KONG("Hong Kong"),
    @XmlEnumValue("Italy")
    ITALY("Italy"),
    @XmlEnumValue("Japan")
    JAPAN("Japan"),
    @XmlEnumValue("Korea")
    KOREA("Korea"),
    @XmlEnumValue("New Zealand")
    NEW_ZEALAND("New Zealand"),
    @XmlEnumValue("Spain")
    SPAIN("Spain"),
    @XmlEnumValue("Sweden")
    SWEDEN("Sweden"),
    @XmlEnumValue("Switzerland")
    SWITZERLAND("Switzerland"),
    @XmlEnumValue("Taiwan")
    TAIWAN("Taiwan"),
    @XmlEnumValue("U.K.")
    U_K("U.K.");
    private final String value;

    RegionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionType fromValue(String v) {
        for (RegionType c: RegionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
