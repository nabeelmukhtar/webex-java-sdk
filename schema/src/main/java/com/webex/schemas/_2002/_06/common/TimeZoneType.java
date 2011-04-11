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
 * The Enum TimeZoneType.
 */
@XmlType(name = "timeZoneType")
@XmlEnum
public enum TimeZoneType {

    /** The GM t_12_00_ datelin e_ eniwetok. */
    @XmlEnumValue("GMT-12:00, Dateline (Eniwetok)")
    GMT_12_00_DATELINE_ENIWETOK("GMT-12:00, Dateline (Eniwetok)"),
    
    /** The GM t_11_00_ samo a_ samoa. */
    @XmlEnumValue("GMT-11:00, Samoa (Samoa)")
    GMT_11_00_SAMOA_SAMOA("GMT-11:00, Samoa (Samoa)"),
    
    /** The GM t_10_00_ hawai i_ honolulu. */
    @XmlEnumValue("GMT-10:00, Hawaii (Honolulu)")
    GMT_10_00_HAWAII_HONOLULU("GMT-10:00, Hawaii (Honolulu)"),
    
    /** The GM t_09_00_ alask a_ ancorage. */
    @XmlEnumValue("GMT-09:00, Alaska (Ancorage)")
    GMT_09_00_ALASKA_ANCORAGE("GMT-09:00, Alaska (Ancorage)"),
    
    /** The GM t_08_00_ pacifi c_ sa n_ jose. */
    @XmlEnumValue("GMT-08:00, Pacific (San Jose)")
    GMT_08_00_PACIFIC_SAN_JOSE("GMT-08:00, Pacific (San Jose)"),
    
    /** The GM t_07_00_ mountai n_ arizona. */
    @XmlEnumValue("GMT-07:00, Mountain (Arizona)")
    GMT_07_00_MOUNTAIN_ARIZONA("GMT-07:00, Mountain (Arizona)"),
    
    /** The GM t_07_00_ mountai n_ denver. */
    @XmlEnumValue("GMT-07:00, Mountain (Denver)")
    GMT_07_00_MOUNTAIN_DENVER("GMT-07:00, Mountain (Denver)"),
    
    /** The GM t_06_00_ centra l_ chicago. */
    @XmlEnumValue("GMT-06:00, Central (Chicago)")
    GMT_06_00_CENTRAL_CHICAGO("GMT-06:00, Central (Chicago)"),
    
    /** The GM t_06_00_ mexic o_ mexic o_ cit y_ tegucigalpa. */
    @XmlEnumValue("GMT-06:00, Mexico (Mexico City,Tegucigalpa)")
    GMT_06_00_MEXICO_MEXICO_CITY_TEGUCIGALPA("GMT-06:00, Mexico (Mexico City,Tegucigalpa)"),
    
    /** The GM t_06_00_ centra l_ regina. */
    @XmlEnumValue("GMT-06:00, Central (Regina)")
    GMT_06_00_CENTRAL_REGINA("GMT-06:00, Central (Regina)"),
    
    /** The GM t_05_00_ s_ americ a_ pacifi c_ bogota. */
    @XmlEnumValue("GMT-05:00, S. America Pacific (Bogota)")
    GMT_05_00_S_AMERICA_PACIFIC_BOGOTA("GMT-05:00, S. America Pacific (Bogota)"),
    
    /** The GM t_05_00_ easter n_ ne w_ york. */
    @XmlEnumValue("GMT-05:00, Eastern (New York)")
    GMT_05_00_EASTERN_NEW_YORK("GMT-05:00, Eastern (New York)"),
    
    /** The GM t_05_00_ easter n_ indiana. */
    @XmlEnumValue("GMT-05:00, Eastern (Indiana)")
    GMT_05_00_EASTERN_INDIANA("GMT-05:00, Eastern (Indiana)"),
    
    /** The GM t_04_00_ atlanti c_ halifax. */
    @XmlEnumValue("GMT-04:00, Atlantic (Halifax)")
    GMT_04_00_ATLANTIC_HALIFAX("GMT-04:00, Atlantic (Halifax)"),
    
    /** The GM t_04_00_ s_ americ a_ wester n_ caracas. */
    @XmlEnumValue("GMT-04:00, S. America Western (Caracas)")
    GMT_04_00_S_AMERICA_WESTERN_CARACAS("GMT-04:00, S. America Western (Caracas)"),
    
