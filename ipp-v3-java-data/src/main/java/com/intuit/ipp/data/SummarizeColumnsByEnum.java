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
 * <p>Java class for SummarizeColumnsByEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SummarizeColumnsByEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Total"/&gt;
 *     &lt;enumeration value="Year"/&gt;
 *     &lt;enumeration value="Quarter"/&gt;
 *     &lt;enumeration value="FiscalYear"/&gt;
 *     &lt;enumeration value="FiscalQuarter"/&gt;
 *     &lt;enumeration value="Month"/&gt;
 *     &lt;enumeration value="Week"/&gt;
 *     &lt;enumeration value="Days"/&gt;
 *     &lt;enumeration value="Customers"/&gt;
 *     &lt;enumeration value="Vendors"/&gt;
 *     &lt;enumeration value="Employees"/&gt;
 *     &lt;enumeration value="Departments"/&gt;
 *     &lt;enumeration value="Classes"/&gt;
 *     &lt;enumeration value="ProductsAndServices"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SummarizeColumnsByEnum")
@XmlEnum
public enum SummarizeColumnsByEnum {

    @XmlEnumValue("Total")
    TOTAL("Total"),
    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("FiscalYear")
    FISCAL_YEAR("FiscalYear"),
    @XmlEnumValue("FiscalQuarter")
    FISCAL_QUARTER("FiscalQuarter"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Customers")
    CUSTOMERS("Customers"),
    @XmlEnumValue("Vendors")
    VENDORS("Vendors"),
    @XmlEnumValue("Employees")
    EMPLOYEES("Employees"),
    @XmlEnumValue("Departments")
    DEPARTMENTS("Departments"),
    @XmlEnumValue("Classes")
    CLASSES("Classes"),
    @XmlEnumValue("ProductsAndServices")
    PRODUCTS_AND_SERVICES("ProductsAndServices");
    private final String value;

    SummarizeColumnsByEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SummarizeColumnsByEnum fromValue(String v) {
        for (SummarizeColumnsByEnum c: SummarizeColumnsByEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
