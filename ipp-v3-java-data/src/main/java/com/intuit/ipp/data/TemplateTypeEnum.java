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
 * <p>Java class for TemplateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemplateTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BuildAssembly"/&gt;
 *     &lt;enumeration value="CreditMemo"/&gt;
 *     &lt;enumeration value="Estimate"/&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *     &lt;enumeration value="PurchaseOrder"/&gt;
 *     &lt;enumeration value="SalesOrder"/&gt;
 *     &lt;enumeration value="SalesReceipt"/&gt;
 *     &lt;enumeration value="StatementCharge"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TemplateTypeEnum")
@XmlEnum
public enum TemplateTypeEnum {

    @XmlEnumValue("BuildAssembly")
    BUILD_ASSEMBLY("BuildAssembly"),
    @XmlEnumValue("CreditMemo")
    CREDIT_MEMO("CreditMemo"),
    @XmlEnumValue("Estimate")
    ESTIMATE("Estimate"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("PurchaseOrder")
    PURCHASE_ORDER("PurchaseOrder"),
    @XmlEnumValue("SalesOrder")
    SALES_ORDER("SalesOrder"),
    @XmlEnumValue("SalesReceipt")
    SALES_RECEIPT("SalesReceipt"),
    @XmlEnumValue("StatementCharge")
    STATEMENT_CHARGE("StatementCharge");
    private final String value;

    TemplateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemplateTypeEnum fromValue(String v) {
        for (TemplateTypeEnum c: TemplateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