    /** The GM t_03_30_ newfoundlan d_ newfoundland. */
    @XmlEnumValue("GMT-03:30, Newfoundland (Newfoundland)")
    GMT_03_30_NEWFOUNDLAND_NEWFOUNDLAND("GMT-03:30, Newfoundland (Newfoundland)"),
    
    /** The GM t_03_00_ s_ americ a_ easter n_ brasilia. */
    @XmlEnumValue("GMT-03:00, S. America Eastern (Brasilia)")
    GMT_03_00_S_AMERICA_EASTERN_BRASILIA("GMT-03:00, S. America Eastern (Brasilia)"),
    
    /** The GM t_03_00_ s_ americ a_ easter n_ bueno s_ aires. */
    @XmlEnumValue("GMT-03:00, S. America Eastern (Buenos Aires)")
    GMT_03_00_S_AMERICA_EASTERN_BUENOS_AIRES("GMT-03:00, S. America Eastern (Buenos Aires)"),
    
    /** The GM t_02_00_ mi d_ atlanti c_ mi d_ atlantic. */
    @XmlEnumValue("GMT-02:00, Mid-Atlantic (Mid-Atlantic)")
    GMT_02_00_MID_ATLANTIC_MID_ATLANTIC("GMT-02:00, Mid-Atlantic (Mid-Atlantic)"),
    
    /** The GM t_01_00_ azore s_ azores. */
    @XmlEnumValue("GMT-01:00, Azores (Azores)")
    GMT_01_00_AZORES_AZORES("GMT-01:00, Azores (Azores)"),
    
    /** The GM t_00_00_ greenwic h_ casablanca. */
    @XmlEnumValue("GMT+00:00, Greenwich (Casablanca)")
    GMT_00_00_GREENWICH_CASABLANCA("GMT+00:00, Greenwich (Casablanca)"),
    
    /** The GM t_00_00_ gm t_ london. */
    @XmlEnumValue("GMT+00:00, GMT (London)")
    GMT_00_00_GMT_LONDON("GMT+00:00, GMT (London)"),
    
    /** The GM t_01_00_ europ e_ amsterdam. */
    @XmlEnumValue("GMT+01:00, Europe (Amsterdam)")
    GMT_01_00_EUROPE_AMSTERDAM("GMT+01:00, Europe (Amsterdam)"),
    
    /** The GM t_01_00_ europ e_ paris. */
    @XmlEnumValue("GMT+01:00, Europe (Paris)")
    GMT_01_00_EUROPE_PARIS("GMT+01:00, Europe (Paris)"),
    
    /** The GM t_01_00_ europ e_ prague. */
    @XmlEnumValue("GMT+01:00, Europe (Prague)")
    GMT_01_00_EUROPE_PRAGUE("GMT+01:00, Europe (Prague)"),
    
    /** The GM t_01_00_ europ e_ berlin. */
    @XmlEnumValue("GMT+01:00, Europe (Berlin)")
    GMT_01_00_EUROPE_BERLIN("GMT+01:00, Europe (Berlin)"),
    
    /** The GM t_02_00_ greec e_ athens. */
    @XmlEnumValue("GMT+02:00, Greece (Athens)")
    GMT_02_00_GREECE_ATHENS("GMT+02:00, Greece (Athens)"),
    
    /** The GM t_02_00_ easter n_ europ e_ bucharest. */
    @XmlEnumValue("GMT+02:00, Eastern Europe (Bucharest)")
    GMT_02_00_EASTERN_EUROPE_BUCHAREST("GMT+02:00, Eastern Europe (Bucharest)"),
    
    /** The GM t_02_00_ egyp t_ cairo. */
    @XmlEnumValue("GMT+02:00, Egypt (Cairo)")
    GMT_02_00_EGYPT_CAIRO("GMT+02:00, Egypt (Cairo)"),
    
    /** The GM t_02_00_ sout h_ afric a_ pretoria. */
    @XmlEnumValue("GMT+02:00, South Africa (Pretoria)")
    GMT_02_00_SOUTH_AFRICA_PRETORIA("GMT+02:00, South Africa (Pretoria)"),
    
    /** The GM t_02_00_ norther n_ europ e_ helsinki. */
    @XmlEnumValue("GMT+02:00, Northern Europe (Helsinki)")
    GMT_02_00_NORTHERN_EUROPE_HELSINKI("GMT+02:00, Northern Europe (Helsinki)"),
    
