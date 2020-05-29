//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.28 at 10:35:45 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Financial transaction representing a payment from a
 * 				customer applied to one or more sales transactions
 * 			
 * 
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Transaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="RemitToRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ARAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="DepositToAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://schema.intuit.com/finance/v3}PaymentTypeEnum" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="CheckPayment" type="{http://schema.intuit.com/finance/v3}CheckPayment" minOccurs="0"/&gt;
 *           &lt;element name="CreditCardPayment" type="{http://schema.intuit.com/finance/v3}CreditCardPayment" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UnappliedAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ProcessPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "customerRef",
    "remitToRef",
    "arAccountRef",
    "depositToAccountRef",
    "paymentMethodRef",
    "paymentRefNum",
    "paymentType",
    "checkPayment",
    "creditCardPayment",
    "totalAmt",
    "unappliedAmt",
    "processPayment",
    "paymentEx"
})
public class Payment
    extends Transaction
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CustomerRef")
    protected ReferenceType customerRef;
    @XmlElement(name = "RemitToRef")
    protected ReferenceType remitToRef;
    @XmlElement(name = "ARAccountRef")
    protected ReferenceType arAccountRef;
    @XmlElement(name = "DepositToAccountRef")
    protected ReferenceType depositToAccountRef;
    @XmlElement(name = "PaymentMethodRef")
    protected ReferenceType paymentMethodRef;
    @XmlElement(name = "PaymentRefNum")
    protected String paymentRefNum;
    @XmlElement(name = "PaymentType")
    @XmlSchemaType(name = "string")
    protected PaymentTypeEnum paymentType;
    @XmlElement(name = "CheckPayment")
    protected CheckPayment checkPayment;
    @XmlElement(name = "CreditCardPayment")
    protected CreditCardPayment creditCardPayment;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;
    @XmlElement(name = "UnappliedAmt")
    protected BigDecimal unappliedAmt;
    @XmlElement(name = "ProcessPayment")
    protected Boolean processPayment;
    @XmlElement(name = "PaymentEx")
    protected IntuitAnyType paymentEx;

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCustomerRef(ReferenceType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the remitToRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRemitToRef() {
        return remitToRef;
    }

    /**
     * Sets the value of the remitToRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRemitToRef(ReferenceType value) {
        this.remitToRef = value;
    }

    /**
     * Gets the value of the arAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getARAccountRef() {
        return arAccountRef;
    }

    /**
     * Sets the value of the arAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setARAccountRef(ReferenceType value) {
        this.arAccountRef = value;
    }

    /**
     * Gets the value of the depositToAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDepositToAccountRef() {
        return depositToAccountRef;
    }

    /**
     * Sets the value of the depositToAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDepositToAccountRef(ReferenceType value) {
        this.depositToAccountRef = value;
    }

    /**
     * Gets the value of the paymentMethodRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getPaymentMethodRef() {
        return paymentMethodRef;
    }

    /**
     * Sets the value of the paymentMethodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setPaymentMethodRef(ReferenceType value) {
        this.paymentMethodRef = value;
    }

    /**
     * Gets the value of the paymentRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRefNum() {
        return paymentRefNum;
    }

    /**
     * Sets the value of the paymentRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRefNum(String value) {
        this.paymentRefNum = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeEnum }
     *     
     */
    public PaymentTypeEnum getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeEnum }
     *     
     */
    public void setPaymentType(PaymentTypeEnum value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the checkPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPayment }
     *     
     */
    public CheckPayment getCheckPayment() {
        return checkPayment;
    }

    /**
     * Sets the value of the checkPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPayment }
     *     
     */
    public void setCheckPayment(CheckPayment value) {
        this.checkPayment = value;
    }

    /**
     * Gets the value of the creditCardPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardPayment }
     *     
     */
    public CreditCardPayment getCreditCardPayment() {
        return creditCardPayment;
    }

    /**
     * Sets the value of the creditCardPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardPayment }
     *     
     */
    public void setCreditCardPayment(CreditCardPayment value) {
        this.creditCardPayment = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the unappliedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnappliedAmt() {
        return unappliedAmt;
    }

    /**
     * Sets the value of the unappliedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnappliedAmt(BigDecimal value) {
        this.unappliedAmt = value;
    }

    /**
     * Gets the value of the processPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessPayment() {
        return processPayment;
    }

    /**
     * Sets the value of the processPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessPayment(Boolean value) {
        this.processPayment = value;
    }

    /**
     * Gets the value of the paymentEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getPaymentEx() {
        return paymentEx;
    }

    /**
     * Sets the value of the paymentEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setPaymentEx(IntuitAnyType value) {
        this.paymentEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Payment that = ((Payment) object);
        {
            ReferenceType lhsCustomerRef;
            lhsCustomerRef = this.getCustomerRef();
            ReferenceType rhsCustomerRef;
            rhsCustomerRef = that.getCustomerRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerRef", lhsCustomerRef), LocatorUtils.property(thatLocator, "customerRef", rhsCustomerRef), lhsCustomerRef, rhsCustomerRef, (this.customerRef!= null), (that.customerRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsRemitToRef;
            lhsRemitToRef = this.getRemitToRef();
            ReferenceType rhsRemitToRef;
            rhsRemitToRef = that.getRemitToRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remitToRef", lhsRemitToRef), LocatorUtils.property(thatLocator, "remitToRef", rhsRemitToRef), lhsRemitToRef, rhsRemitToRef, (this.remitToRef!= null), (that.remitToRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsARAccountRef;
            lhsARAccountRef = this.getARAccountRef();
            ReferenceType rhsARAccountRef;
            rhsARAccountRef = that.getARAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arAccountRef", lhsARAccountRef), LocatorUtils.property(thatLocator, "arAccountRef", rhsARAccountRef), lhsARAccountRef, rhsARAccountRef, (this.arAccountRef!= null), (that.arAccountRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsDepositToAccountRef;
            lhsDepositToAccountRef = this.getDepositToAccountRef();
            ReferenceType rhsDepositToAccountRef;
            rhsDepositToAccountRef = that.getDepositToAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "depositToAccountRef", lhsDepositToAccountRef), LocatorUtils.property(thatLocator, "depositToAccountRef", rhsDepositToAccountRef), lhsDepositToAccountRef, rhsDepositToAccountRef, (this.depositToAccountRef!= null), (that.depositToAccountRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsPaymentMethodRef;
            lhsPaymentMethodRef = this.getPaymentMethodRef();
            ReferenceType rhsPaymentMethodRef;
            rhsPaymentMethodRef = that.getPaymentMethodRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMethodRef", lhsPaymentMethodRef), LocatorUtils.property(thatLocator, "paymentMethodRef", rhsPaymentMethodRef), lhsPaymentMethodRef, rhsPaymentMethodRef, (this.paymentMethodRef!= null), (that.paymentMethodRef!= null))) {
                return false;
            }
        }
        {
            String lhsPaymentRefNum;
            lhsPaymentRefNum = this.getPaymentRefNum();
            String rhsPaymentRefNum;
            rhsPaymentRefNum = that.getPaymentRefNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentRefNum", lhsPaymentRefNum), LocatorUtils.property(thatLocator, "paymentRefNum", rhsPaymentRefNum), lhsPaymentRefNum, rhsPaymentRefNum, (this.paymentRefNum!= null), (that.paymentRefNum!= null))) {
                return false;
            }
        }
        {
            PaymentTypeEnum lhsPaymentType;
            lhsPaymentType = this.getPaymentType();
            PaymentTypeEnum rhsPaymentType;
            rhsPaymentType = that.getPaymentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentType", lhsPaymentType), LocatorUtils.property(thatLocator, "paymentType", rhsPaymentType), lhsPaymentType, rhsPaymentType, (this.paymentType!= null), (that.paymentType!= null))) {
                return false;
            }
        }
        {
            CheckPayment lhsCheckPayment;
            lhsCheckPayment = this.getCheckPayment();
            CheckPayment rhsCheckPayment;
            rhsCheckPayment = that.getCheckPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkPayment", lhsCheckPayment), LocatorUtils.property(thatLocator, "checkPayment", rhsCheckPayment), lhsCheckPayment, rhsCheckPayment, (this.checkPayment!= null), (that.checkPayment!= null))) {
                return false;
            }
        }
        {
            CreditCardPayment lhsCreditCardPayment;
            lhsCreditCardPayment = this.getCreditCardPayment();
            CreditCardPayment rhsCreditCardPayment;
            rhsCreditCardPayment = that.getCreditCardPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditCardPayment", lhsCreditCardPayment), LocatorUtils.property(thatLocator, "creditCardPayment", rhsCreditCardPayment), lhsCreditCardPayment, rhsCreditCardPayment, (this.creditCardPayment!= null), (that.creditCardPayment!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalAmt;
            lhsTotalAmt = this.getTotalAmt();
            BigDecimal rhsTotalAmt;
            rhsTotalAmt = that.getTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmt", lhsTotalAmt), LocatorUtils.property(thatLocator, "totalAmt", rhsTotalAmt), lhsTotalAmt, rhsTotalAmt, (this.totalAmt!= null), (that.totalAmt!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsUnappliedAmt;
            lhsUnappliedAmt = this.getUnappliedAmt();
            BigDecimal rhsUnappliedAmt;
            rhsUnappliedAmt = that.getUnappliedAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unappliedAmt", lhsUnappliedAmt), LocatorUtils.property(thatLocator, "unappliedAmt", rhsUnappliedAmt), lhsUnappliedAmt, rhsUnappliedAmt, (this.unappliedAmt!= null), (that.unappliedAmt!= null))) {
                return false;
            }
        }
        {
            Boolean lhsProcessPayment;
            lhsProcessPayment = this.isProcessPayment();
            Boolean rhsProcessPayment;
            rhsProcessPayment = that.isProcessPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processPayment", lhsProcessPayment), LocatorUtils.property(thatLocator, "processPayment", rhsProcessPayment), lhsProcessPayment, rhsProcessPayment, (this.processPayment!= null), (that.processPayment!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsPaymentEx;
            lhsPaymentEx = this.getPaymentEx();
            IntuitAnyType rhsPaymentEx;
            rhsPaymentEx = that.getPaymentEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentEx", lhsPaymentEx), LocatorUtils.property(thatLocator, "paymentEx", rhsPaymentEx), lhsPaymentEx, rhsPaymentEx, (this.paymentEx!= null), (that.paymentEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ReferenceType theCustomerRef;
            theCustomerRef = this.getCustomerRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerRef", theCustomerRef), currentHashCode, theCustomerRef, (this.customerRef!= null));
        }
        {
            ReferenceType theRemitToRef;
            theRemitToRef = this.getRemitToRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remitToRef", theRemitToRef), currentHashCode, theRemitToRef, (this.remitToRef!= null));
        }
        {
            ReferenceType theARAccountRef;
            theARAccountRef = this.getARAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arAccountRef", theARAccountRef), currentHashCode, theARAccountRef, (this.arAccountRef!= null));
        }
        {
            ReferenceType theDepositToAccountRef;
            theDepositToAccountRef = this.getDepositToAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "depositToAccountRef", theDepositToAccountRef), currentHashCode, theDepositToAccountRef, (this.depositToAccountRef!= null));
        }
        {
            ReferenceType thePaymentMethodRef;
            thePaymentMethodRef = this.getPaymentMethodRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMethodRef", thePaymentMethodRef), currentHashCode, thePaymentMethodRef, (this.paymentMethodRef!= null));
        }
        {
            String thePaymentRefNum;
            thePaymentRefNum = this.getPaymentRefNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentRefNum", thePaymentRefNum), currentHashCode, thePaymentRefNum, (this.paymentRefNum!= null));
        }
        {
            PaymentTypeEnum thePaymentType;
            thePaymentType = this.getPaymentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentType", thePaymentType), currentHashCode, thePaymentType, (this.paymentType!= null));
        }
        {
            CheckPayment theCheckPayment;
            theCheckPayment = this.getCheckPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkPayment", theCheckPayment), currentHashCode, theCheckPayment, (this.checkPayment!= null));
        }
        {
            CreditCardPayment theCreditCardPayment;
            theCreditCardPayment = this.getCreditCardPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditCardPayment", theCreditCardPayment), currentHashCode, theCreditCardPayment, (this.creditCardPayment!= null));
        }
        {
            BigDecimal theTotalAmt;
            theTotalAmt = this.getTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmt", theTotalAmt), currentHashCode, theTotalAmt, (this.totalAmt!= null));
        }
        {
            BigDecimal theUnappliedAmt;
            theUnappliedAmt = this.getUnappliedAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unappliedAmt", theUnappliedAmt), currentHashCode, theUnappliedAmt, (this.unappliedAmt!= null));
        }
        {
            Boolean theProcessPayment;
            theProcessPayment = this.isProcessPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processPayment", theProcessPayment), currentHashCode, theProcessPayment, (this.processPayment!= null));
        }
        {
            IntuitAnyType thePaymentEx;
            thePaymentEx = this.getPaymentEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentEx", thePaymentEx), currentHashCode, thePaymentEx, (this.paymentEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
