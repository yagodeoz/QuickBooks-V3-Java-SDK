//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.15 at 03:58:30 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * SalesReceipt Transaction entity 
 * 
 * <p>Java class for SalesReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesReceipt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}SalesTransaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesReceiptEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *         &lt;element name="LessCIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesReceipt", propOrder = {
    "salesReceiptEx",
    "lessCIS"
})
public class SalesReceipt
    extends SalesTransaction
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SalesReceiptEx")
    protected IntuitAnyType salesReceiptEx;
    @XmlElement(name = "LessCIS")
    protected BigDecimal lessCIS;

    /**
     * Gets the value of the salesReceiptEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getSalesReceiptEx() {
        return salesReceiptEx;
    }

    /**
     * Sets the value of the salesReceiptEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setSalesReceiptEx(IntuitAnyType value) {
        this.salesReceiptEx = value;
    }

    /**
     * Gets the value of the lessCIS property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLessCIS() {
        return lessCIS;
    }

    /**
     * Sets the value of the lessCIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLessCIS(BigDecimal value) {
        this.lessCIS = value;
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
        final SalesReceipt that = ((SalesReceipt) object);
        {
            IntuitAnyType lhsSalesReceiptEx;
            lhsSalesReceiptEx = this.getSalesReceiptEx();
            IntuitAnyType rhsSalesReceiptEx;
            rhsSalesReceiptEx = that.getSalesReceiptEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesReceiptEx", lhsSalesReceiptEx), LocatorUtils.property(thatLocator, "salesReceiptEx", rhsSalesReceiptEx), lhsSalesReceiptEx, rhsSalesReceiptEx, (this.salesReceiptEx!= null), (that.salesReceiptEx!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLessCIS;
            lhsLessCIS = this.getLessCIS();
            BigDecimal rhsLessCIS;
            rhsLessCIS = that.getLessCIS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lessCIS", lhsLessCIS), LocatorUtils.property(thatLocator, "lessCIS", rhsLessCIS), lhsLessCIS, rhsLessCIS, (this.lessCIS!= null), (that.lessCIS!= null))) {
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
            IntuitAnyType theSalesReceiptEx;
            theSalesReceiptEx = this.getSalesReceiptEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesReceiptEx", theSalesReceiptEx), currentHashCode, theSalesReceiptEx, (this.salesReceiptEx!= null));
        }
        {
            BigDecimal theLessCIS;
            theLessCIS = this.getLessCIS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lessCIS", theLessCIS), currentHashCode, theLessCIS, (this.lessCIS!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