    /** The GM t_02_00_ israe l_ te l_ aviv. */
    @XmlEnumValue("GMT+02:00, Israel (Tel Aviv)")
    GMT_02_00_ISRAEL_TEL_AVIV("GMT+02:00, Israel (Tel Aviv)"),
    
    /** The GM t_03_00_ saud i_ arabi a_ baghdad. */
    @XmlEnumValue("GMT+03:00, Saudi Arabia (Baghdad)")
    GMT_03_00_SAUDI_ARABIA_BAGHDAD("GMT+03:00, Saudi Arabia (Baghdad)"),
    
    /** The GM t_03_00_ russia n_ moscow. */
    @XmlEnumValue("GMT+03:00, Russian (Moscow)")
    GMT_03_00_RUSSIAN_MOSCOW("GMT+03:00, Russian (Moscow)"),
    
    /** The GM t_03_00_ nairob i_ nairobi. */
    @XmlEnumValue("GMT+03:00, Nairobi (Nairobi)")
    GMT_03_00_NAIROBI_NAIROBI("GMT+03:00, Nairobi (Nairobi)"),
    
    /** The GM t_03_00_ ira n_ tehran. */
    @XmlEnumValue("GMT+03:00, Iran (Tehran)")
    GMT_03_00_IRAN_TEHRAN("GMT+03:00, Iran (Tehran)"),
    
    /** The GM t_04_00_ arabia n_ ab u_ dhab i_ muscat. */
    @XmlEnumValue("GMT+04:00, Arabian (Abu Dhabi, Muscat)")
    GMT_04_00_ARABIAN_ABU_DHABI_MUSCAT("GMT+04:00, Arabian (Abu Dhabi, Muscat)"),
    
    /** The GM t_04_00_ bak u_ baku. */
    @XmlEnumValue("GMT+04:00, Baku (Baku)")
    GMT_04_00_BAKU_BAKU("GMT+04:00, Baku (Baku)"),
    
    /** The GM t_04_00_ afghanista n_ kabul. */
    @XmlEnumValue("GMT+04:00, Afghanistan (Kabul)")
    GMT_04_00_AFGHANISTAN_KABUL("GMT+04:00, Afghanistan (Kabul)"),
    
    /** The GM t_05_00_ wes t_ asi a_ ekaterinburg. */
    @XmlEnumValue("GMT+05:00, West Asia (Ekaterinburg)")
    GMT_05_00_WEST_ASIA_EKATERINBURG("GMT+05:00, West Asia (Ekaterinburg)"),
    
    /** The GM t_05_00_ wes t_ asi a_ islamabad. */
    @XmlEnumValue("GMT+05:00, West Asia (Islamabad)")
    GMT_05_00_WEST_ASIA_ISLAMABAD("GMT+05:00, West Asia (Islamabad)"),
    
    /** The GM t_05_30_ indi a_ bombay. */
    @XmlEnumValue("GMT+05:30, India (Bombay)")
    GMT_05_30_INDIA_BOMBAY("GMT+05:30, India (Bombay)"),
    
    /** The GM t_06_00_ columb o_ columbo. */
    @XmlEnumValue("GMT+06:00, Columbo (Columbo)")
    GMT_06_00_COLUMBO_COLUMBO("GMT+06:00, Columbo (Columbo)"),
    
    /** The GM t_06_00_ centra l_ asi a_ almaty. */
    @XmlEnumValue("GMT+06:00, Central Asia (Almaty)")
    GMT_06_00_CENTRAL_ASIA_ALMATY("GMT+06:00, Central Asia (Almaty)"),
    
    /** The GM t_07_00_ bangko k_ bangkok. */
    @XmlEnumValue("GMT+07:00, Bangkok (Bangkok)")
    GMT_07_00_BANGKOK_BANGKOK("GMT+07:00, Bangkok (Bangkok)"),
    
    /** The GM t_08_00_ chin a_ beijing. */
    @XmlEnumValue("GMT+08:00, China (Beijing)")
    GMT_08_00_CHINA_BEIJING("GMT+08:00, China (Beijing)"),
    
    /** The GM t_08_00_ australi a_ wester n_ perth. */
    @XmlEnumValue("GMT+08:00, Australia Western (Perth)")
    GMT_08_00_AUSTRALIA_WESTERN_PERTH("GMT+08:00, Australia Western (Perth)"),
    
    /** The GM t_08_00_ singapor e_ singapore. */
    @XmlEnumValue("GMT+08:00, Singapore (Singapore)")
    GMT_08_00_SINGAPORE_SINGAPORE("GMT+08:00, Singapore (Singapore)"),
    
