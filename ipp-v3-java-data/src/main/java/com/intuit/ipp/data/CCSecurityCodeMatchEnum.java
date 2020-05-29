//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.28 at 10:35:45 AM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCSecurityCodeMatchEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CCSecurityCodeMatchEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fail"/&gt;
 *     &lt;enumeration value="NotAvailable"/&gt;
 *     &lt;enumeration value="Pass"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CCSecurityCodeMatchEnum")
@XmlEnum
public enum CCSecurityCodeMatchEnum {

    @XmlEnumValue("Fail")
    FAIL("Fail"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("Pass")
    PASS("Pass");
    private final String value;

    CCSecurityCodeMatchEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CCSecurityCodeMatchEnum fromValue(String v) {
        for (CCSecurityCodeMatchEnum c: CCSecurityCodeMatchEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
