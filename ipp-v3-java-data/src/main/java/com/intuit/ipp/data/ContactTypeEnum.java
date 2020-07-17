//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.15 at 03:58:30 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TelephoneNumber"/&gt;
 *     &lt;enumeration value="EmailAddress"/&gt;
 *     &lt;enumeration value="WebSiteAddress"/&gt;
 *     &lt;enumeration value="GenericContactType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactTypeEnum")
@XmlEnum
public enum ContactTypeEnum {

    @XmlEnumValue("TelephoneNumber")
    TELEPHONE_NUMBER("TelephoneNumber"),
    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),
    @XmlEnumValue("WebSiteAddress")
    WEB_SITE_ADDRESS("WebSiteAddress"),
    @XmlEnumValue("GenericContactType")
    GENERIC_CONTACT_TYPE("GenericContactType");
    private final String value;

    ContactTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactTypeEnum fromValue(String v) {
        for (ContactTypeEnum c: ContactTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
