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

package com.webex.schemas._2002._06.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeZoneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GMT-12:00, Dateline (Eniwetok)"/>
 *     &lt;enumeration value="GMT-11:00, Samoa (Samoa)"/>
 *     &lt;enumeration value="GMT-10:00, Hawaii (Honolulu)"/>
 *     &lt;enumeration value="GMT-09:00, Alaska (Ancorage)"/>
 *     &lt;enumeration value="GMT-08:00, Pacific (San Jose)"/>
 *     &lt;enumeration value="GMT-07:00, Mountain (Arizona)"/>
 *     &lt;enumeration value="GMT-07:00, Mountain (Denver)"/>
 *     &lt;enumeration value="GMT-06:00, Central (Chicago)"/>
 *     &lt;enumeration value="GMT-06:00, Mexico (Mexico City,Tegucigalpa)"/>
 *     &lt;enumeration value="GMT-06:00, Central (Regina)"/>
 *     &lt;enumeration value="GMT-05:00, S. America Pacific (Bogota)"/>
 *     &lt;enumeration value="GMT-05:00, Eastern (New York)"/>
 *     &lt;enumeration value="GMT-05:00, Eastern (Indiana)"/>
 *     &lt;enumeration value="GMT-04:00, Atlantic (Halifax)"/>
 *     &lt;enumeration value="GMT-04:00, S. America Western (Caracas)"/>
 *     &lt;enumeration value="GMT-03:30, Newfoundland (Newfoundland)"/>
 *     &lt;enumeration value="GMT-03:00, S. America Eastern (Brasilia)"/>
 *     &lt;enumeration value="GMT-03:00, S. America Eastern (Buenos Aires)"/>
 *     &lt;enumeration value="GMT-02:00, Mid-Atlantic (Mid-Atlantic)"/>
 *     &lt;enumeration value="GMT-01:00, Azores (Azores)"/>
 *     &lt;enumeration value="GMT+00:00, Greenwich (Casablanca)"/>
 *     &lt;enumeration value="GMT+00:00, GMT (London)"/>
 *     &lt;enumeration value="GMT+01:00, Europe (Amsterdam)"/>
 *     &lt;enumeration value="GMT+01:00, Europe (Paris)"/>
 *     &lt;enumeration value="GMT+01:00, Europe (Prague)"/>
 *     &lt;enumeration value="GMT+01:00, Europe (Berlin)"/>
 *     &lt;enumeration value="GMT+02:00, Greece (Athens)"/>
 *     &lt;enumeration value="GMT+02:00, Eastern Europe (Bucharest)"/>
 *     &lt;enumeration value="GMT+02:00, Egypt (Cairo)"/>
 *     &lt;enumeration value="GMT+02:00, South Africa (Pretoria)"/>
 *     &lt;enumeration value="GMT+02:00, Northern Europe (Helsinki)"/>
 *     &lt;enumeration value="GMT+02:00, Israel (Tel Aviv)"/>
 *     &lt;enumeration value="GMT+03:00, Saudi Arabia (Baghdad)"/>
 *     &lt;enumeration value="GMT+03:00, Russian (Moscow)"/>
 *     &lt;enumeration value="GMT+03:00, Nairobi (Nairobi)"/>
 *     &lt;enumeration value="GMT+03:00, Iran (Tehran)"/>
 *     &lt;enumeration value="GMT+04:00, Arabian (Abu Dhabi, Muscat)"/>
 *     &lt;enumeration value="GMT+04:00, Baku (Baku)"/>
 *     &lt;enumeration value="GMT+04:00, Afghanistan (Kabul)"/>
 *     &lt;enumeration value="GMT+05:00, West Asia (Ekaterinburg)"/>
 *     &lt;enumeration value="GMT+05:00, West Asia (Islamabad)"/>
 *     &lt;enumeration value="GMT+05:30, India (Bombay)"/>
 *     &lt;enumeration value="GMT+06:00, Columbo (Columbo)"/>
 *     &lt;enumeration value="GMT+06:00, Central Asia (Almaty)"/>
 *     &lt;enumeration value="GMT+07:00, Bangkok (Bangkok)"/>
 *     &lt;enumeration value="GMT+08:00, China (Beijing)"/>
 *     &lt;enumeration value="GMT+08:00, Australia Western (Perth)"/>
 *     &lt;enumeration value="GMT+08:00, Singapore (Singapore)"/>
 *     &lt;enumeration value="GMT+08:00, Taipei (Hong Kong)"/>
 *     &lt;enumeration value="GMT+09:00, Tokyo (Tokyo)"/>
 *     &lt;enumeration value="GMT+09:00, Korea (Seoul)"/>
 *     &lt;enumeration value="GMT+09:30, Yakutsk (Yakutsk)"/>
 *     &lt;enumeration value="GMT+09:30, Australia Central (Adelaide)"/>
 *     &lt;enumeration value="GMT+09:30, Australia Central (Darwin)"/>
 *     &lt;enumeration value="GMT+10:00, Australia Eastern (Brisbane)"/>
 *     &lt;enumeration value="GMT+10:00, Australia Eastern (Sydney)"/>
 *     &lt;enumeration value="GMT+10:00, West Pacific (Guam)"/>
 *     &lt;enumeration value="GMT+10:00, Tasmania (Hobart)"/>
 *     &lt;enumeration value="GMT+10:00, Vladivostok (Vladivostok)"/>
 *     &lt;enumeration value="GMT+11:00, Central Pacific (Solomon Is)"/>
 *     &lt;enumeration value="GMT+12:00, New Zealand (Wellington)"/>
 *     &lt;enumeration value="GMT+12:00, Fiji (Fiji)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timeZoneType")