    /** The GM t_08_00_ taipe i_ hon g_ kong. */
    @XmlEnumValue("GMT+08:00, Taipei (Hong Kong)")
    GMT_08_00_TAIPEI_HONG_KONG("GMT+08:00, Taipei (Hong Kong)"),
    
    /** The GM t_09_00_ toky o_ tokyo. */
    @XmlEnumValue("GMT+09:00, Tokyo (Tokyo)")
    GMT_09_00_TOKYO_TOKYO("GMT+09:00, Tokyo (Tokyo)"),
    
    /** The GM t_09_00_ kore a_ seoul. */
    @XmlEnumValue("GMT+09:00, Korea (Seoul)")
    GMT_09_00_KOREA_SEOUL("GMT+09:00, Korea (Seoul)"),
    
    /** The GM t_09_30_ yakuts k_ yakutsk. */
    @XmlEnumValue("GMT+09:30, Yakutsk (Yakutsk)")
    GMT_09_30_YAKUTSK_YAKUTSK("GMT+09:30, Yakutsk (Yakutsk)"),
    
    /** The GM t_09_30_ australi a_ centra l_ adelaide. */
    @XmlEnumValue("GMT+09:30, Australia Central (Adelaide)")
    GMT_09_30_AUSTRALIA_CENTRAL_ADELAIDE("GMT+09:30, Australia Central (Adelaide)"),
    
    /** The GM t_09_30_ australi a_ centra l_ darwin. */
    @XmlEnumValue("GMT+09:30, Australia Central (Darwin)")
    GMT_09_30_AUSTRALIA_CENTRAL_DARWIN("GMT+09:30, Australia Central (Darwin)"),
    
    /** The GM t_10_00_ australi a_ easter n_ brisbane. */
    @XmlEnumValue("GMT+10:00, Australia Eastern (Brisbane)")
    GMT_10_00_AUSTRALIA_EASTERN_BRISBANE("GMT+10:00, Australia Eastern (Brisbane)"),
    
    /** The GM t_10_00_ australi a_ easter n_ sydney. */
    @XmlEnumValue("GMT+10:00, Australia Eastern (Sydney)")
    GMT_10_00_AUSTRALIA_EASTERN_SYDNEY("GMT+10:00, Australia Eastern (Sydney)"),
    
    /** The GM t_10_00_ wes t_ pacifi c_ guam. */
    @XmlEnumValue("GMT+10:00, West Pacific (Guam)")
    GMT_10_00_WEST_PACIFIC_GUAM("GMT+10:00, West Pacific (Guam)"),
    
    /** The GM t_10_00_ tasmani a_ hobart. */
    @XmlEnumValue("GMT+10:00, Tasmania (Hobart)")
    GMT_10_00_TASMANIA_HOBART("GMT+10:00, Tasmania (Hobart)"),
    
    /** The GM t_10_00_ vladivosto k_ vladivostok. */
    @XmlEnumValue("GMT+10:00, Vladivostok (Vladivostok)")
    GMT_10_00_VLADIVOSTOK_VLADIVOSTOK("GMT+10:00, Vladivostok (Vladivostok)"),
    
    /** The GM t_11_00_ centra l_ pacifi c_ solomo n_ is. */
    @XmlEnumValue("GMT+11:00, Central Pacific (Solomon Is)")
    GMT_11_00_CENTRAL_PACIFIC_SOLOMON_IS("GMT+11:00, Central Pacific (Solomon Is)"),
    
    /** The GM t_12_00_ ne w_ zealan d_ wellington. */
    @XmlEnumValue("GMT+12:00, New Zealand (Wellington)")
    GMT_12_00_NEW_ZEALAND_WELLINGTON("GMT+12:00, New Zealand (Wellington)"),
    
    /** The GM t_12_00_ fij i_ fiji. */
    @XmlEnumValue("GMT+12:00, Fiji (Fiji)")
    GMT_12_00_FIJI_FIJI("GMT+12:00, Fiji (Fiji)");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new time zone type.
     * 
     * @param v the v
     */
    TimeZoneType(String v) {
        value = v;
    }

    /**
     * Value.
     * 
     * @return the string
     */
    public String value() {
        return value;
    }

    /**
     * From value.
     * 
     * @param v the v
     * 
     * @return the time zone type
     */
    public static TimeZoneType fromValue(String v) {
        for (TimeZoneType c: TimeZoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