@XmlEnum
public enum TimeZoneType {

    @XmlEnumValue("GMT-12:00, Dateline (Eniwetok)")
    GMT_12_00_DATELINE_ENIWETOK("GMT-12:00, Dateline (Eniwetok)"),
    @XmlEnumValue("GMT-11:00, Samoa (Samoa)")
    GMT_11_00_SAMOA_SAMOA("GMT-11:00, Samoa (Samoa)"),
    @XmlEnumValue("GMT-10:00, Hawaii (Honolulu)")
    GMT_10_00_HAWAII_HONOLULU("GMT-10:00, Hawaii (Honolulu)"),
    @XmlEnumValue("GMT-09:00, Alaska (Ancorage)")
    GMT_09_00_ALASKA_ANCORAGE("GMT-09:00, Alaska (Ancorage)"),
    @XmlEnumValue("GMT-08:00, Pacific (San Jose)")
    GMT_08_00_PACIFIC_SAN_JOSE("GMT-08:00, Pacific (San Jose)"),
    @XmlEnumValue("GMT-07:00, Mountain (Arizona)")
    GMT_07_00_MOUNTAIN_ARIZONA("GMT-07:00, Mountain (Arizona)"),
    @XmlEnumValue("GMT-07:00, Mountain (Denver)")
    GMT_07_00_MOUNTAIN_DENVER("GMT-07:00, Mountain (Denver)"),
    @XmlEnumValue("GMT-06:00, Central (Chicago)")
    GMT_06_00_CENTRAL_CHICAGO("GMT-06:00, Central (Chicago)"),
    @XmlEnumValue("GMT-06:00, Mexico (Mexico City,Tegucigalpa)")
    GMT_06_00_MEXICO_MEXICO_CITY_TEGUCIGALPA("GMT-06:00, Mexico (Mexico City,Tegucigalpa)"),
    @XmlEnumValue("GMT-06:00, Central (Regina)")
    GMT_06_00_CENTRAL_REGINA("GMT-06:00, Central (Regina)"),
    @XmlEnumValue("GMT-05:00, S. America Pacific (Bogota)")
    GMT_05_00_S_AMERICA_PACIFIC_BOGOTA("GMT-05:00, S. America Pacific (Bogota)"),
    @XmlEnumValue("GMT-05:00, Eastern (New York)")
    GMT_05_00_EASTERN_NEW_YORK("GMT-05:00, Eastern (New York)"),
    @XmlEnumValue("GMT-05:00, Eastern (Indiana)")
    GMT_05_00_EASTERN_INDIANA("GMT-05:00, Eastern (Indiana)"),
    @XmlEnumValue("GMT-04:00, Atlantic (Halifax)")
    GMT_04_00_ATLANTIC_HALIFAX("GMT-04:00, Atlantic (Halifax)"),
    @XmlEnumValue("GMT-04:00, S. America Western (Caracas)")
    GMT_04_00_S_AMERICA_WESTERN_CARACAS("GMT-04:00, S. America Western (Caracas)"),
    @XmlEnumValue("GMT-03:30, Newfoundland (Newfoundland)")
    GMT_03_30_NEWFOUNDLAND_NEWFOUNDLAND("GMT-03:30, Newfoundland (Newfoundland)"),
    @XmlEnumValue("GMT-03:00, S. America Eastern (Brasilia)")
    GMT_03_00_S_AMERICA_EASTERN_BRASILIA("GMT-03:00, S. America Eastern (Brasilia)"),
    @XmlEnumValue("GMT-03:00, S. America Eastern (Buenos Aires)")
    GMT_03_00_S_AMERICA_EASTERN_BUENOS_AIRES("GMT-03:00, S. America Eastern (Buenos Aires)"),
    @XmlEnumValue("GMT-02:00, Mid-Atlantic (Mid-Atlantic)")
    GMT_02_00_MID_ATLANTIC_MID_ATLANTIC("GMT-02:00, Mid-Atlantic (Mid-Atlantic)"),
    @XmlEnumValue("GMT-01:00, Azores (Azores)")
    GMT_01_00_AZORES_AZORES("GMT-01:00, Azores (Azores)"),
    @XmlEnumValue("GMT+00:00, Greenwich (Casablanca)")
    GMT_00_00_GREENWICH_CASABLANCA("GMT+00:00, Greenwich (Casablanca)"),
    @XmlEnumValue("GMT+00:00, GMT (London)")
    GMT_00_00_GMT_LONDON("GMT+00:00, GMT (London)"),
    @XmlEnumValue("GMT+01:00, Europe (Amsterdam)")
    GMT_01_00_EUROPE_AMSTERDAM("GMT+01:00, Europe (Amsterdam)"),
    @XmlEnumValue("GMT+01:00, Europe (Paris)")
    GMT_01_00_EUROPE_PARIS("GMT+01:00, Europe (Paris)"),
    @XmlEnumValue("GMT+01:00, Europe (Prague)")
    GMT_01_00_EUROPE_PRAGUE("GMT+01:00, Europe (Prague)"),
    @XmlEnumValue("GMT+01:00, Europe (Berlin)")
    GMT_01_00_EUROPE_BERLIN("GMT+01:00, Europe (Berlin)"),
    @XmlEnumValue("GMT+02:00, Greece (Athens)")
    GMT_02_00_GREECE_ATHENS("GMT+02:00, Greece (Athens)"),
    @XmlEnumValue("GMT+02:00, Eastern Europe (Bucharest)")
    GMT_02_00_EASTERN_EUROPE_BUCHAREST("GMT+02:00, Eastern Europe (Bucharest)"),
    @XmlEnumValue("GMT+02:00, Egypt (Cairo)")
    GMT_02_00_EGYPT_CAIRO("GMT+02:00, Egypt (Cairo)"),
    @XmlEnumValue("GMT+02:00, South Africa (Pretoria)")
    GMT_02_00_SOUTH_AFRICA_PRETORIA("GMT+02:00, South Africa (Pretoria)"),
    @XmlEnumValue("GMT+02:00, Northern Europe (Helsinki)")
    GMT_02_00_NORTHERN_EUROPE_HELSINKI("GMT+02:00, Northern Europe (Helsinki)"),
    @XmlEnumValue("GMT+02:00, Israel (Tel Aviv)")
    GMT_02_00_ISRAEL_TEL_AVIV("GMT+02:00, Israel (Tel Aviv)"),
    @XmlEnumValue("GMT+03:00, Saudi Arabia (Baghdad)")
    GMT_03_00_SAUDI_ARABIA_BAGHDAD("GMT+03:00, Saudi Arabia (Baghdad)"),
    @XmlEnumValue("GMT+03:00, Russian (Moscow)")
    GMT_03_00_RUSSIAN_MOSCOW("GMT+03:00, Russian (Moscow)"),
    @XmlEnumValue("GMT+03:00, Nairobi (Nairobi)")
    GMT_03_00_NAIROBI_NAIROBI("GMT+03:00, Nairobi (Nairobi)"),
    @XmlEnumValue("GMT+03:00, Iran (Tehran)")
    GMT_03_00_IRAN_TEHRAN("GMT+03:00, Iran (Tehran)"),
    @XmlEnumValue("GMT+04:00, Arabian (Abu Dhabi, Muscat)")
    GMT_04_00_ARABIAN_ABU_DHABI_MUSCAT("GMT+04:00, Arabian (Abu Dhabi, Muscat)"),
    @XmlEnumValue("GMT+04:00, Baku (Baku)")
    GMT_04_00_BAKU_BAKU("GMT+04:00, Baku (Baku)"),
    @XmlEnumValue("GMT+04:00, Afghanistan (Kabul)")
    GMT_04_00_AFGHANISTAN_KABUL("GMT+04:00, Afghanistan (Kabul)"),
    @XmlEnumValue("GMT+05:00, West Asia (Ekaterinburg)")
    GMT_05_00_WEST_ASIA_EKATERINBURG("GMT+05:00, West Asia (Ekaterinburg)"),
    @XmlEnumValue("GMT+05:00, West Asia (Islamabad)")
    GMT_05_00_WEST_ASIA_ISLAMABAD("GMT+05:00, West Asia (Islamabad)"),
    @XmlEnumValue("GMT+05:30, India (Bombay)")
    GMT_05_30_INDIA_BOMBAY("GMT+05:30, India (Bombay)"),
    @XmlEnumValue("GMT+06:00, Columbo (Columbo)")
    GMT_06_00_COLUMBO_COLUMBO("GMT+06:00, Columbo (Columbo)"),
    @XmlEnumValue("GMT+06:00, Central Asia (Almaty)")
    GMT_06_00_CENTRAL_ASIA_ALMATY("GMT+06:00, Central Asia (Almaty)"),
    @XmlEnumValue("GMT+07:00, Bangkok (Bangkok)")
    GMT_07_00_BANGKOK_BANGKOK("GMT+07:00, Bangkok (Bangkok)"),
    @XmlEnumValue("GMT+08:00, China (Beijing)")
    GMT_08_00_CHINA_BEIJING("GMT+08:00, China (Beijing)"),
    @XmlEnumValue("GMT+08:00, Australia Western (Perth)")
    GMT_08_00_AUSTRALIA_WESTERN_PERTH("GMT+08:00, Australia Western (Perth)"),
    @XmlEnumValue("GMT+08:00, Singapore (Singapore)")
    GMT_08_00_SINGAPORE_SINGAPORE("GMT+08:00, Singapore (Singapore)"),
    @XmlEnumValue("GMT+08:00, Taipei (Hong Kong)")
    GMT_08_00_TAIPEI_HONG_KONG("GMT+08:00, Taipei (Hong Kong)"),
    @XmlEnumValue("GMT+09:00, Tokyo (Tokyo)")
    GMT_09_00_TOKYO_TOKYO("GMT+09:00, Tokyo (Tokyo)"),
    @XmlEnumValue("GMT+09:00, Korea (Seoul)")
    GMT_09_00_KOREA_SEOUL("GMT+09:00, Korea (Seoul)"),
    @XmlEnumValue("GMT+09:30, Yakutsk (Yakutsk)")
    GMT_09_30_YAKUTSK_YAKUTSK("GMT+09:30, Yakutsk (Yakutsk)"),
    @XmlEnumValue("GMT+09:30, Australia Central (Adelaide)")
    GMT_09_30_AUSTRALIA_CENTRAL_ADELAIDE("GMT+09:30, Australia Central (Adelaide)"),
    @XmlEnumValue("GMT+09:30, Australia Central (Darwin)")
    GMT_09_30_AUSTRALIA_CENTRAL_DARWIN("GMT+09:30, Australia Central (Darwin)"),
    @XmlEnumValue("GMT+10:00, Australia Eastern (Brisbane)")
    GMT_10_00_AUSTRALIA_EASTERN_BRISBANE("GMT+10:00, Australia Eastern (Brisbane)"),
    @XmlEnumValue("GMT+10:00, Australia Eastern (Sydney)")
    GMT_10_00_AUSTRALIA_EASTERN_SYDNEY("GMT+10:00, Australia Eastern (Sydney)"),
    @XmlEnumValue("GMT+10:00, West Pacific (Guam)")
    GMT_10_00_WEST_PACIFIC_GUAM("GMT+10:00, West Pacific (Guam)"),
    @XmlEnumValue("GMT+10:00, Tasmania (Hobart)")
    GMT_10_00_TASMANIA_HOBART("GMT+10:00, Tasmania (Hobart)"),
    @XmlEnumValue("GMT+10:00, Vladivostok (Vladivostok)")
    GMT_10_00_VLADIVOSTOK_VLADIVOSTOK("GMT+10:00, Vladivostok (Vladivostok)"),
    @XmlEnumValue("GMT+11:00, Central Pacific (Solomon Is)")
    GMT_11_00_CENTRAL_PACIFIC_SOLOMON_IS("GMT+11:00, Central Pacific (Solomon Is)"),
    @XmlEnumValue("GMT+12:00, New Zealand (Wellington)")
    GMT_12_00_NEW_ZEALAND_WELLINGTON("GMT+12:00, New Zealand (Wellington)"),
    @XmlEnumValue("GMT+12:00, Fiji (Fiji)")
    GMT_12_00_FIJI_FIJI("GMT+12:00, Fiji (Fiji)");
    private final String value;

    TimeZoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeZoneType fromValue(String v) {
        for (TimeZoneType c: TimeZoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
